/**
 * Generated with Acceleo
 */
package CartographyDescription.parts.forms;

// Start of user code for imports
import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.ElementRelationPropertiesEditionPart;

import CartographyDescription.providers.CartographyDescriptionMessages;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class ElementRelationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ElementRelationPropertiesEditionPart {

	protected EObjectFlatComboViewer src;
	protected EObjectFlatComboViewer dest;
	protected EMFComboViewer relationType;



	/**
	 * For {@link ISection} use only.
	 */
	public ElementRelationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ElementRelationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence elementRelationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = elementRelationStep.addStep(CartographyDescriptionViewsRepository.ElementRelation.Properties.class);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.ElementRelation.Properties.src);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.ElementRelation.Properties.dest);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType);
		
		
		composer = new PartComposer(elementRelationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CartographyDescriptionViewsRepository.ElementRelation.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CartographyDescriptionViewsRepository.ElementRelation.Properties.src) {
					return createSrcFlatComboViewer(parent, widgetFactory);
				}
				if (key == CartographyDescriptionViewsRepository.ElementRelation.Properties.dest) {
					return createDestFlatComboViewer(parent, widgetFactory);
				}
				if (key == CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType) {
					return createRelationTypeEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(CartographyDescriptionMessages.ElementRelationPropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSrcFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, CartographyDescriptionViewsRepository.ElementRelation.Properties.src, CartographyDescriptionMessages.ElementRelationPropertiesEditionPart_SrcLabel);
		src = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.ElementRelation.Properties.src, CartographyDescriptionViewsRepository.FORM_KIND));
		widgetFactory.adapt(src);
		src.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData srcData = new GridData(GridData.FILL_HORIZONTAL);
		src.setLayoutData(srcData);
		src.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementRelationPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.ElementRelation.Properties.src, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSrc()));
			}

		});
		src.setID(CartographyDescriptionViewsRepository.ElementRelation.Properties.src);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.ElementRelation.Properties.src, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSrcFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createDestFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, CartographyDescriptionViewsRepository.ElementRelation.Properties.dest, CartographyDescriptionMessages.ElementRelationPropertiesEditionPart_DestLabel);
		dest = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.ElementRelation.Properties.dest, CartographyDescriptionViewsRepository.FORM_KIND));
		widgetFactory.adapt(dest);
		dest.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData destData = new GridData(GridData.FILL_HORIZONTAL);
		dest.setLayoutData(destData);
		dest.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementRelationPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.ElementRelation.Properties.dest, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDest()));
			}

		});
		dest.setID(CartographyDescriptionViewsRepository.ElementRelation.Properties.dest);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.ElementRelation.Properties.dest, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDestFlatComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createRelationTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType, CartographyDescriptionMessages.ElementRelationPropertiesEditionPart_RelationTypeLabel);
		relationType = new EMFComboViewer(parent);
		relationType.setContentProvider(new ArrayContentProvider());
		relationType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData relationTypeData = new GridData(GridData.FILL_HORIZONTAL);
		relationType.getCombo().setLayoutData(relationTypeData);
		relationType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ElementRelationPropertiesEditionPartForm.this, CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRelationType()));
			}

		});
		relationType.setID(CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType, CartographyDescriptionViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createRelationTypeEMFComboViewer

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
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#getSrc()
	 * 
	 */
	public EObject getSrc() {
		if (src.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) src.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#initSrc(EObjectFlatComboSettings)
	 */
	public void initSrc(EObjectFlatComboSettings settings) {
		src.setInput(settings);
		if (current != null) {
			src.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.ElementRelation.Properties.src);
		if (eefElementEditorReadOnlyState && src.isEnabled()) {
			src.setEnabled(false);
			src.setToolTipText(CartographyDescriptionMessages.ElementRelation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !src.isEnabled()) {
			src.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#setSrc(EObject newValue)
	 * 
	 */
	public void setSrc(EObject newValue) {
		if (newValue != null) {
			src.setSelection(new StructuredSelection(newValue));
		} else {
			src.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.ElementRelation.Properties.src);
		if (eefElementEditorReadOnlyState && src.isEnabled()) {
			src.setEnabled(false);
			src.setToolTipText(CartographyDescriptionMessages.ElementRelation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !src.isEnabled()) {
			src.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#setSrcButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSrcButtonMode(ButtonsModeEnum newValue) {
		src.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#addFilterSrc(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSrc(ViewerFilter filter) {
		src.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#addBusinessFilterSrc(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSrc(ViewerFilter filter) {
		src.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#getDest()
	 * 
	 */
	public EObject getDest() {
		if (dest.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) dest.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#initDest(EObjectFlatComboSettings)
	 */
	public void initDest(EObjectFlatComboSettings settings) {
		dest.setInput(settings);
		if (current != null) {
			dest.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.ElementRelation.Properties.dest);
		if (eefElementEditorReadOnlyState && dest.isEnabled()) {
			dest.setEnabled(false);
			dest.setToolTipText(CartographyDescriptionMessages.ElementRelation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dest.isEnabled()) {
			dest.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#setDest(EObject newValue)
	 * 
	 */
	public void setDest(EObject newValue) {
		if (newValue != null) {
			dest.setSelection(new StructuredSelection(newValue));
		} else {
			dest.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.ElementRelation.Properties.dest);
		if (eefElementEditorReadOnlyState && dest.isEnabled()) {
			dest.setEnabled(false);
			dest.setToolTipText(CartographyDescriptionMessages.ElementRelation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dest.isEnabled()) {
			dest.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#setDestButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDestButtonMode(ButtonsModeEnum newValue) {
		dest.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#addFilterDest(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDest(ViewerFilter filter) {
		dest.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#addBusinessFilterDest(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDest(ViewerFilter filter) {
		dest.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#getRelationType()
	 * 
	 */
	public Enumerator getRelationType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) relationType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#initRelationType(Object input, Enumerator current)
	 */
	public void initRelationType(Object input, Enumerator current) {
		relationType.setInput(input);
		relationType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType);
		if (eefElementEditorReadOnlyState && relationType.isEnabled()) {
			relationType.setEnabled(false);
			relationType.setToolTipText(CartographyDescriptionMessages.ElementRelation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !relationType.isEnabled()) {
			relationType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.ElementRelationPropertiesEditionPart#setRelationType(Enumerator newValue)
	 * 
	 */
	public void setRelationType(Enumerator newValue) {
		relationType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType);
		if (eefElementEditorReadOnlyState && relationType.isEnabled()) {
			relationType.setEnabled(false);
			relationType.setToolTipText(CartographyDescriptionMessages.ElementRelation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !relationType.isEnabled()) {
			relationType.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CartographyDescriptionMessages.ElementRelation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
