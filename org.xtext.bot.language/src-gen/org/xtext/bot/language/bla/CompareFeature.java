/**
 */
package org.xtext.bot.language.bla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.CompareFeature#getVariableFeature <em>Variable Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bot.language.bla.BlaPackage#getCompareFeature()
 * @model
 * @generated
 */
public interface CompareFeature extends EObject
{
  /**
	 * Returns the value of the '<em><b>Variable Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Feature</em>' reference.
	 * @see #setVariableFeature(Var)
	 * @see org.xtext.bot.language.bla.BlaPackage#getCompareFeature_VariableFeature()
	 * @model
	 * @generated
	 */
  Var getVariableFeature();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.CompareFeature#getVariableFeature <em>Variable Feature</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Feature</em>' reference.
	 * @see #getVariableFeature()
	 * @generated
	 */
  void setVariableFeature(Var value);

} // CompareFeature
