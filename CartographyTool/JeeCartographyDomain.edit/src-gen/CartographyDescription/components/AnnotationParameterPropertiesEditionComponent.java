/**
 * Generated with Acceleo
 */
package CartographyDescription.components;

// Start of user code for imports
import CartographyDescription.AnnotationParameter;
import CartographyDescription.CartographyDescriptionPackage;

import CartographyDescription.parts.AnnotationParameterPropertiesEditionPart;
import CartographyDescription.parts.CartographyDescriptionViewsRepository;

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


// End of user code

/**
 * 
 * 
 */
public class AnnotationParameterPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public AnnotationParameterPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject annotationParameter, String editing_mode) {
		super(editingContext, annotationParameter, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CartographyDescriptionViewsRepository.class;
		partKey = CartographyDescriptionViewsRepository.AnnotationParameter.class;
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
			
			final AnnotationParameter annotationParameter = (AnnotationParameter)elt;
			final AnnotationParameterPropertiesEditionPart basePart = (AnnotationParameterPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(CartographyDescriptionViewsRepository.AnnotationParameter.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, annotationParameter.getName()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.AnnotationParameter.Properties.value))
				basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, annotationParameter.getValue()));
			
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
		if (editorKey == CartographyDescriptionViewsRepository.AnnotationParameter.Properties.name) {
			return CartographyDescriptionPackage.eINSTANCE.getAnnotationParameter_Name();
		}
		if (editorKey == CartographyDescriptionViewsRepository.AnnotationParameter.Properties.value) {
			return CartographyDescriptionPackage.eINSTANCE.getAnnotationParameter_Value();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AnnotationParameter annotationParameter = (AnnotationParameter)semanticObject;
		if (CartographyDescriptionViewsRepository.AnnotationParameter.Properties.name == event.getAffectedEditor()) {
			annotationParameter.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.AnnotationParameter.Properties.value == event.getAffectedEditor()) {
			annotationParameter.setValue((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			AnnotationParameterPropertiesEditionPart basePart = (AnnotationParameterPropertiesEditionPart)editingPart;
			if (CartographyDescriptionPackage.eINSTANCE.getAnnotationParameter_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.AnnotationParameter.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getAnnotationParameter_Value().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.AnnotationParameter.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setValue("");
				}
			}
			
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
			CartographyDescriptionPackage.eINSTANCE.getAnnotationParameter_Name(),
			CartographyDescriptionPackage.eINSTANCE.getAnnotationParameter_Value()		);
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
				if (CartographyDescriptionViewsRepository.AnnotationParameter.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getAnnotationParameter_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getAnnotationParameter_Name().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.AnnotationParameter.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getAnnotationParameter_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getAnnotationParameter_Value().getEAttributeType(), newValue);
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
