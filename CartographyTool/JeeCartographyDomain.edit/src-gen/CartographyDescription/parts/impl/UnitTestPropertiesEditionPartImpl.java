/**
 * Generated with Acceleo
 */
package CartographyDescription.parts.impl;

// Start of user code for imports
import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.UnitTestPropertiesEditionPart;

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
public class UnitTestPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, UnitTestPropertiesEditionPart {

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
	protected Text type;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public UnitTestPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence unitTestStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = unitTestStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.class);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.locs);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.comments);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.anotations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.weight);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.name);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.maxWeight);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.migRelations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.parentLayer);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.parentModule);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.originalFilePath);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.newFilePath);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.visibility);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.attributes);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.methods);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.inhertance);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.implements_);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.originalFileName);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.UnitTest.Properties.type);
		
		
		composer = new PartComposer(unitTestStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.locs) {
					return createLocsText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.comments) {
					return createCommentsText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.anotations) {
					return createAnotationsAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.weight) {
					return createWeightText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.name) {
					return createNameText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.maxWeight) {
					return createMaxWeightText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.migRelations) {
					return createMigRelationsAdvancedReferencesTable(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.parentLayer) {
					return createParentLayerFlatComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.parentModule) {
					return createParentModuleFlatComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.originalFilePath) {
					return createOriginalFilePathText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.newFilePath) {
					return createNewFilePathText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.visibility) {
					return createVisibilityEMFComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.attributes) {
					return createAttributesAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.methods) {
					return createMethodsAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.inhertance) {
					return createInhertanceEMFComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.implements_) {
					return createImplements_AdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.originalFileName) {
					return createOriginalFileNameText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.UnitTest.Properties.type) {
					return createTypeText(parent);
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
		propertiesGroup.setText(CartographyDescriptionMessages.UnitTestPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createLocsText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.locs, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_LocsLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.locs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locs.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.locs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locs.getText()));
				}
			}

		});
		EditingUtils.setID(locs, CartographyDescriptionViewsRepository.UnitTest.Properties.locs);
		EditingUtils.setEEFtype(locs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.locs, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLocsText

		// End of user code
		return parent;
	}

	
	protected Composite createCommentsText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.comments, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_CommentsLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
				}
			}

		});
		EditingUtils.setID(comments, CartographyDescriptionViewsRepository.UnitTest.Properties.comments);
		EditingUtils.setEEFtype(comments, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.comments, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommentsText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnotationsAdvancedTableComposition(Composite parent) {
		this.anotations = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.UnitTest.Properties.anotations, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_AnotationsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				anotations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				anotations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				anotations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				anotations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.anotationsFilters) {
			this.anotations.addFilter(filter);
		}
		this.anotations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.anotations, CartographyDescriptionViewsRepository.SWT_KIND));
		this.anotations.createControls(parent);
		this.anotations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.anotations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData anotationsData = new GridData(GridData.FILL_HORIZONTAL);
		anotationsData.horizontalSpan = 3;
		this.anotations.setLayoutData(anotationsData);
		this.anotations.setLowerBound(0);
		this.anotations.setUpperBound(-1);
		anotations.setID(CartographyDescriptionViewsRepository.UnitTest.Properties.anotations);
		anotations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnotationsAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createWeightText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.weight, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_WeightLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.weight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.weight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
				}
			}

		});
		EditingUtils.setID(weight, CartographyDescriptionViewsRepository.UnitTest.Properties.weight);
		EditingUtils.setEEFtype(weight, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.weight, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWeightText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.name, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CartographyDescriptionViewsRepository.UnitTest.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.name, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxWeightText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.maxWeight, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_MaxWeightLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.maxWeight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxWeight.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.maxWeight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxWeight.getText()));
				}
			}

		});
		EditingUtils.setID(maxWeight, CartographyDescriptionViewsRepository.UnitTest.Properties.maxWeight);
		EditingUtils.setEEFtype(maxWeight, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.maxWeight, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxWeightText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createMigRelationsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CartographyDescriptionViewsRepository.UnitTest.Properties.migRelations, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_MigRelationsLabel);		 
		this.migRelations = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addMigRelations(); }
			public void handleEdit(EObject element) { editMigRelations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMigRelations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMigRelations(element); }
			public void navigateTo(EObject element) { }
		});
		this.migRelations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.migRelations, CartographyDescriptionViewsRepository.SWT_KIND));
		this.migRelations.createControls(parent);
		this.migRelations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.migRelations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData migRelationsData = new GridData(GridData.FILL_HORIZONTAL);
		migRelationsData.horizontalSpan = 3;
		this.migRelations.setLayoutData(migRelationsData);
		this.migRelations.disableMove();
		migRelations.setID(CartographyDescriptionViewsRepository.UnitTest.Properties.migRelations);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.migRelations,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.migRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		migRelations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMigRelations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.migRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.parentLayer, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_ParentLayerLabel);
		parentLayer = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.UnitTest.Properties.parentLayer, CartographyDescriptionViewsRepository.SWT_KIND));
		parentLayer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentLayer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.parentLayer, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentLayer()));
			}

		});
		GridData parentLayerData = new GridData(GridData.FILL_HORIZONTAL);
		parentLayer.setLayoutData(parentLayerData);
		parentLayer.setID(CartographyDescriptionViewsRepository.UnitTest.Properties.parentLayer);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.parentLayer, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParentLayerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createParentModuleFlatComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.parentModule, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_ParentModuleLabel);
		parentModule = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.UnitTest.Properties.parentModule, CartographyDescriptionViewsRepository.SWT_KIND));
		parentModule.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentModule.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.parentModule, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentModule()));
			}

		});
		GridData parentModuleData = new GridData(GridData.FILL_HORIZONTAL);
		parentModule.setLayoutData(parentModuleData);
		parentModule.setID(CartographyDescriptionViewsRepository.UnitTest.Properties.parentModule);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.parentModule, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParentModuleFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createOriginalFilePathText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.originalFilePath, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_OriginalFilePathLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.originalFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFilePath.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.originalFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFilePath.getText()));
				}
			}

		});
		EditingUtils.setID(originalFilePath, CartographyDescriptionViewsRepository.UnitTest.Properties.originalFilePath);
		EditingUtils.setEEFtype(originalFilePath, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.originalFilePath, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOriginalFilePathText

		// End of user code
		return parent;
	}

	
	protected Composite createNewFilePathText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.newFilePath, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_NewFilePathLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.newFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, newFilePath.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.newFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, newFilePath.getText()));
				}
			}

		});
		EditingUtils.setID(newFilePath, CartographyDescriptionViewsRepository.UnitTest.Properties.newFilePath);
		EditingUtils.setEEFtype(newFilePath, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.newFilePath, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNewFilePathText

		// End of user code
		return parent;
	}

	
	protected Composite createVisibilityEMFComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.visibility, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_VisibilityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
			}

		});
		visibility.setID(CartographyDescriptionViewsRepository.UnitTest.Properties.visibility);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.visibility, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVisibilityEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAttributesAdvancedTableComposition(Composite parent) {
		this.attributes = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.UnitTest.Properties.attributes, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_AttributesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.attributes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				attributes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.attributes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				attributes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.attributes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				attributes.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.attributes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				attributes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.attributesFilters) {
			this.attributes.addFilter(filter);
		}
		this.attributes.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.attributes, CartographyDescriptionViewsRepository.SWT_KIND));
		this.attributes.createControls(parent);
		this.attributes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.attributes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData attributesData = new GridData(GridData.FILL_HORIZONTAL);
		attributesData.horizontalSpan = 3;
		this.attributes.setLayoutData(attributesData);
		this.attributes.setLowerBound(0);
		this.attributes.setUpperBound(-1);
		attributes.setID(CartographyDescriptionViewsRepository.UnitTest.Properties.attributes);
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
		this.methods = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.UnitTest.Properties.methods, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_MethodsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				methods.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				methods.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				methods.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.methods, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				methods.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.methodsFilters) {
			this.methods.addFilter(filter);
		}
		this.methods.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.methods, CartographyDescriptionViewsRepository.SWT_KIND));
		this.methods.createControls(parent);
		this.methods.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.methods, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData methodsData = new GridData(GridData.FILL_HORIZONTAL);
		methodsData.horizontalSpan = 3;
		this.methods.setLayoutData(methodsData);
		this.methods.setLowerBound(0);
		this.methods.setUpperBound(-1);
		methods.setID(CartographyDescriptionViewsRepository.UnitTest.Properties.methods);
		methods.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createMethodsAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createInhertanceEMFComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.inhertance, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_InhertanceLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.inhertance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInhertance()));
			}

		});
		inhertance.setID(CartographyDescriptionViewsRepository.UnitTest.Properties.inhertance);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.inhertance, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInhertanceEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createImplements_AdvancedTableComposition(Composite parent) {
		this.implements_ = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.UnitTest.Properties.implements_, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_Implements_Label), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.implements_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				implements_.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.implements_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				implements_.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.implements_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				implements_.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.implements_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				implements_.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.implements_Filters) {
			this.implements_.addFilter(filter);
		}
		this.implements_.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.implements_, CartographyDescriptionViewsRepository.SWT_KIND));
		this.implements_.createControls(parent);
		this.implements_.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.implements_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData implements_Data = new GridData(GridData.FILL_HORIZONTAL);
		implements_Data.horizontalSpan = 3;
		this.implements_.setLayoutData(implements_Data);
		this.implements_.setLowerBound(0);
		this.implements_.setUpperBound(-1);
		implements_.setID(CartographyDescriptionViewsRepository.UnitTest.Properties.implements_);
		implements_.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createImplements_AdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createOriginalFileNameText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.originalFileName, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_OriginalFileNameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.originalFileName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFileName.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.originalFileName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFileName.getText()));
				}
			}

		});
		EditingUtils.setID(originalFileName, CartographyDescriptionViewsRepository.UnitTest.Properties.originalFileName);
		EditingUtils.setEEFtype(originalFileName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.originalFileName, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOriginalFileNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTypeText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.UnitTest.Properties.type, CartographyDescriptionMessages.UnitTestPropertiesEditionPart_TypeLabel);
		type = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
			}

		});
		type.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UnitTestPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.UnitTest.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}

		});
		EditingUtils.setID(type, CartographyDescriptionViewsRepository.UnitTest.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.UnitTest.Properties.type, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeText

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
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getLocs()
	 * 
	 */
	public String getLocs() {
		return locs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setLocs(String newValue)
	 * 
	 */
	public void setLocs(String newValue) {
		if (newValue != null) {
			locs.setText(newValue);
		} else {
			locs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.locs);
		if (eefElementEditorReadOnlyState && locs.isEnabled()) {
			locs.setEnabled(false);
			locs.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !locs.isEnabled()) {
			locs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getComments()
	 * 
	 */
	public String getComments() {
		return comments.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setComments(String newValue)
	 * 
	 */
	public void setComments(String newValue) {
		if (newValue != null) {
			comments.setText(newValue);
		} else {
			comments.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.comments);
		if (eefElementEditorReadOnlyState && comments.isEnabled()) {
			comments.setEnabled(false);
			comments.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comments.isEnabled()) {
			comments.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#initAnotations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnotations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		anotations.setContentProvider(contentProvider);
		anotations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.anotations);
		if (eefElementEditorReadOnlyState && anotations.isEnabled()) {
			anotations.setEnabled(false);
			anotations.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !anotations.isEnabled()) {
			anotations.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#updateAnotations()
	 * 
	 */
	public void updateAnotations() {
	anotations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addFilterAnotations(ViewerFilter filter)
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
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addBusinessFilterAnotations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnotations(ViewerFilter filter) {
		anotationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#isContainedInAnotationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnotationsTable(EObject element) {
		return ((ReferencesTableSettings)anotations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getWeight()
	 * 
	 */
	public String getWeight() {
		return weight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setWeight(String newValue)
	 * 
	 */
	public void setWeight(String newValue) {
		if (newValue != null) {
			weight.setText(newValue);
		} else {
			weight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.weight);
		if (eefElementEditorReadOnlyState && weight.isEnabled()) {
			weight.setEnabled(false);
			weight.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !weight.isEnabled()) {
			weight.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getMaxWeight()
	 * 
	 */
	public String getMaxWeight() {
		return maxWeight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setMaxWeight(String newValue)
	 * 
	 */
	public void setMaxWeight(String newValue) {
		if (newValue != null) {
			maxWeight.setText(newValue);
		} else {
			maxWeight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.maxWeight);
		if (eefElementEditorReadOnlyState && maxWeight.isEnabled()) {
			maxWeight.setEnabled(false);
			maxWeight.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !maxWeight.isEnabled()) {
			maxWeight.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#initMigRelations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMigRelations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		migRelations.setContentProvider(contentProvider);
		migRelations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.migRelations);
		if (eefElementEditorReadOnlyState && migRelations.getTable().isEnabled()) {
			migRelations.setEnabled(false);
			migRelations.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !migRelations.getTable().isEnabled()) {
			migRelations.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#updateMigRelations()
	 * 
	 */
	public void updateMigRelations() {
	migRelations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addFilterMigRelations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMigRelations(ViewerFilter filter) {
		migRelationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addBusinessFilterMigRelations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMigRelations(ViewerFilter filter) {
		migRelationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#isContainedInMigRelationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMigRelationsTable(EObject element) {
		return ((ReferencesTableSettings)migRelations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getParentLayer()
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
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#initParentLayer(EObjectFlatComboSettings)
	 */
	public void initParentLayer(EObjectFlatComboSettings settings) {
		parentLayer.setInput(settings);
		if (current != null) {
			parentLayer.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.parentLayer);
		if (eefElementEditorReadOnlyState && parentLayer.isEnabled()) {
			parentLayer.setEnabled(false);
			parentLayer.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentLayer.isEnabled()) {
			parentLayer.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setParentLayer(EObject newValue)
	 * 
	 */
	public void setParentLayer(EObject newValue) {
		if (newValue != null) {
			parentLayer.setSelection(new StructuredSelection(newValue));
		} else {
			parentLayer.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.parentLayer);
		if (eefElementEditorReadOnlyState && parentLayer.isEnabled()) {
			parentLayer.setEnabled(false);
			parentLayer.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentLayer.isEnabled()) {
			parentLayer.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setParentLayerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentLayerButtonMode(ButtonsModeEnum newValue) {
		parentLayer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addFilterParentLayer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentLayer(ViewerFilter filter) {
		parentLayer.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addBusinessFilterParentLayer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentLayer(ViewerFilter filter) {
		parentLayer.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getParentModule()
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
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#initParentModule(EObjectFlatComboSettings)
	 */
	public void initParentModule(EObjectFlatComboSettings settings) {
		parentModule.setInput(settings);
		if (current != null) {
			parentModule.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.parentModule);
		if (eefElementEditorReadOnlyState && parentModule.isEnabled()) {
			parentModule.setEnabled(false);
			parentModule.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentModule.isEnabled()) {
			parentModule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setParentModule(EObject newValue)
	 * 
	 */
	public void setParentModule(EObject newValue) {
		if (newValue != null) {
			parentModule.setSelection(new StructuredSelection(newValue));
		} else {
			parentModule.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.parentModule);
		if (eefElementEditorReadOnlyState && parentModule.isEnabled()) {
			parentModule.setEnabled(false);
			parentModule.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentModule.isEnabled()) {
			parentModule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setParentModuleButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentModuleButtonMode(ButtonsModeEnum newValue) {
		parentModule.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addFilterParentModule(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentModule(ViewerFilter filter) {
		parentModule.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addBusinessFilterParentModule(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentModule(ViewerFilter filter) {
		parentModule.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getOriginalFilePath()
	 * 
	 */
	public String getOriginalFilePath() {
		return originalFilePath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setOriginalFilePath(String newValue)
	 * 
	 */
	public void setOriginalFilePath(String newValue) {
		if (newValue != null) {
			originalFilePath.setText(newValue);
		} else {
			originalFilePath.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.originalFilePath);
		if (eefElementEditorReadOnlyState && originalFilePath.isEnabled()) {
			originalFilePath.setEnabled(false);
			originalFilePath.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !originalFilePath.isEnabled()) {
			originalFilePath.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getNewFilePath()
	 * 
	 */
	public String getNewFilePath() {
		return newFilePath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setNewFilePath(String newValue)
	 * 
	 */
	public void setNewFilePath(String newValue) {
		if (newValue != null) {
			newFilePath.setText(newValue);
		} else {
			newFilePath.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.newFilePath);
		if (eefElementEditorReadOnlyState && newFilePath.isEnabled()) {
			newFilePath.setEnabled(false);
			newFilePath.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !newFilePath.isEnabled()) {
			newFilePath.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getVisibility()
	 * 
	 */
	public Enumerator getVisibility() {
		Enumerator selection = (Enumerator) ((StructuredSelection) visibility.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#initVisibility(Object input, Enumerator current)
	 */
	public void initVisibility(Object input, Enumerator current) {
		visibility.setInput(input);
		visibility.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setVisibility(Enumerator newValue)
	 * 
	 */
	public void setVisibility(Enumerator newValue) {
		visibility.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#initAttributes(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAttributes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		attributes.setContentProvider(contentProvider);
		attributes.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.attributes);
		if (eefElementEditorReadOnlyState && attributes.isEnabled()) {
			attributes.setEnabled(false);
			attributes.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !attributes.isEnabled()) {
			attributes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#updateAttributes()
	 * 
	 */
	public void updateAttributes() {
	attributes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addFilterAttributes(ViewerFilter filter)
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
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addBusinessFilterAttributes(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAttributes(ViewerFilter filter) {
		attributesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#isContainedInAttributesTable(EObject element)
	 * 
	 */
	public boolean isContainedInAttributesTable(EObject element) {
		return ((ReferencesTableSettings)attributes.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#initMethods(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMethods(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		methods.setContentProvider(contentProvider);
		methods.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.methods);
		if (eefElementEditorReadOnlyState && methods.isEnabled()) {
			methods.setEnabled(false);
			methods.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !methods.isEnabled()) {
			methods.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#updateMethods()
	 * 
	 */
	public void updateMethods() {
	methods.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addFilterMethods(ViewerFilter filter)
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
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addBusinessFilterMethods(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMethods(ViewerFilter filter) {
		methodsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#isContainedInMethodsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMethodsTable(EObject element) {
		return ((ReferencesTableSettings)methods.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getInhertance()
	 * 
	 */
	public Enumerator getInhertance() {
		Enumerator selection = (Enumerator) ((StructuredSelection) inhertance.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#initInhertance(Object input, Enumerator current)
	 */
	public void initInhertance(Object input, Enumerator current) {
		inhertance.setInput(input);
		inhertance.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.inhertance);
		if (eefElementEditorReadOnlyState && inhertance.isEnabled()) {
			inhertance.setEnabled(false);
			inhertance.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inhertance.isEnabled()) {
			inhertance.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setInhertance(Enumerator newValue)
	 * 
	 */
	public void setInhertance(Enumerator newValue) {
		inhertance.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.inhertance);
		if (eefElementEditorReadOnlyState && inhertance.isEnabled()) {
			inhertance.setEnabled(false);
			inhertance.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inhertance.isEnabled()) {
			inhertance.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#initImplements_(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initImplements_(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		implements_.setContentProvider(contentProvider);
		implements_.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.implements_);
		if (eefElementEditorReadOnlyState && implements_.isEnabled()) {
			implements_.setEnabled(false);
			implements_.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !implements_.isEnabled()) {
			implements_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#updateImplements_()
	 * 
	 */
	public void updateImplements_() {
	implements_.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addFilterImplements_(ViewerFilter filter)
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
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#addBusinessFilterImplements_(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToImplements_(ViewerFilter filter) {
		implements_BusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#isContainedInImplements_Table(EObject element)
	 * 
	 */
	public boolean isContainedInImplements_Table(EObject element) {
		return ((ReferencesTableSettings)implements_.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getOriginalFileName()
	 * 
	 */
	public String getOriginalFileName() {
		return originalFileName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setOriginalFileName(String newValue)
	 * 
	 */
	public void setOriginalFileName(String newValue) {
		if (newValue != null) {
			originalFileName.setText(newValue);
		} else {
			originalFileName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.originalFileName);
		if (eefElementEditorReadOnlyState && originalFileName.isEnabled()) {
			originalFileName.setEnabled(false);
			originalFileName.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !originalFileName.isEnabled()) {
			originalFileName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.UnitTestPropertiesEditionPart#setType(String newValue)
	 * 
	 */
	public void setType(String newValue) {
		if (newValue != null) {
			type.setText(newValue);
		} else {
			type.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.UnitTest.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(CartographyDescriptionMessages.UnitTest_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CartographyDescriptionMessages.UnitTest_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
