/**
 */
package CartographyDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CartographyDescription.Module#getSubModules <em>Sub Modules</em>}</li>
 *   <li>{@link CartographyDescription.Module#getCartographyElements <em>Cartography Elements</em>}</li>
 *   <li>{@link CartographyDescription.Module#getLayers <em>Layers</em>}</li>
 * </ul>
 * </p>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends CartographyElement {
	/**
	 * Returns the value of the '<em><b>Sub Modules</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Modules</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getModule_SubModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getSubModules();

	/**
	 * Returns the value of the '<em><b>Cartography Elements</b></em>' reference list.
	 * The list contents are of type {@link CartographyDescription.CartographyElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cartography Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartography Elements</em>' reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getModule_CartographyElements()
	 * @model
	 * @generated
	 */
	EList<CartographyElement> getCartographyElements();

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getModule_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

} // Module
