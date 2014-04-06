/**
 */
package org.ynn.sqlitedb.modeler.model.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.common.Mapping#getCurr2entryMap <em>Curr2entry Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ynn.sqlitedb.modeler.model.common.CommonPackage#getMapping()
 * @model features="prev2entryMap entries" 
 *        prev2entryMapKind="reference" prev2entryMapType="TMap" prev2entryMapContainment="true" prev2entryMapMany="true" prev2entryMapSuppressedGetVisibility="true"
 *        entriesType="org.ynn.sqlitedb.modeler.model.common.MappingEntry<T>" entriesContainment="true" entriesMany="true" entriesSuppressedGetVisibility="true"
 * @generated
 */
public interface Mapping<T, TMap> extends EObject {
	/**
	 * Returns the value of the '<em><b>Curr2entry Map</b></em>' containment reference list.
	 * The list contents are of type {@link TMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curr2entry Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curr2entry Map</em>' containment reference list.
	 * @see org.ynn.sqlitedb.modeler.model.common.CommonPackage#getMapping_Curr2entryMap()
	 * @model kind="reference" containment="true" suppressedSetVisibility="true"
	 * @generated
	 */
	EList<TMap> getCurr2entryMap();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<MappingEntry<T>> entries();

} // Mapping
