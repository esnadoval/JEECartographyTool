package jeecartographytool.wizards;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (xmi).
 */

public class SelectedClassesPage extends WizardPage {
	private ArrayList<File> formNames;
	private ArrayList<File> selectedFiles = new ArrayList<File>();
	private boolean reorganizeCode = false;
	private Label labelCount;
	private Button reorganize;
	private org.eclipse.swt.widgets.List selectedForms;

	protected SelectedClassesPage(String pageName, ArrayList<File> formFiles) {
		super(pageName);
		setTitle("Application Items to parse.");
		setDescription("These Items are going to be parsed into a XMI model.");
		formNames = formFiles;

	
	}

	public ArrayList<File> getSelectedFiles() {
		return selectedFiles;
	}

	
	public boolean isReorganizeCode() {
		return reorganizeCode;
	}

	public void setReorganizeCode(boolean reorganizeCode) {
		this.reorganizeCode = reorganizeCode;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		container.setLayout(new FillLayout(SWT.VERTICAL));

		selectedForms = new List(container, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);

		labelCount = new Label(container, SWT.BOTTOM);

		reorganize = new Button(container, SWT.CHECK);

		reorganize.setText("Reorganize source code acording to detected modules.");

		reorganize.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Button button = ((Button) e.widget);
	            reorganizeCode = button.getSelection();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button button = ((Button) e.widget);
				reorganizeCode =  button.getSelection();

			}
		});

		selectedForms.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				int[] selectedItems = selectedForms.getSelectionIndices();
				ArrayList<File> sel = new ArrayList<File>();

				for (int loopIndex = 0; loopIndex < selectedItems.length; loopIndex++) {
					sel.add(formNames.get(selectedItems[loopIndex]));
				}

				selectedFiles = sel;
				labelCount.setText("\n\nTotal: " + formNames.size() + " Items.\nSeleccionados: " + selectedFiles.size());
			}

			public void widgetDefaultSelected(SelectionEvent event) {
				int[] selectedItems = selectedForms.getSelectionIndices();
				ArrayList<File> sel = new ArrayList<File>();

				for (int loopIndex = 0; loopIndex < selectedItems.length; loopIndex++) {
					sel.add(formNames.get(selectedItems[loopIndex]));
				}

				selectedFiles = sel;
				labelCount.setText("\n\nTotal: " + formNames.size() + " Items.\nSeleccionados: " + selectedFiles.size());
				
			}
		});

		setControl(container);

	}

	public void refreshList() {
		for (File string : formNames) {
			selectedForms.add(string.getPath());
		}
		selectedForms.setSelection(0, formNames.size() - 1);
		selectedFiles = formNames;
		labelCount.setText("\n\nTotal: " + formNames.size() + " Items.");
	}

}