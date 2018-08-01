/**
 * Generated with Acceleo
 */
package CartographyDescription.components;

// Start of user code for imports
import CartographyDescription.Annotation;
import CartographyDescription.Attribute;
import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.ElementRelation;
import CartographyDescription.Inhertance;
import CartographyDescription.Layer;
import CartographyDescription.Method;
import CartographyDescription.Module;
import CartographyDescription.VarType;
import CartographyDescription.Visibility;

import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.Class_PropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class ClassPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for anotations ReferencesTable
	 */
	protected ReferencesTableSettings anotationsSettings;
	
	/**
	 * Settings for migRelations ReferencesTable
	 */
	private ReferencesTableSettings migRelationsSettings;
	
	/**
	 * Settings for parentLayer EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parentLayerSettings;
	
	/**
	 * Settings for parentModule EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parentModuleSettings;
	
	/**
	 * Settings for attributes ReferencesTable
	 */
	protected ReferencesTableSettings attributesSettings;
	
	/**
	 * Settings for methods ReferencesTable
	 */
	protected ReferencesTableSettings methodsSettings;
	
	/**
	 * Settings for implements ReferencesTable
	 */
	protected ReferencesTableSettings implements_Settings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ClassPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject class_, String editing_mode) {
		super(editingContext, class_, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CartographyDescriptionViewsRepository.class;
		partKey = CartographyDescriptionViewsRepository.Class_.class;
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
			
			final CartographyDescription.Class class_ = (CartographyDescription.Class)elt;
			final Class_PropertiesEditionPart basePart = (Class_PropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.locs)) {
				basePart.setLocs(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, class_.getLocs()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.comments)) {
				basePart.setComments(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, class_.getComments()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.anotations)) {
				anotationsSettings = new ReferencesTableSettings(class_, CartographyDescriptionPackage.eINSTANCE.getAnnotatedObject_Anotations());
				basePart.initAnotations(anotationsSettings);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.weight)) {
				basePart.setWeight(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, class_.getWeight()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, class_.getName()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.maxWeight)) {
				basePart.setMaxWeight(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, class_.getMaxWeight()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.migRelations)) {
				migRelationsSettings = new ReferencesTableSettings(class_, CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MigRelations());
				basePart.initMigRelations(migRelationsSettings);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.parentLayer)) {
				// init part
				parentLayerSettings = new EObjectFlatComboSettings(class_, CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentLayer());
				basePart.initParentLayer(parentLayerSettings);
				// set the button mode
				basePart.setParentLayerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.parentModule)) {
				// init part
				parentModuleSettings = new EObjectFlatComboSettings(class_, CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentModule());
				basePart.initParentModule(parentModuleSettings);
				// set the button mode
				basePart.setParentModuleButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath))
				basePart.setOriginalFilePath(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, class_.getOriginalFilePath()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.newFilePath))
				basePart.setNewFilePath(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, class_.getNewFilePath()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.visibility)) {
				basePart.initVisibility(EEFUtils.choiceOfValues(class_, CartographyDescriptionPackage.eINSTANCE.getClass_Visibility()), class_.getVisibility());
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.attributes)) {
				attributesSettings = new ReferencesTableSettings(class_, CartographyDescriptionPackage.eINSTANCE.getClass_Attributes());
				basePart.initAttributes(attributesSettings);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.methods)) {
				methodsSettings = new ReferencesTableSettings(class_, CartographyDescriptionPackage.eINSTANCE.getClass_Methods());
				basePart.initMethods(methodsSettings);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.inhertance)) {
				basePart.initInhertance(EEFUtils.choiceOfValues(class_, CartographyDescriptionPackage.eINSTANCE.getClass_Inhertance()), class_.getInhertance());
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.implements_)) {
				implements_Settings = new ReferencesTableSettings(class_, CartographyDescriptionPackage.eINSTANCE.getClass_Implements());
				basePart.initImplements_(implements_Settings);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.originalFileName))
				basePart.setOriginalFileName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, class_.getOriginalFileName()));
			
			// init filters
			
			
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.anotations)) {
				basePart.addFilterToAnotations(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Annotation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for anotations
				// End of user code
			}
			
			
			
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.migRelations)) {
				basePart.addFilterToMigRelations(new EObjectFilter(CartographyDescriptionPackage.Literals.ELEMENT_RELATION));
				// Start of user code for additional businessfilters for migRelations
				// End of user code
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.parentLayer)) {
				basePart.addFilterToParentLayer(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Layer); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for parentLayer
				// End of user code
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.parentModule)) {
				basePart.addFilterToParentModule(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Module); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for parentModule
				// End of user code
			}
			
			
			
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.attributes)) {
				basePart.addFilterToAttributes(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Attribute); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for attributes
				// End of user code
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.methods)) {
				basePart.addFilterToMethods(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Method); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for methods
				// End of user code
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.implements_)) {
				basePart.addFilterToImplements_(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof VarType); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for implements
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
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.locs) {
			return CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.comments) {
			return CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.anotations) {
			return CartographyDescriptionPackage.eINSTANCE.getAnnotatedObject_Anotations();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.weight) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.name) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.maxWeight) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.migRelations) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MigRelations();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.parentLayer) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentLayer();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.parentModule) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentModule();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.newFilePath) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.visibility) {
			return CartographyDescriptionPackage.eINSTANCE.getClass_Visibility();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.attributes) {
			return CartographyDescriptionPackage.eINSTANCE.getClass_Attributes();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.methods) {
			return CartographyDescriptionPackage.eINSTANCE.getClass_Methods();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.inhertance) {
			return CartographyDescriptionPackage.eINSTANCE.getClass_Inhertance();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.implements_) {
			return CartographyDescriptionPackage.eINSTANCE.getClass_Implements();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Class_.Properties.originalFileName) {
			return CartographyDescriptionPackage.eINSTANCE.getClass_OriginalFileName();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CartographyDescription.Class class_ = (CartographyDescription.Class)semanticObject;
		if (CartographyDescriptionViewsRepository.Class_.Properties.locs == event.getAffectedEditor()) {
			class_.setLocs((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.comments == event.getAffectedEditor()) {
			class_.setComments((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.anotations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, anotationsSettings, editingContext.getAdapterFactory());
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
				anotationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				anotationsSettings.move(event.getNewIndex(), (Annotation) event.getNewValue());
			}
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.weight == event.getAffectedEditor()) {
			class_.setWeight((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.name == event.getAffectedEditor()) {
			class_.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.maxWeight == event.getAffectedEditor()) {
			class_.setMaxWeight((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.migRelations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ElementRelation) {
					migRelationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				migRelationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				migRelationsSettings.move(event.getNewIndex(), (ElementRelation) event.getNewValue());
			}
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.parentLayer == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parentLayerSettings.setToReference((Layer)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Layer eObject = CartographyDescriptionFactory.eINSTANCE.createLayer();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				parentLayerSettings.setToReference(eObject);
			}
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.parentModule == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parentModuleSettings.setToReference((Module)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Module eObject = CartographyDescriptionFactory.eINSTANCE.createModule();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				parentModuleSettings.setToReference(eObject);
			}
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath == event.getAffectedEditor()) {
			class_.setOriginalFilePath((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.newFilePath == event.getAffectedEditor()) {
			class_.setNewFilePath((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.visibility == event.getAffectedEditor()) {
			class_.setVisibility((Visibility)event.getNewValue());
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.attributes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, attributesSettings, editingContext.getAdapterFactory());
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
				attributesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				attributesSettings.move(event.getNewIndex(), (Attribute) event.getNewValue());
			}
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.methods == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, methodsSettings, editingContext.getAdapterFactory());
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
				methodsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				methodsSettings.move(event.getNewIndex(), (Method) event.getNewValue());
			}
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.inhertance == event.getAffectedEditor()) {
			class_.setInhertance((Inhertance)event.getNewValue());
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.implements_ == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, implements_Settings, editingContext.getAdapterFactory());
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
				implements_Settings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				implements_Settings.move(event.getNewIndex(), (VarType) event.getNewValue());
			}
		}
		if (CartographyDescriptionViewsRepository.Class_.Properties.originalFileName == event.getAffectedEditor()) {
			class_.setOriginalFileName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			Class_PropertiesEditionPart basePart = (Class_PropertiesEditionPart)editingPart;
			if (CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.locs)) {
				if (msg.getNewValue() != null) {
					basePart.setLocs(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setLocs("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.comments)) {
				if (msg.getNewValue() != null) {
					basePart.setComments(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setComments("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getAnnotatedObject_Anotations().equals(msg.getFeature()) && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.anotations))
				basePart.updateAnotations();
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.weight)) {
				if (msg.getNewValue() != null) {
					basePart.setWeight(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setWeight("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.maxWeight)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxWeight(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setMaxWeight("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MigRelations().equals(msg.getFeature())  && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.migRelations))
				basePart.updateMigRelations();
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentLayer().equals(msg.getFeature()) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.parentLayer))
				basePart.setParentLayer((EObject)msg.getNewValue());
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentModule().equals(msg.getFeature()) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.parentModule))
				basePart.setParentModule((EObject)msg.getNewValue());
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath)) {
				if (msg.getNewValue() != null) {
					basePart.setOriginalFilePath(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setOriginalFilePath("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.newFilePath)) {
				if (msg.getNewValue() != null) {
					basePart.setNewFilePath(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setNewFilePath("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getClass_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.visibility))
				basePart.setVisibility((Visibility)msg.getNewValue());
			
			if (CartographyDescriptionPackage.eINSTANCE.getClass_Attributes().equals(msg.getFeature()) && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.attributes))
				basePart.updateAttributes();
			if (CartographyDescriptionPackage.eINSTANCE.getClass_Methods().equals(msg.getFeature()) && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.methods))
				basePart.updateMethods();
			if (CartographyDescriptionPackage.eINSTANCE.getClass_Inhertance().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.inhertance))
				basePart.setInhertance((Inhertance)msg.getNewValue());
			
			if (CartographyDescriptionPackage.eINSTANCE.getClass_Implements().equals(msg.getFeature()) && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.implements_))
				basePart.updateImplements_();
			if (CartographyDescriptionPackage.eINSTANCE.getClass_OriginalFileName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Class_.Properties.originalFileName)) {
				if (msg.getNewValue() != null) {
					basePart.setOriginalFileName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setOriginalFileName("");
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
			CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs(),
			CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments(),
			CartographyDescriptionPackage.eINSTANCE.getAnnotatedObject_Anotations(),
			CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight(),
			CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name(),
			CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight(),
			CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MigRelations(),
			CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentLayer(),
			CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentModule(),
			CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath(),
			CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath(),
			CartographyDescriptionPackage.eINSTANCE.getClass_Visibility(),
			CartographyDescriptionPackage.eINSTANCE.getClass_Attributes(),
			CartographyDescriptionPackage.eINSTANCE.getClass_Methods(),
			CartographyDescriptionPackage.eINSTANCE.getClass_Inhertance(),
			CartographyDescriptionPackage.eINSTANCE.getClass_Implements(),
			CartographyDescriptionPackage.eINSTANCE.getClass_OriginalFileName()		);
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
				if (CartographyDescriptionViewsRepository.Class_.Properties.locs == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Class_.Properties.comments == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Class_.Properties.weight == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Class_.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Class_.Properties.maxWeight == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Class_.Properties.originalFilePath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Class_.Properties.newFilePath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Class_.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getClass_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getClass_Visibility().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Class_.Properties.inhertance == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getClass_Inhertance().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getClass_Inhertance().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Class_.Properties.originalFileName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getClass_OriginalFileName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getClass_OriginalFileName().getEAttributeType(), newValue);
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
