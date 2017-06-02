/**
 */
package CartographyDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartography Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CartographyDescription.CartographyElement#getWeight <em>Weight</em>}</li>
 *   <li>{@link CartographyDescription.CartographyElement#getName <em>Name</em>}</li>
 *   <li>{@link CartographyDescription.CartographyElement#getMaxWeight <em>Max Weight</em>}</li>
 *   <li>{@link CartographyDescription.CartographyElement#getMigRelations <em>Mig Relations</em>}</li>
 *   <li>{@link CartographyDescription.CartographyElement#getParentLayer <em>Parent Layer</em>}</li>
 *   <li>{@link CartographyDescription.CartographyElement#getParentModule <em>Parent Module</em>}</li>
 *   <li>{@link CartographyDescription.CartographyElement#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link CartographyDescription.CartographyElement#getNewFilePath <em>New File Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getCartographyElement()
 * @model
 * @generated
 */
public interface CartographyElement extends StaticMetrics, AnnotatedObject {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(long)
	 * @see CartographyDescription.CartographyDescriptionPackage#getCartographyElement_Weight()
	 * @model
	 * @generated
	 */
	long getWeight();

	/**
	 * Sets the value of the '{@link CartographyDescription.CartographyElement#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(long value);

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
	 * @see CartographyDescription.CartographyDescriptionPackage#getCartographyElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CartographyDescription.CartographyElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Weight</em>' attribute.
	 * @see #setMaxWeight(long)
	 * @see CartographyDescription.CartographyDescriptionPackage#getCartographyElement_MaxWeight()
	 * @model
	 * @generated
	 */
	long getMaxWeight();

	/**
	 * Sets the value of the '{@link CartographyDescription.CartographyElement#getMaxWeight <em>Max Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Weight</em>' attribute.
	 * @see #getMaxWeight()
	 * @generated
	 */
	void setMaxWeight(long value);

	/**
	 * Returns the value of the '<em><b>Mig Relations</b></em>' reference list.
	 * The list contents are of type {@link CartographyDescription.ElementRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mig Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mig Relations</em>' reference list.
	 * @see CartographyDescription.CartographyDescriptionPackage#getCartographyElement_MigRelations()
	 * @model
	 * @generated
	 */
	EList<ElementRelation> getMigRelations();

	/**
	 * Returns the value of the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Layer</em>' reference.
	 * @see #setParentLayer(Layer)
	 * @see CartographyDescription.CartographyDescriptionPackage#getCartographyElement_ParentLayer()
	 * @model
	 * @generated
	 */
	Layer getParentLayer();

	/**
	 * Sets the value of the '{@link CartographyDescription.CartographyElement#getParentLayer <em>Parent Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Layer</em>' reference.
	 * @see #getParentLayer()
	 * @generated
	 */
	void setParentLayer(Layer value);

	/**
	 * Returns the value of the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Module</em>' reference.
	 * @see #setParentModule(Module)
	 * @see CartographyDescription.CartographyDescriptionPackage#getCartographyElement_ParentModule()
	 * @model
	 * @generated
	 */
	Module getParentModule();

	/**
	 * Sets the value of the '{@link CartographyDescription.CartographyElement#getParentModule <em>Parent Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Module</em>' reference.
	 * @see #getParentModule()
	 * @generated
	 */
	void setParentModule(Module value);

	/**
	 * Returns the value of the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Path</em>' attribute.
	 * @see #setOriginalFilePath(String)
	 * @see CartographyDescription.CartographyDescriptionPackage#getCartographyElement_OriginalFilePath()
	 * @model
	 * @generated
	 */
	String getOriginalFilePath();

	/**
	 * Sets the value of the '{@link CartographyDescription.CartographyElement#getOriginalFilePath <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original File Path</em>' attribute.
	 * @see #getOriginalFilePath()
	 * @generated
	 */
	void setOriginalFilePath(String value);

	/**
	 * Returns the value of the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New File Path</em>' attribute.
	 * @see #setNewFilePath(String)
	 * @see CartographyDescription.CartographyDescriptionPackage#getCartographyElement_NewFilePath()
	 * @model
	 * @generated
	 */
	String getNewFilePath();

	/**
	 * Sets the value of the '{@link CartographyDescription.CartographyElement#getNewFilePath <em>New File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New File Path</em>' attribute.
	 * @see #getNewFilePath()
	 * @generated
	 */
	void setNewFilePath(String value);

} // CartographyElement
