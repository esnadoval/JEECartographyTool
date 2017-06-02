/**
 * Generated with Acceleo
 */
package CartographyDescription.components;

// Start of user code for imports
import CartographyDescription.Annotation;
import CartographyDescription.AnnotationParameter;
import CartographyDescription.CartographyDescriptionPackage;

import CartographyDescription.parts.AnnotationPropertiesEditionPart;
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

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class AnnotationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for params ReferencesTable
	 */
	protected ReferencesTableSettings paramsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AnnotationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject annotation, String editing_mode) {
		super(editingContext, annotation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CartographyDescriptionViewsRepository.class;
		partKey = CartographyDescriptionViewsRepository.Annotation.class;
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
			
			final Annotation annotation = (Annotation)elt;
			final AnnotationPropertiesEditionPart basePart = (AnnotationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(CartographyDescriptionViewsRepository.Annotation.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, annotation.getName()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Annotation.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, annotation.getDescription()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Annotation.Properties.params)) {
				paramsSettings = new ReferencesTableSettings(annotation, CartographyDescriptionPackage.eINSTANCE.getAnnotation_Params());
				basePart.initParams(paramsSettings);
			}
			// init filters
			
			
			if (isAccessible(CartographyDescriptionViewsRepository.Annotation.Properties.params)) {
				basePart.addFilterToParams(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof AnnotationParameter); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for params
				// End of user code
			}
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
		if (editorKey == CartographyDescriptionViewsRepository.Annotation.Properties.name) {
			return CartographyDescriptionPackage.eINSTANCE.getAnnotation_Name();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Annotation.Properties.description) {
			return CartographyDescriptionPackage.eINSTANCE.getAnnotation_Description();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Annotation.Properties.params) {
			return CartographyDescriptionPackage.eINSTANCE.getAnnotation_Params();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Annotation annotation = (Annotation)semanticObject;
		if (CartographyDescriptionViewsRepository.Annotation.Properties.name == event.getAffectedEditor()) {
			annotation.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Annotation.Properties.description == event.getAffectedEditor()) {
			annotation.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Annotation.Properties.params == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, paramsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				paramsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				paramsSettings.move(event.getNewIndex(), (AnnotationParameter) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			AnnotationPropertiesEditionPart basePart = (AnnotationPropertiesEditionPart)editingPart;
			if (CartographyDescriptionPackage.eINSTANCE.getAnnotation_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Annotation.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getAnnotation_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Annotation.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getAnnotation_Params().equals(msg.getFeature()) && isAccessible(CartographyDescriptionViewsRepository.Annotation.Properties.params))
				basePart.updateParams();
			
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
			CartographyDescriptionPackage.eINSTANCE.getAnnotation_Name(),
			CartographyDescriptionPackage.eINSTANCE.getAnnotation_Description(),
			CartographyDescriptionPackage.eINSTANCE.getAnnotation_Params()		);
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
				if (CartographyDescriptionViewsRepository.Annotation.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getAnnotation_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getAnnotation_Name().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Annotation.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getAnnotation_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getAnnotation_Description().getEAttributeType(), newValue);
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
