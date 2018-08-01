/**
 */
package CartographyDescription.provider;


import CartographyDescription.Application;
import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.CartographyDescriptionPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CartographyDescription.Application} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationItemProvider extends CartographyElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CartographyDescriptionPackage.Literals.APPLICATION__MODULES);
			childrenFeatures.add(CartographyDescriptionPackage.Literals.APPLICATION__LAYERS);
			childrenFeatures.add(CartographyDescriptionPackage.Literals.APPLICATION__COMPILATION_UNITS);
			childrenFeatures.add(CartographyDescriptionPackage.Literals.APPLICATION__APP_RELATIONS);
			childrenFeatures.add(CartographyDescriptionPackage.Literals.APPLICATION__PATERNS);
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
	 * This returns Application.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Application"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Application)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Application_type") :
			getString("_UI_Application_type") + " " + label;
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

		switch (notification.getFeatureID(Application.class)) {
			case CartographyDescriptionPackage.APPLICATION__MODULES:
			case CartographyDescriptionPackage.APPLICATION__LAYERS:
			case CartographyDescriptionPackage.APPLICATION__COMPILATION_UNITS:
			case CartographyDescriptionPackage.APPLICATION__APP_RELATIONS:
			case CartographyDescriptionPackage.APPLICATION__PATERNS:
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
				(CartographyDescriptionPackage.Literals.APPLICATION__MODULES,
				 CartographyDescriptionFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__LAYERS,
				 CartographyDescriptionFactory.eINSTANCE.createLayer()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__COMPILATION_UNITS,
				 CartographyDescriptionFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__COMPILATION_UNITS,
				 CartographyDescriptionFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__COMPILATION_UNITS,
				 CartographyDescriptionFactory.eINSTANCE.createBussiness()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__COMPILATION_UNITS,
				 CartographyDescriptionFactory.eINSTANCE.createUI()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__COMPILATION_UNITS,
				 CartographyDescriptionFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__COMPILATION_UNITS,
				 CartographyDescriptionFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__COMPILATION_UNITS,
				 CartographyDescriptionFactory.eINSTANCE.createUnitTest()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__COMPILATION_UNITS,
				 CartographyDescriptionFactory.eINSTANCE.createPersistenceManager()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__COMPILATION_UNITS,
				 CartographyDescriptionFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__APP_RELATIONS,
				 CartographyDescriptionFactory.eINSTANCE.createElementRelation()));

		newChildDescriptors.add
			(createChildParameter
				(CartographyDescriptionPackage.Literals.APPLICATION__PATERNS,
				 CartographyDescriptionFactory.eINSTANCE.createPattern()));
	}

}
