/**
 */
package org.xtext.bot.language.bla;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.WhileLoop#getWhile <em>While</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.WhileLoop#getDoLoop <em>Do Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bot.language.bla.BlaPackage#getWhileLoop()
 * @model
 * @generated
 */
public interface WhileLoop extends Procedure, Block
{
  /**
	 * Returns the value of the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>While</em>' containment reference.
	 * @see #setWhile(IfExpression)
	 * @see org.xtext.bot.language.bla.BlaPackage#getWhileLoop_While()
	 * @model containment="true"
	 * @generated
	 */
  IfExpression getWhile();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.WhileLoop#getWhile <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While</em>' containment reference.
	 * @see #getWhile()
	 * @generated
	 */
  void setWhile(IfExpression value);

  /**
	 * Returns the value of the '<em><b>Do Loop</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.bot.language.bla.Block}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do Loop</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Loop</em>' containment reference list.
	 * @see org.xtext.bot.language.bla.BlaPackage#getWhileLoop_DoLoop()
	 * @model containment="true"
	 * @generated
	 */
  EList<Block> getDoLoop();

} // WhileLoop
