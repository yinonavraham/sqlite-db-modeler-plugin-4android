/**
 */
package org.ynn.sqlitedb.modeler.model.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.ynn.sqlitedb.modeler.model.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ynn.org/sqlitedb/modeler/model/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.ynn.sqlitedb.modeler.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.ynn.sqlitedb.modeler.model.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ynn.sqlitedb.modeler.model.common.NameProvider <em>Name Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ynn.sqlitedb.modeler.model.common.NameProvider
	 * @see org.ynn.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getNameProvider()
	 * @generated
	 */
	int NAME_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROVIDER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ynn.sqlitedb.modeler.model.common.PreviousVersionProvider <em>Previous Version Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ynn.sqlitedb.modeler.model.common.PreviousVersionProvider
	 * @see org.ynn.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getPreviousVersionProvider()
	 * @generated
	 */
	int PREVIOUS_VERSION_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_VERSION_PROVIDER__PREVIOUS_VERSION = 0;

	/**
	 * The number of structural features of the '<em>Previous Version Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_VERSION_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Previous Version Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_VERSION_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ynn.sqlitedb.modeler.model.common.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ynn.sqlitedb.modeler.model.common.impl.MappingImpl
	 * @see org.ynn.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Prev2entry Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__PREV2ENTRY_MAP = 0;

	/**
	 * The feature id for the '<em><b>Curr2entry Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CURR2ENTRY_MAP = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ENTRIES = 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_PREVIOUS__OBJECT = 0;

	/**
	 * The operation id for the '<em>Get All Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_ALL_PREVIOUS = 1;

	/**
	 * The operation id for the '<em>Get Current</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_CURRENT__OBJECT = 2;

	/**
	 * The operation id for the '<em>Get All Current</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___GET_ALL_CURRENT = 3;

	/**
	 * The operation id for the '<em>Put</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING___PUT__OBJECT_OBJECT = 4;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.ynn.sqlitedb.modeler.model.common.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ynn.sqlitedb.modeler.model.common.impl.MappingEntryImpl
	 * @see org.ynn.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getMappingEntry()
	 * @generated
	 */
	int MAPPING_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__PREVIOUS = 0;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__CURRENT = 1;

	/**
	 * The number of structural features of the '<em>Mapping Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ynn.sqlitedb.modeler.model.common.impl.StringToMappingEntryMapImpl <em>String To Mapping Entry Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ynn.sqlitedb.modeler.model.common.impl.StringToMappingEntryMapImpl
	 * @see org.ynn.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getStringToMappingEntryMap()
	 * @generated
	 */
	int STRING_TO_MAPPING_ENTRY_MAP = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_MAPPING_ENTRY_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_MAPPING_ENTRY_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Mapping Entry Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_MAPPING_ENTRY_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Mapping Entry Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_MAPPING_ENTRY_MAP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.ynn.sqlitedb.modeler.model.common.NameProvider <em>Name Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Provider</em>'.
	 * @see org.ynn.sqlitedb.modeler.model.common.NameProvider
	 * @generated
	 */
	EClass getNameProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.ynn.sqlitedb.modeler.model.common.NameProvider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ynn.sqlitedb.modeler.model.common.NameProvider#getName()
	 * @see #getNameProvider()
	 * @generated
	 */
	EAttribute getNameProvider_Name();

	/**
	 * Returns the meta object for class '{@link org.ynn.sqlitedb.modeler.model.common.PreviousVersionProvider <em>Previous Version Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Previous Version Provider</em>'.
	 * @see org.ynn.sqlitedb.modeler.model.common.PreviousVersionProvider
	 * @generated
	 */
	EClass getPreviousVersionProvider();

	/**
	 * Returns the meta object for the reference '{@link org.ynn.sqlitedb.modeler.model.common.PreviousVersionProvider#getPreviousVersion <em>Previous Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Version</em>'.
	 * @see org.ynn.sqlitedb.modeler.model.common.PreviousVersionProvider#getPreviousVersion()
	 * @see #getPreviousVersionProvider()
	 * @generated
	 */
	EReference getPreviousVersionProvider_PreviousVersion();

	/**
	 * Returns the meta object for class '{@link org.ynn.sqlitedb.modeler.model.common.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.ynn.sqlitedb.modeler.model.common.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the map '{@link org.ynn.sqlitedb.modeler.model.common.Mapping#getPrev2entryMap <em>Prev2entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Prev2entry Map</em>'.
	 * @see org.ynn.sqlitedb.modeler.model.common.Mapping#getPrev2entryMap()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Prev2entryMap();

	/**
	 * Returns the meta object for the map '{@link org.ynn.sqlitedb.modeler.model.common.Mapping#getCurr2entryMap <em>Curr2entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Curr2entry Map</em>'.
	 * @see org.ynn.sqlitedb.modeler.model.common.Mapping#getCurr2entryMap()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Curr2entryMap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ynn.sqlitedb.modeler.model.common.Mapping#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.ynn.sqlitedb.modeler.model.common.Mapping#getEntries()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Entries();

	/**
	 * Returns the meta object for the '{@link org.ynn.sqlitedb.modeler.model.common.Mapping#getPrevious(java.lang.Object) <em>Get Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Previous</em>' operation.
	 * @see org.ynn.sqlitedb.modeler.model.common.Mapping#getPrevious(java.lang.Object)
	 * @generated
	 */
	EOperation getMapping__GetPrevious__Object();

	/**
	 * Returns the meta object for the '{@link org.ynn.sqlitedb.modeler.model.common.Mapping#getAllPrevious() <em>Get All Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Previous</em>' operation.
	 * @see org.ynn.sqlitedb.modeler.model.common.Mapping#getAllPrevious()
	 * @generated
	 */
	EOperation getMapping__GetAllPrevious();

	/**
	 * Returns the meta object for the '{@link org.ynn.sqlitedb.modeler.model.common.Mapping#getCurrent(java.lang.Object) <em>Get Current</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current</em>' operation.
	 * @see org.ynn.sqlitedb.modeler.model.common.Mapping#getCurrent(java.lang.Object)
	 * @generated
	 */
	EOperation getMapping__GetCurrent__Object();

	/**
	 * Returns the meta object for the '{@link org.ynn.sqlitedb.modeler.model.common.Mapping#getAllCurrent() <em>Get All Current</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Current</em>' operation.
	 * @see org.ynn.sqlitedb.modeler.model.common.Mapping#getAllCurrent()
	 * @generated
	 */
	EOperation getMapping__GetAllCurrent();

	/**
	 * Returns the meta object for the '{@link org.ynn.sqlitedb.modeler.model.common.Mapping#put(java.lang.Object, java.lang.Object) <em>Put</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put</em>' operation.
	 * @see org.ynn.sqlitedb.modeler.model.common.Mapping#put(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getMapping__Put__Object_Object();

	/**
	 * Returns the meta object for class '{@link org.ynn.sqlitedb.modeler.model.common.MappingEntry <em>Mapping Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Entry</em>'.
	 * @see org.ynn.sqlitedb.modeler.model.common.MappingEntry
	 * @generated
	 */
	EClass getMappingEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.ynn.sqlitedb.modeler.model.common.MappingEntry#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous</em>'.
	 * @see org.ynn.sqlitedb.modeler.model.common.MappingEntry#getPrevious()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EAttribute getMappingEntry_Previous();

	/**
	 * Returns the meta object for the attribute '{@link org.ynn.sqlitedb.modeler.model.common.MappingEntry#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see org.ynn.sqlitedb.modeler.model.common.MappingEntry#getCurrent()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EAttribute getMappingEntry_Current();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Mapping Entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Mapping Entry Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="org.ynn.sqlitedb.modeler.model.common.MappingEntry<T>" valueRequired="true"
	 * @generated
	 */
	EClass getStringToMappingEntryMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToMappingEntryMap()
	 * @generated
	 */
	EAttribute getStringToMappingEntryMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToMappingEntryMap()
	 * @generated
	 */
	EReference getStringToMappingEntryMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link org.ynn.sqlitedb.modeler.model.common.NameProvider <em>Name Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ynn.sqlitedb.modeler.model.common.NameProvider
		 * @see org.ynn.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getNameProvider()
		 * @generated
		 */
		EClass NAME_PROVIDER = eINSTANCE.getNameProvider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_PROVIDER__NAME = eINSTANCE.getNameProvider_Name();

		/**
		 * The meta object literal for the '{@link org.ynn.sqlitedb.modeler.model.common.PreviousVersionProvider <em>Previous Version Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ynn.sqlitedb.modeler.model.common.PreviousVersionProvider
		 * @see org.ynn.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getPreviousVersionProvider()
		 * @generated
		 */
		EClass PREVIOUS_VERSION_PROVIDER = eINSTANCE.getPreviousVersionProvider();

		/**
		 * The meta object literal for the '<em><b>Previous Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREVIOUS_VERSION_PROVIDER__PREVIOUS_VERSION = eINSTANCE.getPreviousVersionProvider_PreviousVersion();

		/**
		 * The meta object literal for the '{@link org.ynn.sqlitedb.modeler.model.common.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ynn.sqlitedb.modeler.model.common.impl.MappingImpl
		 * @see org.ynn.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Prev2entry Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__PREV2ENTRY_MAP = eINSTANCE.getMapping_Prev2entryMap();

		/**
		 * The meta object literal for the '<em><b>Curr2entry Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__CURR2ENTRY_MAP = eINSTANCE.getMapping_Curr2entryMap();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__ENTRIES = eINSTANCE.getMapping_Entries();

		/**
		 * The meta object literal for the '<em><b>Get Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAPPING___GET_PREVIOUS__OBJECT = eINSTANCE.getMapping__GetPrevious__Object();

		/**
		 * The meta object literal for the '<em><b>Get All Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAPPING___GET_ALL_PREVIOUS = eINSTANCE.getMapping__GetAllPrevious();

		/**
		 * The meta object literal for the '<em><b>Get Current</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAPPING___GET_CURRENT__OBJECT = eINSTANCE.getMapping__GetCurrent__Object();

		/**
		 * The meta object literal for the '<em><b>Get All Current</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAPPING___GET_ALL_CURRENT = eINSTANCE.getMapping__GetAllCurrent();

		/**
		 * The meta object literal for the '<em><b>Put</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAPPING___PUT__OBJECT_OBJECT = eINSTANCE.getMapping__Put__Object_Object();

		/**
		 * The meta object literal for the '{@link org.ynn.sqlitedb.modeler.model.common.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ynn.sqlitedb.modeler.model.common.impl.MappingEntryImpl
		 * @see org.ynn.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getMappingEntry()
		 * @generated
		 */
		EClass MAPPING_ENTRY = eINSTANCE.getMappingEntry();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ENTRY__PREVIOUS = eINSTANCE.getMappingEntry_Previous();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ENTRY__CURRENT = eINSTANCE.getMappingEntry_Current();

		/**
		 * The meta object literal for the '{@link org.ynn.sqlitedb.modeler.model.common.impl.StringToMappingEntryMapImpl <em>String To Mapping Entry Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ynn.sqlitedb.modeler.model.common.impl.StringToMappingEntryMapImpl
		 * @see org.ynn.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getStringToMappingEntryMap()
		 * @generated
		 */
		EClass STRING_TO_MAPPING_ENTRY_MAP = eINSTANCE.getStringToMappingEntryMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_MAPPING_ENTRY_MAP__KEY = eINSTANCE.getStringToMappingEntryMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_MAPPING_ENTRY_MAP__VALUE = eINSTANCE.getStringToMappingEntryMap_Value();

	}

} //CommonPackage
