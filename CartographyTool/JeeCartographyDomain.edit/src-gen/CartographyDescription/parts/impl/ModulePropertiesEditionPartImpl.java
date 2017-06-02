/**
 * Generated with Acceleo
 */
package CartographyDescription.parts.impl;

// Start of user code for imports
import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.ModulePropertiesEditionPart;

import CartographyDescription.providers.CartographyDescriptionMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class ModulePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ModulePropertiesEditionPart {

	protected Text locs;
	protected Text comments;
	protected ReferencesTable anotations;
	protected List<ViewerFilter> anotationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> anotationsFilters = new ArrayList<ViewerFilter>();
	protected Text weight;
	protected Text name;
	protected Text maxWeight;
	protected ReferencesTable migRelations;
	protected List<ViewerFilter> migRelationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> migRelationsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer parentLayer;
	protected EObjectFlatComboViewer parentModule;
	protected Text originalFilePath;
	protected Text newFilePath;
	protected ReferencesTable subModules;
	protected List<ViewerFilter> subModulesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> subModulesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable cartographyElements;
	protected List<ViewerFilter> cartographyElementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> cartographyElementsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable layers;
	protected List<ViewerFilter> layersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> layersFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ModulePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence moduleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = moduleStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.class);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.locs);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.comments);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.anotations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.weight);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.name);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.maxWeight);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.migRelations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.parentLayer);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.parentModule);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.originalFilePath);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.newFilePath);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.subModules);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.cartographyElements);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Module.Properties.layers);
		
		
		composer = new PartComposer(moduleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CartographyDescriptionViewsRepository.Module.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.locs) {
					return createLocsText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.comments) {
					return createCommentsText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.anotations) {
					return createAnotationsAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.weight) {
					return createWeightText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.name) {
					return createNameText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.maxWeight) {
					return createMaxWeightText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.migRelations) {
					return createMigRelationsAdvancedReferencesTable(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.parentLayer) {
					return createParentLayerFlatComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.parentModule) {
					return createParentModuleFlatComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.originalFilePath) {
					return createOriginalFilePathText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.newFilePath) {
					return createNewFilePathText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.subModules) {
					return createSubModulesAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.cartographyElements) {
					return createCartographyElementsAdvancedReferencesTable(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Module.Properties.layers) {
					return createLayersAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(CartographyDescriptionMessages.ModulePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createLocsText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Module.Properties.locs, CartographyDescriptionMessages.ModulePropertiesEditionPart_LocsLabel);
		locs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData locsData = new GridData(GridData.FILL_HORIZONTAL);
		locs.setLayoutData(locsData);
		locs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.locs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locs.getText()));
			}

		});
		locs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.locs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locs.getText()));
				}
			}

		});
		EditingUtils.setID(locs, CartographyDescriptionViewsRepository.Module.Properties.locs);
		EditingUtils.setEEFtype(locs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.locs, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLocsText

		// End of user code
		return parent;
	}

	
	protected Composite createCommentsText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Module.Properties.comments, CartographyDescriptionMessages.ModulePropertiesEditionPart_CommentsLabel);
		comments = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData commentsData = new GridData(GridData.FILL_HORIZONTAL);
		comments.setLayoutData(commentsData);
		comments.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
			}

		});
		comments.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
				}
			}

		});
		EditingUtils.setID(comments, CartographyDescriptionViewsRepository.Module.Properties.comments);
		EditingUtils.setEEFtype(comments, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.comments, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommentsText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnotationsAdvancedTableComposition(Composite parent) {
		this.anotations = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Module.Properties.anotations, CartographyDescriptionMessages.ModulePropertiesEditionPart_AnotationsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				anotations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				anotations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				anotations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				anotations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.anotationsFilters) {
			this.anotations.addFilter(filter);
		}
		this.anotations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.anotations, CartographyDescriptionViewsRepository.SWT_KIND));
		this.anotations.createControls(parent);
		this.anotations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.anotations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData anotationsData = new GridData(GridData.FILL_HORIZONTAL);
		anotationsData.horizontalSpan = 3;
		this.anotations.setLayoutData(anotationsData);
		this.anotations.setLowerBound(0);
		this.anotations.setUpperBound(-1);
		anotations.setID(CartographyDescriptionViewsRepository.Module.Properties.anotations);
		anotations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnotationsAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createWeightText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Module.Properties.weight, CartographyDescriptionMessages.ModulePropertiesEditionPart_WeightLabel);
		weight = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData weightData = new GridData(GridData.FILL_HORIZONTAL);
		weight.setLayoutData(weightData);
		weight.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.weight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
			}

		});
		weight.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.weight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
				}
			}

		});
		EditingUtils.setID(weight, CartographyDescriptionViewsRepository.Module.Properties.weight);
		EditingUtils.setEEFtype(weight, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.weight, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWeightText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Module.Properties.name, CartographyDescriptionMessages.ModulePropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CartographyDescriptionViewsRepository.Module.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.name, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxWeightText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Module.Properties.maxWeight, CartographyDescriptionMessages.ModulePropertiesEditionPart_MaxWeightLabel);
		maxWeight = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData maxWeightData = new GridData(GridData.FILL_HORIZONTAL);
		maxWeight.setLayoutData(maxWeightData);
		maxWeight.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.maxWeight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxWeight.getText()));
			}

		});
		maxWeight.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.maxWeight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxWeight.getText()));
				}
			}

		});
		EditingUtils.setID(maxWeight, CartographyDescriptionViewsRepository.Module.Properties.maxWeight);
		EditingUtils.setEEFtype(maxWeight, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.maxWeight, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxWeightText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createMigRelationsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CartographyDescriptionViewsRepository.Module.Properties.migRelations, CartographyDescriptionMessages.ModulePropertiesEditionPart_MigRelationsLabel);		 
		this.migRelations = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addMigRelations(); }
			public void handleEdit(EObject element) { editMigRelations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMigRelations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMigRelations(element); }
			public void navigateTo(EObject element) { }
		});
		this.migRelations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.migRelations, CartographyDescriptionViewsRepository.SWT_KIND));
		this.migRelations.createControls(parent);
		this.migRelations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.migRelations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData migRelationsData = new GridData(GridData.FILL_HORIZONTAL);
		migRelationsData.horizontalSpan = 3;
		this.migRelations.setLayoutData(migRelationsData);
		this.migRelations.disableMove();
		migRelations.setID(CartographyDescriptionViewsRepository.Module.Properties.migRelations);
		migRelations.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addMigRelations() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(migRelations.getInput(), migRelationsFilters, migRelationsBusinessFilters,
		"migRelations", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.migRelations,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				migRelations.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMigRelations(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.migRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		migRelations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMigRelations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.migRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		migRelations.refresh();
	}

	/**
	 * 
	 */
	protected void editMigRelations(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				migRelations.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createParentLayerFlatComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Module.Properties.parentLayer, CartographyDescriptionMessages.ModulePropertiesEditionPart_ParentLayerLabel);
		parentLayer = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.Module.Properties.parentLayer, CartographyDescriptionViewsRepository.SWT_KIND));
		parentLayer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentLayer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.parentLayer, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentLayer()));
			}

		});
		GridData parentLayerData = new GridData(GridData.FILL_HORIZONTAL);
		parentLayer.setLayoutData(parentLayerData);
		parentLayer.setID(CartographyDescriptionViewsRepository.Module.Properties.parentLayer);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.parentLayer, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParentLayerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createParentModuleFlatComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Module.Properties.parentModule, CartographyDescriptionMessages.ModulePropertiesEditionPart_ParentModuleLabel);
		parentModule = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.Module.Properties.parentModule, CartographyDescriptionViewsRepository.SWT_KIND));
		parentModule.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentModule.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.parentModule, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentModule()));
			}

		});
		GridData parentModuleData = new GridData(GridData.FILL_HORIZONTAL);
		parentModule.setLayoutData(parentModuleData);
		parentModule.setID(CartographyDescriptionViewsRepository.Module.Properties.parentModule);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.parentModule, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParentModuleFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createOriginalFilePathText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Module.Properties.originalFilePath, CartographyDescriptionMessages.ModulePropertiesEditionPart_OriginalFilePathLabel);
		originalFilePath = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData originalFilePathData = new GridData(GridData.FILL_HORIZONTAL);
		originalFilePath.setLayoutData(originalFilePathData);
		originalFilePath.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.originalFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFilePath.getText()));
			}

		});
		originalFilePath.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.originalFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFilePath.getText()));
				}
			}

		});
		EditingUtils.setID(originalFilePath, CartographyDescriptionViewsRepository.Module.Properties.originalFilePath);
		EditingUtils.setEEFtype(originalFilePath, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.originalFilePath, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOriginalFilePathText

		// End of user code
		return parent;
	}

	
	protected Composite createNewFilePathText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Module.Properties.newFilePath, CartographyDescriptionMessages.ModulePropertiesEditionPart_NewFilePathLabel);
		newFilePath = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData newFilePathData = new GridData(GridData.FILL_HORIZONTAL);
		newFilePath.setLayoutData(newFilePathData);
		newFilePath.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.newFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, newFilePath.getText()));
			}

		});
		newFilePath.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.newFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, newFilePath.getText()));
				}
			}

		});
		EditingUtils.setID(newFilePath, CartographyDescriptionViewsRepository.Module.Properties.newFilePath);
		EditingUtils.setEEFtype(newFilePath, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.newFilePath, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNewFilePathText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSubModulesAdvancedTableComposition(Composite parent) {
		this.subModules = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Module.Properties.subModules, CartographyDescriptionMessages.ModulePropertiesEditionPart_SubModulesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.subModules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				subModules.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.subModules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				subModules.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.subModules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				subModules.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.subModules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				subModules.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.subModulesFilters) {
			this.subModules.addFilter(filter);
		}
		this.subModules.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.subModules, CartographyDescriptionViewsRepository.SWT_KIND));
		this.subModules.createControls(parent);
		this.subModules.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.subModules, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData subModulesData = new GridData(GridData.FILL_HORIZONTAL);
		subModulesData.horizontalSpan = 3;
		this.subModules.setLayoutData(subModulesData);
		this.subModules.setLowerBound(0);
		this.subModules.setUpperBound(-1);
		subModules.setID(CartographyDescriptionViewsRepository.Module.Properties.subModules);
		subModules.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSubModulesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCartographyElementsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CartographyDescriptionViewsRepository.Module.Properties.cartographyElements, CartographyDescriptionMessages.ModulePropertiesEditionPart_CartographyElementsLabel);		 
		this.cartographyElements = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addCartographyElements(); }
			public void handleEdit(EObject element) { editCartographyElements(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCartographyElements(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCartographyElements(element); }
			public void navigateTo(EObject element) { }
		});
		this.cartographyElements.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.cartographyElements, CartographyDescriptionViewsRepository.SWT_KIND));
		this.cartographyElements.createControls(parent);
		this.cartographyElements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.cartographyElements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData cartographyElementsData = new GridData(GridData.FILL_HORIZONTAL);
		cartographyElementsData.horizontalSpan = 3;
		this.cartographyElements.setLayoutData(cartographyElementsData);
		this.cartographyElements.disableMove();
		cartographyElements.setID(CartographyDescriptionViewsRepository.Module.Properties.cartographyElements);
		cartographyElements.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCartographyElements() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(cartographyElements.getInput(), cartographyElementsFilters, cartographyElementsBusinessFilters,
		"cartographyElements", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.cartographyElements,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				cartographyElements.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCartographyElements(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.cartographyElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		cartographyElements.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCartographyElements(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.cartographyElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		cartographyElements.refresh();
	}

	/**
	 * 
	 */
	protected void editCartographyElements(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				cartographyElements.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createLayersAdvancedTableComposition(Composite parent) {
		this.layers = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Module.Properties.layers, CartographyDescriptionMessages.ModulePropertiesEditionPart_LayersLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.layers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				layers.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.layers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				layers.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.layers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				layers.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.layers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				layers.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.layersFilters) {
			this.layers.addFilter(filter);
		}
		this.layers.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Module.Properties.layers, CartographyDescriptionViewsRepository.SWT_KIND));
		this.layers.createControls(parent);
		this.layers.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ModulePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Module.Properties.layers, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData layersData = new GridData(GridData.FILL_HORIZONTAL);
		layersData.horizontalSpan = 3;
		this.layers.setLayoutData(layersData);
		this.layers.setLowerBound(0);
		this.layers.setUpperBound(-1);
		layers.setID(CartographyDescriptionViewsRepository.Module.Properties.layers);
		layers.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createLayersAdvancedTableComposition

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#getLocs()
	 * 
	 */
	public String getLocs() {
		return locs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#setLocs(String newValue)
	 * 
	 */
	public void setLocs(String newValue) {
		if (newValue != null) {
			locs.setText(newValue);
		} else {
			locs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.locs);
		if (eefElementEditorReadOnlyState && locs.isEnabled()) {
			locs.setEnabled(false);
			locs.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !locs.isEnabled()) {
			locs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#getComments()
	 * 
	 */
	public String getComments() {
		return comments.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#setComments(String newValue)
	 * 
	 */
	public void setComments(String newValue) {
		if (newValue != null) {
			comments.setText(newValue);
		} else {
			comments.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.comments);
		if (eefElementEditorReadOnlyState && comments.isEnabled()) {
			comments.setEnabled(false);
			comments.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comments.isEnabled()) {
			comments.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#initAnotations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnotations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		anotations.setContentProvider(contentProvider);
		anotations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.anotations);
		if (eefElementEditorReadOnlyState && anotations.isEnabled()) {
			anotations.setEnabled(false);
			anotations.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !anotations.isEnabled()) {
			anotations.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#updateAnotations()
	 * 
	 */
	public void updateAnotations() {
	anotations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addFilterAnotations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnotations(ViewerFilter filter) {
		anotationsFilters.add(filter);
		if (this.anotations != null) {
			this.anotations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addBusinessFilterAnotations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnotations(ViewerFilter filter) {
		anotationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#isContainedInAnotationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnotationsTable(EObject element) {
		return ((ReferencesTableSettings)anotations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#getWeight()
	 * 
	 */
	public String getWeight() {
		return weight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#setWeight(String newValue)
	 * 
	 */
	public void setWeight(String newValue) {
		if (newValue != null) {
			weight.setText(newValue);
		} else {
			weight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.weight);
		if (eefElementEditorReadOnlyState && weight.isEnabled()) {
			weight.setEnabled(false);
			weight.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !weight.isEnabled()) {
			weight.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#getMaxWeight()
	 * 
	 */
	public String getMaxWeight() {
		return maxWeight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#setMaxWeight(String newValue)
	 * 
	 */
	public void setMaxWeight(String newValue) {
		if (newValue != null) {
			maxWeight.setText(newValue);
		} else {
			maxWeight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.maxWeight);
		if (eefElementEditorReadOnlyState && maxWeight.isEnabled()) {
			maxWeight.setEnabled(false);
			maxWeight.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !maxWeight.isEnabled()) {
			maxWeight.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#initMigRelations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMigRelations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		migRelations.setContentProvider(contentProvider);
		migRelations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.migRelations);
		if (eefElementEditorReadOnlyState && migRelations.getTable().isEnabled()) {
			migRelations.setEnabled(false);
			migRelations.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !migRelations.getTable().isEnabled()) {
			migRelations.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#updateMigRelations()
	 * 
	 */
	public void updateMigRelations() {
	migRelations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addFilterMigRelations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMigRelations(ViewerFilter filter) {
		migRelationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addBusinessFilterMigRelations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMigRelations(ViewerFilter filter) {
		migRelationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#isContainedInMigRelationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMigRelationsTable(EObject element) {
		return ((ReferencesTableSettings)migRelations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#getParentLayer()
	 * 
	 */
	public EObject getParentLayer() {
		if (parentLayer.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parentLayer.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#initParentLayer(EObjectFlatComboSettings)
	 */
	public void initParentLayer(EObjectFlatComboSettings settings) {
		parentLayer.setInput(settings);
		if (current != null) {
			parentLayer.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.parentLayer);
		if (eefElementEditorReadOnlyState && parentLayer.isEnabled()) {
			parentLayer.setEnabled(false);
			parentLayer.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentLayer.isEnabled()) {
			parentLayer.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#setParentLayer(EObject newValue)
	 * 
	 */
	public void setParentLayer(EObject newValue) {
		if (newValue != null) {
			parentLayer.setSelection(new StructuredSelection(newValue));
		} else {
			parentLayer.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.parentLayer);
		if (eefElementEditorReadOnlyState && parentLayer.isEnabled()) {
			parentLayer.setEnabled(false);
			parentLayer.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentLayer.isEnabled()) {
			parentLayer.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#setParentLayerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentLayerButtonMode(ButtonsModeEnum newValue) {
		parentLayer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addFilterParentLayer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentLayer(ViewerFilter filter) {
		parentLayer.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addBusinessFilterParentLayer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentLayer(ViewerFilter filter) {
		parentLayer.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#getParentModule()
	 * 
	 */
	public EObject getParentModule() {
		if (parentModule.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parentModule.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#initParentModule(EObjectFlatComboSettings)
	 */
	public void initParentModule(EObjectFlatComboSettings settings) {
		parentModule.setInput(settings);
		if (current != null) {
			parentModule.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.parentModule);
		if (eefElementEditorReadOnlyState && parentModule.isEnabled()) {
			parentModule.setEnabled(false);
			parentModule.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentModule.isEnabled()) {
			parentModule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#setParentModule(EObject newValue)
	 * 
	 */
	public void setParentModule(EObject newValue) {
		if (newValue != null) {
			parentModule.setSelection(new StructuredSelection(newValue));
		} else {
			parentModule.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.parentModule);
		if (eefElementEditorReadOnlyState && parentModule.isEnabled()) {
			parentModule.setEnabled(false);
			parentModule.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentModule.isEnabled()) {
			parentModule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#setParentModuleButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentModuleButtonMode(ButtonsModeEnum newValue) {
		parentModule.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addFilterParentModule(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentModule(ViewerFilter filter) {
		parentModule.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addBusinessFilterParentModule(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentModule(ViewerFilter filter) {
		parentModule.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#getOriginalFilePath()
	 * 
	 */
	public String getOriginalFilePath() {
		return originalFilePath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#setOriginalFilePath(String newValue)
	 * 
	 */
	public void setOriginalFilePath(String newValue) {
		if (newValue != null) {
			originalFilePath.setText(newValue);
		} else {
			originalFilePath.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.originalFilePath);
		if (eefElementEditorReadOnlyState && originalFilePath.isEnabled()) {
			originalFilePath.setEnabled(false);
			originalFilePath.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !originalFilePath.isEnabled()) {
			originalFilePath.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#getNewFilePath()
	 * 
	 */
	public String getNewFilePath() {
		return newFilePath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#setNewFilePath(String newValue)
	 * 
	 */
	public void setNewFilePath(String newValue) {
		if (newValue != null) {
			newFilePath.setText(newValue);
		} else {
			newFilePath.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.newFilePath);
		if (eefElementEditorReadOnlyState && newFilePath.isEnabled()) {
			newFilePath.setEnabled(false);
			newFilePath.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !newFilePath.isEnabled()) {
			newFilePath.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#initSubModules(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSubModules(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		subModules.setContentProvider(contentProvider);
		subModules.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.subModules);
		if (eefElementEditorReadOnlyState && subModules.isEnabled()) {
			subModules.setEnabled(false);
			subModules.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !subModules.isEnabled()) {
			subModules.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#updateSubModules()
	 * 
	 */
	public void updateSubModules() {
	subModules.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addFilterSubModules(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubModules(ViewerFilter filter) {
		subModulesFilters.add(filter);
		if (this.subModules != null) {
			this.subModules.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addBusinessFilterSubModules(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubModules(ViewerFilter filter) {
		subModulesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#isContainedInSubModulesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubModulesTable(EObject element) {
		return ((ReferencesTableSettings)subModules.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#initCartographyElements(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCartographyElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		cartographyElements.setContentProvider(contentProvider);
		cartographyElements.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.cartographyElements);
		if (eefElementEditorReadOnlyState && cartographyElements.getTable().isEnabled()) {
			cartographyElements.setEnabled(false);
			cartographyElements.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !cartographyElements.getTable().isEnabled()) {
			cartographyElements.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#updateCartographyElements()
	 * 
	 */
	public void updateCartographyElements() {
	cartographyElements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addFilterCartographyElements(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCartographyElements(ViewerFilter filter) {
		cartographyElementsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addBusinessFilterCartographyElements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCartographyElements(ViewerFilter filter) {
		cartographyElementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#isContainedInCartographyElementsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCartographyElementsTable(EObject element) {
		return ((ReferencesTableSettings)cartographyElements.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#initLayers(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initLayers(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		layers.setContentProvider(contentProvider);
		layers.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Module.Properties.layers);
		if (eefElementEditorReadOnlyState && layers.isEnabled()) {
			layers.setEnabled(false);
			layers.setToolTipText(CartographyDescriptionMessages.Module_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !layers.isEnabled()) {
			layers.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#updateLayers()
	 * 
	 */
	public void updateLayers() {
	layers.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addFilterLayers(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLayers(ViewerFilter filter) {
		layersFilters.add(filter);
		if (this.layers != null) {
			this.layers.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#addBusinessFilterLayers(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayers(ViewerFilter filter) {
		layersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ModulePropertiesEditionPart#isContainedInLayersTable(EObject element)
	 * 
	 */
	public boolean isContainedInLayersTable(EObject element) {
		return ((ReferencesTableSettings)layers.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CartographyDescriptionMessages.Module_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
