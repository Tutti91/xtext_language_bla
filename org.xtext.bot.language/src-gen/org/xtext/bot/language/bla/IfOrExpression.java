/**
 */
package org.xtext.bot.language.bla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.IfOrExpression#getLeftFeature <em>Left Feature</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.IfOrExpression#getOr <em>Or</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.IfOrExpression#getRightFeature <em>Right Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bot.language.bla.BlaPackage#getIfOrExpression()
 * @model
 * @generated
 */
public interface IfOrExpression extends IfExpression
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
	 * @see #setLeftFeature(IfCompareExpression)
	 * @see org.xtext.bot.language.bla.BlaPackage#getIfOrExpression_LeftFeature()
	 * @model containment="true"
	 * @generated
	 */
  IfCompareExpression getLeftFeature();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.IfOrExpression#getLeftFeature <em>Left Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Feature</em>' containment reference.
	 * @see #getLeftFeature()
	 * @generated
	 */
  void setLeftFeature(IfCompareExpression value);

  /**
	 * Returns the value of the '<em><b>Or</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' attribute.
	 * @see #setOr(String)
	 * @see org.xtext.bot.language.bla.BlaPackage#getIfOrExpression_Or()
	 * @model
	 * @generated
	 */
  String getOr();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.IfOrExpression#getOr <em>Or</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' attribute.
	 * @see #getOr()
	 * @generated
	 */
  void setOr(String value);

  /**
	 * Returns the value of the '<em><b>Right Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Feature</em>' containment reference.
	 * @see #setRightFeature(IfCompareExpression)
	 * @see org.xtext.bot.language.bla.BlaPackage#getIfOrExpression_RightFeature()
	 * @model containment="true"
	 * @generated
	 */
  IfCompareExpression getRightFeature();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.IfOrExpression#getRightFeature <em>Right Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Feature</em>' containment reference.
	 * @see #getRightFeature()
	 * @generated
	 */
  void setRightFeature(IfCompareExpression value);

} // IfOrExpression
