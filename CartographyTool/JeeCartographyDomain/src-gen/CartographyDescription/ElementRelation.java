/**
 */
package CartographyDescription;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CartographyDescription.ElementRelation#getSrc <em>Src</em>}</li>
 *   <li>{@link CartographyDescription.ElementRelation#getDest <em>Dest</em>}</li>
 *   <li>{@link CartographyDescription.ElementRelation#getRelationType <em>Relation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getElementRelation()
 * @model
 * @generated
 */
public interface ElementRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(CartographyElement)
	 * @see CartographyDescription.CartographyDescriptionPackage#getElementRelation_Src()
	 * @model
	 * @generated
	 */
	CartographyElement getSrc();

	/**
	 * Sets the value of the '{@link CartographyDescription.ElementRelation#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(CartographyElement value);

	/**
	 * Returns the value of the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' reference.
	 * @see #setDest(CartographyElement)
	 * @see CartographyDescription.CartographyDescriptionPackage#getElementRelation_Dest()
	 * @model
	 * @generated
	 */
	CartographyElement getDest();

	/**
	 * Sets the value of the '{@link CartographyDescription.ElementRelation#getDest <em>Dest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' reference.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(CartographyElement value);

	/**
	 * Returns the value of the '<em><b>Relation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CartographyDescription.RelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Type</em>' attribute.
	 * @see CartographyDescription.RelationType
	 * @see #setRelationType(RelationType)
	 * @see CartographyDescription.CartographyDescriptionPackage#getElementRelation_RelationType()
	 * @model
	 * @generated
	 */
	RelationType getRelationType();

	/**
	 * Sets the value of the '{@link CartographyDescription.ElementRelation#getRelationType <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Type</em>' attribute.
	 * @see CartographyDescription.RelationType
	 * @see #getRelationType()
	 * @generated
	 */
	void setRelationType(RelationType value);

} // ElementRelation
