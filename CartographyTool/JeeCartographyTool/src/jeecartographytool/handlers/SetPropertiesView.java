package jeecartographytool.handlers;

import java.util.Collection;
import java.util.Map;

import jeecartographytool.utils.ModelUtils;


import jeecartographytool.views.ElementPropertiesView;
import jeecartographytool.views.IMigrationPropertiesContentChanger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.tree.DTreeItem;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.PlatformUI;

import CartographyDescription.Class;
import CartographyDescription.ElementRelation;
import CartographyDescription.Module;


public class SetPropertiesView implements IExternalJavaAction {

	public SetPropertiesView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		
	    for (EObject eObject : arg0) {
			if(eObject instanceof DNode){
				return getSemanticElementValidation(((DNode) eObject).getTarget());
			}else if(eObject instanceof DEdge){
				return getSemanticElementValidation(((DEdge) eObject).getTarget());
			}else if(eObject instanceof DTreeItem){
				return getSemanticElementValidation(((DTreeItem) eObject).getTarget());
			}
			return false;
		}
		
		
		
		return false;
	}

	private boolean getSemanticElementValidation(EObject eObject){
		
		if(eObject instanceof Module){
			return true;
		}else if(eObject instanceof ElementRelation){
			return true;
		}else if(ModelUtils.isValidSourceCode(eObject)){
			return true;
		}
		
		return false;
	}
	
	private void showProperties(EObject eObject){
		if(eObject instanceof Module){
			
			IMigrationPropertiesContentChanger vw = (IMigrationPropertiesContentChanger) getView(ElementPropertiesView.ID);
			
			vw.refreshModuleContent((Module) eObject);
			
			return;
		}else if(eObject instanceof Class){
			
			IMigrationPropertiesContentChanger vw = (IMigrationPropertiesContentChanger) getView(ElementPropertiesView.ID);
			
			vw.refreshClassContent((Class) eObject);
			
			return;
		}else{
			
			IMigrationPropertiesContentChanger vw = (IMigrationPropertiesContentChanger) getView(ElementPropertiesView.ID);
			
			vw.refreshGeneric(eObject);
			
			return;
		}
	}
	@Override
	public void execute(Collection<? extends EObject> arg0,
			Map<String, Object> arg1) {
		System.out.println("eee");
		for (EObject eObject : arg0) {
			
			if(eObject instanceof DNode){
				showProperties(((DNode) eObject).getTarget());
			}else if(eObject instanceof DEdge){
				showProperties(((DEdge) eObject).getTarget());
			}else if(eObject instanceof DTreeItem){
				showProperties(((DTreeItem) eObject).getTarget());
			}
			
			
		}

	}

	public static IViewPart getView(String id) {
		IViewReference viewReferences[] = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getViewReferences();
		for (int i = 0; i < viewReferences.length; i++) {
			if (id.equals(viewReferences[i].getId())) {
				return viewReferences[i].getView(false);
			}
		}
		return null;
	}

}
