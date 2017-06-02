package jeecartographytool.builder;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jeecartographytool.utils.FileUtils;
import jeecartographytool.utils.ModelUtils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;

import CartographyDescription.Application;
import CartographyDescription.CartographyElement;
import CartographyDescription.Class;
import CartographyDescription.ElementRelation;
import CartographyDescription.Module;

public class BuildReorganizedProject {

	public void createReorganizedProject(IFile cartoModel, Application rapp,
			IProject rootProject) throws Exception {

		Application app = rapp == null ? ModelUtils.loadModel(cartoModel)
				: rapp;
		IProject project = rapp == null ? cartoModel.getProject() : rootProject;
		project.getFolder(JeeCartographyProjectBuilder.DESTINATION_APPS_DIR)
				.delete(true, null);

		for (Module mdl : app.getModules().get(0).getSubModules()) {
			for (CartographyElement obj : mdl.getCartographyElements()) {

				if (ModelUtils.isValidSourceCode(obj)) {
					Class classes = (Class) obj;
					File fc = new File(classes.getOriginalFilePath());

					FileInputStream fis = new FileInputStream(fc);
					byte[] data = new byte[(int) fc.length()];
					fis.read(data);
					fis.close();

					String content = new String(data, "UTF-8");
					String pckg = findPathFromModules(classes).toLowerCase();
					content = replacePackage(content, app.getName()
							.toLowerCase() + pckg.replaceAll("/", "."));

					String relative = app.getName().toLowerCase() + pckg + "/"
							+ classes.getOriginalFileName();
					System.out.println("PTH>" + relative);

					IFile sourceFolderTemp = project.getFile(JeeCartographyProjectBuilder.DESTINATION_APPS_DIR+"/"+mdl.getName()+"/src/main/java/"
							+ relative);

					FileUtils.prepareFolder((IFolder) sourceFolderTemp
							.getParent());

					System.out.println("FILREORG> "
							+ sourceFolderTemp.getLocation().toString());
					classes.setNewFilePath(sourceFolderTemp.getLocation()
							.toString());
					// IFile filetemp =
					// sourceFolderTemp.getFile(file.getName()); //
					// such
					if (!sourceFolderTemp.exists()) {
						sourceFolderTemp.create(new ByteArrayInputStream(
								content.getBytes(StandardCharsets.UTF_8)),
								false, null);

					}
					
				}

			}
			URL url = new URL("platform:/plugin/JeeCartographyTool/pom.xml");
			InputStream inputStream = url.openConnection().getInputStream();
			IFile filen = project.getFile(JeeCartographyProjectBuilder.DESTINATION_APPS_DIR+"/"+mdl.getName()+"/pom.xml"); // such as
			/*if (filen.exists()) {
				filen.delete(true, null);
			}*/
			// == false

			InputStream sc = FileUtils.replaceWord(inputStream, "CHANGEMEA",
					"reorganized." + mdl.getName());
			sc = FileUtils
					.replaceWord(sc, "CHANGEMEB", mdl.getName());

			filen.create(sc, false, null);
		}

		
		ModelUtils.saveModel(app, cartoModel);
		project.refreshLocal(IResource.DEPTH_INFINITE, null);

	}

	public String findPathFromModules(Class cls) {

		return moduleBrowsePathGenerator("/" + cls.getParentModule().getName(),
				(Module) cls.getParentModule().eContainer())
				+ "/"
				+ cls.getParentLayer().getName();
	}

	public String moduleBrowsePathGenerator(String pth, Module modul) {
		if (!(modul.eContainer() instanceof Application)) {
			String npath = "/" + modul.getName() + pth;
			return moduleBrowsePathGenerator(npath, (Module) modul.eContainer())
					+ npath;
		}

		return pth;

	}

	public static String replacePackage(String content, String npackage) {
		// Pattern replace = Pattern.compile("\\s+");
		System.out.println("REPLACING>" + npackage);
		// System.out.println(content);
		Matcher matcher = Pattern.compile("package [a-zA-Z.]+;",
				Pattern.CASE_INSENSITIVE).matcher(content);
		content = matcher.replaceAll("package " + npackage + ";");
		return "" + content;
	}
	private ArrayList<Module> getDependantModules(Module fg){
		
		ArrayList<Module> mdls = new ArrayList<Module>();
		for (ElementRelation rl : ((Module) fg.eContainer()).getMigRelations()) {

			if (rl.getSrc().getParentModule().getName().equals(fg.getName())) {

				boolean fnd = false;
				for (Module string : mdls) {
					if(string.getName().equals(rl.getDest().getParentModule().getName())){
						fnd = true;
					}
				}
				if(!fnd){
				mdls.add(rl.getDest().getParentModule());
				}

			}

		}
		
		return mdls;
	}

}
