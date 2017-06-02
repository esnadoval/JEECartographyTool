/**
 */
package CartographyDescription.impl;

import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.CartographyElement;
import CartographyDescription.Layer;
import CartographyDescription.Module;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CartographyDescription.impl.ModuleImpl#getSubModules <em>Sub Modules</em>}</li>
 *   <li>{@link CartographyDescription.impl.ModuleImpl#getCartographyElements <em>Cartography Elements</em>}</li>
 *   <li>{@link CartographyDescription.impl.ModuleImpl#getLayers <em>Layers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends CartographyElementImpl implements Module {
	/**
	 * The cached value of the '{@link #getSubModules() <em>Sub Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> subModules;

	/**
	 * The cached value of the '{@link #getCartographyElements() <em>Cartography Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartographyElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CartographyElement> cartographyElements;

	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> layers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CartographyDescriptionPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getSubModules() {
		if (subModules == null) {
			subModules = new EObjectContainmentEList<Module>(Module.class, this, CartographyDescriptionPackage.MODULE__SUB_MODULES);
		}
		return subModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CartographyElement> getCartographyElements() {
		if (cartographyElements == null) {
			cartographyElements = new EObjectResolvingEList<CartographyElement>(CartographyElement.class, this, CartographyDescriptionPackage.MODULE__CARTOGRAPHY_ELEMENTS);
		}
		return cartographyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layer> getLayers() {
		if (layers == null) {
			layers = new EObjectContainmentEList<Layer>(Layer.class, this, CartographyDescriptionPackage.MODULE__LAYERS);
		}
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CartographyDescriptionPackage.MODULE__SUB_MODULES:
				return ((InternalEList<?>)getSubModules()).basicRemove(otherEnd, msgs);
			case CartographyDescriptionPackage.MODULE__LAYERS:
				return ((InternalEList<?>)getLayers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CartographyDescriptionPackage.MODULE__SUB_MODULES:
				return getSubModules();
			case CartographyDescriptionPackage.MODULE__CARTOGRAPHY_ELEMENTS:
				return getCartographyElements();
			case CartographyDescriptionPackage.MODULE__LAYERS:
				return getLayers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CartographyDescriptionPackage.MODULE__SUB_MODULES:
				getSubModules().clear();
				getSubModules().addAll((Collection<? extends Module>)newValue);
				return;
			case CartographyDescriptionPackage.MODULE__CARTOGRAPHY_ELEMENTS:
				getCartographyElements().clear();
				getCartographyElements().addAll((Collection<? extends CartographyElement>)newValue);
				return;
			case CartographyDescriptionPackage.MODULE__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection<? extends Layer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CartographyDescriptionPackage.MODULE__SUB_MODULES:
				getSubModules().clear();
				return;
			case CartographyDescriptionPackage.MODULE__CARTOGRAPHY_ELEMENTS:
				getCartographyElements().clear();
				return;
			case CartographyDescriptionPackage.MODULE__LAYERS:
				getLayers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CartographyDescriptionPackage.MODULE__SUB_MODULES:
				return subModules != null && !subModules.isEmpty();
			case CartographyDescriptionPackage.MODULE__CARTOGRAPHY_ELEMENTS:
				return cartographyElements != null && !cartographyElements.isEmpty();
			case CartographyDescriptionPackage.MODULE__LAYERS:
				return layers != null && !layers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
