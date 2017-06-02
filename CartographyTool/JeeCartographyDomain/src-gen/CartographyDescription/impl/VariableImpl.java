/**
 */
package CartographyDescription.impl;

import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.Inhertance;
import CartographyDescription.VarType;
import CartographyDescription.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CartographyDescription.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link CartographyDescription.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link CartographyDescription.impl.VariableImpl#getInhertance <em>Inhertance</em>}</li>
 *   <li>{@link CartographyDescription.impl.VariableImpl#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VarType type;

	/**
	 * The default value of the '{@link #getInhertance() <em>Inhertance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhertance()
	 * @generated
	 * @ordered
	 */
	protected static final Inhertance INHERTANCE_EDEFAULT = Inhertance.NONE;

	/**
	 * The cached value of the '{@link #getInhertance() <em>Inhertance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhertance()
	 * @generated
	 * @ordered
	 */
	protected Inhertance inhertance = INHERTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CartographyDescriptionPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(VarType newType, NotificationChain msgs) {
		VarType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.VARIABLE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(VarType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CartographyDescriptionPackage.VARIABLE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CartographyDescriptionPackage.VARIABLE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.VARIABLE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inhertance getInhertance() {
		return inhertance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInhertance(Inhertance newInhertance) {
		Inhertance oldInhertance = inhertance;
		inhertance = newInhertance == null ? INHERTANCE_EDEFAULT : newInhertance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.VARIABLE__INHERTANCE, oldInhertance, inhertance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.VARIABLE__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CartographyDescriptionPackage.VARIABLE__TYPE:
				return basicSetType(null, msgs);
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
			case CartographyDescriptionPackage.VARIABLE__NAME:
				return getName();
			case CartographyDescriptionPackage.VARIABLE__TYPE:
				return getType();
			case CartographyDescriptionPackage.VARIABLE__INHERTANCE:
				return getInhertance();
			case CartographyDescriptionPackage.VARIABLE__STATIC:
				return isStatic();
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
			case CartographyDescriptionPackage.VARIABLE__NAME:
				setName((String)newValue);
				return;
			case CartographyDescriptionPackage.VARIABLE__TYPE:
				setType((VarType)newValue);
				return;
			case CartographyDescriptionPackage.VARIABLE__INHERTANCE:
				setInhertance((Inhertance)newValue);
				return;
			case CartographyDescriptionPackage.VARIABLE__STATIC:
				setStatic((Boolean)newValue);
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
			case CartographyDescriptionPackage.VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CartographyDescriptionPackage.VARIABLE__TYPE:
				setType((VarType)null);
				return;
			case CartographyDescriptionPackage.VARIABLE__INHERTANCE:
				setInhertance(INHERTANCE_EDEFAULT);
				return;
			case CartographyDescriptionPackage.VARIABLE__STATIC:
				setStatic(STATIC_EDEFAULT);
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
			case CartographyDescriptionPackage.VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CartographyDescriptionPackage.VARIABLE__TYPE:
				return type != null;
			case CartographyDescriptionPackage.VARIABLE__INHERTANCE:
				return inhertance != INHERTANCE_EDEFAULT;
			case CartographyDescriptionPackage.VARIABLE__STATIC:
				return static_ != STATIC_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", inhertance: ");
		result.append(inhertance);
		result.append(", static: ");
		result.append(static_);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
