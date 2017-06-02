/**
 * Generated with Acceleo
 */
package CartographyDescription.parts.impl;

// Start of user code for imports
import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.VariablePropertiesEditionPart;

import CartographyDescription.providers.CartographyDescriptionMessages;

import org.eclipse.emf.common.util.Enumerator;

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

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class VariablePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, VariablePropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer inhertance;
	protected Button static_;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public VariablePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence variableStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = variableStep.addStep(CartographyDescriptionViewsRepository.Variable.Properties.class);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Variable.Properties.name);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Variable.Properties.inhertance);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.Variable.Properties.static_);
		
		
		composer = new PartComposer(variableStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CartographyDescriptionViewsRepository.Variable.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Variable.Properties.name) {
					return createNameText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Variable.Properties.inhertance) {
					return createInhertanceEMFComboViewer(parent);
				}
				if (key == CartographyDescriptionViewsRepository.Variable.Properties.static_) {
					return createStatic_Checkbox(parent);
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
		propertiesGroup.setText(CartographyDescriptionMessages.VariablePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Variable.Properties.name, CartographyDescriptionMessages.VariablePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(VariablePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Variable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(VariablePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Variable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CartographyDescriptionViewsRepository.Variable.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Variable.Properties.name, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createInhertanceEMFComboViewer(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.Variable.Properties.inhertance, CartographyDescriptionMessages.VariablePropertiesEditionPart_InhertanceLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(VariablePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Variable.Properties.inhertance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInhertance()));
			}

		});
		inhertance.setID(CartographyDescriptionViewsRepository.Variable.Properties.inhertance);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Variable.Properties.inhertance, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInhertanceEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createStatic_Checkbox(Composite parent) {
		static_ = new Button(parent, SWT.CHECK);
		static_.setText(getDescription(CartographyDescriptionViewsRepository.Variable.Properties.static_, CartographyDescriptionMessages.VariablePropertiesEditionPart_Static_Label));
		static_.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(VariablePropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.Variable.Properties.static_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(static_.getSelection())));
			}

		});
		GridData static_Data = new GridData(GridData.FILL_HORIZONTAL);
		static_Data.horizontalSpan = 2;
		static_.setLayoutData(static_Data);
		EditingUtils.setID(static_, CartographyDescriptionViewsRepository.Variable.Properties.static_);
		EditingUtils.setEEFtype(static_, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.Variable.Properties.static_, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStatic_Checkbox

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
	 * @see CartographyDescription.parts.VariablePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.VariablePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Variable.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(CartographyDescriptionMessages.Variable_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.VariablePropertiesEditionPart#getInhertance()
	 * 
	 */
	public Enumerator getInhertance() {
		Enumerator selection = (Enumerator) ((StructuredSelection) inhertance.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.VariablePropertiesEditionPart#initInhertance(Object input, Enumerator current)
	 */
	public void initInhertance(Object input, Enumerator current) {
		inhertance.setInput(input);
		inhertance.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Variable.Properties.inhertance);
		if (eefElementEditorReadOnlyState && inhertance.isEnabled()) {
			inhertance.setEnabled(false);
			inhertance.setToolTipText(CartographyDescriptionMessages.Variable_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inhertance.isEnabled()) {
			inhertance.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.VariablePropertiesEditionPart#setInhertance(Enumerator newValue)
	 * 
	 */
	public void setInhertance(Enumerator newValue) {
		inhertance.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Variable.Properties.inhertance);
		if (eefElementEditorReadOnlyState && inhertance.isEnabled()) {
			inhertance.setEnabled(false);
			inhertance.setToolTipText(CartographyDescriptionMessages.Variable_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inhertance.isEnabled()) {
			inhertance.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.VariablePropertiesEditionPart#getStatic_()
	 * 
	 */
	public Boolean getStatic_() {
		return Boolean.valueOf(static_.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.VariablePropertiesEditionPart#setStatic_(Boolean newValue)
	 * 
	 */
	public void setStatic_(Boolean newValue) {
		if (newValue != null) {
			static_.setSelection(newValue.booleanValue());
		} else {
			static_.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.Variable.Properties.static_);
		if (eefElementEditorReadOnlyState && static_.isEnabled()) {
			static_.setEnabled(false);
			static_.setToolTipText(CartographyDescriptionMessages.Variable_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !static_.isEnabled()) {
			static_.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CartographyDescriptionMessages.Variable_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
