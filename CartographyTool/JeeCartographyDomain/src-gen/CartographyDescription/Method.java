/**
 */
package CartographyDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CartographyDescription.Method#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link CartographyDescription.Method#getCode <em>Code</em>}</li>
 *   <li>{@link CartographyDescription.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link CartographyDescription.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link CartographyDescription.Method#getInhertance <em>Inhertance</em>}</li>
 *   <li>{@link CartographyDescription.Method#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends CartographyElement {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * The literals are from the enumeration {@link CartographyDescription.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see CartographyDescription.Visibility
	 * @see #setVisibility(Visibility)
	 * @see CartographyDescription.CartographyDescriptionPackage#getMethod_Visibility()
	 * @model default="1"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link CartographyDescription.Method#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see CartographyDescription.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see CartographyDescription.CartographyDescriptionPackage#getMethod_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link CartographyDescription.Method#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(VarType)
	 * @see CartographyDescription.CartographyDescriptionPackage#getMethod_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	VarType getReturnType();

	/**
	 * Sets the value of the '{@link CartographyDescription.Method#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(VarType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getParameters();

	/**
	 * Returns the value of the '<em><b>Inhertance</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * The literals are from the enumeration {@link CartographyDescription.Inhertance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inhertance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhertance</em>' attribute.
	 * @see CartographyDescription.Inhertance
	 * @see #setInhertance(Inhertance)
	 * @see CartographyDescription.CartographyDescriptionPackage#getMethod_Inhertance()
	 * @model default="1"
	 * @generated
	 */
	Inhertance getInhertance();

	/**
	 * Sets the value of the '{@link CartographyDescription.Method#getInhertance <em>Inhertance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhertance</em>' attribute.
	 * @see CartographyDescription.Inhertance
	 * @see #getInhertance()
	 * @generated
	 */
	void setInhertance(Inhertance value);

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getMethod_Exceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CartographyDescription.Exception> getExceptions();

} // Method
