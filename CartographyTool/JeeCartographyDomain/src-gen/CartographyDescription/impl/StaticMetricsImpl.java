/**
 */
package CartographyDescription.impl;

import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.StaticMetrics;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Metrics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CartographyDescription.impl.StaticMetricsImpl#getLocs <em>Locs</em>}</li>
 *   <li>{@link CartographyDescription.impl.StaticMetricsImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticMetricsImpl extends MinimalEObjectImpl.Container implements StaticMetrics {
	/**
	 * The default value of the '{@link #getLocs() <em>Locs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocs()
	 * @generated
	 * @ordered
	 */
	protected static final long LOCS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLocs() <em>Locs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocs()
	 * @generated
	 * @ordered
	 */
	protected long locs = LOCS_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final long COMMENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected long comments = COMMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticMetricsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CartographyDescriptionPackage.Literals.STATIC_METRICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLocs() {
		return locs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocs(long newLocs) {
		long oldLocs = locs;
		locs = newLocs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.STATIC_METRICS__LOCS, oldLocs, locs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(long newComments) {
		long oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.STATIC_METRICS__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CartographyDescriptionPackage.STATIC_METRICS__LOCS:
				return getLocs();
			case CartographyDescriptionPackage.STATIC_METRICS__COMMENTS:
				return getComments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CartographyDescriptionPackage.STATIC_METRICS__LOCS:
				setLocs((Long)newValue);
				return;
			case CartographyDescriptionPackage.STATIC_METRICS__COMMENTS:
				setComments((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CartographyDescriptionPackage.STATIC_METRICS__LOCS:
				setLocs(LOCS_EDEFAULT);
				return;
			case CartographyDescriptionPackage.STATIC_METRICS__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CartographyDescriptionPackage.STATIC_METRICS__LOCS:
				return locs != LOCS_EDEFAULT;
			case CartographyDescriptionPackage.STATIC_METRICS__COMMENTS:
				return comments != COMMENTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (locs: ");
		result.append(locs);
		result.append(", comments: ");
		result.append(comments);
		result.append(')');
		return result.toString();
	}

} //StaticMetricsImpl
