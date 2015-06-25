/**
 */
package org.xtext.bot.language.bla.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.bot.language.bla.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlaFactoryImpl extends EFactoryImpl implements BlaFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static BlaFactory init()
  {
		try {
			BlaFactory theBlaFactory = (BlaFactory)EPackage.Registry.INSTANCE.getEFactory(BlaPackage.eNS_URI);
			if (theBlaFactory != null) {
				return theBlaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlaFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BlaFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case BlaPackage.BOT_LANGUAGE: return createBotLanguage();
			case BlaPackage.INSTRUCTION: return createInstruction();
			case BlaPackage.NOTIFICATION: return createNotification();
			case BlaPackage.START: return createStart();
			case BlaPackage.STOP: return createStop();
			case BlaPackage.PROCEDURE: return createProcedure();
			case BlaPackage.WAIT: return createWait();
			case BlaPackage.CONNECT: return createConnect();
			case BlaPackage.READ: return createRead();
			case BlaPackage.WRITE: return createWrite();
			case BlaPackage.CLICK: return createClick();
			case BlaPackage.VAR: return createVar();
			case BlaPackage.IF_STATEMENT: return createIFStatement();
			case BlaPackage.BLOCK: return createBlock();
			case BlaPackage.IF_EXPRESSION: return createIfExpression();
			case BlaPackage.IF_AND_EXPRESSION: return createIfAndExpression();
			case BlaPackage.IF_OR_EXPRESSION: return createIfOrExpression();
			case BlaPackage.IF_COMPARE_EXPRESSION: return createIfCompareExpression();
			case BlaPackage.COMPARE_VALUE: return createCompareValue();
			case BlaPackage.COMPARE_FEATURE: return createCompareFeature();
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS: return createMathematicalInstructions();
			case BlaPackage.ADDITION: return createAddition();
			case BlaPackage.SUBTRACTION: return createSubtraction();
			case BlaPackage.MULTIPLICATION: return createMultiplication();
			case BlaPackage.DIVISION: return createDivision();
			case BlaPackage.MATH_VALUE1: return createMathValue1();
			case BlaPackage.MATH_VALUE2: return createMathValue2();
			case BlaPackage.WHILE_LOOP: return createWhileLoop();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BotLanguage createBotLanguage()
  {
		BotLanguageImpl botLanguage = new BotLanguageImpl();
		return botLanguage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Instruction createInstruction()
  {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Notification createNotification()
  {
		NotificationImpl notification = new NotificationImpl();
		return notification;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Start createStart()
  {
		StartImpl start = new StartImpl();
		return start;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Stop createStop()
  {
		StopImpl stop = new StopImpl();
		return stop;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Procedure createProcedure()
  {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Wait createWait()
  {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Connect createConnect()
  {
		ConnectImpl connect = new ConnectImpl();
		return connect;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Read createRead()
  {
		ReadImpl read = new ReadImpl();
		return read;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Write createWrite()
  {
		WriteImpl write = new WriteImpl();
		return write;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Click createClick()
  {
		ClickImpl click = new ClickImpl();
		return click;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Var createVar()
  {
		VarImpl var = new VarImpl();
		return var;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IFStatement createIFStatement()
  {
		IFStatementImpl ifStatement = new IFStatementImpl();
		return ifStatement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Block createBlock()
  {
		BlockImpl block = new BlockImpl();
		return block;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IfExpression createIfExpression()
  {
		IfExpressionImpl ifExpression = new IfExpressionImpl();
		return ifExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IfAndExpression createIfAndExpression()
  {
		IfAndExpressionImpl ifAndExpression = new IfAndExpressionImpl();
		return ifAndExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IfOrExpression createIfOrExpression()
  {
		IfOrExpressionImpl ifOrExpression = new IfOrExpressionImpl();
		return ifOrExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IfCompareExpression createIfCompareExpression()
  {
		IfCompareExpressionImpl ifCompareExpression = new IfCompareExpressionImpl();
		return ifCompareExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CompareValue createCompareValue()
  {
		CompareValueImpl compareValue = new CompareValueImpl();
		return compareValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CompareFeature createCompareFeature()
  {
		CompareFeatureImpl compareFeature = new CompareFeatureImpl();
		return compareFeature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MathematicalInstructions createMathematicalInstructions()
  {
		MathematicalInstructionsImpl mathematicalInstructions = new MathematicalInstructionsImpl();
		return mathematicalInstructions;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Addition createAddition()
  {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Subtraction createSubtraction()
  {
		SubtractionImpl subtraction = new SubtractionImpl();
		return subtraction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Multiplication createMultiplication()
  {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Division createDivision()
  {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MathValue1 createMathValue1()
  {
		MathValue1Impl mathValue1 = new MathValue1Impl();
		return mathValue1;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MathValue2 createMathValue2()
  {
		MathValue2Impl mathValue2 = new MathValue2Impl();
		return mathValue2;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WhileLoop createWhileLoop()
  {
		WhileLoopImpl whileLoop = new WhileLoopImpl();
		return whileLoop;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BlaPackage getBlaPackage()
  {
		return (BlaPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static BlaPackage getPackage()
  {
		return BlaPackage.eINSTANCE;
	}

} //BlaFactoryImpl
