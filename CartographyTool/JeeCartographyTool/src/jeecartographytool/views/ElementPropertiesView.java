package jeecartographytool.views;

import java.util.ArrayList;
import java.util.Iterator;

import jeecartographytool.utils.FileUtils;
import jeecartographytool.utils.ModelUtils;

import org.eclipse.sirius.eef.actions.OpenPropertiesWizardAction;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.part.*;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;

import CartographyDescription.Attribute;
import CartographyDescription.CartographyElement;
import CartographyDescription.ElementRelation;
import CartographyDescription.Exception;
import CartographyDescription.Method;
import CartographyDescription.Module;
import CartographyDescription.Variable;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class ElementPropertiesView extends ViewPart implements
		IMigrationPropertiesContentChanger {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "jeecartographytool.views.MigrationPropertiesView";

	public static final int VIEWING_MODULE = 0;
	public static final int VIEWING_CLASS = 1;
	public static final int VIEWING_GEN = 1;
	private EObject selectedElement;
	private TableViewer viewer;
	private Button buttonOpenSrc;

	private Label lblTitle;
	private Label lblDetail;

	private Label lblFormas;

	private Combo subsystemFormsCombo;
	private List subsystemForms;
	private Label lblTables;

	private Combo subsystemTablesCombo;
	private List subsystemTables;
	private Composite parent;

	private Group cpt1;
	private Group cpt2;
	private org.eclipse.swt.widgets.Table details;

	private int viewing = 0;

	/**
	 * The constructor.
	 */
	public ElementPropertiesView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		this.parent = parent;
		GridLayout layout = new GridLayout(2, false);

		parent.setLayout(layout);

		lblTitle = new Label(parent, SWT.LEFT);

		lblTitle.setFont(new Font(null, "Arial", 14, SWT.BOLD));
		lblTitle.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2,
				2));

		lblDetail = new Label(parent, SWT.LEFT);

		lblDetail.setFont(new Font(null, "Arial", 12, SWT.NORMAL));
		lblDetail.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2,
				1));
		lblDetail.setText("Select an element to see its properties.");
		
		buttonOpenSrc = new Button(parent, SWT.PUSH);
		buttonOpenSrc.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2,
				1));
		buttonOpenSrc.setVisible(false);
		buttonOpenSrc.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseUp(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDown(MouseEvent e) {
				switch (viewing) {
				case VIEWING_CLASS:
					FileUtils.openFileinWorkSpace(((CartographyDescription.Class)selectedElement).getNewFilePath());
					break;
				case VIEWING_MODULE:
					OpenPropertiesWizardAction opw = new OpenPropertiesWizardAction();
					ArrayList<EObject> obj = new ArrayList<EObject>();
					obj.add(selectedElement);
					opw.execute(obj, null);
					break;
					
				default:
					break;
				}
				
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		cpt1 = new Group(parent, 0);
		cpt1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 15));
		cpt1.setText("Details");
		cpt1.setLayout(new GridLayout(2, false));
		cpt1.setVisible(false);

		details = new org.eclipse.swt.widgets.Table(cpt1, SWT.MULTI
				| SWT.BORDER | SWT.FULL_SELECTION);
		details.setLinesVisible(true);
		details.setHeaderVisible(false);
		details.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2,
				15));
		TableColumn column1 = new TableColumn(details, SWT.NONE);
		column1.setText("Property");

		TableColumn column2 = new TableColumn(details, SWT.NONE);
		column2.setText("Detail");

		cpt2 = new Group(parent, 0);
		cpt2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 20));
		cpt2.setLayout(new GridLayout(2, false));
		cpt2.setText("Contents");
		cpt2.setVisible(false);
		lblFormas = new Label(cpt2, SWT.LEFT);
		lblFormas.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false,
				2, 1));

		subsystemFormsCombo = new Combo(cpt2, SWT.READ_ONLY);
		subsystemFormsCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true, 2, 1));
		subsystemFormsCombo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				switch (viewing) {
				case VIEWING_MODULE:
					populateModuleForms(subsystemFormsCombo
							.getItem(subsystemFormsCombo.getSelectionIndex()));
					break;

				default:
					break;
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				switch (viewing) {
				case VIEWING_MODULE:
					populateModuleTables(subsystemTablesCombo
							.getItem(subsystemTablesCombo.getSelectionIndex()));
					break;

				default:
					break;
				}

			}
		});

		subsystemForms = new List(cpt2, SWT.BORDER | SWT.FILL | SWT.V_SCROLL
				| SWT.H_SCROLL);
		subsystemForms.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 2, 9));

		lblTables = new Label(cpt2, SWT.LEFT);
		lblTables.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false,
				2, 1));

		subsystemTablesCombo = new Combo(cpt2, SWT.READ_ONLY);
		subsystemTablesCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true, 2, 1));
		subsystemTablesCombo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				switch (viewing) {
				case VIEWING_MODULE:
					populateModuleTables(subsystemTablesCombo
							.getItem(subsystemTablesCombo.getSelectionIndex()));
					break;

				default:
					break;
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				switch (viewing) {
				case VIEWING_MODULE:
					populateModuleTables(subsystemTablesCombo
							.getItem(subsystemTablesCombo.getSelectionIndex()));
					break;

				default:
					break;
				}

			}
		});

		subsystemTables = new List(cpt2, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL
				| SWT.H_SCROLL);
		subsystemTables.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 2, 10));
	}

	/*
	 * private void hookContextMenu() { MenuManager menuMgr = new
	 * MenuManager("#PopupMenu"); menuMgr.setRemoveAllWhenShown(true);
	 * menuMgr.addMenuListener(new IMenuListener() { public void
	 * menuAboutToShow(IMenuManager manager) {
	 * MigrationPropertiesView.this.fillContextMenu(manager); } }); Menu menu =
	 * menuMgr.createContextMenu(viewer.getControl());
	 * viewer.getControl().setMenu(menu); getSite().registerContextMenu(menuMgr,
	 * viewer); }
	 * 
	 * private void contributeToActionBars() { IActionBars bars =
	 * getViewSite().getActionBars(); fillLocalPullDown(bars.getMenuManager());
	 * fillLocalToolBar(bars.getToolBarManager()); }
	 * 
	 * private void fillLocalPullDown(IMenuManager manager) {
	 * manager.add(action1); manager.add(new Separator()); manager.add(action2);
	 * }
	 * 
	 * private void fillContextMenu(IMenuManager manager) {
	 * manager.add(action1); manager.add(action2); // Other plug-ins can
	 * contribute there actions here manager.add(new
	 * Separator(IWorkbenchActionConstants.MB_ADDITIONS)); }
	 * 
	 * private void fillLocalToolBar(IToolBarManager manager) {
	 * manager.add(action1); manager.add(action2); }
	 * 
	 * private void makeActions() { action1 = new Action() { public void run() {
	 * showMessage("Action 1 executed"); } }; action1.setText("Action 1");
	 * action1.setToolTipText("Action 1 tooltip");
	 * action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
	 * getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
	 * 
	 * action2 = new Action() { public void run() {
	 * showMessage("Action 2 executed"); } }; action2.setText("Action 2");
	 * action2.setToolTipText("Action 2 tooltip");
	 * action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
	 * getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK)); doubleClickAction =
	 * new Action() { public void run() { ISelection selection =
	 * viewer.getSelection(); Object obj =
	 * ((IStructuredSelection)selection).getFirstElement();
	 * showMessage("Double-click detected on "+obj.toString()); } }; }
	 * 
	 * private void hookDoubleClickAction() { viewer.addDoubleClickListener(new
	 * IDoubleClickListener() { public void doubleClick(DoubleClickEvent event)
	 * { doubleClickAction.run(); } }); } private void showMessage(String
	 * message) { MessageDialog.openInformation( viewer.getControl().getShell(),
	 * "Migration Properties", message); }
	 * 
	 * /** Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		// viewer.getControl().setFocus();
	}

	public void refreshModuleContent(Module fg) {
		System.out.println("REFRESHING");

		viewing = VIEWING_MODULE;
		selectedElement = fg;

		lblTitle.setText(fg.getName());
		lblDetail.setText("Module.");

		subsystemFormsCombo.removeAll();
		subsystemForms.removeAll();
		subsystemTablesCombo.removeAll();
		subsystemTables.removeAll();
		details.removeAll();
		buttonOpenSrc.setVisible(true);
		buttonOpenSrc.setText("Edit Contents");

		TableItem item1 = new TableItem(details, SWT.NONE);
		item1.setText(0, "Classes");
		item1.setText(1, "" + fg.getCartographyElements().size());

		TableItem item2 = new TableItem(details, SWT.NONE);
		item2.setText(0, "Parent Group");
		item2.setText(1, "" + ((Module)fg.eContainer()).getName());

		for (int i = 0; i < details.getColumnCount(); i++) {
			details.getColumn(i).pack();
		}

		ArrayList<Class> clss = ModelUtils.getCompilationTypes();
		ArrayList<String> nm = new ArrayList<String>();
		nm.add("All");
		for (Class class1 : clss) {
			nm.add(class1.getSimpleName());
		}
		String[] itArr = new String[nm.size()];

		subsystemFormsCombo.setItems(nm.toArray(itArr));
		subsystemFormsCombo.select(0);
		populateModuleForms("All");

		ArrayList<String> nm2 = new ArrayList<String>();
		nm2.add("All");
		for (ElementRelation rl : ((Module) fg.eContainer()).getMigRelations()) {

			if (rl.getSrc().getParentModule().getName().equals(fg.getName())) {

				boolean fnd = false;
				for (String string : nm2) {
					if(string.equals(rl.getDest().getParentModule().getName())){
						fnd = true;
					}
				}
				if(!fnd){
				nm2.add(rl.getDest().getParentModule().getName());
				}

			}

		}
		String[] it2 = new String[nm2.size()];

		subsystemTablesCombo.setItems(nm2.toArray(it2));
		subsystemTablesCombo.select(0);
		populateModuleTables("All");

		cpt1.setVisible(true);
		cpt2.setVisible(true);
		parent.redraw();

	}

	public void populateModuleForms(String value) {
		subsystemForms.removeAll();
		int frms = 0;
		for (CartographyElement frm : ((Module) selectedElement)
				.getCartographyElements()) {
			if (frm.eClass().getName().equals(value) || value.equals("All")) {
				subsystemForms.add("[" + frm.eClass().getName() + "] "
						+ frm.getName());
				frms++;
			}

		}

		lblFormas.setText(frms + " Classes of:");
	}

	public void populateModuleTables(String value) {
		int tbls = 0;
		subsystemTables.removeAll();
		for (ElementRelation rl : ((Module) selectedElement.eContainer())
				.getMigRelations()) {

			if (rl.getSrc().getParentModule().getName()
					.equals(((Module) selectedElement).getName())
					&& (rl.getDest().getParentModule().getName().equals(value) || value
							.equals("All"))) {

				subsystemTables.add("[" + rl.getSrc().eClass().getName() + "]"
						+ rl.getSrc().getName() + " --< "+rl.getRelationType().getLiteral()+">--> " + "["
						+ rl.getDest().eClass().getName() + "]"
						+ rl.getDest().getName());
				tbls++;
			}

		}
		lblTables.setText(tbls + " Extramodule Dependencies to:");
	}

	public void refreshClassContent(CartographyDescription.Class so) {
		System.out.println("REFRESHING");
		selectedElement = so;
		viewing = VIEWING_CLASS;
		lblTitle.setText(so.getName());
		lblDetail.setText(so.eClass().getName());

		subsystemFormsCombo.removeAll();
		subsystemForms.removeAll();
		subsystemTablesCombo.removeAll();
		subsystemTables.removeAll();
		details.removeAll();
		buttonOpenSrc.setVisible(true);
		buttonOpenSrc.setText("Open Source Code");

		TableItem item1 = new TableItem(details, SWT.NONE);
		item1.setText(0, "Dependencies");
		item1.setText(1, "" + so.getMigRelations().size());

		TableItem item2 = new TableItem(details, SWT.NONE);
		item2.setText(0, "Layer");
		item2.setText(1, "" + so.getParentLayer().getName());

		TableItem item3 = new TableItem(details, SWT.NONE);
		item3.setText(0, "Module");
		item3.setText(1, "" + so.getParentModule().getName());

		for (int i = 0; i < details.getColumnCount(); i++) {
			details.getColumn(i).pack();
		}

		int frms = 0;
		int tbls = 0;
		subsystemFormsCombo.setItems(new String[] { "All" });
		subsystemFormsCombo.select(0);
		for (Attribute atr : so.getAttributes()) {

			subsystemForms.add("[" + atr.getVariable().getType().getName()
					+ "] " + atr.getVariable().getName());
			frms++;

		}

		subsystemTablesCombo.setItems(new String[] { "All" });
		subsystemTablesCombo.select(0);
		for (Method mth : so.getMethods()) {

			String prmst = "";
			String ext = "";

			for (Variable prms : mth.getParameters()) {
				prmst += prms.getName() + ",";

			}

			for (Exception ex : mth.getExceptions()) {
				ext += ex.getName() + ",";

			}

			subsystemTables.add(""
					+ mth.getVisibility().getLiteral()
					+ " "
					+ (mth.getReturnType() == null ? "void" : mth
							.getReturnType().getName())
					+ " "
					+ mth.getName()
					+ "("
					+ (prmst.length() == 0 ? "" : prmst.substring(0,
							prmst.length() - 1))
					+ ")"
					+ (ext.length() == 0 ? "" : " throws "
							+ ext.substring(0, ext.length() - 1)));
			tbls++;

		}

		lblFormas.setText(frms + " Attributes.");
		lblTables.setText(tbls + " Methods.");
		cpt1.setVisible(true);
		cpt2.setVisible(true);
		parent.redraw();
	}

	@Override
	public void refreshGeneric(EObject co) {

		if (co instanceof ElementRelation) {
			showRelationProperties((ElementRelation) co);
		}

	}

	public void showRelationProperties(ElementRelation lr) {
		System.out.println("REFRESHING");

		viewing = VIEWING_GEN;
		selectedElement = lr;
		cpt2.setVisible(false);
		buttonOpenSrc.setVisible(false);
		lblTitle.setText("Relation.");
		lblDetail.setText(lr.getRelationType().getLiteral() + ".");

		subsystemForms.removeAll();

		subsystemTables.removeAll();
		details.removeAll();

		TableItem ite = new TableItem(details, SWT.NONE);
		ite.setText(0, "Src");
		ite.setText(1, lr.getSrc().getName());

		TableItem ite1 = new TableItem(details, SWT.NONE);
		ite1.setText(0, "Dest");
		ite1.setText(1, lr.getDest().getName());

		TableItem ite2 = new TableItem(details, SWT.NONE);
		ite2.setText(0, "Module src");
		ite2.setText(1, lr.getSrc().getParentModule().getName());

		TableItem ite3 = new TableItem(details, SWT.NONE);
		ite3.setText(0, "Module dest");
		ite3.setText(1, lr.getDest().getParentModule().getName());

		TableItem ite4 = new TableItem(details, SWT.NONE);
		ite4.setText(0, "Layer src");
		ite4.setText(1, lr.getSrc().getParentLayer().getName());

		TableItem ite5 = new TableItem(details, SWT.NONE);
		ite5.setText(0, "Layer dest");
		ite5.setText(1, lr.getDest().getParentLayer().getName());
		for (int i = 0; i < details.getColumnCount(); i++) {
			details.getColumn(i).pack();
		}

		cpt1.setVisible(true);

		parent.redraw();
	}

}