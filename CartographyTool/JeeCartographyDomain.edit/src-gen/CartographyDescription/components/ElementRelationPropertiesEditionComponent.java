/**
 * Generated with Acceleo
 */
package CartographyDescription.components;

// Start of user code for imports
import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.CartographyElement;
import CartographyDescription.ElementRelation;
import CartographyDescription.RelationType;

import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.ElementRelationPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class ElementRelationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for src EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings srcSettings;
	
	/**
	 * Settings for dest EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings destSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ElementRelationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject elementRelation, String editing_mode) {
		super(editingContext, elementRelation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CartographyDescriptionViewsRepository.class;
		partKey = CartographyDescriptionViewsRepository.ElementRelation.class;
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
			
			final ElementRelation elementRelation = (ElementRelation)elt;
			final ElementRelationPropertiesEditionPart basePart = (ElementRelationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(CartographyDescriptionViewsRepository.ElementRelation.Properties.src)) {
				// init part
				srcSettings = new EObjectFlatComboSettings(elementRelation, CartographyDescriptionPackage.eINSTANCE.getElementRelation_Src());
				basePart.initSrc(srcSettings);
				// set the button mode
				basePart.setSrcButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.ElementRelation.Properties.dest)) {
				// init part
				destSettings = new EObjectFlatComboSettings(elementRelation, CartographyDescriptionPackage.eINSTANCE.getElementRelation_Dest());
				basePart.initDest(destSettings);
				// set the button mode
				basePart.setDestButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType)) {
				basePart.initRelationType(EEFUtils.choiceOfValues(elementRelation, CartographyDescriptionPackage.eINSTANCE.getElementRelation_RelationType()), elementRelation.getRelationType());
			}
			// init filters
			if (isAccessible(CartographyDescriptionViewsRepository.ElementRelation.Properties.src)) {
				basePart.addFilterToSrc(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof CartographyElement); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for src
				// End of user code
			}
			if (isAccessible(CartographyDescriptionViewsRepository.ElementRelation.Properties.dest)) {
				basePart.addFilterToDest(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof CartographyElement); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for dest
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
		if (editorKey == CartographyDescriptionViewsRepository.ElementRelation.Properties.src) {
			return CartographyDescriptionPackage.eINSTANCE.getElementRelation_Src();
		}
		if (editorKey == CartographyDescriptionViewsRepository.ElementRelation.Properties.dest) {
			return CartographyDescriptionPackage.eINSTANCE.getElementRelation_Dest();
		}
		if (editorKey == CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType) {
			return CartographyDescriptionPackage.eINSTANCE.getElementRelation_RelationType();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ElementRelation elementRelation = (ElementRelation)semanticObject;
		if (CartographyDescriptionViewsRepository.ElementRelation.Properties.src == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				srcSettings.setToReference((CartographyElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				CartographyElement eObject = CartographyDescriptionFactory.eINSTANCE.createCartographyElement();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				srcSettings.setToReference(eObject);
			}
		}
		if (CartographyDescriptionViewsRepository.ElementRelation.Properties.dest == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				destSettings.setToReference((CartographyElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				CartographyElement eObject = CartographyDescriptionFactory.eINSTANCE.createCartographyElement();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				destSettings.setToReference(eObject);
			}
		}
		if (CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType == event.getAffectedEditor()) {
			elementRelation.setRelationType((RelationType)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ElementRelationPropertiesEditionPart basePart = (ElementRelationPropertiesEditionPart)editingPart;
			if (CartographyDescriptionPackage.eINSTANCE.getElementRelation_Src().equals(msg.getFeature()) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.ElementRelation.Properties.src))
				basePart.setSrc((EObject)msg.getNewValue());
			if (CartographyDescriptionPackage.eINSTANCE.getElementRelation_Dest().equals(msg.getFeature()) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.ElementRelation.Properties.dest))
				basePart.setDest((EObject)msg.getNewValue());
			if (CartographyDescriptionPackage.eINSTANCE.getElementRelation_RelationType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType))
				basePart.setRelationType((RelationType)msg.getNewValue());
			
			
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
			CartographyDescriptionPackage.eINSTANCE.getElementRelation_Src(),
			CartographyDescriptionPackage.eINSTANCE.getElementRelation_Dest(),
			CartographyDescriptionPackage.eINSTANCE.getElementRelation_RelationType()		);
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
				if (CartographyDescriptionViewsRepository.ElementRelation.Properties.relationType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getElementRelation_RelationType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getElementRelation_RelationType().getEAttributeType(), newValue);
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
