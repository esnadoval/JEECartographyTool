/**
 */
package CartographyDescription.impl;

import CartographyDescription.Attribute;
import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.Inhertance;
import CartographyDescription.Method;
import CartographyDescription.VarType;
import CartographyDescription.Visibility;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CartographyDescription.impl.ClassImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link CartographyDescription.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link CartographyDescription.impl.ClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link CartographyDescription.impl.ClassImpl#getModiscoClassDeclaration <em>Modisco Class Declaration</em>}</li>
 *   <li>{@link CartographyDescription.impl.ClassImpl#getInhertance <em>Inhertance</em>}</li>
 *   <li>{@link CartographyDescription.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link CartographyDescription.impl.ClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link CartographyDescription.impl.ClassImpl#getOriginalFileName <em>Original File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends CartographyElementImpl implements CartographyDescription.Class {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.NONE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getModiscoClassDeclaration() <em>Modisco Class Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModiscoClassDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EObject modiscoClassDeclaration;

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
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<VarType> implements_;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected VarType extends_;

	/**
	 * The default value of the '{@link #getOriginalFileName() <em>Original File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalFileName() <em>Original File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFileName()
	 * @generated
	 * @ordered
	 */
	protected String originalFileName = ORIGINAL_FILE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CartographyDescriptionPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CLASS__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, CartographyDescriptionPackage.CLASS__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this, CartographyDescriptionPackage.CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getModiscoClassDeclaration() {
		return modiscoClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModiscoClassDeclaration(EObject newModiscoClassDeclaration, NotificationChain msgs) {
		EObject oldModiscoClassDeclaration = modiscoClassDeclaration;
		modiscoClassDeclaration = newModiscoClassDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CLASS__MODISCO_CLASS_DECLARATION, oldModiscoClassDeclaration, newModiscoClassDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModiscoClassDeclaration(EObject newModiscoClassDeclaration) {
		if (newModiscoClassDeclaration != modiscoClassDeclaration) {
			NotificationChain msgs = null;
			if (modiscoClassDeclaration != null)
				msgs = ((InternalEObject)modiscoClassDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CartographyDescriptionPackage.CLASS__MODISCO_CLASS_DECLARATION, null, msgs);
			if (newModiscoClassDeclaration != null)
				msgs = ((InternalEObject)newModiscoClassDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CartographyDescriptionPackage.CLASS__MODISCO_CLASS_DECLARATION, null, msgs);
			msgs = basicSetModiscoClassDeclaration(newModiscoClassDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CLASS__MODISCO_CLASS_DECLARATION, newModiscoClassDeclaration, newModiscoClassDeclaration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CLASS__INHERTANCE, oldInhertance, inhertance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarType> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectContainmentEList<VarType>(VarType.class, this, CartographyDescriptionPackage.CLASS__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(VarType newExtends, NotificationChain msgs) {
		VarType oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CLASS__EXTENDS, oldExtends, newExtends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(VarType newExtends) {
		if (newExtends != extends_) {
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CartographyDescriptionPackage.CLASS__EXTENDS, null, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CartographyDescriptionPackage.CLASS__EXTENDS, null, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CLASS__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalFileName() {
		return originalFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalFileName(String newOriginalFileName) {
		String oldOriginalFileName = originalFileName;
		originalFileName = newOriginalFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CLASS__ORIGINAL_FILE_NAME, oldOriginalFileName, originalFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CartographyDescriptionPackage.CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case CartographyDescriptionPackage.CLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case CartographyDescriptionPackage.CLASS__MODISCO_CLASS_DECLARATION:
				return basicSetModiscoClassDeclaration(null, msgs);
			case CartographyDescriptionPackage.CLASS__IMPLEMENTS:
				return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
			case CartographyDescriptionPackage.CLASS__EXTENDS:
				return basicSetExtends(null, msgs);
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
			case CartographyDescriptionPackage.CLASS__VISIBILITY:
				return getVisibility();
			case CartographyDescriptionPackage.CLASS__ATTRIBUTES:
				return getAttributes();
			case CartographyDescriptionPackage.CLASS__METHODS:
				return getMethods();
			case CartographyDescriptionPackage.CLASS__MODISCO_CLASS_DECLARATION:
				return getModiscoClassDeclaration();
			case CartographyDescriptionPackage.CLASS__INHERTANCE:
				return getInhertance();
			case CartographyDescriptionPackage.CLASS__IMPLEMENTS:
				return getImplements();
			case CartographyDescriptionPackage.CLASS__EXTENDS:
				return getExtends();
			case CartographyDescriptionPackage.CLASS__ORIGINAL_FILE_NAME:
				return getOriginalFileName();
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
			case CartographyDescriptionPackage.CLASS__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case CartographyDescriptionPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CartographyDescriptionPackage.CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case CartographyDescriptionPackage.CLASS__MODISCO_CLASS_DECLARATION:
				setModiscoClassDeclaration((EObject)newValue);
				return;
			case CartographyDescriptionPackage.CLASS__INHERTANCE:
				setInhertance((Inhertance)newValue);
				return;
			case CartographyDescriptionPackage.CLASS__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends VarType>)newValue);
				return;
			case CartographyDescriptionPackage.CLASS__EXTENDS:
				setExtends((VarType)newValue);
				return;
			case CartographyDescriptionPackage.CLASS__ORIGINAL_FILE_NAME:
				setOriginalFileName((String)newValue);
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
			case CartographyDescriptionPackage.CLASS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case CartographyDescriptionPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case CartographyDescriptionPackage.CLASS__METHODS:
				getMethods().clear();
				return;
			case CartographyDescriptionPackage.CLASS__MODISCO_CLASS_DECLARATION:
				setModiscoClassDeclaration((EObject)null);
				return;
			case CartographyDescriptionPackage.CLASS__INHERTANCE:
				setInhertance(INHERTANCE_EDEFAULT);
				return;
			case CartographyDescriptionPackage.CLASS__IMPLEMENTS:
				getImplements().clear();
				return;
			case CartographyDescriptionPackage.CLASS__EXTENDS:
				setExtends((VarType)null);
				return;
			case CartographyDescriptionPackage.CLASS__ORIGINAL_FILE_NAME:
				setOriginalFileName(ORIGINAL_FILE_NAME_EDEFAULT);
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
			case CartographyDescriptionPackage.CLASS__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case CartographyDescriptionPackage.CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case CartographyDescriptionPackage.CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case CartographyDescriptionPackage.CLASS__MODISCO_CLASS_DECLARATION:
				return modiscoClassDeclaration != null;
			case CartographyDescriptionPackage.CLASS__INHERTANCE:
				return inhertance != INHERTANCE_EDEFAULT;
			case CartographyDescriptionPackage.CLASS__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case CartographyDescriptionPackage.CLASS__EXTENDS:
				return extends_ != null;
			case CartographyDescriptionPackage.CLASS__ORIGINAL_FILE_NAME:
				return ORIGINAL_FILE_NAME_EDEFAULT == null ? originalFileName != null : !ORIGINAL_FILE_NAME_EDEFAULT.equals(originalFileName);
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", inhertance: ");
		result.append(inhertance);
		result.append(", originalFileName: ");
		result.append(originalFileName);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
