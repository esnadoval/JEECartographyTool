/**
 */
package CartographyDescription;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CartographyDescription.Variable#getName <em>Name</em>}</li>
 *   <li>{@link CartographyDescription.Variable#getType <em>Type</em>}</li>
 *   <li>{@link CartographyDescription.Variable#getInhertance <em>Inhertance</em>}</li>
 *   <li>{@link CartographyDescription.Variable#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CartographyDescription.CartographyDescriptionPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CartographyDescription.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(VarType)
	 * @see CartographyDescription.CartographyDescriptionPackage#getVariable_Type()
	 * @model containment="true"
	 * @generated
	 */
	VarType getType();

	/**
	 * Sets the value of the '{@link CartographyDescription.Variable#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(VarType value);

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
	 * @see CartographyDescription.CartographyDescriptionPackage#getVariable_Inhertance()
	 * @model default="1"
	 * @generated
	 */
	Inhertance getInhertance();

	/**
	 * Sets the value of the '{@link CartographyDescription.Variable#getInhertance <em>Inhertance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhertance</em>' attribute.
	 * @see CartographyDescription.Inhertance
	 * @see #getInhertance()
	 * @generated
	 */
	void setInhertance(Inhertance value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see CartographyDescription.CartographyDescriptionPackage#getVariable_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link CartographyDescription.Variable#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

} // Variable
