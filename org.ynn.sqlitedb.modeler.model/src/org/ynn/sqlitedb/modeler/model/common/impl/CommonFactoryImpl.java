/**
 */
package org.ynn.sqlitedb.modeler.model.common.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ynn.sqlitedb.modeler.model.column.Column;

import org.ynn.sqlitedb.modeler.model.common.*;

import org.ynn.sqlitedb.modeler.model.table.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonFactoryImpl extends EFactoryImpl implements CommonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonFactory init() {
		try {
			CommonFactory theCommonFactory = (CommonFactory)EPackage.Registry.INSTANCE.getEFactory(CommonPackage.eNS_URI);
			if (theCommonFactory != null) {
				return theCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactoryImpl() {
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
			case CommonPackage.MAPPING: return createMapping();
			case CommonPackage.MAPPING_ENTRY: return createMappingEntry();
			case CommonPackage.STRING_TO_TABLE_MAPPING_ENTRY_MAP: return (EObject)createStringToTableMappingEntryMap();
			case CommonPackage.STRING_TO_COLUMN_MAPPING_ENTRY_MAP: return (EObject)createStringToColumnMappingEntryMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T, TMap> Mapping<T, TMap> createMapping() {
		MappingImpl<T, TMap> mapping = new MappingImpl<T, TMap>();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> MappingEntry<T> createMappingEntry() {
		MappingEntryImpl<T> mappingEntry = new MappingEntryImpl<T>();
		return mappingEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, MappingEntry<Table>> createStringToTableMappingEntryMap() {
		StringToTableMappingEntryMapImpl stringToTableMappingEntryMap = new StringToTableMappingEntryMapImpl();
		return stringToTableMappingEntryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, MappingEntry<Column>> createStringToColumnMappingEntryMap() {
		StringToColumnMappingEntryMapImpl stringToColumnMappingEntryMap = new StringToColumnMappingEntryMapImpl();
		return stringToColumnMappingEntryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonPackage getCommonPackage() {
		return (CommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonPackage getPackage() {
		return CommonPackage.eINSTANCE;
	}

} //CommonFactoryImpl
