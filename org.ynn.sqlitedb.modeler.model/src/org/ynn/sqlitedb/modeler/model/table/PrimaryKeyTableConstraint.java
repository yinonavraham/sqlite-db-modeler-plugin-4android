/**
 */
package org.ynn.sqlitedb.modeler.model.table;

import org.ynn.sqlitedb.modeler.model.column.IndexedColumn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ynn.sqlitedb.modeler.model.table.TablePackage#getPrimaryKeyTableConstraint()
 * @model
 * @generated
 */
public interface PrimaryKeyTableConstraint extends TableConstraint {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference.
	 * @see #setColumns(IndexedColumn)
	 * @see org.ynn.sqlitedb.modeler.model.table.TablePackage#getPrimaryKeyTableConstraint_Columns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IndexedColumn getColumns();

	/**
	 * Sets the value of the '{@link org.ynn.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint#getColumns <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' containment reference.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(IndexedColumn value);

} // PrimaryKeyTableConstraint
