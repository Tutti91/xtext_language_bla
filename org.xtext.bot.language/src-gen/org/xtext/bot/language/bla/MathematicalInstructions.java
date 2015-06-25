/**
 */
package org.xtext.bot.language.bla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mathematical Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.MathematicalInstructions#getValueLeft <em>Value Left</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.MathematicalInstructions#getValueRight <em>Value Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bot.language.bla.BlaPackage#getMathematicalInstructions()
 * @model
 * @generated
 */
public interface MathematicalInstructions extends CompareValue, CompareFeature
{
  /**
	 * Returns the value of the '<em><b>Value Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Left</em>' containment reference.
	 * @see #setValueLeft(MathValue1)
	 * @see org.xtext.bot.language.bla.BlaPackage#getMathematicalInstructions_ValueLeft()
	 * @model containment="true"
	 * @generated
	 */
  MathValue1 getValueLeft();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.MathematicalInstructions#getValueLeft <em>Value Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Left</em>' containment reference.
	 * @see #getValueLeft()
	 * @generated
	 */
  void setValueLeft(MathValue1 value);

  /**
	 * Returns the value of the '<em><b>Value Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Right</em>' containment reference.
	 * @see #setValueRight(MathValue2)
	 * @see org.xtext.bot.language.bla.BlaPackage#getMathematicalInstructions_ValueRight()
	 * @model containment="true"
	 * @generated
	 */
  MathValue2 getValueRight();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.MathematicalInstructions#getValueRight <em>Value Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Right</em>' containment reference.
	 * @see #getValueRight()
	 * @generated
	 */
  void setValueRight(MathValue2 value);

} // MathematicalInstructions
