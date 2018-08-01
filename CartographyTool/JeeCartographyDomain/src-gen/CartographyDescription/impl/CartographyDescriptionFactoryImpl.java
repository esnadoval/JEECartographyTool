/**
 */
package CartographyDescription.impl;

import CartographyDescription.AnnotatedObject;
import CartographyDescription.Annotation;
import CartographyDescription.AnnotationParameter;
import CartographyDescription.Application;
import CartographyDescription.Attribute;
import CartographyDescription.Bussiness;
import CartographyDescription.CartographyDescriptionFactory;
import CartographyDescription.CartographyDescriptionPackage;
import CartographyDescription.CartographyElement;
import CartographyDescription.Constructor;
import CartographyDescription.ElementRelation;
import CartographyDescription.Entity;
import CartographyDescription.EnumLiteral;
import CartographyDescription.EnumLiteralvalue;
import CartographyDescription.Enumeration;
import CartographyDescription.Inhertance;
import CartographyDescription.Interface;
import CartographyDescription.Layer;
import CartographyDescription.Method;
import CartographyDescription.Module;
import CartographyDescription.Pattern;
import CartographyDescription.PersistenceManager;
import CartographyDescription.RelationType;
import CartographyDescription.Service;
import CartographyDescription.StaticMetrics;
import CartographyDescription.UI;
import CartographyDescription.UnitTest;
import CartographyDescription.VarType;
import CartographyDescription.Variable;
import CartographyDescription.Visibility;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartographyDescriptionFactoryImpl extends EFactoryImpl implements CartographyDescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CartographyDescriptionFactory init() {
		try {
			CartographyDescriptionFactory theCartographyDescriptionFactory = (CartographyDescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(CartographyDescriptionPackage.eNS_URI);
			if (theCartographyDescriptionFactory != null) {
				return theCartographyDescriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CartographyDescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartographyDescriptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CartographyDescriptionPackage.APPLICATION: return createApplication();
			case CartographyDescriptionPackage.MODULE: return createModule();
			case CartographyDescriptionPackage.PATTERN: return createPattern();
			case CartographyDescriptionPackage.ENTITY: return createEntity();
			case CartographyDescriptionPackage.BUSSINESS: return createBussiness();
			case CartographyDescriptionPackage.UI: return createUI();
			case CartographyDescriptionPackage.CLASS: return createClass();
			case CartographyDescriptionPackage.LAYER: return createLayer();
			case CartographyDescriptionPackage.ATTRIBUTE: return createAttribute();
			case CartographyDescriptionPackage.SERVICE: return createService();
			case CartographyDescriptionPackage.METHOD: return createMethod();
			case CartographyDescriptionPackage.ANNOTATION: return createAnnotation();
			case CartographyDescriptionPackage.VARIABLE: return createVariable();
			case CartographyDescriptionPackage.INTERFACE: return createInterface();
			case CartographyDescriptionPackage.ELEMENT_RELATION: return createElementRelation();
			case CartographyDescriptionPackage.UNIT_TEST: return createUnitTest();
			case CartographyDescriptionPackage.VAR_TYPE: return createVarType();
			case CartographyDescriptionPackage.STATIC_METRICS: return createStaticMetrics();
			case CartographyDescriptionPackage.ANNOTATED_OBJECT: return createAnnotatedObject();
			case CartographyDescriptionPackage.CARTOGRAPHY_ELEMENT: return createCartographyElement();
			case CartographyDescriptionPackage.PERSISTENCE_MANAGER: return createPersistenceManager();
			case CartographyDescriptionPackage.ANNOTATION_PARAMETER: return createAnnotationParameter();
			case CartographyDescriptionPackage.EXCEPTION: return createException();
			case CartographyDescriptionPackage.ENUMERATION: return createEnumeration();
			case CartographyDescriptionPackage.ENUM_LITERAL: return createEnumLiteral();
			case CartographyDescriptionPackage.ENUM_LITERALVALUE: return createEnumLiteralvalue();
			case CartographyDescriptionPackage.CONSTRUCTOR: return createConstructor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CartographyDescriptionPackage.RELATION_TYPE:
				return createRelationTypeFromString(eDataType, initialValue);
			case CartographyDescriptionPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case CartographyDescriptionPackage.INHERTANCE:
				return createInhertanceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CartographyDescriptionPackage.RELATION_TYPE:
				return convertRelationTypeToString(eDataType, instanceValue);
			case CartographyDescriptionPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case CartographyDescriptionPackage.INHERTANCE:
				return convertInhertanceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bussiness createBussiness() {
		BussinessImpl bussiness = new BussinessImpl();
		return bussiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI createUI() {
		UIImpl ui = new UIImpl();
		return ui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartographyDescription.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementRelation createElementRelation() {
		ElementRelationImpl elementRelation = new ElementRelationImpl();
		return elementRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTest createUnitTest() {
		UnitTestImpl unitTest = new UnitTestImpl();
		return unitTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType createVarType() {
		VarTypeImpl varType = new VarTypeImpl();
		return varType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticMetrics createStaticMetrics() {
		StaticMetricsImpl staticMetrics = new StaticMetricsImpl();
		return staticMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedObject createAnnotatedObject() {
		AnnotatedObjectImpl annotatedObject = new AnnotatedObjectImpl();
		return annotatedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartographyElement createCartographyElement() {
		CartographyElementImpl cartographyElement = new CartographyElementImpl();
		return cartographyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceManager createPersistenceManager() {
		PersistenceManagerImpl persistenceManager = new PersistenceManagerImpl();
		return persistenceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationParameter createAnnotationParameter() {
		AnnotationParameterImpl annotationParameter = new AnnotationParameterImpl();
		return annotationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartographyDescription.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralvalue createEnumLiteralvalue() {
		EnumLiteralvalueImpl enumLiteralvalue = new EnumLiteralvalueImpl();
		return enumLiteralvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType createRelationTypeFromString(EDataType eDataType, String initialValue) {
		RelationType result = RelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inhertance createInhertanceFromString(EDataType eDataType, String initialValue) {
		Inhertance result = Inhertance.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInhertanceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartographyDescriptionPackage getCartographyDescriptionPackage() {
		return (CartographyDescriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CartographyDescriptionPackage getPackage() {
		return CartographyDescriptionPackage.eINSTANCE;
	}

} //CartographyDescriptionFactoryImpl
