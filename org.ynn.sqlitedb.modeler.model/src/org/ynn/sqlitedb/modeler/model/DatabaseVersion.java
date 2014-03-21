/**
 */
package org.ynn.sqlitedb.modeler.model;

import org.eclipse.emf.ecore.EObject;

import org.ynn.sqlitedb.modeler.model.column.Column;

import org.ynn.sqlitedb.modeler.model.common.Mapping;

import org.ynn.sqlitedb.modeler.model.table.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getPreviousVersion <em>Previous Version</em>}</li>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getNextVersion <em>Next Version</em>}</li>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getTableMapping <em>Table Mapping</em>}</li>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getColumnMapping <em>Column Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ynn.sqlitedb.modeler.model.ModelPackage#getDatabaseVersion()
 * @model
 * @generated
 */
public interface DatabaseVersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(Database)
	 * @see org.ynn.sqlitedb.modeler.model.ModelPackage#getDatabaseVersion_Database()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Previous Version</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getNextVersion <em>Next Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Version</em>' reference.
	 * @see #setPreviousVersion(DatabaseVersion)
	 * @see org.ynn.sqlitedb.modeler.model.ModelPackage#getDatabaseVersion_PreviousVersion()
	 * @see org.ynn.sqlitedb.modeler.model.DatabaseVersion#getNextVersion
	 * @model opposite="nextVersion"
	 * @generated
	 */
	DatabaseVersion getPreviousVersion();

	/**
	 * Sets the value of the '{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getPreviousVersion <em>Previous Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Version</em>' reference.
	 * @see #getPreviousVersion()
	 * @generated
	 */
	void setPreviousVersion(DatabaseVersion value);

	/**
	 * Returns the value of the '<em><b>Next Version</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getPreviousVersion <em>Previous Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Version</em>' reference.
	 * @see #setNextVersion(DatabaseVersion)
	 * @see org.ynn.sqlitedb.modeler.model.ModelPackage#getDatabaseVersion_NextVersion()
	 * @see org.ynn.sqlitedb.modeler.model.DatabaseVersion#getPreviousVersion
	 * @model opposite="previousVersion"
	 * @generated
	 */
	DatabaseVersion getNextVersion();

	/**
	 * Sets the value of the '{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getNextVersion <em>Next Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Version</em>' reference.
	 * @see #getNextVersion()
	 * @generated
	 */
	void setNextVersion(DatabaseVersion value);

	/**
	 * Returns the value of the '<em><b>Table Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Mapping</em>' containment reference.
	 * @see #setTableMapping(Mapping)
	 * @see org.ynn.sqlitedb.modeler.model.ModelPackage#getDatabaseVersion_TableMapping()
	 * @model containment="true"
	 * @generated
	 */
	Mapping<Table> getTableMapping();

	/**
	 * Sets the value of the '{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getTableMapping <em>Table Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Mapping</em>' containment reference.
	 * @see #getTableMapping()
	 * @generated
	 */
	void setTableMapping(Mapping<Table> value);

	/**
	 * Returns the value of the '<em><b>Column Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Mapping</em>' containment reference.
	 * @see #setColumnMapping(Mapping)
	 * @see org.ynn.sqlitedb.modeler.model.ModelPackage#getDatabaseVersion_ColumnMapping()
	 * @model containment="true"
	 * @generated
	 */
	Mapping<Column> getColumnMapping();

	/**
	 * Sets the value of the '{@link org.ynn.sqlitedb.modeler.model.DatabaseVersion#getColumnMapping <em>Column Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Mapping</em>' containment reference.
	 * @see #getColumnMapping()
	 * @generated
	 */
	void setColumnMapping(Mapping<Column> value);

} // DatabaseVersion
