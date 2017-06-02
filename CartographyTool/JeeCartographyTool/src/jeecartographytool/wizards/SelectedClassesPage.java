package jeecartographytool.wizards;


import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.*;
/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (xmi).
 */

public class SelectedClassesPage extends WizardPage {
	private ArrayList<File> formNames;
	private ArrayList<File> selectedFiles = new ArrayList<File>();
	
	private Label labelCount;
	private org.eclipse.swt.widgets.List selectedForms;
	protected SelectedClassesPage(String pageName,ArrayList<File> formFiles) {
		super(pageName);
		setTitle("Application Items to parse.");
		setDescription("These Items are going to be parsed into a XMI model.");
		formNames = formFiles;
		
		
		// TODO Auto-generated constructor stub
	}




	public ArrayList<File> getSelectedFiles() {
		return selectedFiles;
	}




	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		
		container.setLayout(new FillLayout(SWT.VERTICAL));
		
		selectedForms= new List(container, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL| SWT.H_SCROLL );
		
		labelCount = new Label(container, SWT.BOTTOM);
	
		
		   selectedForms.addSelectionListener(new SelectionListener() {
			      public void widgetSelected(SelectionEvent event) {
			    	  
			    	  ArrayList<File> sel = new ArrayList<File>();
			        int[] selectedItems = selectedForms.getSelectionIndices();
			        System.out.println("===============");
			        for (int loopIndex = 0; loopIndex < selectedItems.length; loopIndex++){
			        	
			        	sel.add(formNames.get(selectedItems[loopIndex]));
			        }
			        
		
			        selectedFiles = sel;
			       labelCount.setText("\n\nTotal: "+formNames.size() + " Items.\nSeleccionados: "+selectedFiles.size());
			      }
			      public void widgetDefaultSelected(SelectionEvent event) {
			        int[] selectedItems = selectedForms.getSelectionIndices();
			        ArrayList<File> sel = new ArrayList<File>();
			        System.out.println("CHA");
			        for (int loopIndex = 0; loopIndex < selectedItems.length; loopIndex++){
			        	sel.add(formNames.get(selectedItems[loopIndex]));
			        }
			       
			        selectedFiles = sel;
			        labelCount.setText("\n\nTotal: "+formNames.size() + " Items.\nSeleccionados: "+selectedFiles.size());
			        //System.out.println("SZ"+formNames.size());
			      }
			    });
				
		

		setControl(container);
		
	}

	public void refreshList(){
		for (File string : formNames) {
			selectedForms.add(string.getPath());
		}
		selectedForms.setSelection(0, formNames.size()-1);
		selectedFiles = formNames;
		labelCount.setText("\n\nTotal: "+formNames.size() + " Items.");
	}
	

	

	
}