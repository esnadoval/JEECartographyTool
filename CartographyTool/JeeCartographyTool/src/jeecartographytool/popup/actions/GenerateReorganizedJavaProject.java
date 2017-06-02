package jeecartographytool.popup.actions;

import java.util.Iterator;

import jeecartographytool.builder.BuildReorganizedProject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class GenerateReorganizedJavaProject implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selFile;

	/**
	 * Constructor for Action1.
	 */
	public GenerateReorganizedJavaProject() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		
		BuildReorganizedProject reo = new BuildReorganizedProject();

		Iterator itr = ((IStructuredSelection) selFile).iterator();

		IProject project = null;
		Object selection = itr.next();

		if (selection instanceof IFile) {

			try {

				reo.createReorganizedProject((IFile) selection,null,null);
				MessageDialog.openInformation(shell, "Jee Cartography Tool", "Code relocated successfully. Remember to fix imports in each class and pom.xml for libraries.");

			} catch (Exception e) {
				MessageDialog.openError(
						shell,
						"Jee Cartography Tool",
						"An error ocurred during the operation. "
								+ e.getMessage());
				e.printStackTrace();
			}

		}

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {

		selFile = selection;

	}

}
