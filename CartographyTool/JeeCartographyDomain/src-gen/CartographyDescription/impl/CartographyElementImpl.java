/**
 */
package CartographyDescription.impl;

import CartographyDescription.AnnotatedObject;
import CartographyDescription.Annotation;
import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.CartographyElement;
import CartographyDescription.ElementRelation;
import CartographyDescription.Layer;
import CartographyDescription.Module;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartography Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CartographyDescription.impl.CartographyElementImpl#getAnotations <em>Anotations</em>}</li>
 *   <li>{@link CartographyDescription.impl.CartographyElementImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link CartographyDescription.impl.CartographyElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link CartographyDescription.impl.CartographyElementImpl#getMaxWeight <em>Max Weight</em>}</li>
 *   <li>{@link CartographyDescription.impl.CartographyElementImpl#getMigRelations <em>Mig Relations</em>}</li>
 *   <li>{@link CartographyDescription.impl.CartographyElementImpl#getParentLayer <em>Parent Layer</em>}</li>
 *   <li>{@link CartographyDescription.impl.CartographyElementImpl#getParentModule <em>Parent Module</em>}</li>
 *   <li>{@link CartographyDescription.impl.CartographyElementImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link CartographyDescription.impl.CartographyElementImpl#getNewFilePath <em>New File Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CartographyElementImpl extends StaticMetricsImpl implements CartographyElement {
	/**
	 * The cached value of the '{@link #getAnotations() <em>Anotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> anotations;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final long WEIGHT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected long weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxWeight() <em>Max Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWeight()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_WEIGHT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxWeight() <em>Max Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWeight()
	 * @generated
	 * @ordered
	 */
	protected long maxWeight = MAX_WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMigRelations() <em>Mig Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementRelation> migRelations;

	/**
	 * The cached value of the '{@link #getParentLayer() <em>Parent Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentLayer()
	 * @generated
	 * @ordered
	 */
	protected Layer parentLayer;

	/**
	 * The cached value of the '{@link #getParentModule() <em>Parent Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentModule()
	 * @generated
	 * @ordered
	 */
	protected Module parentModule;

	/**
	 * The default value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected String originalFilePath = ORIGINAL_FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewFilePath() <em>New File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewFilePath() <em>New File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewFilePath()
	 * @generated
	 * @ordered
	 */
	protected String newFilePath = NEW_FILE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartographyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CartographyDescriptionPackage.Literals.CARTOGRAPHY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnotations() {
		if (anotations == null) {
			anotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ANOTATIONS);
		}
		return anotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(long newWeight) {
		long oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxWeight() {
		return maxWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxWeight(long newMaxWeight) {
		long oldMaxWeight = maxWeight;
		maxWeight = newMaxWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__MAX_WEIGHT, oldMaxWeight, maxWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementRelation> getMigRelations() {
		if (migRelations == null) {
			migRelations = new EObjectResolvingEList<ElementRelation>(ElementRelation.class, this, CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__MIG_RELATIONS);
		}
		return migRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer getParentLayer() {
		if (parentLayer != null && parentLayer.eIsProxy()) {
			InternalEObject oldParentLayer = (InternalEObject)parentLayer;
			parentLayer = (Layer)eResolveProxy(oldParentLayer);
			if (parentLayer != oldParentLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_LAYER, oldParentLayer, parentLayer));
			}
		}
		return parentLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer basicGetParentLayer() {
		return parentLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentLayer(Layer newParentLayer) {
		Layer oldParentLayer = parentLayer;
		parentLayer = newParentLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_LAYER, oldParentLayer, parentLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getParentModule() {
		if (parentModule != null && parentModule.eIsProxy()) {
			InternalEObject oldParentModule = (InternalEObject)parentModule;
			parentModule = (Module)eResolveProxy(oldParentModule);
			if (parentModule != oldParentModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_MODULE, oldParentModule, parentModule));
			}
		}
		return parentModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetParentModule() {
		return parentModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentModule(Module newParentModule) {
		Module oldParentModule = parentModule;
		parentModule = newParentModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_MODULE, oldParentModule, parentModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalFilePath() {
		return originalFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalFilePath(String newOriginalFilePath) {
		String oldOriginalFilePath = originalFilePath;
		originalFilePath = newOriginalFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH, oldOriginalFilePath, originalFilePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewFilePath() {
		return newFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewFilePath(String newNewFilePath) {
		String oldNewFilePath = newFilePath;
		newFilePath = newNewFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NEW_FILE_PATH, oldNewFilePath, newFilePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ANOTATIONS:
				return ((InternalEList<?>)getAnotations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ANOTATIONS:
				return getAnotations();
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__WEIGHT:
				return getWeight();
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NAME:
				return getName();
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__MAX_WEIGHT:
				return getMaxWeight();
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__MIG_RELATIONS:
				return getMigRelations();
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_LAYER:
				if (resolve) return getParentLayer();
				return basicGetParentLayer();
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_MODULE:
				if (resolve) return getParentModule();
				return basicGetParentModule();
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH:
				return getOriginalFilePath();
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NEW_FILE_PATH:
				return getNewFilePath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ANOTATIONS:
				getAnotations().clear();
				getAnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__WEIGHT:
				setWeight((Long)newValue);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__MAX_WEIGHT:
				setMaxWeight((Long)newValue);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__MIG_RELATIONS:
				getMigRelations().clear();
				getMigRelations().addAll((Collection<? extends ElementRelation>)newValue);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_LAYER:
				setParentLayer((Layer)newValue);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_MODULE:
				setParentModule((Module)newValue);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH:
				setOriginalFilePath((String)newValue);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NEW_FILE_PATH:
				setNewFilePath((String)newValue);
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
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ANOTATIONS:
				getAnotations().clear();
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__MAX_WEIGHT:
				setMaxWeight(MAX_WEIGHT_EDEFAULT);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__MIG_RELATIONS:
				getMigRelations().clear();
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_LAYER:
				setParentLayer((Layer)null);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_MODULE:
				setParentModule((Module)null);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH:
				setOriginalFilePath(ORIGINAL_FILE_PATH_EDEFAULT);
				return;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NEW_FILE_PATH:
				setNewFilePath(NEW_FILE_PATH_EDEFAULT);
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
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ANOTATIONS:
				return anotations != null && !anotations.isEmpty();
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__MAX_WEIGHT:
				return maxWeight != MAX_WEIGHT_EDEFAULT;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__MIG_RELATIONS:
				return migRelations != null && !migRelations.isEmpty();
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_LAYER:
				return parentLayer != null;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__PARENT_MODULE:
				return parentModule != null;
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH:
				return ORIGINAL_FILE_PATH_EDEFAULT == null ? originalFilePath != null : !ORIGINAL_FILE_PATH_EDEFAULT.equals(originalFilePath);
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__NEW_FILE_PATH:
				return NEW_FILE_PATH_EDEFAULT == null ? newFilePath != null : !NEW_FILE_PATH_EDEFAULT.equals(newFilePath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotatedObject.class) {
			switch (derivedFeatureID) {
				case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ANOTATIONS: return CartographyDescriptionPackage.ANNOTATED_OBJECT__ANOTATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotatedObject.class) {
			switch (baseFeatureID) {
				case CartographyDescriptionPackage.ANNOTATED_OBJECT__ANOTATIONS: return CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT__ANOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(", name: ");
		result.append(name);
		result.append(", maxWeight: ");
		result.append(maxWeight);
		result.append(", originalFilePath: ");
		result.append(originalFilePath);
		result.append(", newFilePath: ");
		result.append(newFilePath);
		result.append(')');
		return result.toString();
	}

} //CartographyElementImpl
