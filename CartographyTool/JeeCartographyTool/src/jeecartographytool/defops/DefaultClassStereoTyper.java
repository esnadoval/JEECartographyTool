package jeecartographytool.defops;

import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.InterfaceDeclaration;

import jeecartographytool.CartographyModelParser;
import jeecartographytool.extensions.IModelStereoTyper;

public class DefaultClassStereoTyper implements IModelStereoTyper{

	@Override
	public int getStereoType(ClassDeclaration mclass) {

	
		
		if(searchForAnotationInClass(mclass,"entity")){
			return CartographyModelParser.ENTITY_TYPE;
		/*}else if(searchForAnotationInClass(mclass,"persistencecontext")){
			return PERSISTENCEMAN_TYPE;*/
		}else if(searchForAnotationInClass(mclass,"mangedbean")){
			return CartographyModelParser.UI_TYPE;
		}else if(searchForAnotationInClass(mclass,"messagebean")){
			return CartographyModelParser.BUSSINES_TYPE;
		}else if(searchForAnotationInClass(mclass,"post")){
			return CartographyModelParser.SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"get")){
			return CartographyModelParser.SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"webservice")){
			return CartographyModelParser.SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"delete")){
			return CartographyModelParser.SERVICE_TYPE;
		/*}else if(searchForAnotationInClass(mclass,"entitymanager")){
			return PERSISTENCEMAN_TYPE;
		*/}else if(searchForAnotationInClass(mclass,"webservice")){
			return CartographyModelParser.SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"produces")){
			return CartographyModelParser.SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"consumes")){
			return CartographyModelParser.SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"path")){
			return CartographyModelParser.SERVICE_TYPE;
		}else if(searchForAnotationInClass(mclass,"stateless")){
			return CartographyModelParser.BUSSINES_TYPE;
		}else if(searchForAnotationInClass(mclass,"stateful")){
			return CartographyModelParser.BUSSINES_TYPE;
		}else if(searchForAnotationInClass(mclass,"singleton")){
			return CartographyModelParser.BUSSINES_TYPE;
		}
		else if(searchForAnotationInClass(mclass,"test")){
			return CartographyModelParser.TEST_TYPE;
		}
		
		if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*bean[A-za-z0-9.]*")){
			return CartographyModelParser.BUSSINES_TYPE;
		}else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*facade[A-za-z0-9.]*")){
			return CartographyModelParser.UI_TYPE;
		}else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*controller[A-za-z0-9.]*")){
			return CartographyModelParser.UI_TYPE;
		}
		else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*bo[A-za-z0-9.]*")){
			return CartographyModelParser.ENTITY_TYPE;
		}
		else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*dto[A-za-z0-9.]*")){
			return CartographyModelParser.ENTITY_TYPE;
		}
		else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*webvo[A-za-z0-9.]*")){
			return CartographyModelParser.ENTITY_TYPE;
		}else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*dao[A-za-z0-9.]*")){
			return CartographyModelParser.PERSISTENCEMAN_TYPE;
		}else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*service[A-za-z0-9.]*")){
			return CartographyModelParser.SERVICE_TYPE;
		}
		else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*businessdelegate[A-za-z0-9.]*")){
			return CartographyModelParser.SERVICE_TYPE;
		}
		else if(mclass.getName().toLowerCase().matches("[A-za-z0-9.]*servlet[A-za-z0-9.]*")){
			return CartographyModelParser.SERVICE_TYPE;
		}
		else if(mclass.getName().toLowerCase().matches("[A-za-z0-9]+'test'")){
			return CartographyModelParser.TEST_TYPE;
		}
		

		return 0;
	}
	
	
	private boolean searchForAnotationInClass(ClassDeclaration elem,String anotn){
		for (Annotation anot : elem.getAnnotations()) {
			if(anot.getType().getType().getName().toLowerCase().equals(anotn)){
				return true;
		
			}
		}
		
		for (BodyDeclaration bddec : elem.getBodyDeclarations()) {
			for (Annotation anot : bddec.getAnnotations()) {
				if(anot.getType().getType().getName().toLowerCase().equals(anotn)){
					return true;
			
				}
			}
			if(bddec.eClass().getName().equals("VariableDeclaration")){
				if(((FieldDeclaration)bddec).getType().getType().getName().toLowerCase().equals(anotn)){
					return true;
			
				}
			}
			
		}
		
		
		return false;
	}
	
	private boolean searchForAnotationInInterface(InterfaceDeclaration elem,String anotn){
		for (Annotation anot : elem.getAnnotations()) {
			if(anot.getType().getType().getName().toLowerCase().equals(anotn)){
				return true;
		
			}
		}
		
		for (BodyDeclaration bddec : elem.getBodyDeclarations()) {
			for (Annotation anot : bddec.getAnnotations()) {
				if(anot.getType().getType().getName().toLowerCase().equals(anotn)){
					return true;
			
				}
			}
		}
		
		
		return false;
	}
	

}
