/**
 */
package org.xtext.bot.language.bla.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.bot.language.bla.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.bot.language.bla.BlaPackage
 * @generated
 */
public class BlaAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static BlaPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BlaAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = BlaPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BlaSwitch<Adapter> modelSwitch =
    new BlaSwitch<Adapter>() {
			@Override
			public Adapter caseBotLanguage(BotLanguage object) {
				return createBotLanguageAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseNotification(Notification object) {
				return createNotificationAdapter();
			}
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseStop(Stop object) {
				return createStopAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseWait(Wait object) {
				return createWaitAdapter();
			}
			@Override
			public Adapter caseConnect(Connect object) {
				return createConnectAdapter();
			}
			@Override
			public Adapter caseRead(Read object) {
				return createReadAdapter();
			}
			@Override
			public Adapter caseWrite(Write object) {
				return createWriteAdapter();
			}
			@Override
			public Adapter caseClick(Click object) {
				return createClickAdapter();
			}
			@Override
			public Adapter caseVar(Var object) {
				return createVarAdapter();
			}
			@Override
			public Adapter caseIFStatement(IFStatement object) {
				return createIFStatementAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseIfExpression(IfExpression object) {
				return createIfExpressionAdapter();
			}
			@Override
			public Adapter caseIfAndExpression(IfAndExpression object) {
				return createIfAndExpressionAdapter();
			}
			@Override
			public Adapter caseIfOrExpression(IfOrExpression object) {
				return createIfOrExpressionAdapter();
			}
			@Override
			public Adapter caseIfCompareExpression(IfCompareExpression object) {
				return createIfCompareExpressionAdapter();
			}
			@Override
			public Adapter caseCompareValue(CompareValue object) {
				return createCompareValueAdapter();
			}
			@Override
			public Adapter caseCompareFeature(CompareFeature object) {
				return createCompareFeatureAdapter();
			}
			@Override
			public Adapter caseMathematicalInstructions(MathematicalInstructions object) {
				return createMathematicalInstructionsAdapter();
			}
			@Override
			public Adapter caseAddition(Addition object) {
				return createAdditionAdapter();
			}
			@Override
			public Adapter caseSubtraction(Subtraction object) {
				return createSubtractionAdapter();
			}
			@Override
			public Adapter caseMultiplication(Multiplication object) {
				return createMultiplicationAdapter();
			}
			@Override
			public Adapter caseDivision(Division object) {
				return createDivisionAdapter();
			}
			@Override
			public Adapter caseMathValue1(MathValue1 object) {
				return createMathValue1Adapter();
			}
			@Override
			public Adapter caseMathValue2(MathValue2 object) {
				return createMathValue2Adapter();
			}
			@Override
			public Adapter caseWhileLoop(WhileLoop object) {
				return createWhileLoopAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.BotLanguage <em>Bot Language</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.BotLanguage
	 * @generated
	 */
  public Adapter createBotLanguageAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Instruction
	 * @generated
	 */
  public Adapter createInstructionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Notification
	 * @generated
	 */
  public Adapter createNotificationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Start
	 * @generated
	 */
  public Adapter createStartAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Stop
	 * @generated
	 */
  public Adapter createStopAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Procedure
	 * @generated
	 */
  public Adapter createProcedureAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Wait
	 * @generated
	 */
  public Adapter createWaitAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Connect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Connect
	 * @generated
	 */
  public Adapter createConnectAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Read
	 * @generated
	 */
  public Adapter createReadAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Write <em>Write</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Write
	 * @generated
	 */
  public Adapter createWriteAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Click <em>Click</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Click
	 * @generated
	 */
  public Adapter createClickAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Var
	 * @generated
	 */
  public Adapter createVarAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.IFStatement <em>IF Statement</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.IFStatement
	 * @generated
	 */
  public Adapter createIFStatementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Block
	 * @generated
	 */
  public Adapter createBlockAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.IfExpression
	 * @generated
	 */
  public Adapter createIfExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.IfAndExpression <em>If And Expression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.IfAndExpression
	 * @generated
	 */
  public Adapter createIfAndExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.IfOrExpression <em>If Or Expression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.IfOrExpression
	 * @generated
	 */
  public Adapter createIfOrExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.IfCompareExpression <em>If Compare Expression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.IfCompareExpression
	 * @generated
	 */
  public Adapter createIfCompareExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.CompareValue <em>Compare Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.CompareValue
	 * @generated
	 */
  public Adapter createCompareValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.CompareFeature <em>Compare Feature</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.CompareFeature
	 * @generated
	 */
  public Adapter createCompareFeatureAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.MathematicalInstructions <em>Mathematical Instructions</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.MathematicalInstructions
	 * @generated
	 */
  public Adapter createMathematicalInstructionsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Addition
	 * @generated
	 */
  public Adapter createAdditionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Subtraction
	 * @generated
	 */
  public Adapter createSubtractionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Multiplication
	 * @generated
	 */
  public Adapter createMultiplicationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.Division
	 * @generated
	 */
  public Adapter createDivisionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.MathValue1 <em>Math Value1</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.MathValue1
	 * @generated
	 */
  public Adapter createMathValue1Adapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.MathValue2 <em>Math Value2</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.MathValue2
	 * @generated
	 */
  public Adapter createMathValue2Adapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.bot.language.bla.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.bot.language.bla.WhileLoop
	 * @generated
	 */
  public Adapter createWhileLoopAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //BlaAdapterFactory
