/**
 */
package org.xtext.bot.language.bla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.Block#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bot.language.bla.BlaPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject
{
  /**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Write)
	 * @see org.xtext.bot.language.bla.BlaPackage#getBlock_Action()
	 * @model containment="true"
	 * @generated
	 */
  Write getAction();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.Block#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
  void setAction(Write value);

} // Block
