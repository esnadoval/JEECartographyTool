/**
 */
package CartographyDescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CartographyDescription.Class#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link CartographyDescription.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link CartographyDescription.Class#getMethods <em>Methods</em>}</li>
 *   <li>{@link CartographyDescription.Class#getModiscoClassDeclaration <em>Modisco Class Declaration</em>}</li>
 *   <li>{@link CartographyDescription.Class#getInhertance <em>Inhertance</em>}</li>
 *   <li>{@link CartographyDescription.Class#getImplements <em>Implements</em>}</li>
 *   <li>{@link CartographyDescription.Class#getExtends <em>Extends</em>}</li>
 *   <li>{@link CartographyDescription.Class#getOriginalFileName <em>Original File Name</em>}</li>
 * </ul>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends CartographyElement {
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
	 * @see CartographyDescription.CartographyDescriptionPackage#getClass_Visibility()
	 * @model default="1"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link CartographyDescription.Class#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see CartographyDescription.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getClass_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Modisco Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modisco Class Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modisco Class Declaration</em>' containment reference.
	 * @see #setModiscoClassDeclaration(EObject)
	 * @see CartographyDescription.CartographyDescriptionPackage#getClass_ModiscoClassDeclaration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EObject getModiscoClassDeclaration();

	/**
	 * Sets the value of the '{@link CartographyDescription.Class#getModiscoClassDeclaration <em>Modisco Class Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modisco Class Declaration</em>' containment reference.
	 * @see #getModiscoClassDeclaration()
	 * @generated
	 */
	void setModiscoClassDeclaration(EObject value);

	/**
	 * Returns the value of the '<em><b>Inhertance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
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
	 * @see CartographyDescription.CartographyDescriptionPackage#getClass_Inhertance()
	 * @model default="0"
	 * @generated
	 */
	Inhertance getInhertance();

	/**
	 * Sets the value of the '{@link CartographyDescription.Class#getInhertance <em>Inhertance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhertance</em>' attribute.
	 * @see CartographyDescription.Inhertance
	 * @see #getInhertance()
	 * @generated
	 */
	void setInhertance(Inhertance value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.VarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getClass_Implements()
	 * @model containment="true"
	 * @generated
	 */
	EList<VarType> getImplements();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference.
	 * @see #setExtends(VarType)
	 * @see CartographyDescription.CartographyDescriptionPackage#getClass_Extends()
	 * @model containment="true"
	 * @generated
	 */
	VarType getExtends();

	/**
	 * Sets the value of the '{@link CartographyDescription.Class#getExtends <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' containment reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(VarType value);

	/**
	 * Returns the value of the '<em><b>Original File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Name</em>' attribute.
	 * @see #setOriginalFileName(String)
	 * @see CartographyDescription.CartographyDescriptionPackage#getClass_OriginalFileName()
	 * @model
	 * @generated
	 */
	String getOriginalFileName();

	/**
	 * Sets the value of the '{@link CartographyDescription.Class#getOriginalFileName <em>Original File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original File Name</em>' attribute.
	 * @see #getOriginalFileName()
	 * @generated
	 */
	void setOriginalFileName(String value);

} // Class
