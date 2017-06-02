package jeecartographytool.handlers;

import java.io.File;
import java.util.Collection;
import java.util.Map;

import jeecartographytool.utils.FileUtils;
import jeecartographytool.utils.ModelUtils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import CartographyDescription.Bussiness;
import CartographyDescription.Entity;
import CartographyDescription.Interface;
import CartographyDescription.PersistenceManager;
import CartographyDescription.Service;
import CartographyDescription.UI;
import CartographyDescription.UnitTest;

import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.tree.DTreeItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class OpenClassFile implements IExternalJavaAction {

	public OpenClassFile() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		boolean fnlReturn = false; 
		
		for (EObject eObject : arg0) {
				if(eObject instanceof DNode){
					return getSemanticElementValidation(((DNode) eObject).getTarget());
				}else if(eObject instanceof DTreeItem){
					return getSemanticElementValidation(((DTreeItem) eObject).getTarget());
				}
				
		}
		 
		 return fnlReturn;
	}
private boolean getSemanticElementValidation(EObject eObject){
		
			
		return ModelUtils.isValidSourceCode(eObject);
	}

	@Override
	public void execute(Collection<? extends EObject> arg0,
			Map<String, Object> arg1) {
		CartographyDescription.Class tmp = null;
		for (EObject eObject : arg0) {
			if(eObject instanceof DNode){
				tmp = ((CartographyDescription.Class)((DNode)eObject).getTarget());
			}else if(eObject instanceof DTreeItem){
				tmp = ((CartographyDescription.Class)((DTreeItem)eObject).getTarget());
			}
			
			
			FileUtils.openFileinWorkSpace(tmp.getNewFilePath());
		}
		
	}

}
