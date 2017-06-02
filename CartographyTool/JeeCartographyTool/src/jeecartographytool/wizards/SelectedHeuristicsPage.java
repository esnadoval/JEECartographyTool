package jeecartographytool.wizards;

import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;

import jeecartographytool.extensions.IModelHeuristic;
import jeecartographytool.handlers.ModelHeuristicsHandler;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (xmi).
 */

public class SelectedHeuristicsPage extends WizardPage {

	private ArrayList<IModelHeuristic> postProcClas;
	private List availPostProc;
	private List selectPostProc;
	private Button btnUp;
	private Button btnDn;
	private Button btnSel;
	private Button btnDSel;
	private Group ava;
	private Group used;
	private Group midL;

	protected SelectedHeuristicsPage(String pageName) {
		super(pageName);

		setTitle("Select Available Heuristics.");
		setDescription("Select the heuristics to be applied on the JEE application.");

		// TODO Auto-generated constructor stub
	}

	private org.eclipse.swt.widgets.List selectedForms;

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout(5, true);

		container.setLayout(layout);

		used = new Group(container, 0);
		used.setText("Selected Heuristics.");
		used.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 2, 2));
		used.setLayout(new FillLayout(SWT.HORIZONTAL));
		used.setVisible(true);

		midL = new Group(container, 0);
		midL.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, true, 1,
				2));
		midL.setLayout(new FillLayout(SWT.VERTICAL));
		midL.setText("Execution Order");
		midL.setVisible(true);

		btnUp = new Button(midL, SWT.PUSH);
		btnUp.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {

				int sel = selectPostProc.getSelectionIndex();
				if (sel - 1 >= 0) {
					String chElement = selectPostProc.getItem(sel - 1);
					String actElement = selectPostProc.getItem(sel);

					selectPostProc.setItem(sel - 1, actElement);
					selectPostProc.setItem(sel, chElement);
					selectPostProc.setSelection(sel - 1);
				}
			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btnUp.setText("/\\");
		btnDn = new Button(midL, SWT.PUSH);

		btnDn.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDown(MouseEvent e) {
				int sel = selectPostProc.getSelectionIndex();
				if (sel + 1 < selectPostProc.getItemCount()) {
					String chElement = selectPostProc.getItem(sel + 1);
					String actElement = selectPostProc.getItem(sel);

					selectPostProc.setItem(sel + 1, actElement);
					selectPostProc.setItem(sel, chElement);
					selectPostProc.setSelection(sel + 1);
				}

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btnDn.setText("\\/");

		btnSel = new Button(midL, SWT.PUSH);
		btnSel.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				selectPostProc.removeAll();
				for (IModelHeuristic iModelPostProcessing : postProcClas) {

					selectPostProc.add(iModelPostProcessing.getHeuristicName());

				}
				availPostProc.removeAll();
			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btnSel.setText("<<");
		btnDSel = new Button(midL, SWT.PUSH);
		btnDSel.setText(">>");
		btnDSel.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				availPostProc.removeAll();
				for (IModelHeuristic iModelPostProcessing : postProcClas) {

					availPostProc.add(iModelPostProcessing.getHeuristicName());

				}
				selectPostProc.removeAll();

			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		ava = new Group(container, 0);
		ava.setText("Available Heuristics.");
		ava.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 2, 2));
		ava.setLayout(new FillLayout(SWT.HORIZONTAL));
		ava.setVisible(true);

		selectPostProc = new List(used, SWT.BORDER | SWT.V_SCROLL
				| SWT.H_SCROLL);

		selectPostProc.addMouseListener(new MouseListener() {
			int lastSelected;

			@Override
			public void mouseUp(MouseEvent e) {

			}

			@Override
			public void mouseDown(MouseEvent e) {

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {

				int selectedItems = selectPostProc.getSelectionIndex();

				availPostProc.add(selectPostProc.getItem(selectedItems));

				selectPostProc.remove(selectedItems);

			}
		});

		availPostProc = new List(ava, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);

		availPostProc.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {

				int selectedItems = availPostProc.getSelectionIndex();

				selectPostProc.add(availPostProc.getItem(selectedItems));

				availPostProc.remove(selectedItems);

			}
		});

		postProcClas = new ModelHeuristicsHandler(null).evaluate(Platform
				.getExtensionRegistry());

		for (IModelHeuristic iModelPostProcessing : postProcClas) {

			selectPostProc.add(iModelPostProcessing.getHeuristicName());
			/*
			 * Button tmp = new Button(container, SWT.CHECK);
			 * tmp.setText(iModelPostProcessing.getHeuristicName());
			 * tmp.setToolTipText
			 * (iModelPostProcessing.getHeuristicDescription());
			 * tmp.setSelection(true); checks.add(tmp);
			 */
		}

		setControl(container);

	}

	public ArrayList<IModelHeuristic> getSelectedPostProcessingClasses() {

		ArrayList<IModelHeuristic> selected = new ArrayList<IModelHeuristic>();

		for (int i = 0; i < selectPostProc.getItemCount(); i++) {
			for (IModelHeuristic iModelHeuristic : postProcClas) {
				if (selectPostProc.getItem(i).toString()
						.equals(iModelHeuristic.getHeuristicName())) {
					selected.add(iModelHeuristic);
				}
			}

		}

		return selected;
	}

}