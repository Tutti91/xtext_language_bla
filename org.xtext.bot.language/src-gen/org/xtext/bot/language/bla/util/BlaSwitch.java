/**
 */
package org.xtext.bot.language.bla.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.bot.language.bla.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.bot.language.bla.BlaPackage
 * @generated
 */
public class BlaSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static BlaPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BlaSwitch()
  {
		if (modelPackage == null) {
			modelPackage = BlaPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case BlaPackage.BOT_LANGUAGE: {
				BotLanguage botLanguage = (BotLanguage)theEObject;
				T result = caseBotLanguage(botLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.NOTIFICATION: {
				Notification notification = (Notification)theEObject;
				T result = caseNotification(notification);
				if (result == null) result = caseProcedure(notification);
				if (result == null) result = caseBlock(notification);
				if (result == null) result = caseInstruction(notification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = caseProcedure(start);
				if (result == null) result = caseBlock(start);
				if (result == null) result = caseInstruction(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.STOP: {
				Stop stop = (Stop)theEObject;
				T result = caseStop(stop);
				if (result == null) result = caseProcedure(stop);
				if (result == null) result = caseBlock(stop);
				if (result == null) result = caseInstruction(stop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseInstruction(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.WAIT: {
				Wait wait = (Wait)theEObject;
				T result = caseWait(wait);
				if (result == null) result = caseProcedure(wait);
				if (result == null) result = caseBlock(wait);
				if (result == null) result = caseInstruction(wait);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.CONNECT: {
				Connect connect = (Connect)theEObject;
				T result = caseConnect(connect);
				if (result == null) result = caseProcedure(connect);
				if (result == null) result = caseInstruction(connect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.READ: {
				Read read = (Read)theEObject;
				T result = caseRead(read);
				if (result == null) result = caseProcedure(read);
				if (result == null) result = caseBlock(read);
				if (result == null) result = caseCompareValue(read);
				if (result == null) result = caseCompareFeature(read);
				if (result == null) result = caseMathValue1(read);
				if (result == null) result = caseMathValue2(read);
				if (result == null) result = caseInstruction(read);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.WRITE: {
				Write write = (Write)theEObject;
				T result = caseWrite(write);
				if (result == null) result = caseProcedure(write);
				if (result == null) result = caseInstruction(write);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.CLICK: {
				Click click = (Click)theEObject;
				T result = caseClick(click);
				if (result == null) result = caseProcedure(click);
				if (result == null) result = caseBlock(click);
				if (result == null) result = caseInstruction(click);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.VAR: {
				Var var = (Var)theEObject;
				T result = caseVar(var);
				if (result == null) result = caseProcedure(var);
				if (result == null) result = caseBlock(var);
				if (result == null) result = caseMathValue1(var);
				if (result == null) result = caseMathValue2(var);
				if (result == null) result = caseInstruction(var);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.IF_STATEMENT: {
				IFStatement ifStatement = (IFStatement)theEObject;
				T result = caseIFStatement(ifStatement);
				if (result == null) result = caseProcedure(ifStatement);
				if (result == null) result = caseBlock(ifStatement);
				if (result == null) result = caseInstruction(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.IF_EXPRESSION: {
				IfExpression ifExpression = (IfExpression)theEObject;
				T result = caseIfExpression(ifExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.IF_AND_EXPRESSION: {
				IfAndExpression ifAndExpression = (IfAndExpression)theEObject;
				T result = caseIfAndExpression(ifAndExpression);
				if (result == null) result = caseIfExpression(ifAndExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.IF_OR_EXPRESSION: {
				IfOrExpression ifOrExpression = (IfOrExpression)theEObject;
				T result = caseIfOrExpression(ifOrExpression);
				if (result == null) result = caseIfExpression(ifOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.IF_COMPARE_EXPRESSION: {
				IfCompareExpression ifCompareExpression = (IfCompareExpression)theEObject;
				T result = caseIfCompareExpression(ifCompareExpression);
				if (result == null) result = caseIfExpression(ifCompareExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.COMPARE_VALUE: {
				CompareValue compareValue = (CompareValue)theEObject;
				T result = caseCompareValue(compareValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.COMPARE_FEATURE: {
				CompareFeature compareFeature = (CompareFeature)theEObject;
				T result = caseCompareFeature(compareFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS: {
				MathematicalInstructions mathematicalInstructions = (MathematicalInstructions)theEObject;
				T result = caseMathematicalInstructions(mathematicalInstructions);
				if (result == null) result = caseCompareValue(mathematicalInstructions);
				if (result == null) result = caseCompareFeature(mathematicalInstructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.ADDITION: {
				Addition addition = (Addition)theEObject;
				T result = caseAddition(addition);
				if (result == null) result = caseMathematicalInstructions(addition);
				if (result == null) result = caseCompareValue(addition);
				if (result == null) result = caseCompareFeature(addition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.SUBTRACTION: {
				Subtraction subtraction = (Subtraction)theEObject;
				T result = caseSubtraction(subtraction);
				if (result == null) result = caseMathematicalInstructions(subtraction);
				if (result == null) result = caseCompareValue(subtraction);
				if (result == null) result = caseCompareFeature(subtraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.MULTIPLICATION: {
				Multiplication multiplication = (Multiplication)theEObject;
				T result = caseMultiplication(multiplication);
				if (result == null) result = caseMathematicalInstructions(multiplication);
				if (result == null) result = caseCompareValue(multiplication);
				if (result == null) result = caseCompareFeature(multiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseMathematicalInstructions(division);
				if (result == null) result = caseCompareValue(division);
				if (result == null) result = caseCompareFeature(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.MATH_VALUE1: {
				MathValue1 mathValue1 = (MathValue1)theEObject;
				T result = caseMathValue1(mathValue1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.MATH_VALUE2: {
				MathValue2 mathValue2 = (MathValue2)theEObject;
				T result = caseMathValue2(mathValue2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlaPackage.WHILE_LOOP: {
				WhileLoop whileLoop = (WhileLoop)theEObject;
				T result = caseWhileLoop(whileLoop);
				if (result == null) result = caseProcedure(whileLoop);
				if (result == null) result = caseBlock(whileLoop);
				if (result == null) result = caseInstruction(whileLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Bot Language</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bot Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBotLanguage(BotLanguage object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseInstruction(Instruction object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNotification(Notification object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseStart(Start object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseStop(Stop object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProcedure(Procedure object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWait(Wait object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Connect</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseConnect(Connect object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Read</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRead(Read object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Write</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWrite(Write object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Click</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Click</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseClick(Click object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Var</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVar(Var object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>IF Statement</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IF Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseIFStatement(IFStatement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBlock(Block object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseIfExpression(IfExpression object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>If And Expression</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseIfAndExpression(IfAndExpression object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>If Or Expression</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseIfOrExpression(IfOrExpression object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>If Compare Expression</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Compare Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseIfCompareExpression(IfCompareExpression object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Compare Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compare Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCompareValue(CompareValue object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Compare Feature</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compare Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCompareFeature(CompareFeature object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Mathematical Instructions</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mathematical Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMathematicalInstructions(MathematicalInstructions object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAddition(Addition object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSubtraction(Subtraction object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMultiplication(Multiplication object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDivision(Division object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Math Value1</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Value1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMathValue1(MathValue1 object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Math Value2</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Value2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMathValue2(MathValue2 object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWhileLoop(WhileLoop object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //BlaSwitch
