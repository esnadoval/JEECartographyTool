/**
 */
package CartographyDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CartographyDescription.Layer#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends CartographyElement {
	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' reference list.
	 * The list contents are of type {@link CartographyDescription.CartographyElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getLayer_CompilationUnits()
	 * @model
	 * @generated
	 */
	EList<CartographyElement> getCompilationUnits();

} // Layer
