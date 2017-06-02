/**
 */
package CartographyDescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CartographyDescription.AnnotatedObject#getAnotations <em>Anotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getAnnotatedObject()
 * @model
 * @generated
 */
public interface AnnotatedObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Anotations</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anotations</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getAnnotatedObject_Anotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnotations();

} // AnnotatedObject
