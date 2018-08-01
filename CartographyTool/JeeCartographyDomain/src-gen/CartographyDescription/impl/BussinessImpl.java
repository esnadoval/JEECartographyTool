/**
 */
package CartographyDescription.impl;

import CartographyDescription.Bussiness;
import CartographyDescription.CartographyDescriptionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bussiness</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CartographyDescription.impl.BussinessImpl#getFrameworkType <em>Framework Type</em>}</li>
 *   <li>{@link CartographyDescription.impl.BussinessImpl#getUsageStrategy <em>Usage Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BussinessImpl extends ClassImpl implements Bussiness {
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
	 * The default value of the '{@link #getUsageStrategy() <em>Usage Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageStrategy() <em>Usage Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageStrategy()
	 * @generated
	 * @ordered
	 */
	protected String usageStrategy = USAGE_STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BussinessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CartographyDescriptionPackage.Literals.BUSSINESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.BUSSINESS__FRAMEWORK_TYPE, oldFrameworkType, frameworkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageStrategy() {
		return usageStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageStrategy(String newUsageStrategy) {
		String oldUsageStrategy = usageStrategy;
		usageStrategy = newUsageStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.BUSSINESS__USAGE_STRATEGY, oldUsageStrategy, usageStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CartographyDescriptionPackage.BUSSINESS__FRAMEWORK_TYPE:
				return getFrameworkType();
			case CartographyDescriptionPackage.BUSSINESS__USAGE_STRATEGY:
				return getUsageStrategy();
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
			case CartographyDescriptionPackage.BUSSINESS__FRAMEWORK_TYPE:
				setFrameworkType((String)newValue);
				return;
			case CartographyDescriptionPackage.BUSSINESS__USAGE_STRATEGY:
				setUsageStrategy((String)newValue);
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
			case CartographyDescriptionPackage.BUSSINESS__FRAMEWORK_TYPE:
				setFrameworkType(FRAMEWORK_TYPE_EDEFAULT);
				return;
			case CartographyDescriptionPackage.BUSSINESS__USAGE_STRATEGY:
				setUsageStrategy(USAGE_STRATEGY_EDEFAULT);
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
			case CartographyDescriptionPackage.BUSSINESS__FRAMEWORK_TYPE:
				return FRAMEWORK_TYPE_EDEFAULT == null ? frameworkType != null : !FRAMEWORK_TYPE_EDEFAULT.equals(frameworkType);
			case CartographyDescriptionPackage.BUSSINESS__USAGE_STRATEGY:
				return USAGE_STRATEGY_EDEFAULT == null ? usageStrategy != null : !USAGE_STRATEGY_EDEFAULT.equals(usageStrategy);
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
		result.append(", usageStrategy: ");
		result.append(usageStrategy);
		result.append(')');
		return result.toString();
	}

} //BussinessImpl
