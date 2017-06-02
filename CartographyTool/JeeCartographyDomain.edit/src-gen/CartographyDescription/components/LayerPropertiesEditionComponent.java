/**
 * Generated with Acceleo
 */
package CartographyDescription.components;

// Start of user code for imports
import CartographyDescription.Annotation;
import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.CartographyElement;
import CartographyDescription.ElementRelation;
import CartographyDescription.Layer;
import CartographyDescription.Module;

import CartographyDescription.parts.CartographyDescriptionViewsRepository;
import CartographyDescription.parts.LayerPropertiesEditionPart;

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
public class LayerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for compilationUnits ReferencesTable
	 */
	private ReferencesTableSettings compilationUnitsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public LayerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject layer, String editing_mode) {
		super(editingContext, layer, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CartographyDescriptionViewsRepository.class;
		partKey = CartographyDescriptionViewsRepository.Layer.class;
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
			
			final Layer layer = (Layer)elt;
			final LayerPropertiesEditionPart basePart = (LayerPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.locs)) {
				basePart.setLocs(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, layer.getLocs()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.comments)) {
				basePart.setComments(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, layer.getComments()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.anotations)) {
				anotationsSettings = new ReferencesTableSettings(layer, CartographyDescriptionPackage.eINSTANCE.getAnnotatedObject_Anotations());
				basePart.initAnotations(anotationsSettings);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.weight)) {
				basePart.setWeight(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, layer.getWeight()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, layer.getName()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.maxWeight)) {
				basePart.setMaxWeight(EEFConverterUtil.convertToString(EcorePackage.Literals.ELONG, layer.getMaxWeight()));
			}
			
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.migRelations)) {
				migRelationsSettings = new ReferencesTableSettings(layer, CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MigRelations());
				basePart.initMigRelations(migRelationsSettings);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.parentLayer)) {
				// init part
				parentLayerSettings = new EObjectFlatComboSettings(layer, CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentLayer());
				basePart.initParentLayer(parentLayerSettings);
				// set the button mode
				basePart.setParentLayerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.parentModule)) {
				// init part
				parentModuleSettings = new EObjectFlatComboSettings(layer, CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentModule());
				basePart.initParentModule(parentModuleSettings);
				// set the button mode
				basePart.setParentModuleButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath))
				basePart.setOriginalFilePath(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, layer.getOriginalFilePath()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.newFilePath))
				basePart.setNewFilePath(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, layer.getNewFilePath()));
			
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits)) {
				compilationUnitsSettings = new ReferencesTableSettings(layer, CartographyDescriptionPackage.eINSTANCE.getLayer_CompilationUnits());
				basePart.initCompilationUnits(compilationUnitsSettings);
			}
			// init filters
			
			
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.anotations)) {
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
			
			
			
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.migRelations)) {
				basePart.addFilterToMigRelations(new EObjectFilter(CartographyDescriptionPackage.Literals.ELEMENT_RELATION));
				// Start of user code for additional businessfilters for migRelations
				// End of user code
			}
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.parentLayer)) {
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
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.parentModule)) {
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
			
			
			if (isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits)) {
				basePart.addFilterToCompilationUnits(new EObjectFilter(CartographyDescriptionPackage.Literals.CARTOGRAPHY_ELEMENT));
				// Start of user code for additional businessfilters for compilationUnits
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
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.locs) {
			return CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.comments) {
			return CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.anotations) {
			return CartographyDescriptionPackage.eINSTANCE.getAnnotatedObject_Anotations();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.weight) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.name) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.maxWeight) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.migRelations) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MigRelations();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.parentLayer) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentLayer();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.parentModule) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentModule();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.newFilePath) {
			return CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath();
		}
		if (editorKey == CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits) {
			return CartographyDescriptionPackage.eINSTANCE.getLayer_CompilationUnits();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Layer layer = (Layer)semanticObject;
		if (CartographyDescriptionViewsRepository.Layer.Properties.locs == event.getAffectedEditor()) {
			layer.setLocs((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Layer.Properties.comments == event.getAffectedEditor()) {
			layer.setComments((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Layer.Properties.anotations == event.getAffectedEditor()) {
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
		if (CartographyDescriptionViewsRepository.Layer.Properties.weight == event.getAffectedEditor()) {
			layer.setWeight((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Layer.Properties.name == event.getAffectedEditor()) {
			layer.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Layer.Properties.maxWeight == event.getAffectedEditor()) {
			layer.setMaxWeight((EEFConverterUtil.createLongFromString(EcorePackage.Literals.ELONG, (String)event.getNewValue())));
		}
		if (CartographyDescriptionViewsRepository.Layer.Properties.migRelations == event.getAffectedEditor()) {
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
		if (CartographyDescriptionViewsRepository.Layer.Properties.parentLayer == event.getAffectedEditor()) {
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
		if (CartographyDescriptionViewsRepository.Layer.Properties.parentModule == event.getAffectedEditor()) {
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
		if (CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath == event.getAffectedEditor()) {
			layer.setOriginalFilePath((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Layer.Properties.newFilePath == event.getAffectedEditor()) {
			layer.setNewFilePath((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof CartographyElement) {
					compilationUnitsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				compilationUnitsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				compilationUnitsSettings.move(event.getNewIndex(), (CartographyElement) event.getNewValue());
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
			LayerPropertiesEditionPart basePart = (LayerPropertiesEditionPart)editingPart;
			if (CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.locs)) {
				if (msg.getNewValue() != null) {
					basePart.setLocs(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setLocs("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.comments)) {
				if (msg.getNewValue() != null) {
					basePart.setComments(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setComments("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getAnnotatedObject_Anotations().equals(msg.getFeature()) && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.anotations))
				basePart.updateAnotations();
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.weight)) {
				if (msg.getNewValue() != null) {
					basePart.setWeight(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setWeight("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.maxWeight)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxWeight(EcoreUtil.convertToString(EcorePackage.Literals.ELONG, msg.getNewValue()));
				} else {
					basePart.setMaxWeight("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MigRelations().equals(msg.getFeature())  && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.migRelations))
				basePart.updateMigRelations();
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentLayer().equals(msg.getFeature()) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.parentLayer))
				basePart.setParentLayer((EObject)msg.getNewValue());
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_ParentModule().equals(msg.getFeature()) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.parentModule))
				basePart.setParentModule((EObject)msg.getNewValue());
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath)) {
				if (msg.getNewValue() != null) {
					basePart.setOriginalFilePath(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setOriginalFilePath("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.newFilePath)) {
				if (msg.getNewValue() != null) {
					basePart.setNewFilePath(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setNewFilePath("");
				}
			}
			if (CartographyDescriptionPackage.eINSTANCE.getLayer_CompilationUnits().equals(msg.getFeature())  && isAccessible(CartographyDescriptionViewsRepository.Layer.Properties.compilationUnits))
				basePart.updateCompilationUnits();
			
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
			CartographyDescriptionPackage.eINSTANCE.getLayer_CompilationUnits()		);
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
				if (CartographyDescriptionViewsRepository.Layer.Properties.locs == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Locs().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Layer.Properties.comments == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getStaticMetrics_Comments().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Layer.Properties.weight == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Weight().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Layer.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_Name().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Layer.Properties.maxWeight == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_MaxWeight().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Layer.Properties.originalFilePath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_OriginalFilePath().getEAttributeType(), newValue);
				}
				if (CartographyDescriptionViewsRepository.Layer.Properties.newFilePath == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CartographyDescriptionPackage.eINSTANCE.getCartographyElement_NewFilePath().getEAttributeType(), newValue);
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
