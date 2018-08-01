package jeecartographytool.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.core.resources.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.java.Model;

import java.io.*;

import jeecartographytool.TransformationChoreographer;
import jeecartographytool.builder.BuildReorganizedProject;
import jeecartographytool.extensions.IModelHeuristic;
import jeecartographytool.handlers.ModelStereoTyperHandler;
import jeecartographytool.utils.ModelUtils;
import jeecartographytool.utils.modisco.ModelGenerator;
import org.eclipse.ui.*;
import CartographyDescription.Application;

/**
 * This is a sample new wizard. Its role is to create a new file resource in the
 * provided container. If the container resource (a folder or a project) is
 * selected in the workspace when the wizard is opened, it will accept it as the
 * target container. The wizard creates one file with the extension "xmi". If a
 * sample multi-page editor (also available as a template) is registered for the
 * same extension, it will be able to open it.
 */

public class AppToModelWizard extends Wizard implements INewWizard {

	// public static String PATTERNS_FILE = "JEECartographyToolPatterns.ini";
	public static String CARTOGRAPHY_FILE = "JEECartography.odesign";

	private ProjectSelectionPage page;
	private SelectedClassesPage pagei;
	private SelectedHeuristicsPage pagePost;

	private ArrayList<File> selectedFiles = new ArrayList<File>();
	private ArrayList<IModelHeuristic> selectedPostProcessingClasses = new ArrayList<IModelHeuristic>();

	/**
	 * Constructor for AppToModelWizard.
	 */
	public AppToModelWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("JEE Cartography Project Wizard");

	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {

		page = new ProjectSelectionPage(this, "JEE Cartography Project Setup.", selectedFiles);
		addPage(page);
		pagei = new SelectedClassesPage("Selected Source Code Units.", selectedFiles);
		addPage(pagei);
		pagePost = new SelectedHeuristicsPage("Heuristics.");
		// ArrayList<IModelHeuristic> postProcClas = new
		// ModelHeuristicsHandler().evaluate(Platform.getExtensionRegistry());
		// if (!postProcClas.isEmpty()) {
		addPage(pagePost);
		// }

	}

	public void updateFileView() {
		pagei.refreshList();
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		// final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		selectedPostProcessingClasses = pagePost.getSelectedPostProcessingClasses();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(fileName, monitor);
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);

		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {

			MessageDialog.openError(getShell(), "Error", "An error ocurred during de parsing operation.\n" + e.getTargetException().getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 * 
	 * @throws Exception
	 */

	private void doFinish(

	String fileName, IProgressMonitor monitor) throws Exception {

		monitor.beginTask("Creating Project...", 4);

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(fileName);

		project.create(null);
		project.open(null);

		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = "JeeCartographyTool.jeeCrtographyProjectBuilder";
		description.setNatureIds(newNatures);
		project.setDescription(description, null);

		IResource resource = root.findMember(project.getFullPath() + "/Models");

		IContainer container = (IContainer) resource;

		// final IFile file = container.getFile(new Path(fileName +
		// "App.japp"));

		monitor.worked(1);
		monitor.setTaskName("Modisco");
		// FileOutputStream fout = new
		// FileOutputStream(file.getLocation().makeAbsolute().toFile());
		Resource rcs = null;

		rcs = openContentStream(monitor, fileName);
		monitor.done();
		monitor.beginTask("Saving Modisco model..", 3 + selectedPostProcessingClasses.size());

		/*
		 * try { rcs.save(fout, null); } catch (Exception e) {
		 * e.printStackTrace(); }
		 * 
		 * 
		 * fout.close();
		 */
		monitor.setTaskName("Creating Cartography Model, please wait...");
		monitor.worked(1);

		Model moapp = (Model) rcs.getContents().get(0);

		
		TransformationChoreographer tc = new TransformationChoreographer(moapp, project.getName(), selectedPostProcessingClasses, pagei.getSelectedFiles(),new ModelStereoTyperHandler().evaluate(Platform.getExtensionRegistry()).get(0));
		Application appcrt = tc.excuteCartographyOperations(monitor);

		System.out.println("+++>" + appcrt);

		final IFile filecrt = container.getFile(new Path(fileName + "Cpy.jcp"));

		monitor.setTaskName("Reorganizing sources, please wait...");
		monitor.worked(1);

		if (pagei.isReorganizeCode()) {
			new BuildReorganizedProject().createReorganizedProject(filecrt, appcrt, project);
		}else{
			ModelUtils.saveModel(appcrt, filecrt);

		}


		monitor.setTaskName("Opening Project and Model, please wait...");
		monitor.worked(1);

		IFile repr = project.getFile("representations.aird"); // such as
																// file.exists()
																// == false
		String contents = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<viewpoint:DAnalysis xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:CartographyDescription=\"www.csw.uniandes.edu.co/CartographyDescription/1.0\" xmlns:viewpoint=\"http://www.eclipse.org/sirius/1.1.0\" xmi:id=\"_2pmvAIO9EeS0-7BL-QPfmg\" version=\"8.1.1\">\n  <models xmi:type=\"CartographyDescription:Application\" href=\"Models/" + fileName + "Cpy.jcp#/\"/>\n</viewpoint:DAnalysis>";
		InputStream source = new ByteArrayInputStream(contents.getBytes());
		repr.create(source, false, null);

		monitor.worked(1);
		System.out.println("-> Conversion finished without errors");
		project.refreshLocal(IResource.DEPTH_INFINITE, null);

	}

	/**
	 * We will initialize file contents with a sample text.
	 * 
	 * @throws Exception
	 * @throws IOException
	 */

	private Resource openContentStream(IProgressMonitor monitor, String filename) {

		ModelGenerator mg = new ModelGenerator();
		mg.setMonitor(monitor);

		Resource javaModel = mg.prepareVirtualProject(pagei.getSelectedFiles(), filename + "Vrt");

		return javaModel;

	}

	private InputStream getCartograhpyFile() throws Exception {

		try {

			return new FileInputStream(new File(CARTOGRAPHY_FILE));

		} catch (FileNotFoundException ex) {

			URL url = new URL("platform:/plugin/JeeCartographyTool/JEECartography.odesign");
			try {
				InputStream is = url.openConnection().getInputStream();

				OutputStream os = new FileOutputStream(CARTOGRAPHY_FILE);

				byte[] buffer = new byte[1024];
				int bytesRead; // read from is to buffer
				while ((bytesRead = is.read(buffer)) != -1) {
					os.write(buffer, 0, bytesRead);
				}
				is.close();
				os.flush();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			return url.openConnection().getInputStream();
		}

	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}

	public ArrayList<File> getSelectedFiles() {
		return selectedFiles;
	}

	public void setSelectedFiles(ArrayList<File> selectedFiles) {
		this.selectedFiles = selectedFiles;
	}

}
