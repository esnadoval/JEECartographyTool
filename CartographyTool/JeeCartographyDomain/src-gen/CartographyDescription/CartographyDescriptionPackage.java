/**
 */
package CartographyDescription;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CartographyDescription.CartographyDescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface CartographyDescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CartographyDescription";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.csw.uniandes.edu.co/CartographyDescription/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CartDesc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CartographyDescriptionPackage eINSTANCE = CartographyDescription.impl.CartographyDescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.StaticMetricsImpl <em>Static Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.StaticMetricsImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getStaticMetrics()
	 * @generated
	 */
	int STATIC_METRICS = 17;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METRICS__LOCS = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METRICS__COMMENTS = 1;

	/**
	 * The number of structural features of the '<em>Static Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METRICS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Static Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_METRICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.CartographyElementImpl <em>Cartography Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.CartographyElementImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getCartographyElement()
	 * @generated
	 */
	int CARTOGRAPHY_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT__LOCS = STATIC_METRICS__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT__COMMENTS = STATIC_METRICS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT__ANOTATIONS = STATIC_METRICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT__WEIGHT = STATIC_METRICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT__NAME = STATIC_METRICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT__MAX_WEIGHT = STATIC_METRICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT__MIG_RELATIONS = STATIC_METRICS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT__PARENT_LAYER = STATIC_METRICS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT__PARENT_MODULE = STATIC_METRICS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH = STATIC_METRICS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT__NEW_FILE_PATH = STATIC_METRICS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Cartography Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT_FEATURE_COUNT = STATIC_METRICS_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Cartography Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTOGRAPHY_ELEMENT_OPERATION_COUNT = STATIC_METRICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.ApplicationImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LOCS = CARTOGRAPHY_ELEMENT__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMMENTS = CARTOGRAPHY_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ANOTATIONS = CARTOGRAPHY_ELEMENT__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__WEIGHT = CARTOGRAPHY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = CARTOGRAPHY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MAX_WEIGHT = CARTOGRAPHY_ELEMENT__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MIG_RELATIONS = CARTOGRAPHY_ELEMENT__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PARENT_LAYER = CARTOGRAPHY_ELEMENT__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PARENT_MODULE = CARTOGRAPHY_ELEMENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ORIGINAL_FILE_PATH = CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NEW_FILE_PATH = CARTOGRAPHY_ELEMENT__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MODULES = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LAYERS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compilation Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMPILATION_UNITS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>App Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APP_RELATIONS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Paterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PATERNS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = CARTOGRAPHY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.ModuleImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 1;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LOCS = CARTOGRAPHY_ELEMENT__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COMMENTS = CARTOGRAPHY_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ANOTATIONS = CARTOGRAPHY_ELEMENT__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__WEIGHT = CARTOGRAPHY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = CARTOGRAPHY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MAX_WEIGHT = CARTOGRAPHY_ELEMENT__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MIG_RELATIONS = CARTOGRAPHY_ELEMENT__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARENT_LAYER = CARTOGRAPHY_ELEMENT__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARENT_MODULE = CARTOGRAPHY_ELEMENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ORIGINAL_FILE_PATH = CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NEW_FILE_PATH = CARTOGRAPHY_ELEMENT__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Sub Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SUB_MODULES = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cartography Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CARTOGRAPHY_ELEMENTS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LAYERS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = CARTOGRAPHY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.PatternImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__LOCS = CARTOGRAPHY_ELEMENT__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__COMMENTS = CARTOGRAPHY_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ANOTATIONS = CARTOGRAPHY_ELEMENT__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__WEIGHT = CARTOGRAPHY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = CARTOGRAPHY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__MAX_WEIGHT = CARTOGRAPHY_ELEMENT__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__MIG_RELATIONS = CARTOGRAPHY_ELEMENT__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PARENT_LAYER = CARTOGRAPHY_ELEMENT__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PARENT_MODULE = CARTOGRAPHY_ELEMENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ORIGINAL_FILE_PATH = CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NEW_FILE_PATH = CARTOGRAPHY_ELEMENT__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__MODULES = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = CARTOGRAPHY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.ClassImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 6;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__LOCS = CARTOGRAPHY_ELEMENT__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENTS = CARTOGRAPHY_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANOTATIONS = CARTOGRAPHY_ELEMENT__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__WEIGHT = CARTOGRAPHY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CARTOGRAPHY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MAX_WEIGHT = CARTOGRAPHY_ELEMENT__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MIG_RELATIONS = CARTOGRAPHY_ELEMENT__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PARENT_LAYER = CARTOGRAPHY_ELEMENT__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PARENT_MODULE = CARTOGRAPHY_ELEMENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ORIGINAL_FILE_PATH = CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NEW_FILE_PATH = CARTOGRAPHY_ELEMENT__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VISIBILITY = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modisco Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MODISCO_CLASS_DECLARATION = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inhertance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INHERTANCE = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPLEMENTS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENDS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Original File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ORIGINAL_FILE_NAME = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = CARTOGRAPHY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.EntityImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LOCS = CLASS__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__COMMENTS = CLASS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ANOTATIONS = CLASS__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__WEIGHT = CLASS__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MAX_WEIGHT = CLASS__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MIG_RELATIONS = CLASS__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PARENT_LAYER = CLASS__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PARENT_MODULE = CLASS__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ORIGINAL_FILE_PATH = CLASS__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NEW_FILE_PATH = CLASS__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VISIBILITY = CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__METHODS = CLASS__METHODS;

	/**
	 * The feature id for the '<em><b>Modisco Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MODISCO_CLASS_DECLARATION = CLASS__MODISCO_CLASS_DECLARATION;

	/**
	 * The feature id for the '<em><b>Inhertance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INHERTANCE = CLASS__INHERTANCE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IMPLEMENTS = CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXTENDS = CLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Original File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ORIGINAL_FILE_NAME = CLASS__ORIGINAL_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Framework Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FRAMEWORK_TYPE = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Db Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DB_TABLE = CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persistence Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PERSISTENCE_MODE = CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.BussinessImpl <em>Bussiness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.BussinessImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getBussiness()
	 * @generated
	 */
	int BUSSINESS = 4;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__LOCS = CLASS__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__COMMENTS = CLASS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__ANOTATIONS = CLASS__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__WEIGHT = CLASS__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__MAX_WEIGHT = CLASS__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__MIG_RELATIONS = CLASS__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__PARENT_LAYER = CLASS__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__PARENT_MODULE = CLASS__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__ORIGINAL_FILE_PATH = CLASS__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__NEW_FILE_PATH = CLASS__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__VISIBILITY = CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__ATTRIBUTES = CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__METHODS = CLASS__METHODS;

	/**
	 * The feature id for the '<em><b>Modisco Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__MODISCO_CLASS_DECLARATION = CLASS__MODISCO_CLASS_DECLARATION;

	/**
	 * The feature id for the '<em><b>Inhertance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__INHERTANCE = CLASS__INHERTANCE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__IMPLEMENTS = CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__EXTENDS = CLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Original File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__ORIGINAL_FILE_NAME = CLASS__ORIGINAL_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Framework Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__FRAMEWORK_TYPE = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usage Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS__USAGE_STRATEGY = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bussiness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bussiness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSINESS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.UIImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getUI()
	 * @generated
	 */
	int UI = 5;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__LOCS = CLASS__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__COMMENTS = CLASS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__ANOTATIONS = CLASS__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__WEIGHT = CLASS__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__MAX_WEIGHT = CLASS__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__MIG_RELATIONS = CLASS__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__PARENT_LAYER = CLASS__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__PARENT_MODULE = CLASS__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__ORIGINAL_FILE_PATH = CLASS__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__NEW_FILE_PATH = CLASS__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__VISIBILITY = CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__ATTRIBUTES = CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__METHODS = CLASS__METHODS;

	/**
	 * The feature id for the '<em><b>Modisco Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__MODISCO_CLASS_DECLARATION = CLASS__MODISCO_CLASS_DECLARATION;

	/**
	 * The feature id for the '<em><b>Inhertance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__INHERTANCE = CLASS__INHERTANCE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__IMPLEMENTS = CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__EXTENDS = CLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Original File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__ORIGINAL_FILE_NAME = CLASS__ORIGINAL_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Framework Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__FRAMEWORK_TYPE = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__FOR_DEVICE = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.LayerImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 7;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__LOCS = CARTOGRAPHY_ELEMENT__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__COMMENTS = CARTOGRAPHY_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ANOTATIONS = CARTOGRAPHY_ELEMENT__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__WEIGHT = CARTOGRAPHY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = CARTOGRAPHY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__MAX_WEIGHT = CARTOGRAPHY_ELEMENT__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__MIG_RELATIONS = CARTOGRAPHY_ELEMENT__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__PARENT_LAYER = CARTOGRAPHY_ELEMENT__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__PARENT_MODULE = CARTOGRAPHY_ELEMENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ORIGINAL_FILE_PATH = CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NEW_FILE_PATH = CARTOGRAPHY_ELEMENT__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Compilation Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__COMPILATION_UNITS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = CARTOGRAPHY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.AnnotatedObjectImpl <em>Annotated Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.AnnotatedObjectImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getAnnotatedObject()
	 * @generated
	 */
	int ANNOTATED_OBJECT = 18;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_OBJECT__ANOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotated Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotated Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.AttributeImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANOTATIONS = ANNOTATED_OBJECT__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = ANNOTATED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VARIABLE = ANNOTATED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ANNOTATED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = ANNOTATED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.ServiceImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 9;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__LOCS = CLASS__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__COMMENTS = CLASS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ANOTATIONS = CLASS__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__WEIGHT = CLASS__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MAX_WEIGHT = CLASS__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MIG_RELATIONS = CLASS__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PARENT_LAYER = CLASS__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PARENT_MODULE = CLASS__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ORIGINAL_FILE_PATH = CLASS__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NEW_FILE_PATH = CLASS__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VISIBILITY = CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ATTRIBUTES = CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__METHODS = CLASS__METHODS;

	/**
	 * The feature id for the '<em><b>Modisco Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MODISCO_CLASS_DECLARATION = CLASS__MODISCO_CLASS_DECLARATION;

	/**
	 * The feature id for the '<em><b>Inhertance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INHERTANCE = CLASS__INHERTANCE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IMPLEMENTS = CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EXTENDS = CLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Original File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ORIGINAL_FILE_NAME = CLASS__ORIGINAL_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TYPE = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.MethodImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 10;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__LOCS = CARTOGRAPHY_ELEMENT__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__COMMENTS = CARTOGRAPHY_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ANOTATIONS = CARTOGRAPHY_ELEMENT__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__WEIGHT = CARTOGRAPHY_ELEMENT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = CARTOGRAPHY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__MAX_WEIGHT = CARTOGRAPHY_ELEMENT__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__MIG_RELATIONS = CARTOGRAPHY_ELEMENT__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARENT_LAYER = CARTOGRAPHY_ELEMENT__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARENT_MODULE = CARTOGRAPHY_ELEMENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ORIGINAL_FILE_PATH = CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NEW_FILE_PATH = CARTOGRAPHY_ELEMENT__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CODE = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inhertance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__INHERTANCE = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__EXCEPTIONS = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = CARTOGRAPHY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = CARTOGRAPHY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.AnnotationImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__PARAMS = 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.VariableImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Inhertance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INHERTANCE = 2;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__STATIC = 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.InterfaceImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 13;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__LOCS = CLASS__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__COMMENTS = CLASS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ANOTATIONS = CLASS__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__WEIGHT = CLASS__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MAX_WEIGHT = CLASS__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MIG_RELATIONS = CLASS__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PARENT_LAYER = CLASS__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PARENT_MODULE = CLASS__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ORIGINAL_FILE_PATH = CLASS__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NEW_FILE_PATH = CLASS__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__VISIBILITY = CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ATTRIBUTES = CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__METHODS = CLASS__METHODS;

	/**
	 * The feature id for the '<em><b>Modisco Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MODISCO_CLASS_DECLARATION = CLASS__MODISCO_CLASS_DECLARATION;

	/**
	 * The feature id for the '<em><b>Inhertance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INHERTANCE = CLASS__INHERTANCE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IMPLEMENTS = CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXTENDS = CLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Original File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ORIGINAL_FILE_NAME = CLASS__ORIGINAL_FILE_NAME;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.ElementRelationImpl <em>Element Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.ElementRelationImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getElementRelation()
	 * @generated
	 */
	int ELEMENT_RELATION = 14;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RELATION__SRC = 0;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RELATION__DEST = 1;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RELATION__RELATION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Element Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.UnitTestImpl <em>Unit Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.UnitTestImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getUnitTest()
	 * @generated
	 */
	int UNIT_TEST = 15;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__LOCS = CLASS__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__COMMENTS = CLASS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__ANOTATIONS = CLASS__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__WEIGHT = CLASS__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__MAX_WEIGHT = CLASS__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__MIG_RELATIONS = CLASS__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__PARENT_LAYER = CLASS__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__PARENT_MODULE = CLASS__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__ORIGINAL_FILE_PATH = CLASS__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__NEW_FILE_PATH = CLASS__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__VISIBILITY = CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__ATTRIBUTES = CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__METHODS = CLASS__METHODS;

	/**
	 * The feature id for the '<em><b>Modisco Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__MODISCO_CLASS_DECLARATION = CLASS__MODISCO_CLASS_DECLARATION;

	/**
	 * The feature id for the '<em><b>Inhertance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__INHERTANCE = CLASS__INHERTANCE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__IMPLEMENTS = CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__EXTENDS = CLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Original File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__ORIGINAL_FILE_NAME = CLASS__ORIGINAL_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__TYPE = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_FEATURE_COUNT = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.VarTypeImpl <em>Var Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.VarTypeImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getVarType()
	 * @generated
	 */
	int VAR_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.PersistenceManagerImpl <em>Persistence Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.PersistenceManagerImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getPersistenceManager()
	 * @generated
	 */
	int PERSISTENCE_MANAGER = 20;

	/**
	 * The feature id for the '<em><b>Locs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__LOCS = CLASS__LOCS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__COMMENTS = CLASS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Anotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__ANOTATIONS = CLASS__ANOTATIONS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__WEIGHT = CLASS__WEIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__MAX_WEIGHT = CLASS__MAX_WEIGHT;

	/**
	 * The feature id for the '<em><b>Mig Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__MIG_RELATIONS = CLASS__MIG_RELATIONS;

	/**
	 * The feature id for the '<em><b>Parent Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__PARENT_LAYER = CLASS__PARENT_LAYER;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__PARENT_MODULE = CLASS__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__ORIGINAL_FILE_PATH = CLASS__ORIGINAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>New File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__NEW_FILE_PATH = CLASS__NEW_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__VISIBILITY = CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__ATTRIBUTES = CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__METHODS = CLASS__METHODS;

	/**
	 * The feature id for the '<em><b>Modisco Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__MODISCO_CLASS_DECLARATION = CLASS__MODISCO_CLASS_DECLARATION;

	/**
	 * The feature id for the '<em><b>Inhertance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__INHERTANCE = CLASS__INHERTANCE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__IMPLEMENTS = CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__EXTENDS = CLASS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Original File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__ORIGINAL_FILE_NAME = CLASS__ORIGINAL_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER__PERSISTENCE_TYPE = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Persistence Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER_FEATURE_COUNT = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Persistence Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MANAGER_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.AnnotationParameterImpl <em>Annotation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.AnnotationParameterImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getAnnotationParameter()
	 * @generated
	 */
	int ANNOTATION_PARAMETER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.impl.ExceptionImpl
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CartographyDescription.RelationType <em>Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.RelationType
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 23;

	/**
	 * The meta object id for the '{@link CartographyDescription.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.Visibility
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 24;

	/**
	 * The meta object id for the '{@link CartographyDescription.Inhertance <em>Inhertance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CartographyDescription.Inhertance
	 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getInhertance()
	 * @generated
	 */
	int INHERTANCE = 25;


	/**
	 * Returns the meta object for class '{@link CartographyDescription.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see CartographyDescription.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Application#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see CartographyDescription.Application#getModules()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Application#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see CartographyDescription.Application#getLayers()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Layers();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Application#getCompilationUnits <em>Compilation Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compilation Units</em>'.
	 * @see CartographyDescription.Application#getCompilationUnits()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_CompilationUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Application#getAppRelations <em>App Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>App Relations</em>'.
	 * @see CartographyDescription.Application#getAppRelations()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_AppRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Application#getPaterns <em>Paterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paterns</em>'.
	 * @see CartographyDescription.Application#getPaterns()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Paterns();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see CartographyDescription.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Module#getSubModules <em>Sub Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Modules</em>'.
	 * @see CartographyDescription.Module#getSubModules()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_SubModules();

	/**
	 * Returns the meta object for the reference list '{@link CartographyDescription.Module#getCartographyElements <em>Cartography Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cartography Elements</em>'.
	 * @see CartographyDescription.Module#getCartographyElements()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_CartographyElements();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Module#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see CartographyDescription.Module#getLayers()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Layers();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see CartographyDescription.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the reference list '{@link CartographyDescription.Pattern#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see CartographyDescription.Pattern#getModules()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Modules();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see CartographyDescription.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Entity#getFrameworkType <em>Framework Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework Type</em>'.
	 * @see CartographyDescription.Entity#getFrameworkType()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_FrameworkType();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Entity#getDbTable <em>Db Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Table</em>'.
	 * @see CartographyDescription.Entity#getDbTable()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_DbTable();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Entity#getPersistenceMode <em>Persistence Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Mode</em>'.
	 * @see CartographyDescription.Entity#getPersistenceMode()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_PersistenceMode();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Bussiness <em>Bussiness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bussiness</em>'.
	 * @see CartographyDescription.Bussiness
	 * @generated
	 */
	EClass getBussiness();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Bussiness#getFrameworkType <em>Framework Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework Type</em>'.
	 * @see CartographyDescription.Bussiness#getFrameworkType()
	 * @see #getBussiness()
	 * @generated
	 */
	EAttribute getBussiness_FrameworkType();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Bussiness#getUsageStrategy <em>Usage Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Strategy</em>'.
	 * @see CartographyDescription.Bussiness#getUsageStrategy()
	 * @see #getBussiness()
	 * @generated
	 */
	EAttribute getBussiness_UsageStrategy();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see CartographyDescription.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.UI#getFrameworkType <em>Framework Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework Type</em>'.
	 * @see CartographyDescription.UI#getFrameworkType()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_FrameworkType();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.UI#getForDevice <em>For Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Device</em>'.
	 * @see CartographyDescription.UI#getForDevice()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_ForDevice();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see CartographyDescription.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Class#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see CartographyDescription.Class#getVisibility()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Visibility();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see CartographyDescription.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Class#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see CartographyDescription.Class#getMethods()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Methods();

	/**
	 * Returns the meta object for the containment reference '{@link CartographyDescription.Class#getModiscoClassDeclaration <em>Modisco Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modisco Class Declaration</em>'.
	 * @see CartographyDescription.Class#getModiscoClassDeclaration()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ModiscoClassDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Class#getInhertance <em>Inhertance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inhertance</em>'.
	 * @see CartographyDescription.Class#getInhertance()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Inhertance();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Class#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements</em>'.
	 * @see CartographyDescription.Class#getImplements()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Implements();

	/**
	 * Returns the meta object for the containment reference '{@link CartographyDescription.Class#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extends</em>'.
	 * @see CartographyDescription.Class#getExtends()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Extends();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Class#getOriginalFileName <em>Original File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original File Name</em>'.
	 * @see CartographyDescription.Class#getOriginalFileName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_OriginalFileName();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see CartographyDescription.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the reference list '{@link CartographyDescription.Layer#getCompilationUnits <em>Compilation Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compilation Units</em>'.
	 * @see CartographyDescription.Layer#getCompilationUnits()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_CompilationUnits();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see CartographyDescription.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Attribute#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see CartographyDescription.Attribute#getVisibility()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link CartographyDescription.Attribute#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see CartographyDescription.Attribute#getVariable()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Variable();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see CartographyDescription.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Service#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CartographyDescription.Service#getType()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Type();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see CartographyDescription.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Method#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see CartographyDescription.Method#getVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Method#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CartographyDescription.Method#getCode()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Code();

	/**
	 * Returns the meta object for the containment reference '{@link CartographyDescription.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see CartographyDescription.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see CartographyDescription.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Method#getInhertance <em>Inhertance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inhertance</em>'.
	 * @see CartographyDescription.Method#getInhertance()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Inhertance();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Method#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see CartographyDescription.Method#getExceptions()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Exceptions();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see CartographyDescription.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Annotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CartographyDescription.Annotation#getName()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Name();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Annotation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CartographyDescription.Annotation#getDescription()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.Annotation#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see CartographyDescription.Annotation#getParams()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Params();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see CartographyDescription.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CartographyDescription.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link CartographyDescription.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see CartographyDescription.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Variable#getInhertance <em>Inhertance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inhertance</em>'.
	 * @see CartographyDescription.Variable#getInhertance()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Inhertance();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Variable#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see CartographyDescription.Variable#isStatic()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Static();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see CartographyDescription.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.ElementRelation <em>Element Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Relation</em>'.
	 * @see CartographyDescription.ElementRelation
	 * @generated
	 */
	EClass getElementRelation();

	/**
	 * Returns the meta object for the reference '{@link CartographyDescription.ElementRelation#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see CartographyDescription.ElementRelation#getSrc()
	 * @see #getElementRelation()
	 * @generated
	 */
	EReference getElementRelation_Src();

	/**
	 * Returns the meta object for the reference '{@link CartographyDescription.ElementRelation#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest</em>'.
	 * @see CartographyDescription.ElementRelation#getDest()
	 * @see #getElementRelation()
	 * @generated
	 */
	EReference getElementRelation_Dest();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.ElementRelation#getRelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Type</em>'.
	 * @see CartographyDescription.ElementRelation#getRelationType()
	 * @see #getElementRelation()
	 * @generated
	 */
	EAttribute getElementRelation_RelationType();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.UnitTest <em>Unit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Test</em>'.
	 * @see CartographyDescription.UnitTest
	 * @generated
	 */
	EClass getUnitTest();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.UnitTest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CartographyDescription.UnitTest#getType()
	 * @see #getUnitTest()
	 * @generated
	 */
	EAttribute getUnitTest_Type();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Type</em>'.
	 * @see CartographyDescription.VarType
	 * @generated
	 */
	EClass getVarType();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.VarType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CartographyDescription.VarType#getName()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Name();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.StaticMetrics <em>Static Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Metrics</em>'.
	 * @see CartographyDescription.StaticMetrics
	 * @generated
	 */
	EClass getStaticMetrics();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.StaticMetrics#getLocs <em>Locs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locs</em>'.
	 * @see CartographyDescription.StaticMetrics#getLocs()
	 * @see #getStaticMetrics()
	 * @generated
	 */
	EAttribute getStaticMetrics_Locs();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.StaticMetrics#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see CartographyDescription.StaticMetrics#getComments()
	 * @see #getStaticMetrics()
	 * @generated
	 */
	EAttribute getStaticMetrics_Comments();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.AnnotatedObject <em>Annotated Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Object</em>'.
	 * @see CartographyDescription.AnnotatedObject
	 * @generated
	 */
	EClass getAnnotatedObject();

	/**
	 * Returns the meta object for the containment reference list '{@link CartographyDescription.AnnotatedObject#getAnotations <em>Anotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anotations</em>'.
	 * @see CartographyDescription.AnnotatedObject#getAnotations()
	 * @see #getAnnotatedObject()
	 * @generated
	 */
	EReference getAnnotatedObject_Anotations();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.CartographyElement <em>Cartography Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartography Element</em>'.
	 * @see CartographyDescription.CartographyElement
	 * @generated
	 */
	EClass getCartographyElement();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.CartographyElement#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see CartographyDescription.CartographyElement#getWeight()
	 * @see #getCartographyElement()
	 * @generated
	 */
	EAttribute getCartographyElement_Weight();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.CartographyElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CartographyDescription.CartographyElement#getName()
	 * @see #getCartographyElement()
	 * @generated
	 */
	EAttribute getCartographyElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.CartographyElement#getMaxWeight <em>Max Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Weight</em>'.
	 * @see CartographyDescription.CartographyElement#getMaxWeight()
	 * @see #getCartographyElement()
	 * @generated
	 */
	EAttribute getCartographyElement_MaxWeight();

	/**
	 * Returns the meta object for the reference list '{@link CartographyDescription.CartographyElement#getMigRelations <em>Mig Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mig Relations</em>'.
	 * @see CartographyDescription.CartographyElement#getMigRelations()
	 * @see #getCartographyElement()
	 * @generated
	 */
	EReference getCartographyElement_MigRelations();

	/**
	 * Returns the meta object for the reference '{@link CartographyDescription.CartographyElement#getParentLayer <em>Parent Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Layer</em>'.
	 * @see CartographyDescription.CartographyElement#getParentLayer()
	 * @see #getCartographyElement()
	 * @generated
	 */
	EReference getCartographyElement_ParentLayer();

	/**
	 * Returns the meta object for the reference '{@link CartographyDescription.CartographyElement#getParentModule <em>Parent Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Module</em>'.
	 * @see CartographyDescription.CartographyElement#getParentModule()
	 * @see #getCartographyElement()
	 * @generated
	 */
	EReference getCartographyElement_ParentModule();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.CartographyElement#getOriginalFilePath <em>Original File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original File Path</em>'.
	 * @see CartographyDescription.CartographyElement#getOriginalFilePath()
	 * @see #getCartographyElement()
	 * @generated
	 */
	EAttribute getCartographyElement_OriginalFilePath();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.CartographyElement#getNewFilePath <em>New File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New File Path</em>'.
	 * @see CartographyDescription.CartographyElement#getNewFilePath()
	 * @see #getCartographyElement()
	 * @generated
	 */
	EAttribute getCartographyElement_NewFilePath();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.PersistenceManager <em>Persistence Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Manager</em>'.
	 * @see CartographyDescription.PersistenceManager
	 * @generated
	 */
	EClass getPersistenceManager();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.PersistenceManager#getPersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Type</em>'.
	 * @see CartographyDescription.PersistenceManager#getPersistenceType()
	 * @see #getPersistenceManager()
	 * @generated
	 */
	EAttribute getPersistenceManager_PersistenceType();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.AnnotationParameter <em>Annotation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Parameter</em>'.
	 * @see CartographyDescription.AnnotationParameter
	 * @generated
	 */
	EClass getAnnotationParameter();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.AnnotationParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CartographyDescription.AnnotationParameter#getName()
	 * @see #getAnnotationParameter()
	 * @generated
	 */
	EAttribute getAnnotationParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.AnnotationParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CartographyDescription.AnnotationParameter#getValue()
	 * @see #getAnnotationParameter()
	 * @generated
	 */
	EAttribute getAnnotationParameter_Value();

	/**
	 * Returns the meta object for class '{@link CartographyDescription.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see CartographyDescription.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for the attribute '{@link CartographyDescription.Exception#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CartographyDescription.Exception#getName()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_Name();

	/**
	 * Returns the meta object for enum '{@link CartographyDescription.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Type</em>'.
	 * @see CartographyDescription.RelationType
	 * @generated
	 */
	EEnum getRelationType();

	/**
	 * Returns the meta object for enum '{@link CartographyDescription.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see CartographyDescription.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link CartographyDescription.Inhertance <em>Inhertance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inhertance</em>'.
	 * @see CartographyDescription.Inhertance
	 * @generated
	 */
	EEnum getInhertance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CartographyDescriptionFactory getCartographyDescriptionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.ApplicationImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MODULES = eINSTANCE.getApplication_Modules();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__LAYERS = eINSTANCE.getApplication_Layers();

		/**
		 * The meta object literal for the '<em><b>Compilation Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__COMPILATION_UNITS = eINSTANCE.getApplication_CompilationUnits();

		/**
		 * The meta object literal for the '<em><b>App Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__APP_RELATIONS = eINSTANCE.getApplication_AppRelations();

		/**
		 * The meta object literal for the '<em><b>Paterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PATERNS = eINSTANCE.getApplication_Paterns();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.ModuleImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Sub Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__SUB_MODULES = eINSTANCE.getModule_SubModules();

		/**
		 * The meta object literal for the '<em><b>Cartography Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CARTOGRAPHY_ELEMENTS = eINSTANCE.getModule_CartographyElements();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__LAYERS = eINSTANCE.getModule_Layers();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.PatternImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__MODULES = eINSTANCE.getPattern_Modules();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.EntityImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Framework Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__FRAMEWORK_TYPE = eINSTANCE.getEntity_FrameworkType();

		/**
		 * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DB_TABLE = eINSTANCE.getEntity_DbTable();

		/**
		 * The meta object literal for the '<em><b>Persistence Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__PERSISTENCE_MODE = eINSTANCE.getEntity_PersistenceMode();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.BussinessImpl <em>Bussiness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.BussinessImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getBussiness()
		 * @generated
		 */
		EClass BUSSINESS = eINSTANCE.getBussiness();

		/**
		 * The meta object literal for the '<em><b>Framework Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSSINESS__FRAMEWORK_TYPE = eINSTANCE.getBussiness_FrameworkType();

		/**
		 * The meta object literal for the '<em><b>Usage Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSSINESS__USAGE_STRATEGY = eINSTANCE.getBussiness_UsageStrategy();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.UIImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '<em><b>Framework Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__FRAMEWORK_TYPE = eINSTANCE.getUI_FrameworkType();

		/**
		 * The meta object literal for the '<em><b>For Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__FOR_DEVICE = eINSTANCE.getUI_ForDevice();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.ClassImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__VISIBILITY = eINSTANCE.getClass_Visibility();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__METHODS = eINSTANCE.getClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Modisco Class Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__MODISCO_CLASS_DECLARATION = eINSTANCE.getClass_ModiscoClassDeclaration();

		/**
		 * The meta object literal for the '<em><b>Inhertance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__INHERTANCE = eINSTANCE.getClass_Inhertance();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__IMPLEMENTS = eINSTANCE.getClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__EXTENDS = eINSTANCE.getClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Original File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ORIGINAL_FILE_NAME = eINSTANCE.getClass_OriginalFileName();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.LayerImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Compilation Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__COMPILATION_UNITS = eINSTANCE.getLayer_CompilationUnits();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.AttributeImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VISIBILITY = eINSTANCE.getAttribute_Visibility();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__VARIABLE = eINSTANCE.getAttribute_Variable();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.ServiceImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TYPE = eINSTANCE.getService_Type();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.MethodImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__CODE = eINSTANCE.getMethod_Code();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Inhertance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__INHERTANCE = eINSTANCE.getMethod_Inhertance();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__EXCEPTIONS = eINSTANCE.getMethod_Exceptions();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.AnnotationImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__DESCRIPTION = eINSTANCE.getAnnotation_Description();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__PARAMS = eINSTANCE.getAnnotation_Params();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.VariableImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Inhertance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__INHERTANCE = eINSTANCE.getVariable_Inhertance();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__STATIC = eINSTANCE.getVariable_Static();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.InterfaceImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.ElementRelationImpl <em>Element Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.ElementRelationImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getElementRelation()
		 * @generated
		 */
		EClass ELEMENT_RELATION = eINSTANCE.getElementRelation();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_RELATION__SRC = eINSTANCE.getElementRelation_Src();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_RELATION__DEST = eINSTANCE.getElementRelation_Dest();

		/**
		 * The meta object literal for the '<em><b>Relation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_RELATION__RELATION_TYPE = eINSTANCE.getElementRelation_RelationType();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.UnitTestImpl <em>Unit Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.UnitTestImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getUnitTest()
		 * @generated
		 */
		EClass UNIT_TEST = eINSTANCE.getUnitTest();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TEST__TYPE = eINSTANCE.getUnitTest_Type();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.VarTypeImpl <em>Var Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.VarTypeImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getVarType()
		 * @generated
		 */
		EClass VAR_TYPE = eINSTANCE.getVarType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__NAME = eINSTANCE.getVarType_Name();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.StaticMetricsImpl <em>Static Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.StaticMetricsImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getStaticMetrics()
		 * @generated
		 */
		EClass STATIC_METRICS = eINSTANCE.getStaticMetrics();

		/**
		 * The meta object literal for the '<em><b>Locs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_METRICS__LOCS = eINSTANCE.getStaticMetrics_Locs();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_METRICS__COMMENTS = eINSTANCE.getStaticMetrics_Comments();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.AnnotatedObjectImpl <em>Annotated Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.AnnotatedObjectImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getAnnotatedObject()
		 * @generated
		 */
		EClass ANNOTATED_OBJECT = eINSTANCE.getAnnotatedObject();

		/**
		 * The meta object literal for the '<em><b>Anotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_OBJECT__ANOTATIONS = eINSTANCE.getAnnotatedObject_Anotations();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.CartographyElementImpl <em>Cartography Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.CartographyElementImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getCartographyElement()
		 * @generated
		 */
		EClass CARTOGRAPHY_ELEMENT = eINSTANCE.getCartographyElement();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTOGRAPHY_ELEMENT__WEIGHT = eINSTANCE.getCartographyElement_Weight();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTOGRAPHY_ELEMENT__NAME = eINSTANCE.getCartographyElement_Name();

		/**
		 * The meta object literal for the '<em><b>Max Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTOGRAPHY_ELEMENT__MAX_WEIGHT = eINSTANCE.getCartographyElement_MaxWeight();

		/**
		 * The meta object literal for the '<em><b>Mig Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTOGRAPHY_ELEMENT__MIG_RELATIONS = eINSTANCE.getCartographyElement_MigRelations();

		/**
		 * The meta object literal for the '<em><b>Parent Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTOGRAPHY_ELEMENT__PARENT_LAYER = eINSTANCE.getCartographyElement_ParentLayer();

		/**
		 * The meta object literal for the '<em><b>Parent Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTOGRAPHY_ELEMENT__PARENT_MODULE = eINSTANCE.getCartographyElement_ParentModule();

		/**
		 * The meta object literal for the '<em><b>Original File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTOGRAPHY_ELEMENT__ORIGINAL_FILE_PATH = eINSTANCE.getCartographyElement_OriginalFilePath();

		/**
		 * The meta object literal for the '<em><b>New File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTOGRAPHY_ELEMENT__NEW_FILE_PATH = eINSTANCE.getCartographyElement_NewFilePath();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.PersistenceManagerImpl <em>Persistence Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.PersistenceManagerImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getPersistenceManager()
		 * @generated
		 */
		EClass PERSISTENCE_MANAGER = eINSTANCE.getPersistenceManager();

		/**
		 * The meta object literal for the '<em><b>Persistence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_MANAGER__PERSISTENCE_TYPE = eINSTANCE.getPersistenceManager_PersistenceType();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.AnnotationParameterImpl <em>Annotation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.AnnotationParameterImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getAnnotationParameter()
		 * @generated
		 */
		EClass ANNOTATION_PARAMETER = eINSTANCE.getAnnotationParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_PARAMETER__NAME = eINSTANCE.getAnnotationParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_PARAMETER__VALUE = eINSTANCE.getAnnotationParameter_Value();

		/**
		 * The meta object literal for the '{@link CartographyDescription.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.impl.ExceptionImpl
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__NAME = eINSTANCE.getException_Name();

		/**
		 * The meta object literal for the '{@link CartographyDescription.RelationType <em>Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.RelationType
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getRelationType()
		 * @generated
		 */
		EEnum RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '{@link CartographyDescription.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.Visibility
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link CartographyDescription.Inhertance <em>Inhertance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CartographyDescription.Inhertance
		 * @see CartographyDescription.impl.CartographyDescriptionPackageImpl#getInhertance()
		 * @generated
		 */
		EEnum INHERTANCE = eINSTANCE.getInhertance();

	}

} //CartographyDescriptionPackage
