/**
 */
package CartographyDescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bussiness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CartographyDescription.Bussiness#getFrameworkType <em>Framework Type</em>}</li>
 *   <li>{@link CartographyDescription.Bussiness#getUsageStrategy <em>Usage Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getBussiness()
 * @model
 * @generated
 */
public interface Bussiness extends CartographyDescription.Class {
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
	 * @see CartographyDescription.CartographyDescriptionPackage#getBussiness_FrameworkType()
	 * @model
	 * @generated
	 */
	String getFrameworkType();

	/**
	 * Sets the value of the '{@link CartographyDescription.Bussiness#getFrameworkType <em>Framework Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Type</em>' attribute.
	 * @see #getFrameworkType()
	 * @generated
	 */
	void setFrameworkType(String value);

	/**
	 * Returns the value of the '<em><b>Usage Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Strategy</em>' attribute.
	 * @see #setUsageStrategy(String)
	 * @see CartographyDescription.CartographyDescriptionPackage#getBussiness_UsageStrategy()
	 * @model
	 * @generated
	 */
	String getUsageStrategy();

	/**
	 * Sets the value of the '{@link CartographyDescription.Bussiness#getUsageStrategy <em>Usage Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Strategy</em>' attribute.
	 * @see #getUsageStrategy()
	 * @generated
	 */
	void setUsageStrategy(String value);

} // Bussiness
