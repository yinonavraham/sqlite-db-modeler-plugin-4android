/**
 */
package org.ynn.sqlitedb.modeler.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Versions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.DatabaseVersions#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.DatabaseVersions#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.DatabaseVersions#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ynn.sqlitedb.modeler.model.ModelPackage#getDatabaseVersions()
 * @model
 * @generated
 */
public interface DatabaseVersions extends EObject {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.ynn.sqlitedb.modeler.model.DatabaseVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.ynn.sqlitedb.modeler.model.ModelPackage#getDatabaseVersions_Versions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DatabaseVersion> getVersions();

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.ynn.sqlitedb.modeler.model.ModelPackage#getDatabaseVersions_PackageName()
	 * @model required="true"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.ynn.sqlitedb.modeler.model.DatabaseVersions#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.ynn.sqlitedb.modeler.model.ModelPackage#getDatabaseVersions_FileName()
	 * @model required="true"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.ynn.sqlitedb.modeler.model.DatabaseVersions#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	DatabaseVersion getFirstVersion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	DatabaseVersion getLastVersion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	DatabaseVersion createVersion();

} // DatabaseVersions
