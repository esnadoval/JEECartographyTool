package jeeprojectgroupingheuristic;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

import CartographyDescription.Application;
import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.CartographyElement;
import CartographyDescription.Class;
import CartographyDescription.ElementRelation;
import CartographyDescription.Layer;
import CartographyDescription.Module;
import jeecartographytool.extensions.IModelHeuristic;
import jeecartographytool.utils.ModelUtils;


public class ProjectGroupingHeuristic implements IModelHeuristic {

	private ArrayList<File> originalFiles;
	private HashMap<String, Class> classes;
	private ArrayList<ElementRelation> relations = new ArrayList<ElementRelation>();
	private Application root;
	private CartographyDescriptionFactory cartModelFactory = CartographyDescriptionFactory.eINSTANCE;
	private String keyPath = "";
	private int keyPathIdx = 0;
	
	public ProjectGroupingHeuristic() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHeuristicName() {
		// TODO Auto-generated method stub
		return "Project Grouping Heuristic";
	}

	@Override
	public String getHeuristicDescription() {
		// TODO Auto-generated method stub
		return "Groups all the classes of an application based on its source project and packages, generating Module elements.";
	}

	@Override
	public void setParams(Object[] params) {
		classes = (HashMap<String, CartographyDescription.Class>) params[0];
		originalFiles = (ArrayList<File>) params[1];
		
	}


	public Boolean resolveHeuristic(Application root) {
		this.root = root;
		Module mroot = cartModelFactory.createModule();
		mroot.setName("Project Grouping");
		calculateDifPackage();
		for (int i = 0; i < root.getCompilationUnits().size(); i++) {
			System.out.println("GC>"+root.getCompilationUnits().get(i));
			Module m =createModule(mroot,getClassFileProject(root.getCompilationUnits().get(i)), root.getCompilationUnits().get(i));
			System.out.println("G>"+m.getName());
			mroot.setMaxWeight(mroot.getMaxWeight() < m.getWeight()? m.getWeight() : mroot.getMaxWeight());
			mroot.setWeight(mroot.getMaxWeight() + m.getWeight());
			root.getCompilationUnits().get(i).setParentModule(m);
		}
		calculateExternalDependencies(mroot);
		root.getModules().add(mroot);
		
		
		return false;
	}
	
	
	private void calculateExternalDependencies(Module rmodul){
		for (Module mdls : rmodul.getSubModules()) {
			for (CartographyElement crt : mdls.getCartographyElements()) {
				
				for (ElementRelation rlt : crt.getMigRelations()) {
					if(ModelUtils.isValidSourceCode(rlt.getSrc()) && ModelUtils.isValidSourceCode(rlt.getDest())){
						Class dst = (Class) rlt.getDest();
						if(!dst.getParentModule().getName().equals(mdls.getName())){
							boolean nf = false;
							for (ElementRelation avrl : rmodul.getMigRelations()) {
								if(rlt.getSrc().getName().equals(avrl.getSrc().getName()) && rlt.getDest().getName().equals(avrl.getDest().getName()) && rlt.getSrc().getParentModule().getName().equals(mdls.getName())){
									nf = true;
								}
							}
							if(!nf){
							rmodul.getMigRelations().add(rlt);
							}
						}
					}
					
				}
			}
		}
	}
	
	private void calculateDifPackage(){
		
		int pathIdx = originalFiles.get(0).toPath().getNameCount();
		String partPath = originalFiles.get(0).toPath().getName(pathIdx - 1).toString();
		for (int i = 1; i < originalFiles.size(); i++) {
			
			System.out.println("KW>"+partPath);
				Path p = originalFiles.get(i).toPath();
				Path pa = originalFiles.get(i-1).toPath();
				
				int maxSz = p.getNameCount() > pa.getNameCount()? p.getNameCount() :pa.getNameCount();
				System.out.println("Pant>"+p.toString());
				System.out.println("PAct>"+pa.toString());
				for (int j = 0; j < maxSz && j < pathIdx  ; j++) {
					
					if(!p.getName(j).toString().toLowerCase().equals(pa.getName(j).toString().toLowerCase())){
						partPath = p.getName(j-1).toString();
						System.out.println("K>"+partPath);
						pathIdx = j;
					}
					
					
				}
				
			
		}
		
		keyPath = partPath;
		keyPathIdx = pathIdx -1 ;
		
		System.out.println("FINAL > "+ keyPath+ " - " +keyPathIdx);
		
	}
	

	private Module createModule(Module mroot,String name, Class class1){
		
		Module nm = null;
		for (Module mdls : mroot.getSubModules()) {
			if(mdls.getName().equals(name)){
				nm = mdls;
			}
		}
		
		
		if(nm == null){
			nm = cartModelFactory.createModule();
			nm.setName(name);
			mroot.getSubModules().add(nm);
		}
		
		
		
		if(class1.getParentLayer() != null){
			System.out.println("LAY>"+class1.getName());
			Layer ly = null;
			for (Layer tly : nm.getLayers()) {
				if(class1.getParentLayer().getName().equals(tly.getName())){
					ly = tly;
				}
			}
			
			if(ly == null){
				ly = cartModelFactory.createLayer();
				ly.setName(class1.getParentLayer().getName());
				nm.getLayers().add(ly);
				System.out.println("CREATELAY>"+ly.getName());
			}
			ly.getCompilationUnits().add(class1);
		}
			
		nm.getCartographyElements().add(class1);
		nm.setWeight(nm.getWeight() + 1);
		nm.setMaxWeight(nm.getMaxWeight() < (class1.getWeight()) ? (class1.getWeight()) : nm.getMaxWeight());	
		
		return nm;
		
	}
	private String getClassFileProject(Class cls){
		
		for (File file : originalFiles) {
		
			if(file.getName().equals(cls.getOriginalFileName())){
				Path p = file.toPath();
				System.out.println("NP>" + p.toString());
				if (p.getNameCount() -1 == keyPathIdx){
					return p.getName(keyPathIdx).toString();
				}else{
					System.out.println("GT>"+ p.getName( keyPathIdx + 1) +" - "+keyPathIdx);
					return p.getName( keyPathIdx + 1).toString();
				}
				/*for (int i = 0; i < p.getNameCount() -1 ; i++) {
					if(p.getName(i).toString().toLowerCase().equals(keyPath.toLowerCase())){
						return p.getName( i + 1).toString();
					} else if (p.getNameCount() -1 == i){
						return p.getName( i).toString();
					}
					
				}*/
				
			}
			
			
		}
		
		return "Unclassified";
	}


	
	
}
