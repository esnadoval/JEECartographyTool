package jeecartographytool.utils.modisco;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import jeecartographytool.utils.FileUtils;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;

public class ModelGenerator {

	
	IProgressMonitor monitor;
	
	public Resource prepareVirtualProject(ArrayList<File> compilationUnits, String virtualName){
		Resource javaResource = null;
		try {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = root.getProject(virtualName);
			project.create(null);
			project.open(null);
			
			IProjectDescription description = project.getDescription();
			description.setNatureIds(new String[] { JavaCore.NATURE_ID });
			project.setDescription(description, null);
			IJavaProject javaProject = JavaCore.create(project); 
			
			
			for (File file : compilationUnits) {
				
				
				
				IFile sourceFolderTemp = project.getFile("src/java/vrt/"+file.getName());
				
				FileUtils.prepareFolder((IFolder) sourceFolderTemp.getParent()); 
				
				System.out.println("FIL> src/java/vrt/"+file.getName());
				//IFile filetemp = sourceFolderTemp.getFile(file.getName()); // such
				if(!sourceFolderTemp.exists()){
				sourceFolderTemp.create(new FileInputStream(file), false, null);
				}
			}
			
			 javaResource = parseJavaApplication(javaProject);
			project.delete(true, true, null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return javaResource;
		
	}
	public Resource parseJavaApplication(IJavaProject javaProject){
		
			
			
			DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
			try {
				javaDiscoverer.discoverElement(javaProject,monitor);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			return javaDiscoverer.getTargetModel();
			
			
		
		
	}
	
	

	/*
	private String getPackageFromDir(File fil){
		String[] subDirs = fil.getAbsolutePath().split("\\\\");
		String packageStr = "/"+subDirs[subDirs.length - 1];
		
		for (int i = subDirs.length - 2; i >= 0; i--) {
			if(subDirs[i].equals("java") ){
				i = -1;
			}else if(subDirs[i].equals("test")){
				packageStr = "/tests" + packageStr;
				i = -1;
			}else{
				packageStr = "/"+subDirs[i].toLowerCase() + packageStr;
			}
		}
		System.out.println("PCKG>"+packageStr);
		return packageStr.substring(1);
		}*/
	public IProgressMonitor getMonitor() {
		return monitor;
	}
	public void setMonitor(IProgressMonitor monitor) {
		this.monitor = monitor;
	}
	
}
