/**
 */
package CartographyDescription.util;

import CartographyDescription.AnnotatedObject;
import CartographyDescription.Annotation;
import CartographyDescription.AnnotationParameter;
import CartographyDescription.Application;
import CartographyDescription.Attribute;
import CartographyDescription.Bussiness;
import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.CartographyElement;
import CartographyDescription.ElementRelation;
import CartographyDescription.Entity;
import CartographyDescription.Interface;
import CartographyDescription.Layer;
import CartographyDescription.Method;
import CartographyDescription.Module;
import CartographyDescription.Pattern;
import CartographyDescription.PersistenceManager;
import CartographyDescription.Service;
import CartographyDescription.StaticMetrics;
import CartographyDescription.UI;
import CartographyDescription.UnitTest;
import CartographyDescription.VarType;
import CartographyDescription.Variable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CartographyDescription.CartographyDescriptionPackage
 * @generated
 */
public class CartographyDescriptionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CartographyDescriptionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartographyDescriptionSwitch() {
		if (modelPackage == null) {
			modelPackage = CartographyDescriptionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CartographyDescriptionPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = caseCartographyElement(application);
				if (result == null) result = caseStaticMetrics(application);
				if (result == null) result = caseAnnotatedObject(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseCartographyElement(module);
				if (result == null) result = caseStaticMetrics(module);
				if (result == null) result = caseAnnotatedObject(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = caseCartographyElement(pattern);
				if (result == null) result = caseStaticMetrics(pattern);
				if (result == null) result = caseAnnotatedObject(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseClass(entity);
				if (result == null) result = caseCartographyElement(entity);
				if (result == null) result = caseStaticMetrics(entity);
				if (result == null) result = caseAnnotatedObject(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.BUSSINESS: {
				Bussiness bussiness = (Bussiness)theEObject;
				T result = caseBussiness(bussiness);
				if (result == null) result = caseClass(bussiness);
				if (result == null) result = caseCartographyElement(bussiness);
				if (result == null) result = caseStaticMetrics(bussiness);
				if (result == null) result = caseAnnotatedObject(bussiness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.UI: {
				UI ui = (UI)theEObject;
				T result = caseUI(ui);
				if (result == null) result = caseClass(ui);
				if (result == null) result = caseCartographyElement(ui);
				if (result == null) result = caseStaticMetrics(ui);
				if (result == null) result = caseAnnotatedObject(ui);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.CLASS: {
				CartographyDescription.Class class_ = (CartographyDescription.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseCartographyElement(class_);
				if (result == null) result = caseStaticMetrics(class_);
				if (result == null) result = caseAnnotatedObject(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.LAYER: {
				Layer layer = (Layer)theEObject;
				T result = caseLayer(layer);
				if (result == null) result = caseCartographyElement(layer);
				if (result == null) result = caseStaticMetrics(layer);
				if (result == null) result = caseAnnotatedObject(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseAnnotatedObject(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseClass(service);
				if (result == null) result = caseCartographyElement(service);
				if (result == null) result = caseStaticMetrics(service);
				if (result == null) result = caseAnnotatedObject(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseCartographyElement(method);
				if (result == null) result = caseStaticMetrics(method);
				if (result == null) result = caseAnnotatedObject(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseClass(interface_);
				if (result == null) result = caseCartographyElement(interface_);
				if (result == null) result = caseStaticMetrics(interface_);
				if (result == null) result = caseAnnotatedObject(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.ELEMENT_RELATION: {
				ElementRelation elementRelation = (ElementRelation)theEObject;
				T result = caseElementRelation(elementRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.UNIT_TEST: {
				UnitTest unitTest = (UnitTest)theEObject;
				T result = caseUnitTest(unitTest);
				if (result == null) result = caseClass(unitTest);
				if (result == null) result = caseCartographyElement(unitTest);
				if (result == null) result = caseStaticMetrics(unitTest);
				if (result == null) result = caseAnnotatedObject(unitTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.VAR_TYPE: {
				VarType varType = (VarType)theEObject;
				T result = caseVarType(varType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.STATIC_METRICS: {
				StaticMetrics staticMetrics = (StaticMetrics)theEObject;
				T result = caseStaticMetrics(staticMetrics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.ANNOTATED_OBJECT: {
				AnnotatedObject annotatedObject = (AnnotatedObject)theEObject;
				T result = caseAnnotatedObject(annotatedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT: {
				CartographyElement cartographyElement = (CartographyElement)theEObject;
				T result = caseCartographyElement(cartographyElement);
				if (result == null) result = caseStaticMetrics(cartographyElement);
				if (result == null) result = caseAnnotatedObject(cartographyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.PERSISTENCE_MANAGER: {
				PersistenceManager persistenceManager = (PersistenceManager)theEObject;
				T result = casePersistenceManager(persistenceManager);
				if (result == null) result = caseClass(persistenceManager);
				if (result == null) result = caseCartographyElement(persistenceManager);
				if (result == null) result = caseStaticMetrics(persistenceManager);
				if (result == null) result = caseAnnotatedObject(persistenceManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.ANNOTATION_PARAMETER: {
				AnnotationParameter annotationParameter = (AnnotationParameter)theEObject;
				T result = caseAnnotationParameter(annotationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CartographyDescriptionPackage.EXCEPTION: {
				CartographyDescription.Exception exception = (CartographyDescription.Exception)theEObject;
				T result = caseException(exception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bussiness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bussiness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBussiness(Bussiness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUI(UI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(CartographyDescription.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementRelation(ElementRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitTest(UnitTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarType(VarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Metrics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticMetrics(StaticMetrics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotatedObject(AnnotatedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartography Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartography Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartographyElement(CartographyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceManager(PersistenceManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationParameter(AnnotationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseException(CartographyDescription.Exception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CartographyDescriptionSwitch
