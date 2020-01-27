/**
 */
package eMProject.impl;

import eMProject.Animal;
import eMProject.EMProjectPackage;
import eMProject.Enclos;
import eMProject.Zoo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enclos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMProject.impl.EnclosImpl#getAnimal <em>Animal</em>}</li>
 *   <li>{@link eMProject.impl.EnclosImpl#getZoo <em>Zoo</em>}</li>
 *   <li>{@link eMProject.impl.EnclosImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnclosImpl extends MinimalEObjectImpl.Container implements Enclos {
	/**
	 * The cached value of the '{@link #getAnimal() <em>Animal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimal()
	 * @generated
	 * @ordered
	 */
	protected EList<Animal> animal;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnclosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMProjectPackage.Literals.ENCLOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Animal> getAnimal() {
		if (animal == null) {
			animal = new EObjectContainmentWithInverseEList<Animal>(Animal.class, this, EMProjectPackage.ENCLOS__ANIMAL,
					EMProjectPackage.ANIMAL__ENCLOS);
		}
		return animal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zoo getZoo() {
		if (eContainerFeatureID() != EMProjectPackage.ENCLOS__ZOO)
			return null;
		return (Zoo) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZoo(Zoo newZoo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newZoo, EMProjectPackage.ENCLOS__ZOO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZoo(Zoo newZoo) {
		if (newZoo != eInternalContainer()
				|| (eContainerFeatureID() != EMProjectPackage.ENCLOS__ZOO && newZoo != null)) {
			if (EcoreUtil.isAncestor(this, newZoo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newZoo != null)
				msgs = ((InternalEObject) newZoo).eInverseAdd(this, EMProjectPackage.ZOO__ENCLOS, Zoo.class, msgs);
			msgs = basicSetZoo(newZoo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMProjectPackage.ENCLOS__ZOO, newZoo, newZoo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMProjectPackage.ENCLOS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMProjectPackage.ENCLOS__ANIMAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAnimal()).basicAdd(otherEnd, msgs);
		case EMProjectPackage.ENCLOS__ZOO:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetZoo((Zoo) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMProjectPackage.ENCLOS__ANIMAL:
			return ((InternalEList<?>) getAnimal()).basicRemove(otherEnd, msgs);
		case EMProjectPackage.ENCLOS__ZOO:
			return basicSetZoo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case EMProjectPackage.ENCLOS__ZOO:
			return eInternalContainer().eInverseRemove(this, EMProjectPackage.ZOO__ENCLOS, Zoo.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EMProjectPackage.ENCLOS__ANIMAL:
			return getAnimal();
		case EMProjectPackage.ENCLOS__ZOO:
			return getZoo();
		case EMProjectPackage.ENCLOS__ID:
			return getId();
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
		case EMProjectPackage.ENCLOS__ANIMAL:
			getAnimal().clear();
			getAnimal().addAll((Collection<? extends Animal>) newValue);
			return;
		case EMProjectPackage.ENCLOS__ZOO:
			setZoo((Zoo) newValue);
			return;
		case EMProjectPackage.ENCLOS__ID:
			setId((Integer) newValue);
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
		case EMProjectPackage.ENCLOS__ANIMAL:
			getAnimal().clear();
			return;
		case EMProjectPackage.ENCLOS__ZOO:
			setZoo((Zoo) null);
			return;
		case EMProjectPackage.ENCLOS__ID:
			setId(ID_EDEFAULT);
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
		case EMProjectPackage.ENCLOS__ANIMAL:
			return animal != null && !animal.isEmpty();
		case EMProjectPackage.ENCLOS__ZOO:
			return getZoo() != null;
		case EMProjectPackage.ENCLOS__ID:
			return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EnclosImpl
