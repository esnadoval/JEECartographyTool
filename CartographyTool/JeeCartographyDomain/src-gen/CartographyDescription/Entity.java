/**
 */
package CartographyDescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CartographyDescription.Entity#getFrameworkType <em>Framework Type</em>}</li>
 *   <li>{@link CartographyDescription.Entity#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link CartographyDescription.Entity#getPersistenceMode <em>Persistence Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends CartographyDescription.Class {
	/**
	 * Returns the value of the '<em><b>Framework Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Type</em>' attribute.
	 * @see #setFrameworkType(String)
	 * @see CartographyDescription.CartographyDescriptionPackage#getEntity_FrameworkType()
	 * @model
	 * @generated
	 */
	String getFrameworkType();

	/**
	 * Sets the value of the '{@link CartographyDescription.Entity#getFrameworkType <em>Framework Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Type</em>' attribute.
	 * @see #getFrameworkType()
	 * @generated
	 */
	void setFrameworkType(String value);

	/**
	 * Returns the value of the '<em><b>Db Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Table</em>' attribute.
	 * @see #setDbTable(String)
	 * @see CartographyDescription.CartographyDescriptionPackage#getEntity_DbTable()
	 * @model
	 * @generated
	 */
	String getDbTable();

	/**
	 * Sets the value of the '{@link CartographyDescription.Entity#getDbTable <em>Db Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Table</em>' attribute.
	 * @see #getDbTable()
	 * @generated
	 */
	void setDbTable(String value);

	/**
	 * Returns the value of the '<em><b>Persistence Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Mode</em>' attribute.
	 * @see #setPersistenceMode(String)
	 * @see CartographyDescription.CartographyDescriptionPackage#getEntity_PersistenceMode()
	 * @model
	 * @generated
	 */
	String getPersistenceMode();

	/**
	 * Sets the value of the '{@link CartographyDescription.Entity#getPersistenceMode <em>Persistence Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Mode</em>' attribute.
	 * @see #getPersistenceMode()
	 * @generated
	 */
	void setPersistenceMode(String value);

} // Entity
