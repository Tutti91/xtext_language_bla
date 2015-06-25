/**
 */
package org.xtext.bot.language.bla;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.bot.language.bla.BlaFactory
 * @model kind="package"
 * @generated
 */
public interface BlaPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "bla";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.xtext.org/bot/language/Bla";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "bla";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  BlaPackage eINSTANCE = org.xtext.bot.language.bla.impl.BlaPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.BotLanguageImpl <em>Bot Language</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.BotLanguageImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getBotLanguage()
	 * @generated
	 */
  int BOT_LANGUAGE = 0;

  /**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOT_LANGUAGE__INSTRUCTIONS = 0;

  /**
	 * The number of structural features of the '<em>Bot Language</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOT_LANGUAGE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.InstructionImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getInstruction()
	 * @generated
	 */
  int INSTRUCTION = 1;

  /**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.ProcedureImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getProcedure()
	 * @generated
	 */
  int PROCEDURE = 5;

  /**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROCEDURE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.NotificationImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getNotification()
	 * @generated
	 */
  int NOTIFICATION = 2;

  /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOTIFICATION__ACTION = PROCEDURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOTIFICATION__NAME = PROCEDURE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOTIFICATION__ADDRESS = PROCEDURE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NOTIFICATION_FEATURE_COUNT = PROCEDURE_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.StartImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getStart()
	 * @generated
	 */
  int START = 3;

  /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int START__ACTION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int START__NAME = INSTRUCTION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int START_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.StopImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getStop()
	 * @generated
	 */
  int STOP = 4;

  /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STOP__ACTION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STOP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.WaitImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getWait()
	 * @generated
	 */
  int WAIT = 6;

  /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WAIT__ACTION = PROCEDURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WAIT__NAME = PROCEDURE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WAIT_FEATURE_COUNT = PROCEDURE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.ConnectImpl <em>Connect</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.ConnectImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getConnect()
	 * @generated
	 */
  int CONNECT = 7;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONNECT__NAME = PROCEDURE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Connect</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONNECT_FEATURE_COUNT = PROCEDURE_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.ReadImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getRead()
	 * @generated
	 */
  int READ = 8;

  /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int READ__ACTION = PROCEDURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Variable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int READ__VARIABLE_VALUE = PROCEDURE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Variable Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int READ__VARIABLE_FEATURE = PROCEDURE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int READ__NAME = PROCEDURE_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int READ_FEATURE_COUNT = PROCEDURE_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.WriteImpl <em>Write</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.WriteImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getWrite()
	 * @generated
	 */
  int WRITE = 9;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WRITE__NAME = PROCEDURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WRITE__VALUE = PROCEDURE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Write</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WRITE_FEATURE_COUNT = PROCEDURE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.ClickImpl <em>Click</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.ClickImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getClick()
	 * @generated
	 */
  int CLICK = 10;

  /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CLICK__ACTION = PROCEDURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CLICK__NAME = PROCEDURE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Click</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CLICK_FEATURE_COUNT = PROCEDURE_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.VarImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getVar()
	 * @generated
	 */
  int VAR = 11;

  /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VAR__ACTION = PROCEDURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VAR__NAME = PROCEDURE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VAR__VALUE = PROCEDURE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VAR_FEATURE_COUNT = PROCEDURE_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.IFStatementImpl <em>IF Statement</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.IFStatementImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getIFStatement()
	 * @generated
	 */
  int IF_STATEMENT = 12;

  /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_STATEMENT__ACTION = PROCEDURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_STATEMENT__IF = PROCEDURE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Then</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_STATEMENT__THEN = PROCEDURE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_STATEMENT__ELSE = PROCEDURE_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>IF Statement</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_STATEMENT_FEATURE_COUNT = PROCEDURE_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.BlockImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getBlock()
	 * @generated
	 */
  int BLOCK = 13;

  /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BLOCK__ACTION = 0;

  /**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BLOCK_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.IfExpressionImpl <em>If Expression</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.IfExpressionImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getIfExpression()
	 * @generated
	 */
  int IF_EXPRESSION = 14;

  /**
	 * The number of structural features of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_EXPRESSION_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.IfAndExpressionImpl <em>If And Expression</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.IfAndExpressionImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getIfAndExpression()
	 * @generated
	 */
  int IF_AND_EXPRESSION = 15;

  /**
	 * The feature id for the '<em><b>Left Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_AND_EXPRESSION__LEFT_FEATURE = IF_EXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>And</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_AND_EXPRESSION__AND = IF_EXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Right Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_AND_EXPRESSION__RIGHT_FEATURE = IF_EXPRESSION_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>If And Expression</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_AND_EXPRESSION_FEATURE_COUNT = IF_EXPRESSION_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.IfOrExpressionImpl <em>If Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.IfOrExpressionImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getIfOrExpression()
	 * @generated
	 */
  int IF_OR_EXPRESSION = 16;

  /**
	 * The feature id for the '<em><b>Left Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_OR_EXPRESSION__LEFT_FEATURE = IF_EXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Or</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_OR_EXPRESSION__OR = IF_EXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Right Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_OR_EXPRESSION__RIGHT_FEATURE = IF_EXPRESSION_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>If Or Expression</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_OR_EXPRESSION_FEATURE_COUNT = IF_EXPRESSION_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.IfCompareExpressionImpl <em>If Compare Expression</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.IfCompareExpressionImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getIfCompareExpression()
	 * @generated
	 */
  int IF_COMPARE_EXPRESSION = 17;

  /**
	 * The feature id for the '<em><b>Left Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_COMPARE_EXPRESSION__LEFT_FEATURE = IF_EXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Compare Operant</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_COMPARE_EXPRESSION__COMPARE_OPERANT = IF_EXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Right Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_COMPARE_EXPRESSION__RIGHT_FEATURE = IF_EXPRESSION_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>If Compare Expression</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_COMPARE_EXPRESSION_FEATURE_COUNT = IF_EXPRESSION_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.CompareValueImpl <em>Compare Value</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.CompareValueImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getCompareValue()
	 * @generated
	 */
  int COMPARE_VALUE = 18;

  /**
	 * The feature id for the '<em><b>Variable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPARE_VALUE__VARIABLE_VALUE = 0;

  /**
	 * The number of structural features of the '<em>Compare Value</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPARE_VALUE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.CompareFeatureImpl <em>Compare Feature</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.CompareFeatureImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getCompareFeature()
	 * @generated
	 */
  int COMPARE_FEATURE = 19;

  /**
	 * The feature id for the '<em><b>Variable Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPARE_FEATURE__VARIABLE_FEATURE = 0;

  /**
	 * The number of structural features of the '<em>Compare Feature</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COMPARE_FEATURE_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.MathematicalInstructionsImpl <em>Mathematical Instructions</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.MathematicalInstructionsImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getMathematicalInstructions()
	 * @generated
	 */
  int MATHEMATICAL_INSTRUCTIONS = 20;

  /**
	 * The feature id for the '<em><b>Variable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MATHEMATICAL_INSTRUCTIONS__VARIABLE_VALUE = COMPARE_VALUE__VARIABLE_VALUE;

  /**
	 * The feature id for the '<em><b>Variable Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE = COMPARE_VALUE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Value Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT = COMPARE_VALUE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Value Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT = COMPARE_VALUE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Mathematical Instructions</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MATHEMATICAL_INSTRUCTIONS_FEATURE_COUNT = COMPARE_VALUE_FEATURE_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.AdditionImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getAddition()
	 * @generated
	 */
  int ADDITION = 21;

  /**
	 * The feature id for the '<em><b>Variable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDITION__VARIABLE_VALUE = MATHEMATICAL_INSTRUCTIONS__VARIABLE_VALUE;

  /**
	 * The feature id for the '<em><b>Variable Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDITION__VARIABLE_FEATURE = MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE;

  /**
	 * The feature id for the '<em><b>Value Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDITION__VALUE_LEFT = MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT;

  /**
	 * The feature id for the '<em><b>Value Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDITION__VALUE_RIGHT = MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT;

  /**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ADDITION_FEATURE_COUNT = MATHEMATICAL_INSTRUCTIONS_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.SubtractionImpl <em>Subtraction</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.SubtractionImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getSubtraction()
	 * @generated
	 */
  int SUBTRACTION = 22;

  /**
	 * The feature id for the '<em><b>Variable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBTRACTION__VARIABLE_VALUE = MATHEMATICAL_INSTRUCTIONS__VARIABLE_VALUE;

  /**
	 * The feature id for the '<em><b>Variable Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBTRACTION__VARIABLE_FEATURE = MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE;

  /**
	 * The feature id for the '<em><b>Value Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBTRACTION__VALUE_LEFT = MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT;

  /**
	 * The feature id for the '<em><b>Value Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBTRACTION__VALUE_RIGHT = MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT;

  /**
	 * The number of structural features of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBTRACTION_FEATURE_COUNT = MATHEMATICAL_INSTRUCTIONS_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.MultiplicationImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getMultiplication()
	 * @generated
	 */
  int MULTIPLICATION = 23;

  /**
	 * The feature id for the '<em><b>Variable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MULTIPLICATION__VARIABLE_VALUE = MATHEMATICAL_INSTRUCTIONS__VARIABLE_VALUE;

  /**
	 * The feature id for the '<em><b>Variable Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MULTIPLICATION__VARIABLE_FEATURE = MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE;

  /**
	 * The feature id for the '<em><b>Value Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MULTIPLICATION__VALUE_LEFT = MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT;

  /**
	 * The feature id for the '<em><b>Value Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MULTIPLICATION__VALUE_RIGHT = MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT;

  /**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MULTIPLICATION_FEATURE_COUNT = MATHEMATICAL_INSTRUCTIONS_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.DivisionImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getDivision()
	 * @generated
	 */
  int DIVISION = 24;

  /**
	 * The feature id for the '<em><b>Variable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DIVISION__VARIABLE_VALUE = MATHEMATICAL_INSTRUCTIONS__VARIABLE_VALUE;

  /**
	 * The feature id for the '<em><b>Variable Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DIVISION__VARIABLE_FEATURE = MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE;

  /**
	 * The feature id for the '<em><b>Value Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DIVISION__VALUE_LEFT = MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT;

  /**
	 * The feature id for the '<em><b>Value Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DIVISION__VALUE_RIGHT = MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT;

  /**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DIVISION_FEATURE_COUNT = MATHEMATICAL_INSTRUCTIONS_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.MathValue1Impl <em>Math Value1</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.MathValue1Impl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getMathValue1()
	 * @generated
	 */
  int MATH_VALUE1 = 25;

  /**
	 * The number of structural features of the '<em>Math Value1</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MATH_VALUE1_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.MathValue2Impl <em>Math Value2</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.MathValue2Impl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getMathValue2()
	 * @generated
	 */
  int MATH_VALUE2 = 26;

  /**
	 * The number of structural features of the '<em>Math Value2</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MATH_VALUE2_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.xtext.bot.language.bla.impl.WhileLoopImpl <em>While Loop</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.bot.language.bla.impl.WhileLoopImpl
	 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getWhileLoop()
	 * @generated
	 */
  int WHILE_LOOP = 27;

  /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHILE_LOOP__ACTION = PROCEDURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHILE_LOOP__WHILE = PROCEDURE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Do Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHILE_LOOP__DO_LOOP = PROCEDURE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHILE_LOOP_FEATURE_COUNT = PROCEDURE_FEATURE_COUNT + 3;


  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.BotLanguage <em>Bot Language</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bot Language</em>'.
	 * @see org.xtext.bot.language.bla.BotLanguage
	 * @generated
	 */
  EClass getBotLanguage();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.bot.language.bla.BotLanguage#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.xtext.bot.language.bla.BotLanguage#getInstructions()
	 * @see #getBotLanguage()
	 * @generated
	 */
  EReference getBotLanguage_Instructions();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see org.xtext.bot.language.bla.Instruction
	 * @generated
	 */
  EClass getInstruction();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see org.xtext.bot.language.bla.Notification
	 * @generated
	 */
  EClass getNotification();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.Notification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.bot.language.bla.Notification#getName()
	 * @see #getNotification()
	 * @generated
	 */
  EAttribute getNotification_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.Notification#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.xtext.bot.language.bla.Notification#getAddress()
	 * @see #getNotification()
	 * @generated
	 */
  EAttribute getNotification_Address();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see org.xtext.bot.language.bla.Start
	 * @generated
	 */
  EClass getStart();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.Start#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.bot.language.bla.Start#getName()
	 * @see #getStart()
	 * @generated
	 */
  EAttribute getStart_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see org.xtext.bot.language.bla.Stop
	 * @generated
	 */
  EClass getStop();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.xtext.bot.language.bla.Procedure
	 * @generated
	 */
  EClass getProcedure();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see org.xtext.bot.language.bla.Wait
	 * @generated
	 */
  EClass getWait();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.Wait#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.bot.language.bla.Wait#getName()
	 * @see #getWait()
	 * @generated
	 */
  EAttribute getWait_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Connect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect</em>'.
	 * @see org.xtext.bot.language.bla.Connect
	 * @generated
	 */
  EClass getConnect();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.Connect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.bot.language.bla.Connect#getName()
	 * @see #getConnect()
	 * @generated
	 */
  EAttribute getConnect_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see org.xtext.bot.language.bla.Read
	 * @generated
	 */
  EClass getRead();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.Read#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.bot.language.bla.Read#getName()
	 * @see #getRead()
	 * @generated
	 */
  EAttribute getRead_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Write <em>Write</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write</em>'.
	 * @see org.xtext.bot.language.bla.Write
	 * @generated
	 */
  EClass getWrite();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.Write#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.bot.language.bla.Write#getName()
	 * @see #getWrite()
	 * @generated
	 */
  EAttribute getWrite_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.Write#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xtext.bot.language.bla.Write#getValue()
	 * @see #getWrite()
	 * @generated
	 */
  EAttribute getWrite_Value();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Click <em>Click</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Click</em>'.
	 * @see org.xtext.bot.language.bla.Click
	 * @generated
	 */
  EClass getClick();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.Click#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.bot.language.bla.Click#getName()
	 * @see #getClick()
	 * @generated
	 */
  EAttribute getClick_Name();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see org.xtext.bot.language.bla.Var
	 * @generated
	 */
  EClass getVar();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.Var#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.bot.language.bla.Var#getName()
	 * @see #getVar()
	 * @generated
	 */
  EAttribute getVar_Name();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.Var#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.xtext.bot.language.bla.Var#getValue()
	 * @see #getVar()
	 * @generated
	 */
  EReference getVar_Value();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.IFStatement <em>IF Statement</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IF Statement</em>'.
	 * @see org.xtext.bot.language.bla.IFStatement
	 * @generated
	 */
  EClass getIFStatement();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.IFStatement#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.xtext.bot.language.bla.IFStatement#getIf()
	 * @see #getIFStatement()
	 * @generated
	 */
  EReference getIFStatement_If();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.bot.language.bla.IFStatement#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
	 * @see org.xtext.bot.language.bla.IFStatement#getThen()
	 * @see #getIFStatement()
	 * @generated
	 */
  EReference getIFStatement_Then();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.bot.language.bla.IFStatement#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see org.xtext.bot.language.bla.IFStatement#getElse()
	 * @see #getIFStatement()
	 * @generated
	 */
  EReference getIFStatement_Else();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.xtext.bot.language.bla.Block
	 * @generated
	 */
  EClass getBlock();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.Block#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.xtext.bot.language.bla.Block#getAction()
	 * @see #getBlock()
	 * @generated
	 */
  EReference getBlock_Action();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expression</em>'.
	 * @see org.xtext.bot.language.bla.IfExpression
	 * @generated
	 */
  EClass getIfExpression();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.IfAndExpression <em>If And Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If And Expression</em>'.
	 * @see org.xtext.bot.language.bla.IfAndExpression
	 * @generated
	 */
  EClass getIfAndExpression();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.IfAndExpression#getLeftFeature <em>Left Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Feature</em>'.
	 * @see org.xtext.bot.language.bla.IfAndExpression#getLeftFeature()
	 * @see #getIfAndExpression()
	 * @generated
	 */
  EReference getIfAndExpression_LeftFeature();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.IfAndExpression#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>And</em>'.
	 * @see org.xtext.bot.language.bla.IfAndExpression#getAnd()
	 * @see #getIfAndExpression()
	 * @generated
	 */
  EAttribute getIfAndExpression_And();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.IfAndExpression#getRightFeature <em>Right Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Feature</em>'.
	 * @see org.xtext.bot.language.bla.IfAndExpression#getRightFeature()
	 * @see #getIfAndExpression()
	 * @generated
	 */
  EReference getIfAndExpression_RightFeature();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.IfOrExpression <em>If Or Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Or Expression</em>'.
	 * @see org.xtext.bot.language.bla.IfOrExpression
	 * @generated
	 */
  EClass getIfOrExpression();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.IfOrExpression#getLeftFeature <em>Left Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Feature</em>'.
	 * @see org.xtext.bot.language.bla.IfOrExpression#getLeftFeature()
	 * @see #getIfOrExpression()
	 * @generated
	 */
  EReference getIfOrExpression_LeftFeature();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.IfOrExpression#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Or</em>'.
	 * @see org.xtext.bot.language.bla.IfOrExpression#getOr()
	 * @see #getIfOrExpression()
	 * @generated
	 */
  EAttribute getIfOrExpression_Or();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.IfOrExpression#getRightFeature <em>Right Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Feature</em>'.
	 * @see org.xtext.bot.language.bla.IfOrExpression#getRightFeature()
	 * @see #getIfOrExpression()
	 * @generated
	 */
  EReference getIfOrExpression_RightFeature();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.IfCompareExpression <em>If Compare Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Compare Expression</em>'.
	 * @see org.xtext.bot.language.bla.IfCompareExpression
	 * @generated
	 */
  EClass getIfCompareExpression();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.IfCompareExpression#getLeftFeature <em>Left Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Feature</em>'.
	 * @see org.xtext.bot.language.bla.IfCompareExpression#getLeftFeature()
	 * @see #getIfCompareExpression()
	 * @generated
	 */
  EReference getIfCompareExpression_LeftFeature();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.bot.language.bla.IfCompareExpression#getCompareOperant <em>Compare Operant</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compare Operant</em>'.
	 * @see org.xtext.bot.language.bla.IfCompareExpression#getCompareOperant()
	 * @see #getIfCompareExpression()
	 * @generated
	 */
  EAttribute getIfCompareExpression_CompareOperant();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.IfCompareExpression#getRightFeature <em>Right Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Feature</em>'.
	 * @see org.xtext.bot.language.bla.IfCompareExpression#getRightFeature()
	 * @see #getIfCompareExpression()
	 * @generated
	 */
  EReference getIfCompareExpression_RightFeature();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.CompareValue <em>Compare Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare Value</em>'.
	 * @see org.xtext.bot.language.bla.CompareValue
	 * @generated
	 */
  EClass getCompareValue();

  /**
	 * Returns the meta object for the reference '{@link org.xtext.bot.language.bla.CompareValue#getVariableValue <em>Variable Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Value</em>'.
	 * @see org.xtext.bot.language.bla.CompareValue#getVariableValue()
	 * @see #getCompareValue()
	 * @generated
	 */
  EReference getCompareValue_VariableValue();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.CompareFeature <em>Compare Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare Feature</em>'.
	 * @see org.xtext.bot.language.bla.CompareFeature
	 * @generated
	 */
  EClass getCompareFeature();

  /**
	 * Returns the meta object for the reference '{@link org.xtext.bot.language.bla.CompareFeature#getVariableFeature <em>Variable Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Feature</em>'.
	 * @see org.xtext.bot.language.bla.CompareFeature#getVariableFeature()
	 * @see #getCompareFeature()
	 * @generated
	 */
  EReference getCompareFeature_VariableFeature();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.MathematicalInstructions <em>Mathematical Instructions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mathematical Instructions</em>'.
	 * @see org.xtext.bot.language.bla.MathematicalInstructions
	 * @generated
	 */
  EClass getMathematicalInstructions();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.MathematicalInstructions#getValueLeft <em>Value Left</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Left</em>'.
	 * @see org.xtext.bot.language.bla.MathematicalInstructions#getValueLeft()
	 * @see #getMathematicalInstructions()
	 * @generated
	 */
  EReference getMathematicalInstructions_ValueLeft();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.MathematicalInstructions#getValueRight <em>Value Right</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Right</em>'.
	 * @see org.xtext.bot.language.bla.MathematicalInstructions#getValueRight()
	 * @see #getMathematicalInstructions()
	 * @generated
	 */
  EReference getMathematicalInstructions_ValueRight();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see org.xtext.bot.language.bla.Addition
	 * @generated
	 */
  EClass getAddition();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtraction</em>'.
	 * @see org.xtext.bot.language.bla.Subtraction
	 * @generated
	 */
  EClass getSubtraction();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see org.xtext.bot.language.bla.Multiplication
	 * @generated
	 */
  EClass getMultiplication();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see org.xtext.bot.language.bla.Division
	 * @generated
	 */
  EClass getDivision();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.MathValue1 <em>Math Value1</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Value1</em>'.
	 * @see org.xtext.bot.language.bla.MathValue1
	 * @generated
	 */
  EClass getMathValue1();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.MathValue2 <em>Math Value2</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Value2</em>'.
	 * @see org.xtext.bot.language.bla.MathValue2
	 * @generated
	 */
  EClass getMathValue2();

  /**
	 * Returns the meta object for class '{@link org.xtext.bot.language.bla.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Loop</em>'.
	 * @see org.xtext.bot.language.bla.WhileLoop
	 * @generated
	 */
  EClass getWhileLoop();

  /**
	 * Returns the meta object for the containment reference '{@link org.xtext.bot.language.bla.WhileLoop#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see org.xtext.bot.language.bla.WhileLoop#getWhile()
	 * @see #getWhileLoop()
	 * @generated
	 */
  EReference getWhileLoop_While();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.bot.language.bla.WhileLoop#getDoLoop <em>Do Loop</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Do Loop</em>'.
	 * @see org.xtext.bot.language.bla.WhileLoop#getDoLoop()
	 * @see #getWhileLoop()
	 * @generated
	 */
  EReference getWhileLoop_DoLoop();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  BlaFactory getBlaFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.BotLanguageImpl <em>Bot Language</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.BotLanguageImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getBotLanguage()
		 * @generated
		 */
    EClass BOT_LANGUAGE = eINSTANCE.getBotLanguage();

    /**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference BOT_LANGUAGE__INSTRUCTIONS = eINSTANCE.getBotLanguage_Instructions();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.InstructionImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getInstruction()
		 * @generated
		 */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.NotificationImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getNotification()
		 * @generated
		 */
    EClass NOTIFICATION = eINSTANCE.getNotification();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NOTIFICATION__NAME = eINSTANCE.getNotification_Name();

    /**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NOTIFICATION__ADDRESS = eINSTANCE.getNotification_Address();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.StartImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getStart()
		 * @generated
		 */
    EClass START = eINSTANCE.getStart();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute START__NAME = eINSTANCE.getStart_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.StopImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getStop()
		 * @generated
		 */
    EClass STOP = eINSTANCE.getStop();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.ProcedureImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getProcedure()
		 * @generated
		 */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.WaitImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getWait()
		 * @generated
		 */
    EClass WAIT = eINSTANCE.getWait();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WAIT__NAME = eINSTANCE.getWait_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.ConnectImpl <em>Connect</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.ConnectImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getConnect()
		 * @generated
		 */
    EClass CONNECT = eINSTANCE.getConnect();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CONNECT__NAME = eINSTANCE.getConnect_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.ReadImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getRead()
		 * @generated
		 */
    EClass READ = eINSTANCE.getRead();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute READ__NAME = eINSTANCE.getRead_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.WriteImpl <em>Write</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.WriteImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getWrite()
		 * @generated
		 */
    EClass WRITE = eINSTANCE.getWrite();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WRITE__NAME = eINSTANCE.getWrite_Name();

    /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WRITE__VALUE = eINSTANCE.getWrite_Value();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.ClickImpl <em>Click</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.ClickImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getClick()
		 * @generated
		 */
    EClass CLICK = eINSTANCE.getClick();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CLICK__NAME = eINSTANCE.getClick_Name();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.VarImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getVar()
		 * @generated
		 */
    EClass VAR = eINSTANCE.getVar();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VAR__NAME = eINSTANCE.getVar_Name();

    /**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VAR__VALUE = eINSTANCE.getVar_Value();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.IFStatementImpl <em>IF Statement</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.IFStatementImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getIFStatement()
		 * @generated
		 */
    EClass IF_STATEMENT = eINSTANCE.getIFStatement();

    /**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_STATEMENT__IF = eINSTANCE.getIFStatement_If();

    /**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_STATEMENT__THEN = eINSTANCE.getIFStatement_Then();

    /**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_STATEMENT__ELSE = eINSTANCE.getIFStatement_Else();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.BlockImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getBlock()
		 * @generated
		 */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference BLOCK__ACTION = eINSTANCE.getBlock_Action();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.IfExpressionImpl <em>If Expression</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.IfExpressionImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getIfExpression()
		 * @generated
		 */
    EClass IF_EXPRESSION = eINSTANCE.getIfExpression();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.IfAndExpressionImpl <em>If And Expression</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.IfAndExpressionImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getIfAndExpression()
		 * @generated
		 */
    EClass IF_AND_EXPRESSION = eINSTANCE.getIfAndExpression();

    /**
		 * The meta object literal for the '<em><b>Left Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_AND_EXPRESSION__LEFT_FEATURE = eINSTANCE.getIfAndExpression_LeftFeature();

    /**
		 * The meta object literal for the '<em><b>And</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IF_AND_EXPRESSION__AND = eINSTANCE.getIfAndExpression_And();

    /**
		 * The meta object literal for the '<em><b>Right Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_AND_EXPRESSION__RIGHT_FEATURE = eINSTANCE.getIfAndExpression_RightFeature();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.IfOrExpressionImpl <em>If Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.IfOrExpressionImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getIfOrExpression()
		 * @generated
		 */
    EClass IF_OR_EXPRESSION = eINSTANCE.getIfOrExpression();

    /**
		 * The meta object literal for the '<em><b>Left Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_OR_EXPRESSION__LEFT_FEATURE = eINSTANCE.getIfOrExpression_LeftFeature();

    /**
		 * The meta object literal for the '<em><b>Or</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IF_OR_EXPRESSION__OR = eINSTANCE.getIfOrExpression_Or();

    /**
		 * The meta object literal for the '<em><b>Right Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_OR_EXPRESSION__RIGHT_FEATURE = eINSTANCE.getIfOrExpression_RightFeature();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.IfCompareExpressionImpl <em>If Compare Expression</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.IfCompareExpressionImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getIfCompareExpression()
		 * @generated
		 */
    EClass IF_COMPARE_EXPRESSION = eINSTANCE.getIfCompareExpression();

    /**
		 * The meta object literal for the '<em><b>Left Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_COMPARE_EXPRESSION__LEFT_FEATURE = eINSTANCE.getIfCompareExpression_LeftFeature();

    /**
		 * The meta object literal for the '<em><b>Compare Operant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IF_COMPARE_EXPRESSION__COMPARE_OPERANT = eINSTANCE.getIfCompareExpression_CompareOperant();

    /**
		 * The meta object literal for the '<em><b>Right Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_COMPARE_EXPRESSION__RIGHT_FEATURE = eINSTANCE.getIfCompareExpression_RightFeature();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.CompareValueImpl <em>Compare Value</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.CompareValueImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getCompareValue()
		 * @generated
		 */
    EClass COMPARE_VALUE = eINSTANCE.getCompareValue();

    /**
		 * The meta object literal for the '<em><b>Variable Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COMPARE_VALUE__VARIABLE_VALUE = eINSTANCE.getCompareValue_VariableValue();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.CompareFeatureImpl <em>Compare Feature</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.CompareFeatureImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getCompareFeature()
		 * @generated
		 */
    EClass COMPARE_FEATURE = eINSTANCE.getCompareFeature();

    /**
		 * The meta object literal for the '<em><b>Variable Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COMPARE_FEATURE__VARIABLE_FEATURE = eINSTANCE.getCompareFeature_VariableFeature();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.MathematicalInstructionsImpl <em>Mathematical Instructions</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.MathematicalInstructionsImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getMathematicalInstructions()
		 * @generated
		 */
    EClass MATHEMATICAL_INSTRUCTIONS = eINSTANCE.getMathematicalInstructions();

    /**
		 * The meta object literal for the '<em><b>Value Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT = eINSTANCE.getMathematicalInstructions_ValueLeft();

    /**
		 * The meta object literal for the '<em><b>Value Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT = eINSTANCE.getMathematicalInstructions_ValueRight();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.AdditionImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getAddition()
		 * @generated
		 */
    EClass ADDITION = eINSTANCE.getAddition();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.SubtractionImpl <em>Subtraction</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.SubtractionImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getSubtraction()
		 * @generated
		 */
    EClass SUBTRACTION = eINSTANCE.getSubtraction();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.MultiplicationImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getMultiplication()
		 * @generated
		 */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.DivisionImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getDivision()
		 * @generated
		 */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.MathValue1Impl <em>Math Value1</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.MathValue1Impl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getMathValue1()
		 * @generated
		 */
    EClass MATH_VALUE1 = eINSTANCE.getMathValue1();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.MathValue2Impl <em>Math Value2</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.MathValue2Impl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getMathValue2()
		 * @generated
		 */
    EClass MATH_VALUE2 = eINSTANCE.getMathValue2();

    /**
		 * The meta object literal for the '{@link org.xtext.bot.language.bla.impl.WhileLoopImpl <em>While Loop</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.bot.language.bla.impl.WhileLoopImpl
		 * @see org.xtext.bot.language.bla.impl.BlaPackageImpl#getWhileLoop()
		 * @generated
		 */
    EClass WHILE_LOOP = eINSTANCE.getWhileLoop();

    /**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WHILE_LOOP__WHILE = eINSTANCE.getWhileLoop_While();

    /**
		 * The meta object literal for the '<em><b>Do Loop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WHILE_LOOP__DO_LOOP = eINSTANCE.getWhileLoop_DoLoop();

  }

} //BlaPackage
