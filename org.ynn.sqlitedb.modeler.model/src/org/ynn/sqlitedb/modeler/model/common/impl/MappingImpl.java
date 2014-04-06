/**
 */
package org.ynn.sqlitedb.modeler.model.common.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ynn.sqlitedb.modeler.model.common.CommonPackage;
import org.ynn.sqlitedb.modeler.model.common.Mapping;
import org.ynn.sqlitedb.modeler.model.common.MappingEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.common.impl.MappingImpl#getPrev2entryMap <em>Prev2entry Map</em>}</li>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.common.impl.MappingImpl#getCurr2entryMap <em>Curr2entry Map</em>}</li>
 *   <li>{@link org.ynn.sqlitedb.modeler.model.common.impl.MappingImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl<T, TMap> extends MinimalEObjectImpl.Container implements Mapping<T, TMap> {
	/**
	 * The cached value of the '{@link #getPrev2entryMap() <em>Prev2entry Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev2entryMap()
	 * @generated
	 * @ordered
	 */
	protected EList<TMap> prev2entryMap;

	/**
	 * The cached value of the '{@link #getCurr2entryMap() <em>Curr2entry Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurr2entryMap()
	 * @generated
	 * @ordered
	 */
	protected EList<TMap> curr2entryMap;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingEntry<T>> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMap> getPrev2entryMap() {
		if (prev2entryMap == null) {
			prev2entryMap = new EObjectContainmentEList<TMap>(EObject.class, this, CommonPackage.MAPPING__PREV2ENTRY_MAP);
		}
		return prev2entryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMap> getCurr2entryMap() {
		if (curr2entryMap == null) {
			curr2entryMap = new EObjectContainmentEList<TMap>(EObject.class, this, CommonPackage.MAPPING__CURR2ENTRY_MAP);
		}
		return curr2entryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingEntry<T>> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<MappingEntry<T>>(MappingEntry.class, this, CommonPackage.MAPPING__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getPrevious(T current) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getAllPrevious() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getCurrent(T previous) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getAllCurrent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void put(T previous, T current) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingEntry<T>> entries() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.MAPPING__PREV2ENTRY_MAP:
				return ((InternalEList<?>)getPrev2entryMap()).basicRemove(otherEnd, msgs);
			case CommonPackage.MAPPING__CURR2ENTRY_MAP:
				return ((InternalEList<?>)getCurr2entryMap()).basicRemove(otherEnd, msgs);
			case CommonPackage.MAPPING__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.MAPPING__PREV2ENTRY_MAP:
				return getPrev2entryMap();
			case CommonPackage.MAPPING__CURR2ENTRY_MAP:
				return getCurr2entryMap();
			case CommonPackage.MAPPING__ENTRIES:
				return getEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.MAPPING__PREV2ENTRY_MAP:
				getPrev2entryMap().clear();
				getPrev2entryMap().addAll((Collection<? extends TMap>)newValue);
				return;
			case CommonPackage.MAPPING__CURR2ENTRY_MAP:
				getCurr2entryMap().clear();
				getCurr2entryMap().addAll((Collection<? extends TMap>)newValue);
				return;
			case CommonPackage.MAPPING__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends MappingEntry<T>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommonPackage.MAPPING__PREV2ENTRY_MAP:
				getPrev2entryMap().clear();
				return;
			case CommonPackage.MAPPING__CURR2ENTRY_MAP:
				getCurr2entryMap().clear();
				return;
			case CommonPackage.MAPPING__ENTRIES:
				getEntries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommonPackage.MAPPING__PREV2ENTRY_MAP:
				return prev2entryMap != null && !prev2entryMap.isEmpty();
			case CommonPackage.MAPPING__CURR2ENTRY_MAP:
				return curr2entryMap != null && !curr2entryMap.isEmpty();
			case CommonPackage.MAPPING__ENTRIES:
				return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CommonPackage.MAPPING___GET_PREVIOUS__OBJECT:
				return getPrevious((T)arguments.get(0));
			case CommonPackage.MAPPING___GET_ALL_PREVIOUS:
				return getAllPrevious();
			case CommonPackage.MAPPING___GET_CURRENT__OBJECT:
				return getCurrent((T)arguments.get(0));
			case CommonPackage.MAPPING___GET_ALL_CURRENT:
				return getAllCurrent();
			case CommonPackage.MAPPING___PUT__OBJECT_OBJECT:
				put((T)arguments.get(0), (T)arguments.get(1));
				return null;
			case CommonPackage.MAPPING___ENTRIES:
				return entries();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MappingImpl
