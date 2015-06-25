/**
 */
package org.xtext.bot.language.bla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.IfAndExpression#getLeftFeature <em>Left Feature</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.IfAndExpression#getAnd <em>And</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.IfAndExpression#getRightFeature <em>Right Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bot.language.bla.BlaPackage#getIfAndExpression()
 * @model
 * @generated
 */
public interface IfAndExpression extends IfExpression
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
	 * @see org.xtext.bot.language.bla.BlaPackage#getIfAndExpression_LeftFeature()
	 * @model containment="true"
	 * @generated
	 */
  IfCompareExpression getLeftFeature();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.IfAndExpression#getLeftFeature <em>Left Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Feature</em>' containment reference.
	 * @see #getLeftFeature()
	 * @generated
	 */
  void setLeftFeature(IfCompareExpression value);

  /**
	 * Returns the value of the '<em><b>And</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' attribute.
	 * @see #setAnd(String)
	 * @see org.xtext.bot.language.bla.BlaPackage#getIfAndExpression_And()
	 * @model
	 * @generated
	 */
  String getAnd();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.IfAndExpression#getAnd <em>And</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' attribute.
	 * @see #getAnd()
	 * @generated
	 */
  void setAnd(String value);

  /**
	 * Returns the value of the '<em><b>Right Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Feature</em>' containment reference.
	 * @see #setRightFeature(IfExpression)
	 * @see org.xtext.bot.language.bla.BlaPackage#getIfAndExpression_RightFeature()
	 * @model containment="true"
	 * @generated
	 */
  IfExpression getRightFeature();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.IfAndExpression#getRightFeature <em>Right Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Feature</em>' containment reference.
	 * @see #getRightFeature()
	 * @generated
	 */
  void setRightFeature(IfExpression value);

} // IfAndExpression
