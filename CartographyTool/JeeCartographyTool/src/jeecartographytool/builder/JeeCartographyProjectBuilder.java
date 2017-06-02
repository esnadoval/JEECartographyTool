package jeecartographytool.builder;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.JavaCore;

public class JeeCartographyProjectBuilder implements IProjectNature {

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = "JeeCartographyTool.jeeCrtographyProjectBuilder";

	public static String MODELS_DIR = "Models";
	public static String POSTPROC_DIR = "Post-Processing Scripts";

	public static String CARTOGRAPHY_DIR = "Cartography Definition";

	public static String ICONS_DIR = "Icons";
	public static String DESTINATION_APPS_DIR = "src";
	




	
	private IProject project;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	public void configure() throws CoreException {
		IFolder sourceFolder = project.getFolder(MODELS_DIR);
		sourceFolder.create(false, true, null);

		IFolder sourceFolder2 = project.getFolder(POSTPROC_DIR);
		sourceFolder2.create(false, true, null);

		

		// IFolder sourceFolder4 = project.getFolder(METAMODELS_DIR);
		// sourceFolder4.create(false, true, null);

	
		/*IFolder sourceFolder6 = project.getFolder(TRANSFORMATIONS_DIR);
		sourceFolder6.create(false, true, null);*/

		IFolder sourceFolder7 = project.getFolder(DESTINATION_APPS_DIR);
		sourceFolder7.create(false, true, null);

		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = "org.eclipse.sirius.nature.modelingproject";
		
		description.setNatureIds(newNatures);
		project.setDescription(description, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	public void deconfigure() throws CoreException {
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	public IProject getProject() {
		return project;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	public void setProject(IProject project) {
		this.project = project;
	}

}
