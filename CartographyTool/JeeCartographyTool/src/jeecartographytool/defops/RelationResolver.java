package jeecartographytool.defops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jeecartographytool.extensions.IModelHeuristic;
import CartographyDescription.Application;
import CartographyDescription.Attribute;
import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.Class;
import CartographyDescription.ElementRelation;
import CartographyDescription.Method;
import CartographyDescription.RelationType;
import CartographyDescription.VarType;
import CartographyDescription.Variable;

public class RelationResolver implements IModelHeuristic {

	
	private Application app;

	private HashMap<String, CartographyDescription.Class> classes;
	
	private CartographyDescriptionFactory cartModelFactory = CartographyDescriptionFactory.eINSTANCE;
	
	private ArrayList<ElementRelation> relations = new ArrayList<ElementRelation>();
	
	@Override
	public Boolean resolveHeuristic(Application root) {

		app = root;
		
		for (CartographyDescription.Class cls : app.getCompilationUnits()) {
			
			if(cls.getExtends() != null){
				CartographyDescription.Class temp = classes.get(processTypeString(cls.getExtends().getName()));
				if(temp != null){
					cls.getMigRelations().add(createRelation(cls, temp, RelationType.REALIZATION_VALUE));
				}
			}
			
			for (VarType impls : cls.getImplements()) {
				CartographyDescription.Class temp = classes.get(processTypeString(impls.getName()));
				if(temp != null){
					cls.getMigRelations().add(createRelation(cls, temp, RelationType.IMPLEMENTS_VALUE));
				}
			}
			
			for (Attribute attrs : cls.getAttributes()) {
				CartographyDescription.Class temp = classes.get(processTypeString(attrs.getVariable().getType().getName()));
				if(temp != null){
					cls.getMigRelations().add(createRelation(cls, temp, RelationType.ASOSIATION_VALUE));
				}
			}
			
			
			for (Method mtd : cls.getMethods()) {
				
				for (Variable prms : mtd.getParameters()) {
					CartographyDescription.Class temp = classes.get(processTypeString(prms.getType().getName()));
					if(temp != null){
						cls.getMigRelations().add(createRelation(cls, temp, RelationType.USE_VALUE));
					}
				}
				
				if(mtd.getReturnType() != null){
					CartographyDescription.Class temp = classes.get(processTypeString(mtd.getReturnType().getName()));
					if(temp != null){
						cls.getMigRelations().add(createRelation(cls, temp, RelationType.USE_VALUE));
					}
				}
			}
		}
				
		app.getAppRelations().addAll(relations);
		return false;
	}

	private String processTypeString(String typeName){
		
		String last= typeName.split(".").length == 0 ? typeName:typeName.split(".")[typeName.split(".").length-1];
		
		if(classes.get(last)==null){
			
			for (Class cls : app.getCompilationUnits()) {
				if(last.toLowerCase().matches("[a-z0-9<>,.\\[\\]]*"+cls.getName()+"[a-z0-9<>,.\\[\\]]*")){
					last = cls.getName();
					return last;
				}
			}
		}
		
		
		return last;
	}
	
	
	public ElementRelation createRelation(CartographyDescription.Class src,CartographyDescription.Class dst, int type){
		
		if(type == RelationType.ASOSIATION_VALUE || type == RelationType.USE_VALUE ){
		for (ElementRelation elementRelation : relations) {
			if(elementRelation.getSrc().getName().equals(src.getName()) && elementRelation.getDest().getName().equals(dst.getName()) && elementRelation.getRelationType().getValue() == type){
				return elementRelation;
			}
		}
		}
		
		ElementRelation rel = cartModelFactory.createElementRelation();
		rel.setSrc(src);
		rel.setDest(dst);
		rel.setRelationType(RelationType.get(type));
		relations.add(rel);
		return rel;
		
	}
	@Override
	public String getHeuristicName() {
		// TODO Auto-generated method stub
		return "Default Relation Solver.";
	}

	@Override
	public String getHeuristicDescription() {
		// TODO Auto-generated method stub
		return "Creates most Asossiations, Realizations, Implementations and Usage Relations between all the Classes found in the Application.";
	}

	@Override
	public void setParams(Object[] params) {

		classes = (HashMap<String, CartographyDescription.Class>) params[0];
		
	}
}
