/**
 * Generated with Acceleo
 */
package CartographyDescription.parts.impl;

// Start of user code for imports
import CartographyDescription.parts.AnnotationPropertiesEditionPart;
import CartographyDescription.parts.CartographyDescriptionViewsRepository;

import CartographyDescription.providers.CartographyDescriptionMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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
public class AnnotationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AnnotationPropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected ReferencesTable params;
	protected List<ViewerFilter> paramsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> paramsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AnnotationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence annotationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = annotationStep.addStep(CartographyDescriptionViewsRepository.Annotation.Properties.class);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Annotation.Properties.name);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Annotation.Properties.description);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Annotation.Properties.params);
		
		
		composer = new PartComposer(annotationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CartographyDescriptionViewsRepository.Annotation.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Annotation.Properties.name) {
					return createNameText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Annotation.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Annotation.Properties.params) {
					return createParamsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(CartographyDescriptionMessages.AnnotationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Annotation.Properties.name, CartographyDescriptionMessages.AnnotationPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Annotation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Annotation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CartographyDescriptionViewsRepository.Annotation.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Annotation.Properties.name, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Annotation.Properties.description, CartographyDescriptionMessages.AnnotationPropertiesEditionPart_DescriptionLabel);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Annotation.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Annotation.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, CartographyDescriptionViewsRepository.Annotation.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Annotation.Properties.description, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createParamsAdvancedTableComposition(Composite parent) {
		this.params = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.Annotation.Properties.params, CartographyDescriptionMessages.AnnotationPropertiesEditionPart_ParamsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Annotation.Properties.params, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				params.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Annotation.Properties.params, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				params.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Annotation.Properties.params, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				params.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Annotation.Properties.params, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				params.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.paramsFilters) {
			this.params.addFilter(filter);
		}
		this.params.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Annotation.Properties.params, CartographyDescriptionViewsRepository.SWT_KIND));
		this.params.createControls(parent);
		this.params.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Annotation.Properties.params, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData paramsData = new GridData(GridData.FILL_HORIZONTAL);
		paramsData.horizontalSpan = 3;
		this.params.setLayoutData(paramsData);
		this.params.setLowerBound(0);
		this.params.setUpperBound(-1);
		params.setID(CartographyDescriptionViewsRepository.Annotation.Properties.params);
		params.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createParamsAdvancedTableComposition

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
	 * @see CartographyDescription.parts.AnnotationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AnnotationPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Annotation.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(CartographyDescriptionMessages.Annotation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AnnotationPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AnnotationPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Annotation.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(CartographyDescriptionMessages.Annotation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AnnotationPropertiesEditionPart#initParams(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initParams(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		params.setContentProvider(contentProvider);
		params.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Annotation.Properties.params);
		if (eefElementEditorReadOnlyState && params.isEnabled()) {
			params.setEnabled(false);
			params.setToolTipText(CartographyDescriptionMessages.Annotation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !params.isEnabled()) {
			params.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AnnotationPropertiesEditionPart#updateParams()
	 * 
	 */
	public void updateParams() {
	params.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AnnotationPropertiesEditionPart#addFilterParams(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParams(ViewerFilter filter) {
		paramsFilters.add(filter);
		if (this.params != null) {
			this.params.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AnnotationPropertiesEditionPart#addBusinessFilterParams(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParams(ViewerFilter filter) {
		paramsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.AnnotationPropertiesEditionPart#isContainedInParamsTable(EObject element)
	 * 
	 */
	public boolean isContainedInParamsTable(EObject element) {
		return ((ReferencesTableSettings)params.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CartographyDescriptionMessages.Annotation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
