/**
 */
package org.xtext.bot.language.bla.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.bot.language.bla.Addition;
import org.xtext.bot.language.bla.BlaFactory;
import org.xtext.bot.language.bla.BlaPackage;
import org.xtext.bot.language.bla.Block;
import org.xtext.bot.language.bla.BotLanguage;
import org.xtext.bot.language.bla.Click;
import org.xtext.bot.language.bla.CompareFeature;
import org.xtext.bot.language.bla.CompareValue;
import org.xtext.bot.language.bla.Connect;
import org.xtext.bot.language.bla.Division;
import org.xtext.bot.language.bla.IFStatement;
import org.xtext.bot.language.bla.IfAndExpression;
import org.xtext.bot.language.bla.IfCompareExpression;
import org.xtext.bot.language.bla.IfExpression;
import org.xtext.bot.language.bla.IfOrExpression;
import org.xtext.bot.language.bla.Instruction;
import org.xtext.bot.language.bla.MathValue1;
import org.xtext.bot.language.bla.MathValue2;
import org.xtext.bot.language.bla.MathematicalInstructions;
import org.xtext.bot.language.bla.Multiplication;
import org.xtext.bot.language.bla.Notification;
import org.xtext.bot.language.bla.Procedure;
import org.xtext.bot.language.bla.Read;
import org.xtext.bot.language.bla.Start;
import org.xtext.bot.language.bla.Stop;
import org.xtext.bot.language.bla.Subtraction;
import org.xtext.bot.language.bla.Var;
import org.xtext.bot.language.bla.Wait;
import org.xtext.bot.language.bla.WhileLoop;
import org.xtext.bot.language.bla.Write;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlaPackageImpl extends EPackageImpl implements BlaPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass botLanguageEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass instructionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass notificationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass startEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass stopEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass procedureEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass waitEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass connectEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass readEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass writeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass clickEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass varEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ifStatementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass blockEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ifExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ifAndExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ifOrExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ifCompareExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass compareValueEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass compareFeatureEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mathematicalInstructionsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass additionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass subtractionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass multiplicationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass divisionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mathValue1EClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mathValue2EClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass whileLoopEClass = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.xtext.bot.language.bla.BlaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private BlaPackageImpl()
  {
		super(eNS_URI, BlaFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BlaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static BlaPackage init()
  {
		if (isInited) return (BlaPackage)EPackage.Registry.INSTANCE.getEPackage(BlaPackage.eNS_URI);

		// Obtain or create and register package
		BlaPackageImpl theBlaPackage = (BlaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BlaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BlaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBlaPackage.createPackageContents();

		// Initialize created meta-data
		theBlaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBlaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BlaPackage.eNS_URI, theBlaPackage);
		return theBlaPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBotLanguage()
  {
		return botLanguageEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getBotLanguage_Instructions()
  {
		return (EReference)botLanguageEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInstruction()
  {
		return instructionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNotification()
  {
		return notificationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNotification_Name()
  {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNotification_Address()
  {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStart()
  {
		return startEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStart_Name()
  {
		return (EAttribute)startEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStop()
  {
		return stopEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getProcedure()
  {
		return procedureEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWait()
  {
		return waitEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getWait_Name()
  {
		return (EAttribute)waitEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getConnect()
  {
		return connectEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getConnect_Name()
  {
		return (EAttribute)connectEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRead()
  {
		return readEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRead_Name()
  {
		return (EAttribute)readEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWrite()
  {
		return writeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getWrite_Name()
  {
		return (EAttribute)writeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getWrite_Value()
  {
		return (EAttribute)writeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getClick()
  {
		return clickEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getClick_Name()
  {
		return (EAttribute)clickEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVar()
  {
		return varEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVar_Name()
  {
		return (EAttribute)varEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVar_Value()
  {
		return (EReference)varEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIFStatement()
  {
		return ifStatementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIFStatement_If()
  {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIFStatement_Then()
  {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIFStatement_Else()
  {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBlock()
  {
		return blockEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getBlock_Action()
  {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIfExpression()
  {
		return ifExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIfAndExpression()
  {
		return ifAndExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfAndExpression_LeftFeature()
  {
		return (EReference)ifAndExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIfAndExpression_And()
  {
		return (EAttribute)ifAndExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfAndExpression_RightFeature()
  {
		return (EReference)ifAndExpressionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIfOrExpression()
  {
		return ifOrExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfOrExpression_LeftFeature()
  {
		return (EReference)ifOrExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIfOrExpression_Or()
  {
		return (EAttribute)ifOrExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfOrExpression_RightFeature()
  {
		return (EReference)ifOrExpressionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIfCompareExpression()
  {
		return ifCompareExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfCompareExpression_LeftFeature()
  {
		return (EReference)ifCompareExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIfCompareExpression_CompareOperant()
  {
		return (EAttribute)ifCompareExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfCompareExpression_RightFeature()
  {
		return (EReference)ifCompareExpressionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCompareValue()
  {
		return compareValueEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCompareValue_VariableValue()
  {
		return (EReference)compareValueEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCompareFeature()
  {
		return compareFeatureEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCompareFeature_VariableFeature()
  {
		return (EReference)compareFeatureEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMathematicalInstructions()
  {
		return mathematicalInstructionsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMathematicalInstructions_ValueLeft()
  {
		return (EReference)mathematicalInstructionsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMathematicalInstructions_ValueRight()
  {
		return (EReference)mathematicalInstructionsEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAddition()
  {
		return additionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSubtraction()
  {
		return subtractionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMultiplication()
  {
		return multiplicationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDivision()
  {
		return divisionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMathValue1()
  {
		return mathValue1EClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMathValue2()
  {
		return mathValue2EClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWhileLoop()
  {
		return whileLoopEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWhileLoop_While()
  {
		return (EReference)whileLoopEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWhileLoop_DoLoop()
  {
		return (EReference)whileLoopEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BlaFactory getBlaFactory()
  {
		return (BlaFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		botLanguageEClass = createEClass(BOT_LANGUAGE);
		createEReference(botLanguageEClass, BOT_LANGUAGE__INSTRUCTIONS);

		instructionEClass = createEClass(INSTRUCTION);

		notificationEClass = createEClass(NOTIFICATION);
		createEAttribute(notificationEClass, NOTIFICATION__NAME);
		createEAttribute(notificationEClass, NOTIFICATION__ADDRESS);

		startEClass = createEClass(START);
		createEAttribute(startEClass, START__NAME);

		stopEClass = createEClass(STOP);

		procedureEClass = createEClass(PROCEDURE);

		waitEClass = createEClass(WAIT);
		createEAttribute(waitEClass, WAIT__NAME);

		connectEClass = createEClass(CONNECT);
		createEAttribute(connectEClass, CONNECT__NAME);

		readEClass = createEClass(READ);
		createEAttribute(readEClass, READ__NAME);

		writeEClass = createEClass(WRITE);
		createEAttribute(writeEClass, WRITE__NAME);
		createEAttribute(writeEClass, WRITE__VALUE);

		clickEClass = createEClass(CLICK);
		createEAttribute(clickEClass, CLICK__NAME);

		varEClass = createEClass(VAR);
		createEAttribute(varEClass, VAR__NAME);
		createEReference(varEClass, VAR__VALUE);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__IF);
		createEReference(ifStatementEClass, IF_STATEMENT__THEN);
		createEReference(ifStatementEClass, IF_STATEMENT__ELSE);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__ACTION);

		ifExpressionEClass = createEClass(IF_EXPRESSION);

		ifAndExpressionEClass = createEClass(IF_AND_EXPRESSION);
		createEReference(ifAndExpressionEClass, IF_AND_EXPRESSION__LEFT_FEATURE);
		createEAttribute(ifAndExpressionEClass, IF_AND_EXPRESSION__AND);
		createEReference(ifAndExpressionEClass, IF_AND_EXPRESSION__RIGHT_FEATURE);

		ifOrExpressionEClass = createEClass(IF_OR_EXPRESSION);
		createEReference(ifOrExpressionEClass, IF_OR_EXPRESSION__LEFT_FEATURE);
		createEAttribute(ifOrExpressionEClass, IF_OR_EXPRESSION__OR);
		createEReference(ifOrExpressionEClass, IF_OR_EXPRESSION__RIGHT_FEATURE);

		ifCompareExpressionEClass = createEClass(IF_COMPARE_EXPRESSION);
		createEReference(ifCompareExpressionEClass, IF_COMPARE_EXPRESSION__LEFT_FEATURE);
		createEAttribute(ifCompareExpressionEClass, IF_COMPARE_EXPRESSION__COMPARE_OPERANT);
		createEReference(ifCompareExpressionEClass, IF_COMPARE_EXPRESSION__RIGHT_FEATURE);

		compareValueEClass = createEClass(COMPARE_VALUE);
		createEReference(compareValueEClass, COMPARE_VALUE__VARIABLE_VALUE);

		compareFeatureEClass = createEClass(COMPARE_FEATURE);
		createEReference(compareFeatureEClass, COMPARE_FEATURE__VARIABLE_FEATURE);

		mathematicalInstructionsEClass = createEClass(MATHEMATICAL_INSTRUCTIONS);
		createEReference(mathematicalInstructionsEClass, MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT);
		createEReference(mathematicalInstructionsEClass, MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT);

		additionEClass = createEClass(ADDITION);

		subtractionEClass = createEClass(SUBTRACTION);

		multiplicationEClass = createEClass(MULTIPLICATION);

		divisionEClass = createEClass(DIVISION);

		mathValue1EClass = createEClass(MATH_VALUE1);

		mathValue2EClass = createEClass(MATH_VALUE2);

		whileLoopEClass = createEClass(WHILE_LOOP);
		createEReference(whileLoopEClass, WHILE_LOOP__WHILE);
		createEReference(whileLoopEClass, WHILE_LOOP__DO_LOOP);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		notificationEClass.getESuperTypes().add(this.getProcedure());
		notificationEClass.getESuperTypes().add(this.getBlock());
		startEClass.getESuperTypes().add(this.getInstruction());
		startEClass.getESuperTypes().add(this.getProcedure());
		startEClass.getESuperTypes().add(this.getBlock());
		stopEClass.getESuperTypes().add(this.getInstruction());
		stopEClass.getESuperTypes().add(this.getProcedure());
		stopEClass.getESuperTypes().add(this.getBlock());
		procedureEClass.getESuperTypes().add(this.getInstruction());
		waitEClass.getESuperTypes().add(this.getProcedure());
		waitEClass.getESuperTypes().add(this.getBlock());
		connectEClass.getESuperTypes().add(this.getProcedure());
		readEClass.getESuperTypes().add(this.getProcedure());
		readEClass.getESuperTypes().add(this.getBlock());
		readEClass.getESuperTypes().add(this.getCompareValue());
		readEClass.getESuperTypes().add(this.getCompareFeature());
		readEClass.getESuperTypes().add(this.getMathValue1());
		readEClass.getESuperTypes().add(this.getMathValue2());
		writeEClass.getESuperTypes().add(this.getProcedure());
		clickEClass.getESuperTypes().add(this.getProcedure());
		clickEClass.getESuperTypes().add(this.getBlock());
		varEClass.getESuperTypes().add(this.getProcedure());
		varEClass.getESuperTypes().add(this.getBlock());
		varEClass.getESuperTypes().add(this.getMathValue1());
		varEClass.getESuperTypes().add(this.getMathValue2());
		ifStatementEClass.getESuperTypes().add(this.getProcedure());
		ifStatementEClass.getESuperTypes().add(this.getBlock());
		ifAndExpressionEClass.getESuperTypes().add(this.getIfExpression());
		ifOrExpressionEClass.getESuperTypes().add(this.getIfExpression());
		ifCompareExpressionEClass.getESuperTypes().add(this.getIfExpression());
		mathematicalInstructionsEClass.getESuperTypes().add(this.getCompareValue());
		mathematicalInstructionsEClass.getESuperTypes().add(this.getCompareFeature());
		additionEClass.getESuperTypes().add(this.getMathematicalInstructions());
		subtractionEClass.getESuperTypes().add(this.getMathematicalInstructions());
		multiplicationEClass.getESuperTypes().add(this.getMathematicalInstructions());
		divisionEClass.getESuperTypes().add(this.getMathematicalInstructions());
		whileLoopEClass.getESuperTypes().add(this.getProcedure());
		whileLoopEClass.getESuperTypes().add(this.getBlock());

		// Initialize classes and features; add operations and parameters
		initEClass(botLanguageEClass, BotLanguage.class, "BotLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBotLanguage_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, BotLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotification_Name(), ecorePackage.getEString(), "name", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotification_Address(), ecorePackage.getEString(), "address", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStart_Name(), ecorePackage.getEString(), "name", null, 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(waitEClass, Wait.class, "Wait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWait_Name(), ecorePackage.getEInt(), "name", null, 0, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectEClass, Connect.class, "Connect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnect_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readEClass, Read.class, "Read", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRead_Name(), ecorePackage.getEString(), "name", null, 0, 1, Read.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeEClass, Write.class, "Write", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWrite_Name(), ecorePackage.getEString(), "name", null, 0, 1, Write.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWrite_Value(), ecorePackage.getEString(), "value", null, 0, 1, Write.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clickEClass, Click.class, "Click", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClick_Name(), ecorePackage.getEString(), "name", null, 0, 1, Click.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varEClass, Var.class, "Var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVar_Value(), this.getRead(), null, "value", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifStatementEClass, IFStatement.class, "IFStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIFStatement_If(), this.getIfExpression(), null, "if", null, 0, 1, IFStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIFStatement_Then(), this.getBlock(), null, "then", null, 0, -1, IFStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIFStatement_Else(), this.getBlock(), null, "else", null, 0, -1, IFStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Action(), this.getWrite(), null, "action", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifExpressionEClass, IfExpression.class, "IfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifAndExpressionEClass, IfAndExpression.class, "IfAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfAndExpression_LeftFeature(), this.getIfCompareExpression(), null, "leftFeature", null, 0, 1, IfAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfAndExpression_And(), ecorePackage.getEString(), "and", null, 0, 1, IfAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfAndExpression_RightFeature(), this.getIfExpression(), null, "rightFeature", null, 0, 1, IfAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifOrExpressionEClass, IfOrExpression.class, "IfOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfOrExpression_LeftFeature(), this.getIfCompareExpression(), null, "leftFeature", null, 0, 1, IfOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfOrExpression_Or(), ecorePackage.getEString(), "or", null, 0, 1, IfOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfOrExpression_RightFeature(), this.getIfCompareExpression(), null, "rightFeature", null, 0, 1, IfOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifCompareExpressionEClass, IfCompareExpression.class, "IfCompareExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfCompareExpression_LeftFeature(), this.getCompareFeature(), null, "leftFeature", null, 0, 1, IfCompareExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfCompareExpression_CompareOperant(), ecorePackage.getEString(), "compareOperant", null, 0, 1, IfCompareExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfCompareExpression_RightFeature(), this.getCompareValue(), null, "rightFeature", null, 0, 1, IfCompareExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compareValueEClass, CompareValue.class, "CompareValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompareValue_VariableValue(), this.getVar(), null, "variableValue", null, 0, 1, CompareValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compareFeatureEClass, CompareFeature.class, "CompareFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompareFeature_VariableFeature(), this.getVar(), null, "variableFeature", null, 0, 1, CompareFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mathematicalInstructionsEClass, MathematicalInstructions.class, "MathematicalInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMathematicalInstructions_ValueLeft(), this.getMathValue1(), null, "valueLeft", null, 0, 1, MathematicalInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMathematicalInstructions_ValueRight(), this.getMathValue2(), null, "valueRight", null, 0, 1, MathematicalInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtractionEClass, Subtraction.class, "Subtraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mathValue1EClass, MathValue1.class, "MathValue1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mathValue2EClass, MathValue2.class, "MathValue2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whileLoopEClass, WhileLoop.class, "WhileLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileLoop_While(), this.getIfExpression(), null, "while", null, 0, 1, WhileLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhileLoop_DoLoop(), this.getBlock(), null, "doLoop", null, 0, -1, WhileLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BlaPackageImpl
