/**
 * Generated with Acceleo
 */
package CartographyDescription.parts.forms;

// Start of user code for imports
import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.LayerPropertiesEditionPart;

import CartographyDescription.providers.CartographyDescriptionMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

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
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class LayerPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, LayerPropertiesEditionPart {

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
	protected ReferencesTable compilationUnits;
	protected List<ViewerFilter> compilationUnitsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> compilationUnitsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public LayerPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LayerPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence layerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = layerStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.class);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.locs);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.comments);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.anotations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.weight);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.name);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.maxWeight);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.migRelations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.parentLayer);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.parentModule);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.newFilePath);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits);
		
		
		composer = new PartComposer(layerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.locs) {
					return createLocsText(widgetFactory, parent);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.comments) {
					return createCommentsText(widgetFactory, parent);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.anotations) {
					return createAnotationsTableComposition(widgetFactory, parent);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.weight) {
					return createWeightText(widgetFactory, parent);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.maxWeight) {
					return createMaxWeightText(widgetFactory, parent);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.migRelations) {
					return createMigRelationsReferencesTable(widgetFactory, parent);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.parentLayer) {
					return createParentLayerFlatComboViewer(parent, widgetFactory);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.parentModule) {
					return createParentModuleFlatComboViewer(parent, widgetFactory);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath) {
					return createOriginalFilePathText(widgetFactory, parent);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.newFilePath) {
					return createNewFilePathText(widgetFactory, parent);
				}
				if (key == CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits) {
					return createCompilationUnitsReferencesTable(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(CartographyDescriptionMessages.LayerPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createLocsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Layer.Properties.locs, CartographyDescriptionMessages.LayerPropertiesEditionPart_LocsLabel);
		locs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		locs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData locsData = new GridData(GridData.FILL_HORIZONTAL);
		locs.setLayoutData(locsData);
		locs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							LayerPropertiesEditionPartForm.this,
							CartographyDescriptionViewsRepository.Layer.Properties.locs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									CartographyDescriptionViewsRepository.Layer.Properties.locs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, locs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		locs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.locs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locs.getText()));
				}
			}
		});
		EditingUtils.setID(locs, CartographyDescriptionViewsRepository.Layer.Properties.locs);
		EditingUtils.setEEFtype(locs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.locs, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createLocsText

		// End of user code
		return parent;
	}

	
	protected Composite createCommentsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Layer.Properties.comments, CartographyDescriptionMessages.LayerPropertiesEditionPart_CommentsLabel);
		comments = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		comments.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData commentsData = new GridData(GridData.FILL_HORIZONTAL);
		comments.setLayoutData(commentsData);
		comments.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							LayerPropertiesEditionPartForm.this,
							CartographyDescriptionViewsRepository.Layer.Properties.comments,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									CartographyDescriptionViewsRepository.Layer.Properties.comments,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, comments.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		comments.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.comments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comments.getText()));
				}
			}
		});
		EditingUtils.setID(comments, CartographyDescriptionViewsRepository.Layer.Properties.comments);
		EditingUtils.setEEFtype(comments, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.comments, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommentsText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnotationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.anotations = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Layer.Properties.anotations, CartographyDescriptionMessages.LayerPropertiesEditionPart_AnotationsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				anotations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				anotations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				anotations.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				anotations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.anotationsFilters) {
			this.anotations.addFilter(filter);
		}
		this.anotations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.anotations, CartographyDescriptionViewsRepository.FORM_KIND));
		this.anotations.createControls(parent, widgetFactory);
		this.anotations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.anotations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData anotationsData = new GridData(GridData.FILL_HORIZONTAL);
		anotationsData.horizontalSpan = 3;
		this.anotations.setLayoutData(anotationsData);
		this.anotations.setLowerBound(0);
		this.anotations.setUpperBound(-1);
		anotations.setID(CartographyDescriptionViewsRepository.Layer.Properties.anotations);
		anotations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnotationsTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createWeightText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Layer.Properties.weight, CartographyDescriptionMessages.LayerPropertiesEditionPart_WeightLabel);
		weight = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		weight.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData weightData = new GridData(GridData.FILL_HORIZONTAL);
		weight.setLayoutData(weightData);
		weight.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							LayerPropertiesEditionPartForm.this,
							CartographyDescriptionViewsRepository.Layer.Properties.weight,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									CartographyDescriptionViewsRepository.Layer.Properties.weight,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, weight.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		weight.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.weight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, weight.getText()));
				}
			}
		});
		EditingUtils.setID(weight, CartographyDescriptionViewsRepository.Layer.Properties.weight);
		EditingUtils.setEEFtype(weight, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.weight, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWeightText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Layer.Properties.name, CartographyDescriptionMessages.LayerPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							LayerPropertiesEditionPartForm.this,
							CartographyDescriptionViewsRepository.Layer.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									CartographyDescriptionViewsRepository.Layer.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, CartographyDescriptionViewsRepository.Layer.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.name, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createMaxWeightText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Layer.Properties.maxWeight, CartographyDescriptionMessages.LayerPropertiesEditionPart_MaxWeightLabel);
		maxWeight = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		maxWeight.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData maxWeightData = new GridData(GridData.FILL_HORIZONTAL);
		maxWeight.setLayoutData(maxWeightData);
		maxWeight.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							LayerPropertiesEditionPartForm.this,
							CartographyDescriptionViewsRepository.Layer.Properties.maxWeight,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxWeight.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									CartographyDescriptionViewsRepository.Layer.Properties.maxWeight,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, maxWeight.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		maxWeight.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.maxWeight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxWeight.getText()));
				}
			}
		});
		EditingUtils.setID(maxWeight, CartographyDescriptionViewsRepository.Layer.Properties.maxWeight);
		EditingUtils.setEEFtype(maxWeight, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.maxWeight, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMaxWeightText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createMigRelationsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.migRelations = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Layer.Properties.migRelations, CartographyDescriptionMessages.LayerPropertiesEditionPart_MigRelationsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addMigRelations(); }
			public void handleEdit(EObject element) { editMigRelations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMigRelations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMigRelations(element); }
			public void navigateTo(EObject element) { }
		});
		this.migRelations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.migRelations, CartographyDescriptionViewsRepository.FORM_KIND));
		this.migRelations.createControls(parent, widgetFactory);
		this.migRelations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.migRelations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData migRelationsData = new GridData(GridData.FILL_HORIZONTAL);
		migRelationsData.horizontalSpan = 3;
		this.migRelations.setLayoutData(migRelationsData);
		this.migRelations.disableMove();
		migRelations.setID(CartographyDescriptionViewsRepository.Layer.Properties.migRelations);
		migRelations.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createMigRelationsReferencesTable

		// End of user code
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.migRelations,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.migRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		migRelations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMigRelations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.migRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createParentLayerFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, CartographyDescriptionViewsRepository.Layer.Properties.parentLayer, CartographyDescriptionMessages.LayerPropertiesEditionPart_ParentLayerLabel);
		parentLayer = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.Layer.Properties.parentLayer, CartographyDescriptionViewsRepository.FORM_KIND));
		widgetFactory.adapt(parentLayer);
		parentLayer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData parentLayerData = new GridData(GridData.FILL_HORIZONTAL);
		parentLayer.setLayoutData(parentLayerData);
		parentLayer.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.parentLayer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParentLayer()));
			}

		});
		parentLayer.setID(CartographyDescriptionViewsRepository.Layer.Properties.parentLayer);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.parentLayer, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createParentLayerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createParentModuleFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, CartographyDescriptionViewsRepository.Layer.Properties.parentModule, CartographyDescriptionMessages.LayerPropertiesEditionPart_ParentModuleLabel);
		parentModule = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.Layer.Properties.parentModule, CartographyDescriptionViewsRepository.FORM_KIND));
		widgetFactory.adapt(parentModule);
		parentModule.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData parentModuleData = new GridData(GridData.FILL_HORIZONTAL);
		parentModule.setLayoutData(parentModuleData);
		parentModule.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.parentModule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParentModule()));
			}

		});
		parentModule.setID(CartographyDescriptionViewsRepository.Layer.Properties.parentModule);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.parentModule, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createParentModuleFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createOriginalFilePathText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath, CartographyDescriptionMessages.LayerPropertiesEditionPart_OriginalFilePathLabel);
		originalFilePath = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		originalFilePath.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData originalFilePathData = new GridData(GridData.FILL_HORIZONTAL);
		originalFilePath.setLayoutData(originalFilePathData);
		originalFilePath.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							LayerPropertiesEditionPartForm.this,
							CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFilePath.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, originalFilePath.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		originalFilePath.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalFilePath.getText()));
				}
			}
		});
		EditingUtils.setID(originalFilePath, CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath);
		EditingUtils.setEEFtype(originalFilePath, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOriginalFilePathText

		// End of user code
		return parent;
	}

	
	protected Composite createNewFilePathText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Layer.Properties.newFilePath, CartographyDescriptionMessages.LayerPropertiesEditionPart_NewFilePathLabel);
		newFilePath = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		newFilePath.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData newFilePathData = new GridData(GridData.FILL_HORIZONTAL);
		newFilePath.setLayoutData(newFilePathData);
		newFilePath.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							LayerPropertiesEditionPartForm.this,
							CartographyDescriptionViewsRepository.Layer.Properties.newFilePath,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, newFilePath.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									CartographyDescriptionViewsRepository.Layer.Properties.newFilePath,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, newFilePath.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LayerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		newFilePath.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.newFilePath, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, newFilePath.getText()));
				}
			}
		});
		EditingUtils.setID(newFilePath, CartographyDescriptionViewsRepository.Layer.Properties.newFilePath);
		EditingUtils.setEEFtype(newFilePath, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.newFilePath, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNewFilePathText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCompilationUnitsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.compilationUnits = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits, CartographyDescriptionMessages.LayerPropertiesEditionPart_CompilationUnitsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addCompilationUnits(); }
			public void handleEdit(EObject element) { editCompilationUnits(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCompilationUnits(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCompilationUnits(element); }
			public void navigateTo(EObject element) { }
		});
		this.compilationUnits.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits, CartographyDescriptionViewsRepository.FORM_KIND));
		this.compilationUnits.createControls(parent, widgetFactory);
		this.compilationUnits.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData compilationUnitsData = new GridData(GridData.FILL_HORIZONTAL);
		compilationUnitsData.horizontalSpan = 3;
		this.compilationUnits.setLayoutData(compilationUnitsData);
		this.compilationUnits.disableMove();
		compilationUnits.setID(CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits);
		compilationUnits.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createCompilationUnitsReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addCompilationUnits() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(compilationUnits.getInput(), compilationUnitsFilters, compilationUnitsBusinessFilters,
		"compilationUnits", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				compilationUnits.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCompilationUnits(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		compilationUnits.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCompilationUnits(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayerPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		compilationUnits.refresh();
	}

	/**
	 * 
	 */
	protected void editCompilationUnits(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				compilationUnits.refresh();
			}
		}
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
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#getLocs()
	 * 
	 */
	public String getLocs() {
		return locs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#setLocs(String newValue)
	 * 
	 */
	public void setLocs(String newValue) {
		if (newValue != null) {
			locs.setText(newValue);
		} else {
			locs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.locs);
		if (eefElementEditorReadOnlyState && locs.isEnabled()) {
			locs.setEnabled(false);
			locs.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !locs.isEnabled()) {
			locs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#getComments()
	 * 
	 */
	public String getComments() {
		return comments.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#setComments(String newValue)
	 * 
	 */
	public void setComments(String newValue) {
		if (newValue != null) {
			comments.setText(newValue);
		} else {
			comments.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.comments);
		if (eefElementEditorReadOnlyState && comments.isEnabled()) {
			comments.setEnabled(false);
			comments.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comments.isEnabled()) {
			comments.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#initAnotations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnotations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		anotations.setContentProvider(contentProvider);
		anotations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.anotations);
		if (eefElementEditorReadOnlyState && anotations.isEnabled()) {
			anotations.setEnabled(false);
			anotations.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !anotations.isEnabled()) {
			anotations.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#updateAnotations()
	 * 
	 */
	public void updateAnotations() {
	anotations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#addFilterAnotations(ViewerFilter filter)
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
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#addBusinessFilterAnotations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnotations(ViewerFilter filter) {
		anotationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#isContainedInAnotationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnotationsTable(EObject element) {
		return ((ReferencesTableSettings)anotations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#getWeight()
	 * 
	 */
	public String getWeight() {
		return weight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#setWeight(String newValue)
	 * 
	 */
	public void setWeight(String newValue) {
		if (newValue != null) {
			weight.setText(newValue);
		} else {
			weight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.weight);
		if (eefElementEditorReadOnlyState && weight.isEnabled()) {
			weight.setEnabled(false);
			weight.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !weight.isEnabled()) {
			weight.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#getMaxWeight()
	 * 
	 */
	public String getMaxWeight() {
		return maxWeight.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#setMaxWeight(String newValue)
	 * 
	 */
	public void setMaxWeight(String newValue) {
		if (newValue != null) {
			maxWeight.setText(newValue);
		} else {
			maxWeight.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.maxWeight);
		if (eefElementEditorReadOnlyState && maxWeight.isEnabled()) {
			maxWeight.setEnabled(false);
			maxWeight.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !maxWeight.isEnabled()) {
			maxWeight.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#initMigRelations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMigRelations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		migRelations.setContentProvider(contentProvider);
		migRelations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.migRelations);
		if (eefElementEditorReadOnlyState && migRelations.getTable().isEnabled()) {
			migRelations.setEnabled(false);
			migRelations.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !migRelations.getTable().isEnabled()) {
			migRelations.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#updateMigRelations()
	 * 
	 */
	public void updateMigRelations() {
	migRelations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#addFilterMigRelations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMigRelations(ViewerFilter filter) {
		migRelationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#addBusinessFilterMigRelations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMigRelations(ViewerFilter filter) {
		migRelationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#isContainedInMigRelationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMigRelationsTable(EObject element) {
		return ((ReferencesTableSettings)migRelations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#getParentLayer()
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
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#initParentLayer(EObjectFlatComboSettings)
	 */
	public void initParentLayer(EObjectFlatComboSettings settings) {
		parentLayer.setInput(settings);
		if (current != null) {
			parentLayer.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.parentLayer);
		if (eefElementEditorReadOnlyState && parentLayer.isEnabled()) {
			parentLayer.setEnabled(false);
			parentLayer.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentLayer.isEnabled()) {
			parentLayer.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#setParentLayer(EObject newValue)
	 * 
	 */
	public void setParentLayer(EObject newValue) {
		if (newValue != null) {
			parentLayer.setSelection(new StructuredSelection(newValue));
		} else {
			parentLayer.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.parentLayer);
		if (eefElementEditorReadOnlyState && parentLayer.isEnabled()) {
			parentLayer.setEnabled(false);
			parentLayer.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentLayer.isEnabled()) {
			parentLayer.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#setParentLayerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentLayerButtonMode(ButtonsModeEnum newValue) {
		parentLayer.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#addFilterParentLayer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentLayer(ViewerFilter filter) {
		parentLayer.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#addBusinessFilterParentLayer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentLayer(ViewerFilter filter) {
		parentLayer.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#getParentModule()
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
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#initParentModule(EObjectFlatComboSettings)
	 */
	public void initParentModule(EObjectFlatComboSettings settings) {
		parentModule.setInput(settings);
		if (current != null) {
			parentModule.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.parentModule);
		if (eefElementEditorReadOnlyState && parentModule.isEnabled()) {
			parentModule.setEnabled(false);
			parentModule.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentModule.isEnabled()) {
			parentModule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#setParentModule(EObject newValue)
	 * 
	 */
	public void setParentModule(EObject newValue) {
		if (newValue != null) {
			parentModule.setSelection(new StructuredSelection(newValue));
		} else {
			parentModule.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.parentModule);
		if (eefElementEditorReadOnlyState && parentModule.isEnabled()) {
			parentModule.setEnabled(false);
			parentModule.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentModule.isEnabled()) {
			parentModule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#setParentModuleButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentModuleButtonMode(ButtonsModeEnum newValue) {
		parentModule.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#addFilterParentModule(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentModule(ViewerFilter filter) {
		parentModule.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#addBusinessFilterParentModule(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentModule(ViewerFilter filter) {
		parentModule.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#getOriginalFilePath()
	 * 
	 */
	public String getOriginalFilePath() {
		return originalFilePath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#setOriginalFilePath(String newValue)
	 * 
	 */
	public void setOriginalFilePath(String newValue) {
		if (newValue != null) {
			originalFilePath.setText(newValue);
		} else {
			originalFilePath.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath);
		if (eefElementEditorReadOnlyState && originalFilePath.isEnabled()) {
			originalFilePath.setEnabled(false);
			originalFilePath.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !originalFilePath.isEnabled()) {
			originalFilePath.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#getNewFilePath()
	 * 
	 */
	public String getNewFilePath() {
		return newFilePath.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#setNewFilePath(String newValue)
	 * 
	 */
	public void setNewFilePath(String newValue) {
		if (newValue != null) {
			newFilePath.setText(newValue);
		} else {
			newFilePath.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.newFilePath);
		if (eefElementEditorReadOnlyState && newFilePath.isEnabled()) {
			newFilePath.setEnabled(false);
			newFilePath.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !newFilePath.isEnabled()) {
			newFilePath.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#initCompilationUnits(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCompilationUnits(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		compilationUnits.setContentProvider(contentProvider);
		compilationUnits.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits);
		if (eefElementEditorReadOnlyState && compilationUnits.getTable().isEnabled()) {
			compilationUnits.setEnabled(false);
			compilationUnits.setToolTipText(CartographyDescriptionMessages.Layer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !compilationUnits.getTable().isEnabled()) {
			compilationUnits.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#updateCompilationUnits()
	 * 
	 */
	public void updateCompilationUnits() {
	compilationUnits.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#addFilterCompilationUnits(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCompilationUnits(ViewerFilter filter) {
		compilationUnitsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#addBusinessFilterCompilationUnits(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCompilationUnits(ViewerFilter filter) {
		compilationUnitsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.LayerPropertiesEditionPart#isContainedInCompilationUnitsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCompilationUnitsTable(EObject element) {
		return ((ReferencesTableSettings)compilationUnits.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CartographyDescriptionMessages.Layer_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
