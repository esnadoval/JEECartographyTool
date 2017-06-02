/**
 */
package CartographyDescription.provider;


import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.CartographyElement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CartographyDescription.CartographyElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CartographyElementItemProvider extends StaticMetricsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartographyElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addWeightPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addMaxWeightPropertyDescriptor(object);
			addMigRelationsPropertyDescriptor(object);
			addParentLayerPropertyDescriptor(object);
			addParentModulePropertyDescriptor(object);
			addOriginalFilePathPropertyDescriptor(object);
			addNewFilePathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartographyElement_weight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartographyElement_weight_feature", "_UI_CartographyElement_type"),
				 CartographyDescriptionPackage.Literals.CARTOGRAPHY_ELEMENT__WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartographyElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartographyElement_name_feature", "_UI_CartographyElement_type"),
				 CartographyDescriptionPackage.Literals.CARTOGRAPHY_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartographyElement_maxWeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartographyElement_maxWeight_feature", "_UI_CartographyElement_type"),
				 CartographyDescriptionPackage.Literals.CARTOGRAPHY_ELEMENT__MAX_WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mig Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMigRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartographyElement_migRelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartographyElement_migRelations_feature", "_UI_CartographyElement_type"),
				 CartographyDescriptionPackage.Literals.CARTOGRAPHY_ELEMENT__MIG_RELATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Layer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentLayerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartographyElement_parentLayer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartographyElement_parentLayer_feature", "_UI_CartographyElement_type"),
				 CartographyDescriptionPackage.Literals.CARTOGRAPHY_ELEMENT__PARENT_LAYER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Module feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentModulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartographyElement_parentModule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartographyElement_parentModule_feature", "_UI_CartographyElement_type"),
				 CartographyDescriptionPackage.Literals.CARTOGRAPHY_ELEMENT__PARENT_MODULE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Original File Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalFilePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartographyElement_originalFilePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartographyElement_originalFilePath_feature", "_UI_CartographyElement_type"),
				 CartographyDescriptionPackage.Literals.CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New File Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewFilePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartographyElement_newFilePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartographyElement_newFilePath_feature", "_UI_CartographyElement_type"),
				 CartographyDescriptionPackage.Literals.CARTOGRAPHY_ELEMENT__NEW_FILE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CartographyDescriptionPackage.Literals.ANNOTATED_OBJECT__ANOTATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CartographyElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CartographyElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CartographyElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CartographyElement_type") :
			getString("_UI_CartographyElement_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CartographyElement.class)) {
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__WEIGHT:
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NAME:
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__MAX_WEIGHT:
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH:
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NEW_FILE_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ANOTATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.ANNOTATED_OBJECT__ANOTATIONS,
				 CartographyDescriptionFactory.eINSTANCE.createAnnotation()));
	}

}
