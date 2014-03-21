/**
 */
package org.ynn.sqlitedb.modeler.model.common.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ynn.sqlitedb.modeler.model.ModelPackage;
import org.ynn.sqlitedb.modeler.model.column.ColumnPackage;
import org.ynn.sqlitedb.modeler.model.column.impl.ColumnPackageImpl;
import org.ynn.sqlitedb.modeler.model.common.CommonFactory;
import org.ynn.sqlitedb.modeler.model.common.CommonPackage;
import org.ynn.sqlitedb.modeler.model.common.Mapping;
import org.ynn.sqlitedb.modeler.model.common.MappingEntry;
import org.ynn.sqlitedb.modeler.model.common.NameProvider;
import org.ynn.sqlitedb.modeler.model.expression.ExpressionPackage;
import org.ynn.sqlitedb.modeler.model.expression.impl.ExpressionPackageImpl;
import org.ynn.sqlitedb.modeler.model.impl.ModelPackageImpl;
import org.ynn.sqlitedb.modeler.model.index.IndexPackage;
import org.ynn.sqlitedb.modeler.model.index.impl.IndexPackageImpl;
import org.ynn.sqlitedb.modeler.model.table.TablePackage;
import org.ynn.sqlitedb.modeler.model.table.impl.TablePackageImpl;
import org.ynn.sqlitedb.modeler.model.trigger.TriggerPackage;
import org.ynn.sqlitedb.modeler.model.trigger.impl.TriggerPackageImpl;
import org.ynn.sqlitedb.modeler.model.view.ViewPackage;
import org.ynn.sqlitedb.modeler.model.view.impl.ViewPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonPackageImpl extends EPackageImpl implements CommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass previousVersionProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToMappingEntryMapEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ynn.sqlitedb.modeler.model.common.CommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackageImpl() {
		super(eNS_URI, CommonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonPackage init() {
		if (isInited) return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Obtain or create and register package
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		TablePackageImpl theTablePackage = (TablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) instanceof TablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) : TablePackage.eINSTANCE);
		ColumnPackageImpl theColumnPackage = (ColumnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI) instanceof ColumnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI) : ColumnPackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		IndexPackageImpl theIndexPackage = (IndexPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI) instanceof IndexPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI) : IndexPackage.eINSTANCE);
		TriggerPackageImpl theTriggerPackage = (TriggerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) instanceof TriggerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) : TriggerPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theTablePackage.createPackageContents();
		theColumnPackage.createPackageContents();
		theViewPackage.createPackageContents();
		theIndexPackage.createPackageContents();
		theTriggerPackage.createPackageContents();
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theCommonPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theTablePackage.initializePackageContents();
		theColumnPackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theIndexPackage.initializePackageContents();
		theTriggerPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
		return theCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameProvider() {
		return nameProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameProvider_Name() {
		return (EAttribute)nameProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreviousVersionProvider() {
		return previousVersionProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreviousVersionProvider_PreviousVersion() {
		return (EReference)previousVersionProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Prev2entryMap() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Curr2entryMap() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Entries() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMapping__GetPrevious__Object() {
		return mappingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMapping__GetAllPrevious() {
		return mappingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMapping__GetCurrent__Object() {
		return mappingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMapping__GetAllCurrent() {
		return mappingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMapping__Put__Object_Object() {
		return mappingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingEntry() {
		return mappingEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingEntry_Previous() {
		return (EAttribute)mappingEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingEntry_Current() {
		return (EAttribute)mappingEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToMappingEntryMap() {
		return stringToMappingEntryMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToMappingEntryMap_Key() {
		return (EAttribute)stringToMappingEntryMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToMappingEntryMap_Value() {
		return (EReference)stringToMappingEntryMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactory getCommonFactory() {
		return (CommonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nameProviderEClass = createEClass(NAME_PROVIDER);
		createEAttribute(nameProviderEClass, NAME_PROVIDER__NAME);

		previousVersionProviderEClass = createEClass(PREVIOUS_VERSION_PROVIDER);
		createEReference(previousVersionProviderEClass, PREVIOUS_VERSION_PROVIDER__PREVIOUS_VERSION);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__PREV2ENTRY_MAP);
		createEReference(mappingEClass, MAPPING__CURR2ENTRY_MAP);
		createEReference(mappingEClass, MAPPING__ENTRIES);
		createEOperation(mappingEClass, MAPPING___GET_PREVIOUS__OBJECT);
		createEOperation(mappingEClass, MAPPING___GET_ALL_PREVIOUS);
		createEOperation(mappingEClass, MAPPING___GET_CURRENT__OBJECT);
		createEOperation(mappingEClass, MAPPING___GET_ALL_CURRENT);
		createEOperation(mappingEClass, MAPPING___PUT__OBJECT_OBJECT);

		mappingEntryEClass = createEClass(MAPPING_ENTRY);
		createEAttribute(mappingEntryEClass, MAPPING_ENTRY__PREVIOUS);
		createEAttribute(mappingEntryEClass, MAPPING_ENTRY__CURRENT);

		stringToMappingEntryMapEClass = createEClass(STRING_TO_MAPPING_ENTRY_MAP);
		createEAttribute(stringToMappingEntryMapEClass, STRING_TO_MAPPING_ENTRY_MAP__KEY);
		createEReference(stringToMappingEntryMapEClass, STRING_TO_MAPPING_ENTRY_MAP__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter mappingEClass_T = addETypeParameter(mappingEClass, "T");
		ETypeParameter mappingEntryEClass_T = addETypeParameter(mappingEntryEClass, "T");
		ETypeParameter stringToMappingEntryMapEClass_T = addETypeParameter(stringToMappingEntryMapEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(nameProviderEClass, NameProvider.class, "NameProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameProvider_Name(), ecorePackage.getEString(), "name", null, 1, 1, NameProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(this.getStringToMappingEntryMap());
		EGenericType g2 = createEGenericType(mappingEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getMapping_Prev2entryMap(), g1, null, "prev2entryMap", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getStringToMappingEntryMap());
		g2 = createEGenericType(mappingEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getMapping_Curr2entryMap(), g1, null, "curr2entryMap", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMappingEntry());
		g2 = createEGenericType(mappingEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getMapping_Entries(), g1, null, "entries", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getMapping__GetPrevious__Object(), null, "getPrevious", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(mappingEClass_T);
		addEParameter(op, g1, "current", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(mappingEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getMapping__GetAllPrevious(), null, "getAllPrevious", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(mappingEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getMapping__GetCurrent__Object(), null, "getCurrent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(mappingEClass_T);
		addEParameter(op, g1, "previous", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(mappingEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getMapping__GetAllCurrent(), null, "getAllCurrent", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(mappingEClass_T);
		initEOperation(op, g1);

		op = initEOperation(getMapping__Put__Object_Object(), null, "put", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(mappingEClass_T);
		addEParameter(op, g1, "previous", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(mappingEClass_T);
		addEParameter(op, g1, "current", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mappingEntryEClass, MappingEntry.class, "MappingEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(mappingEntryEClass_T);
		initEAttribute(getMappingEntry_Previous(), g1, "previous", null, 0, 1, MappingEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(mappingEntryEClass_T);
		initEAttribute(getMappingEntry_Current(), g1, "current", null, 0, 1, MappingEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToMappingEntryMapEClass, Map.Entry.class, "StringToMappingEntryMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToMappingEntryMap_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMappingEntry());
		g2 = createEGenericType(stringToMappingEntryMapEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getStringToMappingEntryMap_Value(), g1, null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CommonPackageImpl
