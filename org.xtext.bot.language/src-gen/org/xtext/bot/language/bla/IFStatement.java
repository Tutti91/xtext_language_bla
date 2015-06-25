/**
 */
package org.xtext.bot.language.bla;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IF Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.IFStatement#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.IFStatement#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.IFStatement#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bot.language.bla.BlaPackage#getIFStatement()
 * @model
 * @generated
 */
public interface IFStatement extends Procedure, Block
{
  /**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(IfExpression)
	 * @see org.xtext.bot.language.bla.BlaPackage#getIFStatement_If()
	 * @model containment="true"
	 * @generated
	 */
  IfExpression getIf();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.IFStatement#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
  void setIf(IfExpression value);

  /**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.bot.language.bla.Block}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference list.
	 * @see org.xtext.bot.language.bla.BlaPackage#getIFStatement_Then()
	 * @model containment="true"
	 * @generated
	 */
  EList<Block> getThen();

  /**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.bot.language.bla.Block}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference list.
	 * @see org.xtext.bot.language.bla.BlaPackage#getIFStatement_Else()
	 * @model containment="true"
	 * @generated
	 */
  EList<Block> getElse();

} // IFStatement
