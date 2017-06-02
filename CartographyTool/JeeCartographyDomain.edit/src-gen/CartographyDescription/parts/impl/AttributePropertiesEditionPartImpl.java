/**
 * Generated with Acceleo
 */
package CartographyDescription.parts.impl;

// Start of user code for imports
import CartographyDescription.parts.AttributePropertiesEditionPart;
import CartographyDescription.parts.CartographyDescriptionViewsRepository;

import CartographyDescription.providers.CartographyDescriptionMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class AttributePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AttributePropertiesEditionPart {

	protected ReferencesTable anotations;
	protected List<ViewerFilter> anotationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> anotationsFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer visibility;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AttributePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence attributeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = attributeStep.addStep(CartographyDescriptionViewsRepository.Attribute.Properties.class);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Attribute.Properties.anotations);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Attribute.Properties.visibility);
		
		
		composer = new PartComposer(attributeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CartographyDescriptionViewsRepository.Attribute.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Attribute.Properties.anotations) {
					return createAnotationsAdvancedTableComposition(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Attribute.Properties.visibility) {
					return createVisibilityEMFComboViewer(parent);
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
		propertiesGroup.setText(CartographyDescriptionMessages.AttributePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnotationsAdvancedTableComposition(Composite parent) {
		this.anotations = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Attribute.Properties.anotations, CartographyDescriptionMessages.AttributePropertiesEditionPart_AnotationsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Attribute.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				anotations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Attribute.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				anotations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Attribute.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				anotations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Attribute.Properties.anotations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				anotations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.anotationsFilters) {
			this.anotations.addFilter(filter);
		}
		this.anotations.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Attribute.Properties.anotations, CartographyDescriptionViewsRepository.SWT_KIND));
		this.anotations.createControls(parent);
		this.anotations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Attribute.Properties.anotations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData anotationsData = new GridData(GridData.FILL_HORIZONTAL);
		anotationsData.horizontalSpan = 3;
		this.anotations.setLayoutData(anotationsData);
		this.anotations.setLowerBound(0);
		this.anotations.setUpperBound(-1);
		anotations.setID(CartographyDescriptionViewsRepository.Attribute.Properties.anotations);
		anotations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnotationsAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createVisibilityEMFComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Attribute.Properties.visibility, CartographyDescriptionMessages.AttributePropertiesEditionPart_VisibilityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AttributePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Attribute.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
			}

		});
		visibility.setID(CartographyDescriptionViewsRepository.Attribute.Properties.visibility);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Attribute.Properties.visibility, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVisibilityEMFComboViewer

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
	 * @see CartographyDescription.parts.AttributePropertiesEditionPart#initAnotations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnotations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		anotations.setContentProvider(contentProvider);
		anotations.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Attribute.Properties.anotations);
		if (eefElementEditorReadOnlyState && anotations.isEnabled()) {
			anotations.setEnabled(false);
			anotations.setToolTipText(CartographyDescriptionMessages.Attribute_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !anotations.isEnabled()) {
			anotations.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AttributePropertiesEditionPart#updateAnotations()
	 * 
	 */
	public void updateAnotations() {
	anotations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AttributePropertiesEditionPart#addFilterAnotations(ViewerFilter filter)
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
	 * @see CartographyDescription.parts.AttributePropertiesEditionPart#addBusinessFilterAnotations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnotations(ViewerFilter filter) {
		anotationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AttributePropertiesEditionPart#isContainedInAnotationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnotationsTable(EObject element) {
		return ((ReferencesTableSettings)anotations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AttributePropertiesEditionPart#getVisibility()
	 * 
	 */
	public Enumerator getVisibility() {
		Enumerator selection = (Enumerator) ((StructuredSelection) visibility.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AttributePropertiesEditionPart#initVisibility(Object input, Enumerator current)
	 */
	public void initVisibility(Object input, Enumerator current) {
		visibility.setInput(input);
		visibility.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Attribute.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(CartographyDescriptionMessages.Attribute_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AttributePropertiesEditionPart#setVisibility(Enumerator newValue)
	 * 
	 */
	public void setVisibility(Enumerator newValue) {
		visibility.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Attribute.Properties.visibility);
		if (eefElementEditorReadOnlyState && visibility.isEnabled()) {
			visibility.setEnabled(false);
			visibility.setToolTipText(CartographyDescriptionMessages.Attribute_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !visibility.isEnabled()) {
			visibility.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CartographyDescriptionMessages.Attribute_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
