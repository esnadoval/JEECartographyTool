/**
 * Generated with Acceleo
 */
package CartographyDescription.parts.impl;

// Start of user code for imports
import CartographyDescription.parts.ApplicationPropertiesEditionPart;
import CartographyDescription.parts.CartographyDescriptionViewsRepository;

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
public class ApplicationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ApplicationPropertiesEditionPart {

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
	protected ReferencesTable modules;
	protected List<ViewerFilter> modulesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> modulesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable layers;
	protected List<ViewerFilter> layersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> layersFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable compilationUnits;
	protected List<ViewerFilter> compilationUnitsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> compilationUnitsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable appRelations;
	protected List<ViewerFilter> appRelationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> appRelationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable paterns;
	protected List<ViewerFilter> paternsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> paternsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ApplicationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence applicationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = applicationStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.class);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.locs);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.comments);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.anotations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.weight);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.name);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.maxWeight);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.migRelations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.parentLayer);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.parentModule);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.originalFilePath);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.newFilePath);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.modules);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.layers);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.compilationUnits);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.appRelations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Application.Properties.paterns);
		
		
		composer = new PartComposer(applicationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CartographyDescriptionViewsRepository.Application.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.locs) {
					return createLocsText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.comments) {
					return createCommentsText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.anotations) {
					return createAnotationsAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.weight) {
					return createWeightText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.name) {
					return createNameText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.maxWeight) {
					return createMaxWeightText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.migRelations) {
					return createMigRelationsAdvancedReferencesTable(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.parentLayer) {
					return createParentLayerFlatComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.parentModule) {
					return createParentModuleFlatComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.originalFilePath) {
					return createOriginalFilePathText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.newFilePath) {
					return createNewFilePathText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.modules) {
					return createModulesAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.layers) {
					return createLayersAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.compilationUnits) {
					return createCompilationUnitsAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.appRelations) {
					return createAppRelationsAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Application.Properties.paterns) {
					return createPaternsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(CartographyDescriptionMessages.ApplicationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createLocsText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Application.Properties.locs, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_LocsLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.locs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locs.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.locs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locs.getText()));
				}
			}

		});
		EditingUtils.setID(locs, CartographyDescriptionViewsRepository.Application.Properties.locs);
		EditingUtils.setEEFtype(locs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.locs, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLocsText

		// End of user code
		return parent;
	}

	
	protected Composite createCommentsText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Application.Properties.comments, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_CommentsLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
				}
			}

		});
		EditingUtils.setID(comments, CartographyDescriptionViewsRepository.Application.Properties.comments);
		EditingUtils.setEEFtype(comments, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.comments, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommentsText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnotationsAdvancedTableComposition(Composite parent) {
		this.anotations = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Application.Properties.anotations, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_AnotationsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				anotations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				anotations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				anotations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				anotations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.anotationsFilters) {
			this.anotations.addFilter(filter);
		}
		this.anotations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.anotations, CartographyDescriptionViewsRepository.SWT_KIND));
		this.anotations.createControls(parent);
		this.anotations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.anotations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData anotationsData = new GridData(GridData.FILL_HORIZONTAL);
		anotationsData.horizontalSpan = 3;
		this.anotations.setLayoutData(anotationsData);
		this.anotations.setLowerBound(0);
		this.anotations.setUpperBound(-1);
		anotations.setID(CartographyDescriptionViewsRepository.Application.Properties.anotations);
		anotations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnotationsAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createWeightText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Application.Properties.weight, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_WeightLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.weight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.weight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
				}
			}

		});
		EditingUtils.setID(weight, CartographyDescriptionViewsRepository.Application.Properties.weight);
		EditingUtils.setEEFtype(weight, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.weight, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWeightText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Application.Properties.name, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CartographyDescriptionViewsRepository.Application.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.name, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxWeightText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Application.Properties.maxWeight, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_MaxWeightLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.maxWeight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxWeight.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.maxWeight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxWeight.getText()));
				}
			}

		});
		EditingUtils.setID(maxWeight, CartographyDescriptionViewsRepository.Application.Properties.maxWeight);
		EditingUtils.setEEFtype(maxWeight, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.maxWeight, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxWeightText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createMigRelationsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CartographyDescriptionViewsRepository.Application.Properties.migRelations, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_MigRelationsLabel);		 
		this.migRelations = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addMigRelations(); }
			public void handleEdit(EObject element) { editMigRelations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMigRelations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMigRelations(element); }
			public void navigateTo(EObject element) { }
		});
		this.migRelations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.migRelations, CartographyDescriptionViewsRepository.SWT_KIND));
		this.migRelations.createControls(parent);
		this.migRelations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.migRelations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData migRelationsData = new GridData(GridData.FILL_HORIZONTAL);
		migRelationsData.horizontalSpan = 3;
		this.migRelations.setLayoutData(migRelationsData);
		this.migRelations.disableMove();
		migRelations.setID(CartographyDescriptionViewsRepository.Application.Properties.migRelations);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.migRelations,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.migRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		migRelations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMigRelations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.migRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, CartographyDescriptionViewsRepository.Application.Properties.parentLayer, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_ParentLayerLabel);
		parentLayer = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.Application.Properties.parentLayer, CartographyDescriptionViewsRepository.SWT_KIND));
		parentLayer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentLayer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.parentLayer, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentLayer()));
			}

		});
		GridData parentLayerData = new GridData(GridData.FILL_HORIZONTAL);
		parentLayer.setLayoutData(parentLayerData);
		parentLayer.setID(CartographyDescriptionViewsRepository.Application.Properties.parentLayer);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.parentLayer, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParentLayerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createParentModuleFlatComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Application.Properties.parentModule, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_ParentModuleLabel);
		parentModule = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.Application.Properties.parentModule, CartographyDescriptionViewsRepository.SWT_KIND));
		parentModule.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentModule.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.parentModule, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentModule()));
			}

		});
		GridData parentModuleData = new GridData(GridData.FILL_HORIZONTAL);
		parentModule.setLayoutData(parentModuleData);
		parentModule.setID(CartographyDescriptionViewsRepository.Application.Properties.parentModule);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.parentModule, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParentModuleFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createOriginalFilePathText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Application.Properties.originalFilePath, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_OriginalFilePathLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.originalFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFilePath.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.originalFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFilePath.getText()));
				}
			}

		});
		EditingUtils.setID(originalFilePath, CartographyDescriptionViewsRepository.Application.Properties.originalFilePath);
		EditingUtils.setEEFtype(originalFilePath, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.originalFilePath, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOriginalFilePathText

		// End of user code
		return parent;
	}

	
	protected Composite createNewFilePathText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Application.Properties.newFilePath, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_NewFilePathLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.newFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, newFilePath.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.newFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, newFilePath.getText()));
				}
			}

		});
		EditingUtils.setID(newFilePath, CartographyDescriptionViewsRepository.Application.Properties.newFilePath);
		EditingUtils.setEEFtype(newFilePath, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.newFilePath, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNewFilePathText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createModulesAdvancedTableComposition(Composite parent) {
		this.modules = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Application.Properties.modules, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_ModulesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.modules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				modules.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.modules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				modules.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.modules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				modules.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.modules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				modules.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.modulesFilters) {
			this.modules.addFilter(filter);
		}
		this.modules.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.modules, CartographyDescriptionViewsRepository.SWT_KIND));
		this.modules.createControls(parent);
		this.modules.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.modules, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData modulesData = new GridData(GridData.FILL_HORIZONTAL);
		modulesData.horizontalSpan = 3;
		this.modules.setLayoutData(modulesData);
		this.modules.setLowerBound(0);
		this.modules.setUpperBound(-1);
		modules.setID(CartographyDescriptionViewsRepository.Application.Properties.modules);
		modules.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createModulesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createLayersAdvancedTableComposition(Composite parent) {
		this.layers = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Application.Properties.layers, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_LayersLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.layers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				layers.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.layers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				layers.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.layers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				layers.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.layers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				layers.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.layersFilters) {
			this.layers.addFilter(filter);
		}
		this.layers.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.layers, CartographyDescriptionViewsRepository.SWT_KIND));
		this.layers.createControls(parent);
		this.layers.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.layers, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData layersData = new GridData(GridData.FILL_HORIZONTAL);
		layersData.horizontalSpan = 3;
		this.layers.setLayoutData(layersData);
		this.layers.setLowerBound(0);
		this.layers.setUpperBound(-1);
		layers.setID(CartographyDescriptionViewsRepository.Application.Properties.layers);
		layers.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createLayersAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCompilationUnitsAdvancedTableComposition(Composite parent) {
		this.compilationUnits = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Application.Properties.compilationUnits, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_CompilationUnitsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.compilationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				compilationUnits.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.compilationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				compilationUnits.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.compilationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				compilationUnits.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.compilationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				compilationUnits.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.compilationUnitsFilters) {
			this.compilationUnits.addFilter(filter);
		}
		this.compilationUnits.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.compilationUnits, CartographyDescriptionViewsRepository.SWT_KIND));
		this.compilationUnits.createControls(parent);
		this.compilationUnits.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.compilationUnits, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData compilationUnitsData = new GridData(GridData.FILL_HORIZONTAL);
		compilationUnitsData.horizontalSpan = 3;
		this.compilationUnits.setLayoutData(compilationUnitsData);
		this.compilationUnits.setLowerBound(0);
		this.compilationUnits.setUpperBound(-1);
		compilationUnits.setID(CartographyDescriptionViewsRepository.Application.Properties.compilationUnits);
		compilationUnits.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createCompilationUnitsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAppRelationsAdvancedTableComposition(Composite parent) {
		this.appRelations = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Application.Properties.appRelations, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_AppRelationsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.appRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				appRelations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.appRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				appRelations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.appRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				appRelations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.appRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				appRelations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.appRelationsFilters) {
			this.appRelations.addFilter(filter);
		}
		this.appRelations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.appRelations, CartographyDescriptionViewsRepository.SWT_KIND));
		this.appRelations.createControls(parent);
		this.appRelations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.appRelations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData appRelationsData = new GridData(GridData.FILL_HORIZONTAL);
		appRelationsData.horizontalSpan = 3;
		this.appRelations.setLayoutData(appRelationsData);
		this.appRelations.setLowerBound(0);
		this.appRelations.setUpperBound(-1);
		appRelations.setID(CartographyDescriptionViewsRepository.Application.Properties.appRelations);
		appRelations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAppRelationsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPaternsAdvancedTableComposition(Composite parent) {
		this.paterns = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Application.Properties.paterns, CartographyDescriptionMessages.ApplicationPropertiesEditionPart_PaternsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.paterns, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				paterns.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.paterns, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				paterns.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.paterns, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				paterns.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.paterns, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				paterns.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.paternsFilters) {
			this.paterns.addFilter(filter);
		}
		this.paterns.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Application.Properties.paterns, CartographyDescriptionViewsRepository.SWT_KIND));
		this.paterns.createControls(parent);
		this.paterns.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Application.Properties.paterns, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData paternsData = new GridData(GridData.FILL_HORIZONTAL);
		paternsData.horizontalSpan = 3;
		this.paterns.setLayoutData(paternsData);
		this.paterns.setLowerBound(0);
		this.paterns.setUpperBound(-1);
		paterns.setID(CartographyDescriptionViewsRepository.Application.Properties.paterns);
		paterns.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPaternsAdvancedTableComposition

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
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#getLocs()
	 * 
	 */
	public String getLocs() {
		return locs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#setLocs(String newValue)
	 * 
	 */
	public void setLocs(String newValue) {
		if (newValue != null) {
			locs.setText(newValue);
		} else {
			locs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.locs);
		if (eefElementEditorReadOnlyState && locs.isEnabled()) {
			locs.setEnabled(false);
			locs.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !locs.isEnabled()) {
			locs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#getComments()
	 * 
	 */
	public String getComments() {
		return comments.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#setComments(String newValue)
	 * 
	 */
	public void setComments(String newValue) {
		if (newValue != null) {
			comments.setText(newValue);
		} else {
			comments.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.comments);
		if (eefElementEditorReadOnlyState && comments.isEnabled()) {
			comments.setEnabled(false);
			comments.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comments.isEnabled()) {
			comments.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#initAnotations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnotations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		anotations.setContentProvider(contentProvider);
		anotations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.anotations);
		if (eefElementEditorReadOnlyState && anotations.isEnabled()) {
			anotations.setEnabled(false);
			anotations.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !anotations.isEnabled()) {
			anotations.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#updateAnotations()
	 * 
	 */
	public void updateAnotations() {
	anotations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addFilterAnotations(ViewerFilter filter)
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
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addBusinessFilterAnotations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnotations(ViewerFilter filter) {
		anotationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#isContainedInAnotationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnotationsTable(EObject element) {
		return ((ReferencesTableSettings)anotations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#getWeight()
	 * 
	 */
	public String getWeight() {
		return weight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#setWeight(String newValue)
	 * 
	 */
	public void setWeight(String newValue) {
		if (newValue != null) {
			weight.setText(newValue);
		} else {
			weight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.weight);
		if (eefElementEditorReadOnlyState && weight.isEnabled()) {
			weight.setEnabled(false);
			weight.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !weight.isEnabled()) {
			weight.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#getMaxWeight()
	 * 
	 */
	public String getMaxWeight() {
		return maxWeight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#setMaxWeight(String newValue)
	 * 
	 */
	public void setMaxWeight(String newValue) {
		if (newValue != null) {
			maxWeight.setText(newValue);
		} else {
			maxWeight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.maxWeight);
		if (eefElementEditorReadOnlyState && maxWeight.isEnabled()) {
			maxWeight.setEnabled(false);
			maxWeight.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !maxWeight.isEnabled()) {
			maxWeight.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#initMigRelations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMigRelations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		migRelations.setContentProvider(contentProvider);
		migRelations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.migRelations);
		if (eefElementEditorReadOnlyState && migRelations.getTable().isEnabled()) {
			migRelations.setEnabled(false);
			migRelations.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !migRelations.getTable().isEnabled()) {
			migRelations.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#updateMigRelations()
	 * 
	 */
	public void updateMigRelations() {
	migRelations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addFilterMigRelations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMigRelations(ViewerFilter filter) {
		migRelationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addBusinessFilterMigRelations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMigRelations(ViewerFilter filter) {
		migRelationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#isContainedInMigRelationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMigRelationsTable(EObject element) {
		return ((ReferencesTableSettings)migRelations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#getParentLayer()
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
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#initParentLayer(EObjectFlatComboSettings)
	 */
	public void initParentLayer(EObjectFlatComboSettings settings) {
		parentLayer.setInput(settings);
		if (current != null) {
			parentLayer.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.parentLayer);
		if (eefElementEditorReadOnlyState && parentLayer.isEnabled()) {
			parentLayer.setEnabled(false);
			parentLayer.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentLayer.isEnabled()) {
			parentLayer.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#setParentLayer(EObject newValue)
	 * 
	 */
	public void setParentLayer(EObject newValue) {
		if (newValue != null) {
			parentLayer.setSelection(new StructuredSelection(newValue));
		} else {
			parentLayer.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.parentLayer);
		if (eefElementEditorReadOnlyState && parentLayer.isEnabled()) {
			parentLayer.setEnabled(false);
			parentLayer.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentLayer.isEnabled()) {
			parentLayer.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#setParentLayerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentLayerButtonMode(ButtonsModeEnum newValue) {
		parentLayer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addFilterParentLayer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentLayer(ViewerFilter filter) {
		parentLayer.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addBusinessFilterParentLayer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentLayer(ViewerFilter filter) {
		parentLayer.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#getParentModule()
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
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#initParentModule(EObjectFlatComboSettings)
	 */
	public void initParentModule(EObjectFlatComboSettings settings) {
		parentModule.setInput(settings);
		if (current != null) {
			parentModule.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.parentModule);
		if (eefElementEditorReadOnlyState && parentModule.isEnabled()) {
			parentModule.setEnabled(false);
			parentModule.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentModule.isEnabled()) {
			parentModule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#setParentModule(EObject newValue)
	 * 
	 */
	public void setParentModule(EObject newValue) {
		if (newValue != null) {
			parentModule.setSelection(new StructuredSelection(newValue));
		} else {
			parentModule.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.parentModule);
		if (eefElementEditorReadOnlyState && parentModule.isEnabled()) {
			parentModule.setEnabled(false);
			parentModule.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentModule.isEnabled()) {
			parentModule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#setParentModuleButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentModuleButtonMode(ButtonsModeEnum newValue) {
		parentModule.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addFilterParentModule(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentModule(ViewerFilter filter) {
		parentModule.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addBusinessFilterParentModule(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentModule(ViewerFilter filter) {
		parentModule.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#getOriginalFilePath()
	 * 
	 */
	public String getOriginalFilePath() {
		return originalFilePath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#setOriginalFilePath(String newValue)
	 * 
	 */
	public void setOriginalFilePath(String newValue) {
		if (newValue != null) {
			originalFilePath.setText(newValue);
		} else {
			originalFilePath.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.originalFilePath);
		if (eefElementEditorReadOnlyState && originalFilePath.isEnabled()) {
			originalFilePath.setEnabled(false);
			originalFilePath.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !originalFilePath.isEnabled()) {
			originalFilePath.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#getNewFilePath()
	 * 
	 */
	public String getNewFilePath() {
		return newFilePath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#setNewFilePath(String newValue)
	 * 
	 */
	public void setNewFilePath(String newValue) {
		if (newValue != null) {
			newFilePath.setText(newValue);
		} else {
			newFilePath.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.newFilePath);
		if (eefElementEditorReadOnlyState && newFilePath.isEnabled()) {
			newFilePath.setEnabled(false);
			newFilePath.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !newFilePath.isEnabled()) {
			newFilePath.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#initModules(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initModules(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		modules.setContentProvider(contentProvider);
		modules.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.modules);
		if (eefElementEditorReadOnlyState && modules.isEnabled()) {
			modules.setEnabled(false);
			modules.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !modules.isEnabled()) {
			modules.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#updateModules()
	 * 
	 */
	public void updateModules() {
	modules.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addFilterModules(ViewerFilter filter)
	 * 
	 */
	public void addFilterToModules(ViewerFilter filter) {
		modulesFilters.add(filter);
		if (this.modules != null) {
			this.modules.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addBusinessFilterModules(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToModules(ViewerFilter filter) {
		modulesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#isContainedInModulesTable(EObject element)
	 * 
	 */
	public boolean isContainedInModulesTable(EObject element) {
		return ((ReferencesTableSettings)modules.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#initLayers(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initLayers(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		layers.setContentProvider(contentProvider);
		layers.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.layers);
		if (eefElementEditorReadOnlyState && layers.isEnabled()) {
			layers.setEnabled(false);
			layers.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !layers.isEnabled()) {
			layers.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#updateLayers()
	 * 
	 */
	public void updateLayers() {
	layers.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addFilterLayers(ViewerFilter filter)
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
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addBusinessFilterLayers(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayers(ViewerFilter filter) {
		layersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#isContainedInLayersTable(EObject element)
	 * 
	 */
	public boolean isContainedInLayersTable(EObject element) {
		return ((ReferencesTableSettings)layers.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#initCompilationUnits(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCompilationUnits(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		compilationUnits.setContentProvider(contentProvider);
		compilationUnits.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.compilationUnits);
		if (eefElementEditorReadOnlyState && compilationUnits.isEnabled()) {
			compilationUnits.setEnabled(false);
			compilationUnits.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !compilationUnits.isEnabled()) {
			compilationUnits.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#updateCompilationUnits()
	 * 
	 */
	public void updateCompilationUnits() {
	compilationUnits.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addFilterCompilationUnits(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCompilationUnits(ViewerFilter filter) {
		compilationUnitsFilters.add(filter);
		if (this.compilationUnits != null) {
			this.compilationUnits.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addBusinessFilterCompilationUnits(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCompilationUnits(ViewerFilter filter) {
		compilationUnitsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#isContainedInCompilationUnitsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCompilationUnitsTable(EObject element) {
		return ((ReferencesTableSettings)compilationUnits.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#initAppRelations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAppRelations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		appRelations.setContentProvider(contentProvider);
		appRelations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.appRelations);
		if (eefElementEditorReadOnlyState && appRelations.isEnabled()) {
			appRelations.setEnabled(false);
			appRelations.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !appRelations.isEnabled()) {
			appRelations.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#updateAppRelations()
	 * 
	 */
	public void updateAppRelations() {
	appRelations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addFilterAppRelations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAppRelations(ViewerFilter filter) {
		appRelationsFilters.add(filter);
		if (this.appRelations != null) {
			this.appRelations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addBusinessFilterAppRelations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAppRelations(ViewerFilter filter) {
		appRelationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#isContainedInAppRelationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAppRelationsTable(EObject element) {
		return ((ReferencesTableSettings)appRelations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#initPaterns(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPaterns(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		paterns.setContentProvider(contentProvider);
		paterns.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Application.Properties.paterns);
		if (eefElementEditorReadOnlyState && paterns.isEnabled()) {
			paterns.setEnabled(false);
			paterns.setToolTipText(CartographyDescriptionMessages.Application_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !paterns.isEnabled()) {
			paterns.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#updatePaterns()
	 * 
	 */
	public void updatePaterns() {
	paterns.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addFilterPaterns(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPaterns(ViewerFilter filter) {
		paternsFilters.add(filter);
		if (this.paterns != null) {
			this.paterns.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#addBusinessFilterPaterns(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPaterns(ViewerFilter filter) {
		paternsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ApplicationPropertiesEditionPart#isContainedInPaternsTable(EObject element)
	 * 
	 */
	public boolean isContainedInPaternsTable(EObject element) {
		return ((ReferencesTableSettings)paterns.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CartographyDescriptionMessages.Application_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
