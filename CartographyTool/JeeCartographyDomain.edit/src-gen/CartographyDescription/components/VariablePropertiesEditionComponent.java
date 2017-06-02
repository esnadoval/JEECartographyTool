/**
 * Generated with Acceleo
 */
package CartographyDescription.components;

// Start of user code for imports
import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.Inhertance;
import CartographyDescription.Variable;

import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.VariablePropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;


// End of user code

/**
 * 
 * 
 */
public class VariablePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public VariablePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject variable, String editing_mode) {
		super(editingContext, variable, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CartographyDescriptionViewsRepository.class;
		partKey = CartographyDescriptionViewsRepository.Variable.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final Variable variable = (Variable)elt;
			final VariablePropertiesEditionPart basePart = (VariablePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(CartographyDescriptionViewsRepository.Variable.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, variable.getName()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Variable.Properties.inhertance)) {
				basePart.initInhertance(EEFUtils.choiceOfValues(variable, CartographyDescriptionPackage.eINSTANCE.getVariable_Inhertance()), variable.getInhertance());
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Variable.Properties.static_)) {
				basePart.setStatic_(variable.isStatic());
			}
			// init filters
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == CartographyDescriptionViewsRepository.Variable.Properties.name) {
			return CartographyDescriptionPackage.eINSTANCE.getVariable_Name();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Variable.Properties.inhertance) {
			return CartographyDescriptionPackage.eINSTANCE.getVariable_Inhertance();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Variable.Properties.static_) {
			return CartographyDescriptionPackage.eINSTANCE.getVariable_Static();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Variable variable = (Variable)semanticObject;
		if (CartographyDescriptionViewsRepository.Variable.Properties.name == event.getAffectedEditor()) {
			variable.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Variable.Properties.inhertance == event.getAffectedEditor()) {
			variable.setInhertance((Inhertance)event.getNewValue());
		}
		if (CartographyDescriptionViewsRepository.Variable.Properties.static_ == event.getAffectedEditor()) {
			variable.setStatic((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			VariablePropertiesEditionPart basePart = (VariablePropertiesEditionPart)editingPart;
			if (CartographyDescriptionPackage.eINSTANCE.getVariable_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Variable.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getVariable_Inhertance().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(CartographyDescriptionViewsRepository.Variable.Properties.inhertance))
				basePart.setInhertance((Inhertance)msg.getNewValue());
			
			if (CartographyDescriptionPackage.eINSTANCE.getVariable_Static().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Variable.Properties.static_))
				basePart.setStatic_((Boolean)msg.getNewValue());
			
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			CartographyDescriptionPackage.eINSTANCE.getVariable_Name(),
			CartographyDescriptionPackage.eINSTANCE.getVariable_Inhertance(),
			CartographyDescriptionPackage.eINSTANCE.getVariable_Static()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (CartographyDescriptionViewsRepository.Variable.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getVariable_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getVariable_Name().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Variable.Properties.inhertance == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getVariable_Inhertance().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getVariable_Inhertance().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Variable.Properties.static_ == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getVariable_Static().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getVariable_Static().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
