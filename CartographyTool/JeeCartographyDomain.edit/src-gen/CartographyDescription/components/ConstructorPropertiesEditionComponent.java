/**
 * Generated with Acceleo
 */
package CartographyDescription.components;

// Start of user code for imports
import CartographyDescription.Annotation;
import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.Constructor;
import CartographyDescription.ElementRelation;
import CartographyDescription.Inhertance;
import CartographyDescription.Layer;
import CartographyDescription.Module;
import CartographyDescription.Variable;
import CartographyDescription.Visibility;

import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.ConstructorPropertiesEditionPart;

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
public class ConstructorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for parameters ReferencesTable
	 */
	protected ReferencesTableSettings parametersSettings;
	
	/**
	 * Settings for exceptions ReferencesTable
	 */
	protected ReferencesTableSettings exceptionsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ConstructorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject constructor, String editing_mode) {
		super(editingContext, constructor, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CartographyDescriptionViewsRepository.class;
		partKey = CartographyDescriptionViewsRepository.Constructor.class;
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
			
			final Constructor constructor = (Constructor)elt;
			final ConstructorPropertiesEditionPart basePart = (ConstructorPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.locs)) {
				basePart.setLocs(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, constructor.getLocs()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.comments)) {
				basePart.setComments(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, constructor.getComments()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.anotations)) {
				anotationsSettings = new ReferencesTableSettings(constructor, CartographyDescriptionPackage.eINSTANCE.getAnnotatedObject_Anotations());
				basePart.initAnotations(anotationsSettings);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.weight)) {
				basePart.setWeight(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, constructor.getWeight()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, constructor.getName()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.maxWeight)) {
				basePart.setMaxWeight(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, constructor.getMaxWeight()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.migRelations)) {
				migRelationsSettings = new ReferencesTableSettings(constructor, CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MigRelations());
				basePart.initMigRelations(migRelationsSettings);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.parentLayer)) {
				// init part
				parentLayerSettings = new EObjectFlatComboSettings(constructor, CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentLayer());
				basePart.initParentLayer(parentLayerSettings);
				// set the button mode
				basePart.setParentLayerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.parentModule)) {
				// init part
				parentModuleSettings = new EObjectFlatComboSettings(constructor, CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentModule());
				basePart.initParentModule(parentModuleSettings);
				// set the button mode
				basePart.setParentModuleButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.originalFilePath))
				basePart.setOriginalFilePath(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, constructor.getOriginalFilePath()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.newFilePath))
				basePart.setNewFilePath(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, constructor.getNewFilePath()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.visibility)) {
				basePart.initVisibility(EEFUtils.choiceOfValues(constructor, CartographyDescriptionPackage.eINSTANCE.getMethod_Visibility()), constructor.getVisibility());
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, constructor.getCode()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.parameters)) {
				parametersSettings = new ReferencesTableSettings(constructor, CartographyDescriptionPackage.eINSTANCE.getMethod_Parameters());
				basePart.initParameters(parametersSettings);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.inhertance)) {
				basePart.initInhertance(EEFUtils.choiceOfValues(constructor, CartographyDescriptionPackage.eINSTANCE.getMethod_Inhertance()), constructor.getInhertance());
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.exceptions)) {
				exceptionsSettings = new ReferencesTableSettings(constructor, CartographyDescriptionPackage.eINSTANCE.getMethod_Exceptions());
				basePart.initExceptions(exceptionsSettings);
			}
			// init filters
			
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.anotations)) {
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
			
			
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.migRelations)) {
				basePart.addFilterToMigRelations(new EObjectFilter(CartographyDescriptionPackage.Literals.ELEMENT_RELATION));
				// Start of user code for additional businessfilters for migRelations
				// End of user code
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.parentLayer)) {
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
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.parentModule)) {
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
			
			
			
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.parameters)) {
				basePart.addFilterToParameters(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Variable); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for parameters
				// End of user code
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.exceptions)) {
				basePart.addFilterToExceptions(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Exception); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for exceptions
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
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.locs) {
			return CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.comments) {
			return CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.anotations) {
			return CartographyDescriptionPackage.eINSTANCE.getAnnotatedObject_Anotations();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.weight) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.name) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.maxWeight) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.migRelations) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MigRelations();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.parentLayer) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentLayer();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.parentModule) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentModule();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.originalFilePath) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.newFilePath) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.visibility) {
			return CartographyDescriptionPackage.eINSTANCE.getMethod_Visibility();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.code) {
			return CartographyDescriptionPackage.eINSTANCE.getMethod_Code();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.parameters) {
			return CartographyDescriptionPackage.eINSTANCE.getMethod_Parameters();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.inhertance) {
			return CartographyDescriptionPackage.eINSTANCE.getMethod_Inhertance();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Constructor.Properties.exceptions) {
			return CartographyDescriptionPackage.eINSTANCE.getMethod_Exceptions();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Constructor constructor = (Constructor)semanticObject;
		if (CartographyDescriptionViewsRepository.Constructor.Properties.locs == event.getAffectedEditor()) {
			constructor.setLocs((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Constructor.Properties.comments == event.getAffectedEditor()) {
			constructor.setComments((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Constructor.Properties.anotations == event.getAffectedEditor()) {
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
		if (CartographyDescriptionViewsRepository.Constructor.Properties.weight == event.getAffectedEditor()) {
			constructor.setWeight((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Constructor.Properties.name == event.getAffectedEditor()) {
			constructor.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Constructor.Properties.maxWeight == event.getAffectedEditor()) {
			constructor.setMaxWeight((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Constructor.Properties.migRelations == event.getAffectedEditor()) {
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
		if (CartographyDescriptionViewsRepository.Constructor.Properties.parentLayer == event.getAffectedEditor()) {
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
		if (CartographyDescriptionViewsRepository.Constructor.Properties.parentModule == event.getAffectedEditor()) {
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
		if (CartographyDescriptionViewsRepository.Constructor.Properties.originalFilePath == event.getAffectedEditor()) {
			constructor.setOriginalFilePath((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Constructor.Properties.newFilePath == event.getAffectedEditor()) {
			constructor.setNewFilePath((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Constructor.Properties.visibility == event.getAffectedEditor()) {
			constructor.setVisibility((Visibility)event.getNewValue());
		}
		if (CartographyDescriptionViewsRepository.Constructor.Properties.code == event.getAffectedEditor()) {
			constructor.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Constructor.Properties.parameters == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, parametersSettings, editingContext.getAdapterFactory());
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
				parametersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				parametersSettings.move(event.getNewIndex(), (Variable) event.getNewValue());
			}
		}
		if (CartographyDescriptionViewsRepository.Constructor.Properties.inhertance == event.getAffectedEditor()) {
			constructor.setInhertance((Inhertance)event.getNewValue());
		}
		if (CartographyDescriptionViewsRepository.Constructor.Properties.exceptions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, exceptionsSettings, editingContext.getAdapterFactory());
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
				exceptionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				exceptionsSettings.move(event.getNewIndex(), (CartographyDescription.Exception) event.getNewValue());
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
			ConstructorPropertiesEditionPart basePart = (ConstructorPropertiesEditionPart)editingPart;
			if (CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.locs)) {
				if (msg.getNewValue() != null) {
					basePart.setLocs(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setLocs("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.comments)) {
				if (msg.getNewValue() != null) {
					basePart.setComments(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setComments("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getAnnotatedObject_Anotations().equals(msg.getFeature()) && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.anotations))
				basePart.updateAnotations();
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.weight)) {
				if (msg.getNewValue() != null) {
					basePart.setWeight(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setWeight("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.maxWeight)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxWeight(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setMaxWeight("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MigRelations().equals(msg.getFeature())  && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.migRelations))
				basePart.updateMigRelations();
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentLayer().equals(msg.getFeature()) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.parentLayer))
				basePart.setParentLayer((EObject)msg.getNewValue());
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentModule().equals(msg.getFeature()) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.parentModule))
				basePart.setParentModule((EObject)msg.getNewValue());
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.originalFilePath)) {
				if (msg.getNewValue() != null) {
					basePart.setOriginalFilePath(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setOriginalFilePath("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.newFilePath)) {
				if (msg.getNewValue() != null) {
					basePart.setNewFilePath(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setNewFilePath("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getMethod_Visibility().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.visibility))
				basePart.setVisibility((Visibility)msg.getNewValue());
			
			if (CartographyDescriptionPackage.eINSTANCE.getMethod_Code().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getMethod_Parameters().equals(msg.getFeature()) && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.parameters))
				basePart.updateParameters();
			if (CartographyDescriptionPackage.eINSTANCE.getMethod_Inhertance().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.inhertance))
				basePart.setInhertance((Inhertance)msg.getNewValue());
			
			if (CartographyDescriptionPackage.eINSTANCE.getMethod_Exceptions().equals(msg.getFeature()) && isAccessible(CartographyDescriptionViewsRepository.Constructor.Properties.exceptions))
				basePart.updateExceptions();
			
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
			CartographyDescriptionPackage.eINSTANCE.getMethod_Visibility(),
			CartographyDescriptionPackage.eINSTANCE.getMethod_Code(),
			CartographyDescriptionPackage.eINSTANCE.getMethod_Parameters(),
			CartographyDescriptionPackage.eINSTANCE.getMethod_Inhertance(),
			CartographyDescriptionPackage.eINSTANCE.getMethod_Exceptions()		);
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
				if (CartographyDescriptionViewsRepository.Constructor.Properties.locs == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Constructor.Properties.comments == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Constructor.Properties.weight == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Constructor.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Constructor.Properties.maxWeight == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Constructor.Properties.originalFilePath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Constructor.Properties.newFilePath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Constructor.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getMethod_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getMethod_Visibility().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Constructor.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getMethod_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getMethod_Code().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Constructor.Properties.inhertance == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getMethod_Inhertance().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getMethod_Inhertance().getEAttributeType(), newValue);
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
