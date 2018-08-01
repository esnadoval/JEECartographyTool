/**
 * Generated with Acceleo
 */
package CartographyDescription.parts.impl;

// Start of user code for imports
import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.EnumLiteralvaluePropertiesEditionPart;

import CartographyDescription.providers.CartographyDescriptionMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

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
public class EnumLiteralvaluePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EnumLiteralvaluePropertiesEditionPart {

	protected Text value;
	protected EObjectFlatComboViewer attr;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EnumLiteralvaluePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence enumLiteralvalueStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = enumLiteralvalueStep.addStep(CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.class);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.value);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.attr);
		
		
		composer = new PartComposer(enumLiteralvalueStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.value) {
					return createValueText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.attr) {
					return createAttrFlatComboViewer(parent);
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
		propertiesGroup.setText(CartographyDescriptionMessages.EnumLiteralvaluePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createValueText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.value, CartographyDescriptionMessages.EnumLiteralvaluePropertiesEditionPart_ValueLabel);
		value = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumLiteralvaluePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumLiteralvaluePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.value, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createAttrFlatComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.attr, CartographyDescriptionMessages.EnumLiteralvaluePropertiesEditionPart_AttrLabel);
		attr = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.attr, CartographyDescriptionViewsRepository.SWT_KIND));
		attr.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		attr.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumLiteralvaluePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.attr, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getAttr()));
			}

		});
		GridData attrData = new GridData(GridData.FILL_HORIZONTAL);
		attr.setLayoutData(attrData);
		attr.setID(CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.attr);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.attr, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAttrFlatComboViewer

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
	 * @see CartographyDescription.parts.EnumLiteralvaluePropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralvaluePropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.value);
		if (eefElementEditorReadOnlyState && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(CartographyDescriptionMessages.EnumLiteralvalue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralvaluePropertiesEditionPart#getAttr()
	 * 
	 */
	public EObject getAttr() {
		if (attr.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) attr.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralvaluePropertiesEditionPart#initAttr(EObjectFlatComboSettings)
	 */
	public void initAttr(EObjectFlatComboSettings settings) {
		attr.setInput(settings);
		if (current != null) {
			attr.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.attr);
		if (eefElementEditorReadOnlyState && attr.isEnabled()) {
			attr.setEnabled(false);
			attr.setToolTipText(CartographyDescriptionMessages.EnumLiteralvalue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !attr.isEnabled()) {
			attr.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralvaluePropertiesEditionPart#setAttr(EObject newValue)
	 * 
	 */
	public void setAttr(EObject newValue) {
		if (newValue != null) {
			attr.setSelection(new StructuredSelection(newValue));
		} else {
			attr.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.EnumLiteralvalue.Properties.attr);
		if (eefElementEditorReadOnlyState && attr.isEnabled()) {
			attr.setEnabled(false);
			attr.setToolTipText(CartographyDescriptionMessages.EnumLiteralvalue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !attr.isEnabled()) {
			attr.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralvaluePropertiesEditionPart#setAttrButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAttrButtonMode(ButtonsModeEnum newValue) {
		attr.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralvaluePropertiesEditionPart#addFilterAttr(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAttr(ViewerFilter filter) {
		attr.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralvaluePropertiesEditionPart#addBusinessFilterAttr(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAttr(ViewerFilter filter) {
		attr.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CartographyDescriptionMessages.EnumLiteralvalue_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
