/**
 */
package CartographyDescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CartographyDescription.PersistenceManager#getPersistenceType <em>Persistence Type</em>}</li>
 * </ul>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getPersistenceManager()
 * @model
 * @generated
 */
public interface PersistenceManager extends CartographyDescription.Class {
	/**
	 * Returns the value of the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Type</em>' attribute.
	 * @see #setPersistenceType(String)
	 * @see CartographyDescription.CartographyDescriptionPackage#getPersistenceManager_PersistenceType()
	 * @model
	 * @generated
	 */
	String getPersistenceType();

	/**
	 * Sets the value of the '{@link CartographyDescription.PersistenceManager#getPersistenceType <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Type</em>' attribute.
	 * @see #getPersistenceType()
	 * @generated
	 */
	void setPersistenceType(String value);

} // PersistenceManager
