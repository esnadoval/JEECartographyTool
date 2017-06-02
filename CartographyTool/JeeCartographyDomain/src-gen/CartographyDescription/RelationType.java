/**
 */
package CartographyDescription;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CartographyDescription.CartographyDescriptionPackage#getRelationType()
 * @model
 * @generated
 */
public enum RelationType implements Enumerator {
	/**
	 * The '<em><b>Asosiation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASOSIATION_VALUE
	 * @generated
	 * @ordered
	 */
	ASOSIATION(0, "asosiation", "asosiation"),

	/**
	 * The '<em><b>Realization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	REALIZATION(1, "realization", "realization"),

	/**
	 * The '<em><b>Use</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USE_VALUE
	 * @generated
	 * @ordered
	 */
	USE(2, "use", "use"),

	/**
	 * The '<em><b>Implements</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTS(3, "implements", "implements"),

	/**
	 * The '<em><b>Tests</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TESTS_VALUE
	 * @generated
	 * @ordered
	 */
	TESTS(4, "tests", "tests");

	/**
	 * The '<em><b>Asosiation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asosiation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASOSIATION
	 * @model name="asosiation"
	 * @generated
	 * @ordered
	 */
	public static final int ASOSIATION_VALUE = 0;

	/**
	 * The '<em><b>Realization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Realization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REALIZATION
	 * @model name="realization"
	 * @generated
	 * @ordered
	 */
	public static final int REALIZATION_VALUE = 1;

	/**
	 * The '<em><b>Use</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Use</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USE
	 * @model name="use"
	 * @generated
	 * @ordered
	 */
	public static final int USE_VALUE = 2;

	/**
	 * The '<em><b>Implements</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Implements</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTS
	 * @model name="implements"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTS_VALUE = 3;

	/**
	 * The '<em><b>Tests</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tests</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TESTS
	 * @model name="tests"
	 * @generated
	 * @ordered
	 */
	public static final int TESTS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationType[] VALUES_ARRAY =
		new RelationType[] {
			ASOSIATION,
			REALIZATION,
			USE,
			IMPLEMENTS,
			TESTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationType get(int value) {
		switch (value) {
			case ASOSIATION_VALUE: return ASOSIATION;
			case REALIZATION_VALUE: return REALIZATION;
			case USE_VALUE: return USE;
			case IMPLEMENTS_VALUE: return IMPLEMENTS;
			case TESTS_VALUE: return TESTS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RelationType
