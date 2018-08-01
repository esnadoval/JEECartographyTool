package jeecartographytool.builder;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jeecartographytool.utils.FileUtils;
import jeecartographytool.utils.ModelUtils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.epsilon.egl.parse.Egx_EolParserRules.newExpression_return;

import CartographyDescription.Application;
import CartographyDescription.CartographyElement;
import CartographyDescription.Class;
import CartographyDescription.ElementRelation;
import CartographyDescription.Module;

public class BuildReorganizedProject {

	private HashMap<String, String[]> dependencyMap = new HashMap<String, String[]>();
	private ArrayList<String> posibleImports = new ArrayList<String>();
	private Application root;
	public void createReorganizedProject(IFile cartoModel, Application rapp,
			IProject rootProject) throws Exception {

		Application app = rapp == null ? ModelUtils.loadModel(cartoModel)
				: rapp;
		IProject project = rapp == null ? cartoModel.getProject() : rootProject;
		project.getFolder(JeeCartographyProjectBuilder.DESTINATION_APPS_DIR)
				.delete(true, null);
		root = app;
		for (Module depmd : app.getModules().get(0).getSubModules()) {
			addDependencyStrings(depmd, app.getName().toLowerCase());
		}

		for (Module mdl : app.getModules().get(0).getSubModules()) {
			
			ArrayList<Module> depen = getDependantModules(mdl);
			String imports = "";
			String pomdep = "";
			for (Module module : depen) {
				for (CartographyElement cc : module.getCartographyElements()) {
					if(ModelUtils.isValidSourceCode(cc)){
						//imports +="import "+dependencyMap.get(module.getName())[1]+"."+cc.getParentLayer().getName().replace('/', '.').toLowerCase()+"."+cc.getName()+";\n";					
					}
				}				
				
				pomdep += dependencyMap.get(module.getName())[0]+"\n\n";
			}
			
			for (CartographyElement cc : mdl.getCartographyElements()) {
				if(ModelUtils.isValidSourceCode(cc)){
					//imports +="import "+dependencyMap.get(mdl.getName())[1]+"."+cc.getParentLayer().getName().replace('/', '.').toLowerCase()+"."+cc.getName()+";\n";					
				}
			}
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
					
					content = cleanImports(content,classes);
					
					content = replacePackage(content, app.getName()
							.toLowerCase() + pckg.replaceAll("/", "."),imports);

					String relative = app.getName().toLowerCase() + pckg + "/"
							+ classes.getOriginalFileName();
					System.out.println("PTH>" + pckg);

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
					"co.edu.uniandes.academy." + mdl.getName().toLowerCase());
			sc = FileUtils
					.replaceWord(sc, "CHANGEMEB", mdl.getName().toLowerCase());
			
			
			sc = FileUtils.replaceWord(sc, "CHANGEMEC", pomdep);

			filen.create(sc, false, null);
		}

		//BULD-ALL
		URL url = new URL("platform:/plugin/JeeCartographyTool/pom2.xml");
		InputStream inputStream = url.openConnection().getInputStream();
		FileUtils.prepareFolder(project.getFolder(JeeCartographyProjectBuilder.DESTINATION_APPS_DIR+"/build-all"));
		
		IFile filen = project.getFile(JeeCartographyProjectBuilder.DESTINATION_APPS_DIR+"/build-all/pom.xml"); // such as
		/*if (filen.exists()) {
			filen.delete(true, null);
		}*/
		// == false

		InputStream sc = FileUtils.replaceWord(inputStream, "CHANGEMEA",
				"co.edu.uniandes.academy." + app.getName().toLowerCase());
		sc = FileUtils
				.replaceWord(sc, "CHANGEMEB", app.getName().toLowerCase());
		
		String blds = "";
		for (Module string : app.getModules().get(0).getSubModules()) {
			blds+="		<module>../"+string.getName().toLowerCase()+"</module>\n";
		}
		sc = FileUtils.replaceWord(sc, "CHANGEMEC", blds);

		filen.create(sc, false, null);
		
		
		ModelUtils.saveModel(app, cartoModel);
		project.refreshLocal(IResource.DEPTH_INFINITE, null);

	}

	public String findPathFromModules(Class cls) {

		return moduleBrowsePathGenerator("/" + cls.getParentModule().getName().toLowerCase(),
				(Module) cls.getParentModule().eContainer())
				+ "/"
				+ cls.getParentLayer().getName().toLowerCase();
	}

	public String moduleBrowsePathGenerator(String pth, Module modul) {
		if (!(modul.eContainer() instanceof Application)) {
			String npath = "/" + modul.getName().toLowerCase() + pth;
			return moduleBrowsePathGenerator(npath, (Module) modul.eContainer())
					+ npath;
		}

		return pth;

	}

	public static String replacePackage(String content, String npackage,String imports) {
		// Pattern replace = Pattern.compile("\\s+");
		System.out.println("REPLACING>" + npackage);
		// System.out.println(content);
		Matcher matcher = Pattern.compile("package [a-zA-Z.]+;",
				Pattern.CASE_INSENSITIVE).matcher(content);
		content = matcher.replaceAll("package " + npackage + ";\n\n"+imports);
		return "" + content;
	}
	
	private void addDependencyStrings(Module mdl,String appname){
		if(dependencyMap.get(mdl.getName()) == null){
		String [] depdc = new String[2];
		
		depdc[0] =
		"<dependency>\n"+
  		"	<groupId>co.edu.uniandes.academy."+mdl.getName().toLowerCase()+"</groupId>\n"+
  		"	<artifactId>"+mdl.getName().toLowerCase()+"</artifactId>\n"+
  		"	<version>0.0.1-SNAPSHOT</version>\n"+
  		"	<type>jar</type>\n"+
  		"</dependency>";
		
		depdc[1] = appname.toLowerCase() +"."+mdl.getName().toLowerCase();
			
		
		dependencyMap.put(mdl.getName(), depdc);
		}
	}
	public  String cleanImports(String content,CartographyDescription.Class cls ) {
		
		
		
			
			System.out.println("REPLACING IMP>");
			// System.out.println(content);
			Matcher matcher = Pattern.compile("import (?!(java|org))",
			Pattern.CASE_INSENSITIVE).matcher(content);
			content = matcher.replaceAll("//import");
			
		
		// Pattern replace = Pattern.compile("\\s+");
		
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
