/**
 */
package org.xtext.bot.language.bla;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.bot.language.bla.BlaPackage
 * @generated
 */
public interface BlaFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  BlaFactory eINSTANCE = org.xtext.bot.language.bla.impl.BlaFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Bot Language</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bot Language</em>'.
	 * @generated
	 */
  BotLanguage createBotLanguage();

  /**
	 * Returns a new object of class '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction</em>'.
	 * @generated
	 */
  Instruction createInstruction();

  /**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
  Notification createNotification();

  /**
	 * Returns a new object of class '<em>Start</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start</em>'.
	 * @generated
	 */
  Start createStart();

  /**
	 * Returns a new object of class '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop</em>'.
	 * @generated
	 */
  Stop createStop();

  /**
	 * Returns a new object of class '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure</em>'.
	 * @generated
	 */
  Procedure createProcedure();

  /**
	 * Returns a new object of class '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait</em>'.
	 * @generated
	 */
  Wait createWait();

  /**
	 * Returns a new object of class '<em>Connect</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connect</em>'.
	 * @generated
	 */
  Connect createConnect();

  /**
	 * Returns a new object of class '<em>Read</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read</em>'.
	 * @generated
	 */
  Read createRead();

  /**
	 * Returns a new object of class '<em>Write</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write</em>'.
	 * @generated
	 */
  Write createWrite();

  /**
	 * Returns a new object of class '<em>Click</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Click</em>'.
	 * @generated
	 */
  Click createClick();

  /**
	 * Returns a new object of class '<em>Var</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var</em>'.
	 * @generated
	 */
  Var createVar();

  /**
	 * Returns a new object of class '<em>IF Statement</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>IF Statement</em>'.
	 * @generated
	 */
  IFStatement createIFStatement();

  /**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
  Block createBlock();

  /**
	 * Returns a new object of class '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Expression</em>'.
	 * @generated
	 */
  IfExpression createIfExpression();

  /**
	 * Returns a new object of class '<em>If And Expression</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>If And Expression</em>'.
	 * @generated
	 */
  IfAndExpression createIfAndExpression();

  /**
	 * Returns a new object of class '<em>If Or Expression</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Or Expression</em>'.
	 * @generated
	 */
  IfOrExpression createIfOrExpression();

  /**
	 * Returns a new object of class '<em>If Compare Expression</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Compare Expression</em>'.
	 * @generated
	 */
  IfCompareExpression createIfCompareExpression();

  /**
	 * Returns a new object of class '<em>Compare Value</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Value</em>'.
	 * @generated
	 */
  CompareValue createCompareValue();

  /**
	 * Returns a new object of class '<em>Compare Feature</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Feature</em>'.
	 * @generated
	 */
  CompareFeature createCompareFeature();

  /**
	 * Returns a new object of class '<em>Mathematical Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mathematical Instructions</em>'.
	 * @generated
	 */
  MathematicalInstructions createMathematicalInstructions();

  /**
	 * Returns a new object of class '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addition</em>'.
	 * @generated
	 */
  Addition createAddition();

  /**
	 * Returns a new object of class '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtraction</em>'.
	 * @generated
	 */
  Subtraction createSubtraction();

  /**
	 * Returns a new object of class '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplication</em>'.
	 * @generated
	 */
  Multiplication createMultiplication();

  /**
	 * Returns a new object of class '<em>Division</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division</em>'.
	 * @generated
	 */
  Division createDivision();

  /**
	 * Returns a new object of class '<em>Math Value1</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Value1</em>'.
	 * @generated
	 */
  MathValue1 createMathValue1();

  /**
	 * Returns a new object of class '<em>Math Value2</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Value2</em>'.
	 * @generated
	 */
  MathValue2 createMathValue2();

  /**
	 * Returns a new object of class '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Loop</em>'.
	 * @generated
	 */
  WhileLoop createWhileLoop();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  BlaPackage getBlaPackage();

} //BlaFactory
