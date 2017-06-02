/**
 */
package CartographyDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CartographyDescription.Application#getModules <em>Modules</em>}</li>
 *   <li>{@link CartographyDescription.Application#getLayers <em>Layers</em>}</li>
 *   <li>{@link CartographyDescription.Application#getCompilationUnits <em>Compilation Units</em>}</li>
 *   <li>{@link CartographyDescription.Application#getAppRelations <em>App Relations</em>}</li>
 *   <li>{@link CartographyDescription.Application#getPaterns <em>Paterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends CartographyElement {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getApplication_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getModules();

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
	 * @see CartographyDescription.CartographyDescriptionPackage#getApplication_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getApplication_CompilationUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<CartographyDescription.Class> getCompilationUnits();

	/**
	 * Returns the value of the '<em><b>App Relations</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.ElementRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Relations</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getApplication_AppRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementRelation> getAppRelations();

	/**
	 * Returns the value of the '<em><b>Paterns</b></em>' containment reference list.
	 * The list contents are of type {@link CartographyDescription.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paterns</em>' containment reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getApplication_Paterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern> getPaterns();

} // Application
