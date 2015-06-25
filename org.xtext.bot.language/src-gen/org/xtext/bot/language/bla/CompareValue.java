/**
 */
package org.xtext.bot.language.bla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.CompareValue#getVariableValue <em>Variable Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bot.language.bla.BlaPackage#getCompareValue()
 * @model
 * @generated
 */
public interface CompareValue extends EObject
{
  /**
	 * Returns the value of the '<em><b>Variable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Value</em>' reference.
	 * @see #setVariableValue(Var)
	 * @see org.xtext.bot.language.bla.BlaPackage#getCompareValue_VariableValue()
	 * @model
	 * @generated
	 */
  Var getVariableValue();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.CompareValue#getVariableValue <em>Variable Value</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Value</em>' reference.
	 * @see #getVariableValue()
	 * @generated
	 */
  void setVariableValue(Var value);

} // CompareValue
