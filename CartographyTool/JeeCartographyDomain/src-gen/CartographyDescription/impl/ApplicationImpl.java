/**
 */
package CartographyDescription.impl;

import CartographyDescription.Application;
import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.ElementRelation;
import CartographyDescription.Layer;
import CartographyDescription.Module;
import CartographyDescription.Pattern;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CartographyDescription.impl.ApplicationImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link CartographyDescription.impl.ApplicationImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link CartographyDescription.impl.ApplicationImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 *   <li>{@link CartographyDescription.impl.ApplicationImpl#getAppRelations <em>App Relations</em>}</li>
 *   <li>{@link CartographyDescription.impl.ApplicationImpl#getPaterns <em>Paterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends CartographyElementImpl implements Application {
	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> layers;

	/**
	 * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CartographyDescription.Class> compilationUnits;

	/**
	 * The cached value of the '{@link #getAppRelations() <em>App Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementRelation> appRelations;

	/**
	 * The cached value of the '{@link #getPaterns() <em>Paterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaterns()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> paterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CartographyDescriptionPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<Module>(Module.class, this, CartographyDescriptionPackage.APPLICATION__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layer> getLayers() {
		if (layers == null) {
			layers = new EObjectContainmentEList<Layer>(Layer.class, this, CartographyDescriptionPackage.APPLICATION__LAYERS);
		}
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CartographyDescription.Class> getCompilationUnits() {
		if (compilationUnits == null) {
			compilationUnits = new EObjectContainmentEList<CartographyDescription.Class>(CartographyDescription.Class.class, this, CartographyDescriptionPackage.APPLICATION__COMPILATION_UNITS);
		}
		return compilationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementRelation> getAppRelations() {
		if (appRelations == null) {
			appRelations = new EObjectContainmentEList<ElementRelation>(ElementRelation.class, this, CartographyDescriptionPackage.APPLICATION__APP_RELATIONS);
		}
		return appRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getPaterns() {
		if (paterns == null) {
			paterns = new EObjectContainmentEList<Pattern>(Pattern.class, this, CartographyDescriptionPackage.APPLICATION__PATERNS);
		}
		return paterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CartographyDescriptionPackage.APPLICATION__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case CartographyDescriptionPackage.APPLICATION__LAYERS:
				return ((InternalEList<?>)getLayers()).basicRemove(otherEnd, msgs);
			case CartographyDescriptionPackage.APPLICATION__COMPILATION_UNITS:
				return ((InternalEList<?>)getCompilationUnits()).basicRemove(otherEnd, msgs);
			case CartographyDescriptionPackage.APPLICATION__APP_RELATIONS:
				return ((InternalEList<?>)getAppRelations()).basicRemove(otherEnd, msgs);
			case CartographyDescriptionPackage.APPLICATION__PATERNS:
				return ((InternalEList<?>)getPaterns()).basicRemove(otherEnd, msgs);
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
			case CartographyDescriptionPackage.APPLICATION__MODULES:
				return getModules();
			case CartographyDescriptionPackage.APPLICATION__LAYERS:
				return getLayers();
			case CartographyDescriptionPackage.APPLICATION__COMPILATION_UNITS:
				return getCompilationUnits();
			case CartographyDescriptionPackage.APPLICATION__APP_RELATIONS:
				return getAppRelations();
			case CartographyDescriptionPackage.APPLICATION__PATERNS:
				return getPaterns();
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
			case CartographyDescriptionPackage.APPLICATION__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
				return;
			case CartographyDescriptionPackage.APPLICATION__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection<? extends Layer>)newValue);
				return;
			case CartographyDescriptionPackage.APPLICATION__COMPILATION_UNITS:
				getCompilationUnits().clear();
				getCompilationUnits().addAll((Collection<? extends CartographyDescription.Class>)newValue);
				return;
			case CartographyDescriptionPackage.APPLICATION__APP_RELATIONS:
				getAppRelations().clear();
				getAppRelations().addAll((Collection<? extends ElementRelation>)newValue);
				return;
			case CartographyDescriptionPackage.APPLICATION__PATERNS:
				getPaterns().clear();
				getPaterns().addAll((Collection<? extends Pattern>)newValue);
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
			case CartographyDescriptionPackage.APPLICATION__MODULES:
				getModules().clear();
				return;
			case CartographyDescriptionPackage.APPLICATION__LAYERS:
				getLayers().clear();
				return;
			case CartographyDescriptionPackage.APPLICATION__COMPILATION_UNITS:
				getCompilationUnits().clear();
				return;
			case CartographyDescriptionPackage.APPLICATION__APP_RELATIONS:
				getAppRelations().clear();
				return;
			case CartographyDescriptionPackage.APPLICATION__PATERNS:
				getPaterns().clear();
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
			case CartographyDescriptionPackage.APPLICATION__MODULES:
				return modules != null && !modules.isEmpty();
			case CartographyDescriptionPackage.APPLICATION__LAYERS:
				return layers != null && !layers.isEmpty();
			case CartographyDescriptionPackage.APPLICATION__COMPILATION_UNITS:
				return compilationUnits != null && !compilationUnits.isEmpty();
			case CartographyDescriptionPackage.APPLICATION__APP_RELATIONS:
				return appRelations != null && !appRelations.isEmpty();
			case CartographyDescriptionPackage.APPLICATION__PATERNS:
				return paterns != null && !paterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
