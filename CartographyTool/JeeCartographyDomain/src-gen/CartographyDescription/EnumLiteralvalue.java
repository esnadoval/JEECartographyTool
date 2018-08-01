/**
 */
package CartographyDescription;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literalvalue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CartographyDescription.EnumLiteralvalue#getValue <em>Value</em>}</li>
 *   <li>{@link CartographyDescription.EnumLiteralvalue#getAttr <em>Attr</em>}</li>
 * </ul>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getEnumLiteralvalue()
 * @model
 * @generated
 */
public interface EnumLiteralvalue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CartographyDescription.CartographyDescriptionPackage#getEnumLiteralvalue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CartographyDescription.EnumLiteralvalue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Attr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' reference.
	 * @see #setAttr(Variable)
	 * @see CartographyDescription.CartographyDescriptionPackage#getEnumLiteralvalue_Attr()
	 * @model required="true"
	 * @generated
	 */
	Variable getAttr();

	/**
	 * Sets the value of the '{@link CartographyDescription.EnumLiteralvalue#getAttr <em>Attr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr</em>' reference.
	 * @see #getAttr()
	 * @generated
	 */
	void setAttr(Variable value);

} // EnumLiteralvalue
