/**
 */
package CartographyDescription.provider;


import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.CartographyDescriptionPackage;

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
 * This is the item provider adapter for a {@link CartographyDescription.Class} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassItemProvider extends CartographyElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassItemProvider(AdapterFactory adapterFactory) {
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

			addVisibilityPropertyDescriptor(object);
			addInhertancePropertyDescriptor(object);
			addOriginalFileNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_visibility_feature", "_UI_Class_type"),
				 CartographyDescriptionPackage.Literals.CLASS__VISIBILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inhertance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInhertancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_inhertance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_inhertance_feature", "_UI_Class_type"),
				 CartographyDescriptionPackage.Literals.CLASS__INHERTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Original File Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalFileNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_originalFileName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_originalFileName_feature", "_UI_Class_type"),
				 CartographyDescriptionPackage.Literals.CLASS__ORIGINAL_FILE_NAME,
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
			childrenFeatures.add(CartographyDescriptionPackage.Literals.CLASS__ATTRIBUTES);
			childrenFeatures.add(CartographyDescriptionPackage.Literals.CLASS__METHODS);
			childrenFeatures.add(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION);
			childrenFeatures.add(CartographyDescriptionPackage.Literals.CLASS__IMPLEMENTS);
			childrenFeatures.add(CartographyDescriptionPackage.Literals.CLASS__EXTENDS);
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
	 * This returns Class.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Class"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CartographyDescription.Class)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Class_type") :
			getString("_UI_Class_type") + " " + label;
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

		switch (notification.getFeatureID(CartographyDescription.Class.class)) {
			case CartographyDescriptionPackage.CLASS__VISIBILITY:
			case CartographyDescriptionPackage.CLASS__INHERTANCE:
			case CartographyDescriptionPackage.CLASS__ORIGINAL_FILE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CartographyDescriptionPackage.CLASS__ATTRIBUTES:
			case CartographyDescriptionPackage.CLASS__METHODS:
			case CartographyDescriptionPackage.CLASS__MODISCO_CLASS_DECLARATION:
			case CartographyDescriptionPackage.CLASS__IMPLEMENTS:
			case CartographyDescriptionPackage.CLASS__EXTENDS:
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
				(CartographyDescriptionPackage.Literals.CLASS__ATTRIBUTES,
				 CartographyDescriptionFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__METHODS,
				 CartographyDescriptionFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createStaticMetrics()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createCartographyElement()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createApplication()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createBussiness()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createUI()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createLayer()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createAnnotatedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createElementRelation()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createUnitTest()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createVarType()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createPersistenceManager()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createAnnotationParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION,
				 CartographyDescriptionFactory.eINSTANCE.createException()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__IMPLEMENTS,
				 CartographyDescriptionFactory.eINSTANCE.createVarType()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.CLASS__EXTENDS,
				 CartographyDescriptionFactory.eINSTANCE.createVarType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CartographyDescriptionPackage.Literals.ANNOTATED_OBJECT__ANOTATIONS ||
			childFeature == CartographyDescriptionPackage.Literals.CLASS__MODISCO_CLASS_DECLARATION ||
			childFeature == CartographyDescriptionPackage.Literals.CLASS__ATTRIBUTES ||
			childFeature == CartographyDescriptionPackage.Literals.CLASS__METHODS ||
			childFeature == CartographyDescriptionPackage.Literals.CLASS__IMPLEMENTS ||
			childFeature == CartographyDescriptionPackage.Literals.CLASS__EXTENDS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
