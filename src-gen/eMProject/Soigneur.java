/**
 */
package eMProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soigneur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMProject.Soigneur#getZoo <em>Zoo</em>}</li>
 *   <li>{@link eMProject.Soigneur#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see eMProject.EMProjectPackage#getSoigneur()
 * @model
 * @generated
 */
public interface Soigneur extends EObject {
	/**
	 * Returns the value of the '<em><b>Zoo</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eMProject.Zoo#getSoigneur <em>Soigneur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zoo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoo</em>' container reference.
	 * @see #setZoo(Zoo)
	 * @see eMProject.EMProjectPackage#getSoigneur_Zoo()
	 * @see eMProject.Zoo#getSoigneur
	 * @model opposite="soigneur" required="true" transient="false"
	 * @generated
	 */
	Zoo getZoo();

	/**
	 * Sets the value of the '{@link eMProject.Soigneur#getZoo <em>Zoo</em>}' container reference.
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
	 * @see eMProject.EMProjectPackage#getSoigneur_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eMProject.Soigneur#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Soigneur
