/**
 */
package org.xtext.bot.language.bla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Compare Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.IfCompareExpression#getLeftFeature <em>Left Feature</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.IfCompareExpression#getCompareOperant <em>Compare Operant</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.IfCompareExpression#getRightFeature <em>Right Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bot.language.bla.BlaPackage#getIfCompareExpression()
 * @model
 * @generated
 */
public interface IfCompareExpression extends IfExpression
{
  /**
	 * Returns the value of the '<em><b>Left Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Feature</em>' containment reference.
	 * @see #setLeftFeature(CompareFeature)
	 * @see org.xtext.bot.language.bla.BlaPackage#getIfCompareExpression_LeftFeature()
	 * @model containment="true"
	 * @generated
	 */
  CompareFeature getLeftFeature();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.IfCompareExpression#getLeftFeature <em>Left Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Feature</em>' containment reference.
	 * @see #getLeftFeature()
	 * @generated
	 */
  void setLeftFeature(CompareFeature value);

  /**
	 * Returns the value of the '<em><b>Compare Operant</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compare Operant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare Operant</em>' attribute.
	 * @see #setCompareOperant(String)
	 * @see org.xtext.bot.language.bla.BlaPackage#getIfCompareExpression_CompareOperant()
	 * @model
	 * @generated
	 */
  String getCompareOperant();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.IfCompareExpression#getCompareOperant <em>Compare Operant</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare Operant</em>' attribute.
	 * @see #getCompareOperant()
	 * @generated
	 */
  void setCompareOperant(String value);

  /**
	 * Returns the value of the '<em><b>Right Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Feature</em>' containment reference.
	 * @see #setRightFeature(CompareValue)
	 * @see org.xtext.bot.language.bla.BlaPackage#getIfCompareExpression_RightFeature()
	 * @model containment="true"
	 * @generated
	 */
  CompareValue getRightFeature();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.IfCompareExpression#getRightFeature <em>Right Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Feature</em>' containment reference.
	 * @see #getRightFeature()
	 * @generated
	 */
  void setRightFeature(CompareValue value);

} // IfCompareExpression
