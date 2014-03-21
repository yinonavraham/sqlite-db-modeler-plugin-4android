/**
 */
package org.ynn.sqlitedb.modeler.model.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.common.Mapping#getPrev2entryMap <em>Prev2entry Map</em>}</li>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.common.Mapping#getCurr2entryMap <em>Curr2entry Map</em>}</li>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.common.Mapping#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ynn.sqlitedb.modeler.model.common.CommonPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping<T> extends EObject {
	/**
	 * Returns the value of the '<em><b>Prev2entry Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.ynn.sqlitedb.modeler.model.common.MappingEntry<T>},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev2entry Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev2entry Map</em>' map.
	 * @see org.ynn.sqlitedb.modeler.model.common.CommonPackage#getMapping_Prev2entryMap()
	 * @model mapType="org.ynn.sqlitedb.modeler.model.common.StringToMappingEntryMap<org.eclipse.emf.ecore.EString, org.ynn.sqlitedb.modeler.model.common.MappingEntry<T>>"
	 * @generated
	 */
	EMap<String, MappingEntry<T>> getPrev2entryMap();

	/**
	 * Returns the value of the '<em><b>Curr2entry Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.ynn.sqlitedb.modeler.model.common.MappingEntry<T>},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curr2entry Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curr2entry Map</em>' map.
	 * @see org.ynn.sqlitedb.modeler.model.common.CommonPackage#getMapping_Curr2entryMap()
	 * @model mapType="org.ynn.sqlitedb.modeler.model.common.StringToMappingEntryMap<org.eclipse.emf.ecore.EString, org.ynn.sqlitedb.modeler.model.common.MappingEntry<T>>"
	 * @generated
	 */
	EMap<String, MappingEntry<T>> getCurr2entryMap();

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.ynn.sqlitedb.modeler.model.common.MappingEntry}&lt;T>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.ynn.sqlitedb.modeler.model.common.CommonPackage#getMapping_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingEntry<T>> getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model currentRequired="true"
	 * @generated
	 */
	T getPrevious(T current);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<T> getAllPrevious();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model previousRequired="true"
	 * @generated
	 */
	T getCurrent(T previous);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<T> getAllCurrent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void put(T previous, T current);

} // Mapping
