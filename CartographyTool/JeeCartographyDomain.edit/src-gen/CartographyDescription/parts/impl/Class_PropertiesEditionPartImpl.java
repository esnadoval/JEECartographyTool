/**
 * Generated with Acceleo
 */
package CartographyDescription.parts.impl;

// Start of user code for imports
import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.Class_PropertiesEditionPart;

import CartographyDescription.providers.CartographyDescriptionMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
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
public class Class_PropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, Class_PropertiesEditionPart {

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
	protected EMFComboViewer visibility;
	protected ReferencesTable attributes;
	protected List<ViewerFilter> attributesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> attributesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable methods;
	protected List<ViewerFilter> methodsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> methodsFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer inhertance;
	protected ReferencesTable implements_;
	protected List<ViewerFilter> implements_BusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> implements_Filters = new ArrayList<ViewerFilter>();
	protected Text originalFileName;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public Class_PropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence class_Step = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = class_Step.addStep(CartographyDescriptionViewsRepository.Class_.Properties.class);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.locs);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.comments);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.anotations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.weight);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.name);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.maxWeight);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.migRelations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.parentLayer);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.parentModule);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.newFilePath);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.visibility);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.attributes);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.methods);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.inhertance);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.implements_);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Class_.Properties.originalFileName);
		
		
		composer = new PartComposer(class_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.locs) {
					return createLocsText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.comments) {
					return createCommentsText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.anotations) {
					return createAnotationsAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.weight) {
					return createWeightText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.name) {
					return createNameText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.maxWeight) {
					return createMaxWeightText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.migRelations) {
					return createMigRelationsAdvancedReferencesTable(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.parentLayer) {
					return createParentLayerFlatComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.parentModule) {
					return createParentModuleFlatComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath) {
					return createOriginalFilePathText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.newFilePath) {
					return createNewFilePathText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.visibility) {
					return createVisibilityEMFComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.attributes) {
					return createAttributesAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.methods) {
					return createMethodsAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.inhertance) {
					return createInhertanceEMFComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.implements_) {
					return createImplements_AdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Class_.Properties.originalFileName) {
					return createOriginalFileNameText(parent);
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
		propertiesGroup.setText(CartographyDescriptionMessages.Class_PropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createLocsText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.locs, CartographyDescriptionMessages.Class_PropertiesEditionPart_LocsLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.locs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locs.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.locs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locs.getText()));
				}
			}

		});
		EditingUtils.setID(locs, CartographyDescriptionViewsRepository.Class_.Properties.locs);
		EditingUtils.setEEFtype(locs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.locs, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLocsText

		// End of user code
		return parent;
	}

	
	protected Composite createCommentsText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.comments, CartographyDescriptionMessages.Class_PropertiesEditionPart_CommentsLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
				}
			}

		});
		EditingUtils.setID(comments, CartographyDescriptionViewsRepository.Class_.Properties.comments);
		EditingUtils.setEEFtype(comments, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.comments, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommentsText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnotationsAdvancedTableComposition(Composite parent) {
		this.anotations = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Class_.Properties.anotations, CartographyDescriptionMessages.Class_PropertiesEditionPart_AnotationsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				anotations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				anotations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				anotations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				anotations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.anotationsFilters) {
			this.anotations.addFilter(filter);
		}
		this.anotations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.anotations, CartographyDescriptionViewsRepository.SWT_KIND));
		this.anotations.createControls(parent);
		this.anotations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.anotations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData anotationsData = new GridData(GridData.FILL_HORIZONTAL);
		anotationsData.horizontalSpan = 3;
		this.anotations.setLayoutData(anotationsData);
		this.anotations.setLowerBound(0);
		this.anotations.setUpperBound(-1);
		anotations.setID(CartographyDescriptionViewsRepository.Class_.Properties.anotations);
		anotations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnotationsAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createWeightText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.weight, CartographyDescriptionMessages.Class_PropertiesEditionPart_WeightLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.weight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.weight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
				}
			}

		});
		EditingUtils.setID(weight, CartographyDescriptionViewsRepository.Class_.Properties.weight);
		EditingUtils.setEEFtype(weight, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.weight, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWeightText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.name, CartographyDescriptionMessages.Class_PropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CartographyDescriptionViewsRepository.Class_.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.name, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxWeightText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.maxWeight, CartographyDescriptionMessages.Class_PropertiesEditionPart_MaxWeightLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.maxWeight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxWeight.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.maxWeight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxWeight.getText()));
				}
			}

		});
		EditingUtils.setID(maxWeight, CartographyDescriptionViewsRepository.Class_.Properties.maxWeight);
		EditingUtils.setEEFtype(maxWeight, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.maxWeight, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxWeightText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createMigRelationsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CartographyDescriptionViewsRepository.Class_.Properties.migRelations, CartographyDescriptionMessages.Class_PropertiesEditionPart_MigRelationsLabel);		 
		this.migRelations = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addMigRelations(); }
			public void handleEdit(EObject element) { editMigRelations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMigRelations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMigRelations(element); }
			public void navigateTo(EObject element) { }
		});
		this.migRelations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.migRelations, CartographyDescriptionViewsRepository.SWT_KIND));
		this.migRelations.createControls(parent);
		this.migRelations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.migRelations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData migRelationsData = new GridData(GridData.FILL_HORIZONTAL);
		migRelationsData.horizontalSpan = 3;
		this.migRelations.setLayoutData(migRelationsData);
		this.migRelations.disableMove();
		migRelations.setID(CartographyDescriptionViewsRepository.Class_.Properties.migRelations);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.migRelations,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.migRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		migRelations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMigRelations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.migRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.parentLayer, CartographyDescriptionMessages.Class_PropertiesEditionPart_ParentLayerLabel);
		parentLayer = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.Class_.Properties.parentLayer, CartographyDescriptionViewsRepository.SWT_KIND));
		parentLayer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentLayer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.parentLayer, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentLayer()));
			}

		});
		GridData parentLayerData = new GridData(GridData.FILL_HORIZONTAL);
		parentLayer.setLayoutData(parentLayerData);
		parentLayer.setID(CartographyDescriptionViewsRepository.Class_.Properties.parentLayer);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.parentLayer, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParentLayerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createParentModuleFlatComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.parentModule, CartographyDescriptionMessages.Class_PropertiesEditionPart_ParentModuleLabel);
		parentModule = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.Class_.Properties.parentModule, CartographyDescriptionViewsRepository.SWT_KIND));
		parentModule.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentModule.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.parentModule, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentModule()));
			}

		});
		GridData parentModuleData = new GridData(GridData.FILL_HORIZONTAL);
		parentModule.setLayoutData(parentModuleData);
		parentModule.setID(CartographyDescriptionViewsRepository.Class_.Properties.parentModule);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.parentModule, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParentModuleFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createOriginalFilePathText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath, CartographyDescriptionMessages.Class_PropertiesEditionPart_OriginalFilePathLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFilePath.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFilePath.getText()));
				}
			}

		});
		EditingUtils.setID(originalFilePath, CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath);
		EditingUtils.setEEFtype(originalFilePath, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOriginalFilePathText

		// End of user code
		return parent;
	}

	
	protected Composite createNewFilePathText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.newFilePath, CartographyDescriptionMessages.Class_PropertiesEditionPart_NewFilePathLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.newFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, newFilePath.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.newFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, newFilePath.getText()));
				}
			}

		});
		EditingUtils.setID(newFilePath, CartographyDescriptionViewsRepository.Class_.Properties.newFilePath);
		EditingUtils.setEEFtype(newFilePath, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.newFilePath, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNewFilePathText

		// End of user code
		return parent;
	}

	
	protected Composite createVisibilityEMFComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.visibility, CartographyDescriptionMessages.Class_PropertiesEditionPart_VisibilityLabel);
		visibility = new EMFComboViewer(parent);
		visibility.setContentProvider(new ArrayContentProvider());
		visibility.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData visibilityData = new GridData(GridData.FILL_HORIZONTAL);
		visibility.getCombo().setLayoutData(visibilityData);
		visibility.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
			}

		});
		visibility.setID(CartographyDescriptionViewsRepository.Class_.Properties.visibility);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.visibility, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVisibilityEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAttributesAdvancedTableComposition(Composite parent) {
		this.attributes = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Class_.Properties.attributes, CartographyDescriptionMessages.Class_PropertiesEditionPart_AttributesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.attributes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				attributes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.attributes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				attributes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.attributes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				attributes.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.attributes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				attributes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.attributesFilters) {
			this.attributes.addFilter(filter);
		}
		this.attributes.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.attributes, CartographyDescriptionViewsRepository.SWT_KIND));
		this.attributes.createControls(parent);
		this.attributes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.attributes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData attributesData = new GridData(GridData.FILL_HORIZONTAL);
		attributesData.horizontalSpan = 3;
		this.attributes.setLayoutData(attributesData);
		this.attributes.setLowerBound(0);
		this.attributes.setUpperBound(-1);
		attributes.setID(CartographyDescriptionViewsRepository.Class_.Properties.attributes);
		attributes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAttributesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMethodsAdvancedTableComposition(Composite parent) {
		this.methods = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Class_.Properties.methods, CartographyDescriptionMessages.Class_PropertiesEditionPart_MethodsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				methods.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				methods.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				methods.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				methods.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.methodsFilters) {
			this.methods.addFilter(filter);
		}
		this.methods.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.methods, CartographyDescriptionViewsRepository.SWT_KIND));
		this.methods.createControls(parent);
		this.methods.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.methods, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData methodsData = new GridData(GridData.FILL_HORIZONTAL);
		methodsData.horizontalSpan = 3;
		this.methods.setLayoutData(methodsData);
		this.methods.setLowerBound(0);
		this.methods.setUpperBound(-1);
		methods.setID(CartographyDescriptionViewsRepository.Class_.Properties.methods);
		methods.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createMethodsAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createInhertanceEMFComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.inhertance, CartographyDescriptionMessages.Class_PropertiesEditionPart_InhertanceLabel);
		inhertance = new EMFComboViewer(parent);
		inhertance.setContentProvider(new ArrayContentProvider());
		inhertance.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData inhertanceData = new GridData(GridData.FILL_HORIZONTAL);
		inhertance.getCombo().setLayoutData(inhertanceData);
		inhertance.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.inhertance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInhertance()));
			}

		});
		inhertance.setID(CartographyDescriptionViewsRepository.Class_.Properties.inhertance);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.inhertance, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInhertanceEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createImplements_AdvancedTableComposition(Composite parent) {
		this.implements_ = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Class_.Properties.implements_, CartographyDescriptionMessages.Class_PropertiesEditionPart_Implements_Label), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.implements_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				implements_.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.implements_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				implements_.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.implements_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				implements_.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.implements_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				implements_.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.implements_Filters) {
			this.implements_.addFilter(filter);
		}
		this.implements_.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.implements_, CartographyDescriptionViewsRepository.SWT_KIND));
		this.implements_.createControls(parent);
		this.implements_.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.implements_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData implements_Data = new GridData(GridData.FILL_HORIZONTAL);
		implements_Data.horizontalSpan = 3;
		this.implements_.setLayoutData(implements_Data);
		this.implements_.setLowerBound(0);
		this.implements_.setUpperBound(-1);
		implements_.setID(CartographyDescriptionViewsRepository.Class_.Properties.implements_);
		implements_.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createImplements_AdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createOriginalFileNameText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Class_.Properties.originalFileName, CartographyDescriptionMessages.Class_PropertiesEditionPart_OriginalFileNameLabel);
		originalFileName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData originalFileNameData = new GridData(GridData.FILL_HORIZONTAL);
		originalFileName.setLayoutData(originalFileNameData);
		originalFileName.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.originalFileName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFileName.getText()));
			}

		});
		originalFileName.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Class_PropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Class_.Properties.originalFileName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFileName.getText()));
				}
			}

		});
		EditingUtils.setID(originalFileName, CartographyDescriptionViewsRepository.Class_.Properties.originalFileName);
		EditingUtils.setEEFtype(originalFileName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Class_.Properties.originalFileName, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOriginalFileNameText

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
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getLocs()
	 * 
	 */
	public String getLocs() {
		return locs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setLocs(String newValue)
	 * 
	 */
	public void setLocs(String newValue) {
		if (newValue != null) {
			locs.setText(newValue);
		} else {
			locs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.locs);
		if (eefElementEditorReadOnlyState && locs.isEnabled()) {
			locs.setEnabled(false);
			locs.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !locs.isEnabled()) {
			locs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getComments()
	 * 
	 */
	public String getComments() {
		return comments.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setComments(String newValue)
	 * 
	 */
	public void setComments(String newValue) {
		if (newValue != null) {
			comments.setText(newValue);
		} else {
			comments.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.comments);
		if (eefElementEditorReadOnlyState && comments.isEnabled()) {
			comments.setEnabled(false);
			comments.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comments.isEnabled()) {
			comments.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#initAnotations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnotations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		anotations.setContentProvider(contentProvider);
		anotations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.anotations);
		if (eefElementEditorReadOnlyState && anotations.isEnabled()) {
			anotations.setEnabled(false);
			anotations.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !anotations.isEnabled()) {
			anotations.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#updateAnotations()
	 * 
	 */
	public void updateAnotations() {
	anotations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addFilterAnotations(ViewerFilter filter)
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
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addBusinessFilterAnotations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnotations(ViewerFilter filter) {
		anotationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#isContainedInAnotationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnotationsTable(EObject element) {
		return ((ReferencesTableSettings)anotations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getWeight()
	 * 
	 */
	public String getWeight() {
		return weight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setWeight(String newValue)
	 * 
	 */
	public void setWeight(String newValue) {
		if (newValue != null) {
			weight.setText(newValue);
		} else {
			weight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.weight);
		if (eefElementEditorReadOnlyState && weight.isEnabled()) {
			weight.setEnabled(false);
			weight.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !weight.isEnabled()) {
			weight.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getMaxWeight()
	 * 
	 */
	public String getMaxWeight() {
		return maxWeight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setMaxWeight(String newValue)
	 * 
	 */
	public void setMaxWeight(String newValue) {
		if (newValue != null) {
			maxWeight.setText(newValue);
		} else {
			maxWeight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.maxWeight);
		if (eefElementEditorReadOnlyState && maxWeight.isEnabled()) {
			maxWeight.setEnabled(false);
			maxWeight.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !maxWeight.isEnabled()) {
			maxWeight.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#initMigRelations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMigRelations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		migRelations.setContentProvider(contentProvider);
		migRelations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.migRelations);
		if (eefElementEditorReadOnlyState && migRelations.getTable().isEnabled()) {
			migRelations.setEnabled(false);
			migRelations.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !migRelations.getTable().isEnabled()) {
			migRelations.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#updateMigRelations()
	 * 
	 */
	public void updateMigRelations() {
	migRelations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addFilterMigRelations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMigRelations(ViewerFilter filter) {
		migRelationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addBusinessFilterMigRelations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMigRelations(ViewerFilter filter) {
		migRelationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#isContainedInMigRelationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMigRelationsTable(EObject element) {
		return ((ReferencesTableSettings)migRelations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getParentLayer()
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
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#initParentLayer(EObjectFlatComboSettings)
	 */
	public void initParentLayer(EObjectFlatComboSettings settings) {
		parentLayer.setInput(settings);
		if (current != null) {
			parentLayer.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.parentLayer);
		if (eefElementEditorReadOnlyState && parentLayer.isEnabled()) {
			parentLayer.setEnabled(false);
			parentLayer.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentLayer.isEnabled()) {
			parentLayer.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setParentLayer(EObject newValue)
	 * 
	 */
	public void setParentLayer(EObject newValue) {
		if (newValue != null) {
			parentLayer.setSelection(new StructuredSelection(newValue));
		} else {
			parentLayer.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.parentLayer);
		if (eefElementEditorReadOnlyState && parentLayer.isEnabled()) {
			parentLayer.setEnabled(false);
			parentLayer.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentLayer.isEnabled()) {
			parentLayer.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setParentLayerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentLayerButtonMode(ButtonsModeEnum newValue) {
		parentLayer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addFilterParentLayer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentLayer(ViewerFilter filter) {
		parentLayer.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addBusinessFilterParentLayer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentLayer(ViewerFilter filter) {
		parentLayer.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getParentModule()
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
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#initParentModule(EObjectFlatComboSettings)
	 */
	public void initParentModule(EObjectFlatComboSettings settings) {
		parentModule.setInput(settings);
		if (current != null) {
			parentModule.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.parentModule);
		if (eefElementEditorReadOnlyState && parentModule.isEnabled()) {
			parentModule.setEnabled(false);
			parentModule.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentModule.isEnabled()) {
			parentModule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setParentModule(EObject newValue)
	 * 
	 */
	public void setParentModule(EObject newValue) {
		if (newValue != null) {
			parentModule.setSelection(new StructuredSelection(newValue));
		} else {
			parentModule.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.parentModule);
		if (eefElementEditorReadOnlyState && parentModule.isEnabled()) {
			parentModule.setEnabled(false);
			parentModule.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentModule.isEnabled()) {
			parentModule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setParentModuleButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentModuleButtonMode(ButtonsModeEnum newValue) {
		parentModule.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addFilterParentModule(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentModule(ViewerFilter filter) {
		parentModule.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addBusinessFilterParentModule(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentModule(ViewerFilter filter) {
		parentModule.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getOriginalFilePath()
	 * 
	 */
	public String getOriginalFilePath() {
		return originalFilePath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setOriginalFilePath(String newValue)
	 * 
	 */
	public void setOriginalFilePath(String newValue) {
		if (newValue != null) {
			originalFilePath.setText(newValue);
		} else {
			originalFilePath.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath);
		if (eefElementEditorReadOnlyState && originalFilePath.isEnabled()) {
			originalFilePath.setEnabled(false);
			originalFilePath.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !originalFilePath.isEnabled()) {
			originalFilePath.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getNewFilePath()
	 * 
	 */
	public String getNewFilePath() {
		return newFilePath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setNewFilePath(String newValue)
	 * 
	 */
	public void setNewFilePath(String newValue) {
		if (newValue != null) {
			newFilePath.setText(newValue);
		} else {
			newFilePath.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.newFilePath);
		if (eefElementEditorReadOnlyState && newFilePath.isEnabled()) {
			newFilePath.setEnabled(false);
			newFilePath.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !newFilePath.isEnabled()) {
			newFilePath.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getVisibility()
	 * 
	 */
	public Enumerator getVisibility() {
		Enumerator selection = (Enumerator) ((StructuredSelection) visibility.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#initVisibility(Object input, Enumerator current)
	 */
	public void initVisibility(Object input, Enumerator current) {
		visibility.setInput(input);
		visibility.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setVisibility(Enumerator newValue)
	 * 
	 */
	public void setVisibility(Enumerator newValue) {
		visibility.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#initAttributes(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAttributes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		attributes.setContentProvider(contentProvider);
		attributes.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.attributes);
		if (eefElementEditorReadOnlyState && attributes.isEnabled()) {
			attributes.setEnabled(false);
			attributes.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !attributes.isEnabled()) {
			attributes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#updateAttributes()
	 * 
	 */
	public void updateAttributes() {
	attributes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addFilterAttributes(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAttributes(ViewerFilter filter) {
		attributesFilters.add(filter);
		if (this.attributes != null) {
			this.attributes.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addBusinessFilterAttributes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAttributes(ViewerFilter filter) {
		attributesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#isContainedInAttributesTable(EObject element)
	 * 
	 */
	public boolean isContainedInAttributesTable(EObject element) {
		return ((ReferencesTableSettings)attributes.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#initMethods(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMethods(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		methods.setContentProvider(contentProvider);
		methods.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.methods);
		if (eefElementEditorReadOnlyState && methods.isEnabled()) {
			methods.setEnabled(false);
			methods.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !methods.isEnabled()) {
			methods.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#updateMethods()
	 * 
	 */
	public void updateMethods() {
	methods.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addFilterMethods(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMethods(ViewerFilter filter) {
		methodsFilters.add(filter);
		if (this.methods != null) {
			this.methods.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addBusinessFilterMethods(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethods(ViewerFilter filter) {
		methodsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#isContainedInMethodsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMethodsTable(EObject element) {
		return ((ReferencesTableSettings)methods.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getInhertance()
	 * 
	 */
	public Enumerator getInhertance() {
		Enumerator selection = (Enumerator) ((StructuredSelection) inhertance.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#initInhertance(Object input, Enumerator current)
	 */
	public void initInhertance(Object input, Enumerator current) {
		inhertance.setInput(input);
		inhertance.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.inhertance);
		if (eefElementEditorReadOnlyState && inhertance.isEnabled()) {
			inhertance.setEnabled(false);
			inhertance.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inhertance.isEnabled()) {
			inhertance.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setInhertance(Enumerator newValue)
	 * 
	 */
	public void setInhertance(Enumerator newValue) {
		inhertance.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.inhertance);
		if (eefElementEditorReadOnlyState && inhertance.isEnabled()) {
			inhertance.setEnabled(false);
			inhertance.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inhertance.isEnabled()) {
			inhertance.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#initImplements_(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initImplements_(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		implements_.setContentProvider(contentProvider);
		implements_.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.implements_);
		if (eefElementEditorReadOnlyState && implements_.isEnabled()) {
			implements_.setEnabled(false);
			implements_.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !implements_.isEnabled()) {
			implements_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#updateImplements_()
	 * 
	 */
	public void updateImplements_() {
	implements_.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addFilterImplements_(ViewerFilter filter)
	 * 
	 */
	public void addFilterToImplements_(ViewerFilter filter) {
		implements_Filters.add(filter);
		if (this.implements_ != null) {
			this.implements_.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#addBusinessFilterImplements_(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToImplements_(ViewerFilter filter) {
		implements_BusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#isContainedInImplements_Table(EObject element)
	 * 
	 */
	public boolean isContainedInImplements_Table(EObject element) {
		return ((ReferencesTableSettings)implements_.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#getOriginalFileName()
	 * 
	 */
	public String getOriginalFileName() {
		return originalFileName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.Class_PropertiesEditionPart#setOriginalFileName(String newValue)
	 * 
	 */
	public void setOriginalFileName(String newValue) {
		if (newValue != null) {
			originalFileName.setText(newValue);
		} else {
			originalFileName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Class_.Properties.originalFileName);
		if (eefElementEditorReadOnlyState && originalFileName.isEnabled()) {
			originalFileName.setEnabled(false);
			originalFileName.setToolTipText(CartographyDescriptionMessages.Class__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !originalFileName.isEnabled()) {
			originalFileName.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CartographyDescriptionMessages.Class__Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
