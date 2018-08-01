/**
 * Generated with Acceleo
 */
package CartographyDescription.parts.impl;

// Start of user code for imports
import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.EnumLiteralPropertiesEditionPart;

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
public class EnumLiteralPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EnumLiteralPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable values;
	protected List<ViewerFilter> valuesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> valuesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EnumLiteralPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence enumLiteralStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = enumLiteralStep.addStep(CartographyDescriptionViewsRepository.EnumLiteral.Properties.class);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.EnumLiteral.Properties.name);
		propertiesStep.addStep(CartographyDescriptionViewsRepository.EnumLiteral.Properties.values);
		
		
		composer = new PartComposer(enumLiteralStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CartographyDescriptionViewsRepository.EnumLiteral.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CartographyDescriptionViewsRepository.EnumLiteral.Properties.name) {
					return createNameText(parent);
				}
				if (key == CartographyDescriptionViewsRepository.EnumLiteral.Properties.values) {
					return createValuesAdvancedTableComposition(parent);
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
		propertiesGroup.setText(CartographyDescriptionMessages.EnumLiteralPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CartographyDescriptionViewsRepository.EnumLiteral.Properties.name, CartographyDescriptionMessages.EnumLiteralPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumLiteralPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.EnumLiteral.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumLiteralPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.EnumLiteral.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CartographyDescriptionViewsRepository.EnumLiteral.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.EnumLiteral.Properties.name, CartographyDescriptionViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createValuesAdvancedTableComposition(Composite parent) {
		this.values = new ReferencesTable(getDescription(CartographyDescriptionViewsRepository.EnumLiteral.Properties.values, CartographyDescriptionMessages.EnumLiteralPropertiesEditionPart_ValuesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumLiteralPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.EnumLiteral.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				values.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumLiteralPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.EnumLiteral.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				values.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumLiteralPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.EnumLiteral.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				values.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumLiteralPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.EnumLiteral.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				values.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.valuesFilters) {
			this.values.addFilter(filter);
		}
		this.values.setHelpText(propertiesEditionComponent.getHelpContent(CartographyDescriptionViewsRepository.EnumLiteral.Properties.values, CartographyDescriptionViewsRepository.SWT_KIND));
		this.values.createControls(parent);
		this.values.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumLiteralPropertiesEditionPartImpl.this, CartographyDescriptionViewsRepository.EnumLiteral.Properties.values, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData valuesData = new GridData(GridData.FILL_HORIZONTAL);
		valuesData.horizontalSpan = 3;
		this.values.setLayoutData(valuesData);
		this.values.setLowerBound(0);
		this.values.setUpperBound(-1);
		values.setID(CartographyDescriptionViewsRepository.EnumLiteral.Properties.values);
		values.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createValuesAdvancedTableComposition

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
	 * @see CartographyDescription.parts.EnumLiteralPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.EnumLiteral.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(CartographyDescriptionMessages.EnumLiteral_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralPropertiesEditionPart#initValues(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initValues(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		values.setContentProvider(contentProvider);
		values.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CartographyDescriptionViewsRepository.EnumLiteral.Properties.values);
		if (eefElementEditorReadOnlyState && values.isEnabled()) {
			values.setEnabled(false);
			values.setToolTipText(CartographyDescriptionMessages.EnumLiteral_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !values.isEnabled()) {
			values.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralPropertiesEditionPart#updateValues()
	 * 
	 */
	public void updateValues() {
	values.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralPropertiesEditionPart#addFilterValues(ViewerFilter filter)
	 * 
	 */
	public void addFilterToValues(ViewerFilter filter) {
		valuesFilters.add(filter);
		if (this.values != null) {
			this.values.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralPropertiesEditionPart#addBusinessFilterValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToValues(ViewerFilter filter) {
		valuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see CartographyDescription.parts.EnumLiteralPropertiesEditionPart#isContainedInValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInValuesTable(EObject element) {
		return ((ReferencesTableSettings)values.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CartographyDescriptionMessages.EnumLiteral_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
