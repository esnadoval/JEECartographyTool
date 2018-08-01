/**
 */
package CartographyDescription.impl;

import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.Entity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CartographyDescription.impl.EntityImpl#getFrameworkType <em>Framework Type</em>}</li>
 *   <li>{@link CartographyDescription.impl.EntityImpl#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link CartographyDescription.impl.EntityImpl#getPersistenceMode <em>Persistence Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends ClassImpl implements Entity {
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
	 * The default value of the '{@link #getDbTable() <em>Db Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbTable()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbTable() <em>Db Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbTable()
	 * @generated
	 * @ordered
	 */
	protected String dbTable = DB_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistenceMode() <em>Persistence Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceMode()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENCE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistenceMode() <em>Persistence Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceMode()
	 * @generated
	 * @ordered
	 */
	protected String persistenceMode = PERSISTENCE_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CartographyDescriptionPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.ENTITY__FRAMEWORK_TYPE, oldFrameworkType, frameworkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbTable() {
		return dbTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbTable(String newDbTable) {
		String oldDbTable = dbTable;
		dbTable = newDbTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.ENTITY__DB_TABLE, oldDbTable, dbTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistenceMode() {
		return persistenceMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceMode(String newPersistenceMode) {
		String oldPersistenceMode = persistenceMode;
		persistenceMode = newPersistenceMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.ENTITY__PERSISTENCE_MODE, oldPersistenceMode, persistenceMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CartographyDescriptionPackage.ENTITY__FRAMEWORK_TYPE:
				return getFrameworkType();
			case CartographyDescriptionPackage.ENTITY__DB_TABLE:
				return getDbTable();
			case CartographyDescriptionPackage.ENTITY__PERSISTENCE_MODE:
				return getPersistenceMode();
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
			case CartographyDescriptionPackage.ENTITY__FRAMEWORK_TYPE:
				setFrameworkType((String)newValue);
				return;
			case CartographyDescriptionPackage.ENTITY__DB_TABLE:
				setDbTable((String)newValue);
				return;
			case CartographyDescriptionPackage.ENTITY__PERSISTENCE_MODE:
				setPersistenceMode((String)newValue);
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
			case CartographyDescriptionPackage.ENTITY__FRAMEWORK_TYPE:
				setFrameworkType(FRAMEWORK_TYPE_EDEFAULT);
				return;
			case CartographyDescriptionPackage.ENTITY__DB_TABLE:
				setDbTable(DB_TABLE_EDEFAULT);
				return;
			case CartographyDescriptionPackage.ENTITY__PERSISTENCE_MODE:
				setPersistenceMode(PERSISTENCE_MODE_EDEFAULT);
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
			case CartographyDescriptionPackage.ENTITY__FRAMEWORK_TYPE:
				return FRAMEWORK_TYPE_EDEFAULT == null ? frameworkType != null : !FRAMEWORK_TYPE_EDEFAULT.equals(frameworkType);
			case CartographyDescriptionPackage.ENTITY__DB_TABLE:
				return DB_TABLE_EDEFAULT == null ? dbTable != null : !DB_TABLE_EDEFAULT.equals(dbTable);
			case CartographyDescriptionPackage.ENTITY__PERSISTENCE_MODE:
				return PERSISTENCE_MODE_EDEFAULT == null ? persistenceMode != null : !PERSISTENCE_MODE_EDEFAULT.equals(persistenceMode);
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
		result.append(", dbTable: ");
		result.append(dbTable);
		result.append(", persistenceMode: ");
		result.append(persistenceMode);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
