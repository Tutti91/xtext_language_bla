/**
 */
package org.xtext.bot.language.bla.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.bot.language.bla.BlaPackage;
import org.xtext.bot.language.bla.CompareFeature;
import org.xtext.bot.language.bla.MathValue1;
import org.xtext.bot.language.bla.MathValue2;
import org.xtext.bot.language.bla.MathematicalInstructions;
import org.xtext.bot.language.bla.Var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mathematical Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.impl.MathematicalInstructionsImpl#getVariableFeature <em>Variable Feature</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.MathematicalInstructionsImpl#getValueLeft <em>Value Left</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.MathematicalInstructionsImpl#getValueRight <em>Value Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MathematicalInstructionsImpl extends CompareValueImpl implements MathematicalInstructions
{
  /**
	 * The cached value of the '{@link #getVariableFeature() <em>Variable Feature</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariableFeature()
	 * @generated
	 * @ordered
	 */
  protected Var variableFeature;

  /**
	 * The cached value of the '{@link #getValueLeft() <em>Value Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValueLeft()
	 * @generated
	 * @ordered
	 */
  protected MathValue1 valueLeft;

  /**
	 * The cached value of the '{@link #getValueRight() <em>Value Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValueRight()
	 * @generated
	 * @ordered
	 */
  protected MathValue2 valueRight;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MathematicalInstructionsImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return BlaPackage.Literals.MATHEMATICAL_INSTRUCTIONS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Var getVariableFeature()
  {
		if (variableFeature != null && variableFeature.eIsProxy()) {
			InternalEObject oldVariableFeature = (InternalEObject)variableFeature;
			variableFeature = (Var)eResolveProxy(oldVariableFeature);
			if (variableFeature != oldVariableFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlaPackage.MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE, oldVariableFeature, variableFeature));
			}
		}
		return variableFeature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Var basicGetVariableFeature()
  {
		return variableFeature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableFeature(Var newVariableFeature)
  {
		Var oldVariableFeature = variableFeature;
		variableFeature = newVariableFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE, oldVariableFeature, variableFeature));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MathValue1 getValueLeft()
  {
		return valueLeft;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetValueLeft(MathValue1 newValueLeft, NotificationChain msgs)
  {
		MathValue1 oldValueLeft = valueLeft;
		valueLeft = newValueLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT, oldValueLeft, newValueLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValueLeft(MathValue1 newValueLeft)
  {
		if (newValueLeft != valueLeft) {
			NotificationChain msgs = null;
			if (valueLeft != null)
				msgs = ((InternalEObject)valueLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT, null, msgs);
			if (newValueLeft != null)
				msgs = ((InternalEObject)newValueLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT, null, msgs);
			msgs = basicSetValueLeft(newValueLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT, newValueLeft, newValueLeft));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MathValue2 getValueRight()
  {
		return valueRight;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetValueRight(MathValue2 newValueRight, NotificationChain msgs)
  {
		MathValue2 oldValueRight = valueRight;
		valueRight = newValueRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT, oldValueRight, newValueRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValueRight(MathValue2 newValueRight)
  {
		if (newValueRight != valueRight) {
			NotificationChain msgs = null;
			if (valueRight != null)
				msgs = ((InternalEObject)valueRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT, null, msgs);
			if (newValueRight != null)
				msgs = ((InternalEObject)newValueRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT, null, msgs);
			msgs = basicSetValueRight(newValueRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT, newValueRight, newValueRight));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT:
				return basicSetValueLeft(null, msgs);
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT:
				return basicSetValueRight(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE:
				if (resolve) return getVariableFeature();
				return basicGetVariableFeature();
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT:
				return getValueLeft();
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT:
				return getValueRight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE:
				setVariableFeature((Var)newValue);
				return;
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT:
				setValueLeft((MathValue1)newValue);
				return;
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT:
				setValueRight((MathValue2)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE:
				setVariableFeature((Var)null);
				return;
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT:
				setValueLeft((MathValue1)null);
				return;
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT:
				setValueRight((MathValue2)null);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE:
				return variableFeature != null;
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_LEFT:
				return valueLeft != null;
			case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VALUE_RIGHT:
				return valueRight != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == CompareFeature.class) {
			switch (derivedFeatureID) {
				case BlaPackage.MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE: return BlaPackage.COMPARE_FEATURE__VARIABLE_FEATURE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == CompareFeature.class) {
			switch (baseFeatureID) {
				case BlaPackage.COMPARE_FEATURE__VARIABLE_FEATURE: return BlaPackage.MATHEMATICAL_INSTRUCTIONS__VARIABLE_FEATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MathematicalInstructionsImpl
