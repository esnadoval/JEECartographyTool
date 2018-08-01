/**
 */
package CartographyDescription;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CartographyDescription.StaticMetrics#getLocs <em>Locs</em>}</li>
 *   <li>{@link CartographyDescription.StaticMetrics#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see CartographyDescription.CartographyDescriptionPackage#getStaticMetrics()
 * @model
 * @generated
 */
public interface StaticMetrics extends EObject {
	/**
	 * Returns the value of the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locs</em>' attribute.
	 * @see #setLocs(long)
	 * @see CartographyDescription.CartographyDescriptionPackage#getStaticMetrics_Locs()
	 * @model
	 * @generated
	 */
	long getLocs();

	/**
	 * Sets the value of the '{@link CartographyDescription.StaticMetrics#getLocs <em>Locs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locs</em>' attribute.
	 * @see #getLocs()
	 * @generated
	 */
	void setLocs(long value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(long)
	 * @see CartographyDescription.CartographyDescriptionPackage#getStaticMetrics_Comments()
	 * @model
	 * @generated
	 */
	long getComments();

	/**
	 * Sets the value of the '{@link CartographyDescription.StaticMetrics#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(long value);

} // StaticMetrics
