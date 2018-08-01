/**
 */
package CartographyDescription.impl;

import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.UI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CartographyDescription.impl.UIImpl#getFrameworkType <em>Framework Type</em>}</li>
 *   <li>{@link CartographyDescription.impl.UIImpl#getForDevice <em>For Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIImpl extends ClassImpl implements UI {
	/**
	 * The default value of the '{@link #getFrameworkType() <em>Framework Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkType()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAMEWORK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameworkType() <em>Framework Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkType()
	 * @generated
	 * @ordered
	 */
	protected String frameworkType = FRAMEWORK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getForDevice() <em>For Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForDevice() <em>For Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForDevice()
	 * @generated
	 * @ordered
	 */
	protected String forDevice = FOR_DEVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CartographyDescriptionPackage.Literals.UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrameworkType() {
		return frameworkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameworkType(String newFrameworkType) {
		String oldFrameworkType = frameworkType;
		frameworkType = newFrameworkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.UI__FRAMEWORK_TYPE, oldFrameworkType, frameworkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForDevice() {
		return forDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForDevice(String newForDevice) {
		String oldForDevice = forDevice;
		forDevice = newForDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.UI__FOR_DEVICE, oldForDevice, forDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CartographyDescriptionPackage.UI__FRAMEWORK_TYPE:
				return getFrameworkType();
			case CartographyDescriptionPackage.UI__FOR_DEVICE:
				return getForDevice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CartographyDescriptionPackage.UI__FRAMEWORK_TYPE:
				setFrameworkType((String)newValue);
				return;
			case CartographyDescriptionPackage.UI__FOR_DEVICE:
				setForDevice((String)newValue);
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
			case CartographyDescriptionPackage.UI__FRAMEWORK_TYPE:
				setFrameworkType(FRAMEWORK_TYPE_EDEFAULT);
				return;
			case CartographyDescriptionPackage.UI__FOR_DEVICE:
				setForDevice(FOR_DEVICE_EDEFAULT);
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
			case CartographyDescriptionPackage.UI__FRAMEWORK_TYPE:
				return FRAMEWORK_TYPE_EDEFAULT == null ? frameworkType != null : !FRAMEWORK_TYPE_EDEFAULT.equals(frameworkType);
			case CartographyDescriptionPackage.UI__FOR_DEVICE:
				return FOR_DEVICE_EDEFAULT == null ? forDevice != null : !FOR_DEVICE_EDEFAULT.equals(forDevice);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (frameworkType: ");
		result.append(frameworkType);
		result.append(", forDevice: ");
		result.append(forDevice);
		result.append(')');
		return result.toString();
	}

} //UIImpl
