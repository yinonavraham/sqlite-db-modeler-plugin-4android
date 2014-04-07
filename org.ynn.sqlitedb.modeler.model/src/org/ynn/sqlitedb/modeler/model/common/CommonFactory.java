/**
 */
package org.ynn.sqlitedb.modeler.model.common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ynn.sqlitedb.modeler.model.common.CommonPackage
 * @generated
 */
public interface CommonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonFactory eINSTANCE = org.ynn.sqlitedb.modeler.model.common.impl.CommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mapping Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Entry</em>'.
	 * @generated
	 */
	<T> MappingEntry<T> createMappingEntry();

	/**
	 * Returns a new object of class '<em>Table Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Mapping</em>'.
	 * @generated
	 */
	TableMapping createTableMapping();

	/**
	 * Returns a new object of class '<em>Column Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Mapping</em>'.
	 * @generated
	 */
	ColumnMapping createColumnMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonPackage getCommonPackage();

} //CommonFactory
