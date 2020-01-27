/**
 */
package eMProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enclos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMProject.Enclos#getAnimal <em>Animal</em>}</li>
 *   <li>{@link eMProject.Enclos#getZoo <em>Zoo</em>}</li>
 *   <li>{@link eMProject.Enclos#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see eMProject.EMProjectPackage#getEnclos()
 * @model
 * @generated
 */
public interface Enclos extends EObject {
	/**
	 * Returns the value of the '<em><b>Animal</b></em>' containment reference list.
	 * The list contents are of type {@link eMProject.Animal}.
	 * It is bidirectional and its opposite is '{@link eMProject.Animal#getEnclos <em>Enclos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animal</em>' containment reference list.
	 * @see eMProject.EMProjectPackage#getEnclos_Animal()
	 * @see eMProject.Animal#getEnclos
	 * @model opposite="enclos" containment="true"
	 * @generated
	 */
	EList<Animal> getAnimal();

	/**
	 * Returns the value of the '<em><b>Zoo</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMProject.Zoo#getEnclos <em>Enclos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zoo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoo</em>' container reference.
	 * @see #setZoo(Zoo)
	 * @see eMProject.EMProjectPackage#getEnclos_Zoo()
	 * @see eMProject.Zoo#getEnclos
	 * @model opposite="enclos" required="true" transient="false"
	 * @generated
	 */
	Zoo getZoo();

	/**
	 * Sets the value of the '{@link eMProject.Enclos#getZoo <em>Zoo</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoo</em>' container reference.
	 * @see #getZoo()
	 * @generated
	 */
	void setZoo(Zoo value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see eMProject.EMProjectPackage#getEnclos_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eMProject.Enclos#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Enclos
