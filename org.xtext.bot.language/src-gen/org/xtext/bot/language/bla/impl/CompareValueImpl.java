/**
 */
package org.xtext.bot.language.bla.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.bot.language.bla.BlaPackage;
import org.xtext.bot.language.bla.CompareValue;
import org.xtext.bot.language.bla.Var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.impl.CompareValueImpl#getVariableValue <em>Variable Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompareValueImpl extends MinimalEObjectImpl.Container implements CompareValue
{
  /**
	 * The cached value of the '{@link #getVariableValue() <em>Variable Value</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariableValue()
	 * @generated
	 * @ordered
	 */
  protected Var variableValue;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CompareValueImpl()
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
		return BlaPackage.Literals.COMPARE_VALUE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Var getVariableValue()
  {
		if (variableValue != null && variableValue.eIsProxy()) {
			InternalEObject oldVariableValue = (InternalEObject)variableValue;
			variableValue = (Var)eResolveProxy(oldVariableValue);
			if (variableValue != oldVariableValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlaPackage.COMPARE_VALUE__VARIABLE_VALUE, oldVariableValue, variableValue));
			}
		}
		return variableValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Var basicGetVariableValue()
  {
		return variableValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableValue(Var newVariableValue)
  {
		Var oldVariableValue = variableValue;
		variableValue = newVariableValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.COMPARE_VALUE__VARIABLE_VALUE, oldVariableValue, variableValue));
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
			case BlaPackage.COMPARE_VALUE__VARIABLE_VALUE:
				if (resolve) return getVariableValue();
				return basicGetVariableValue();
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
			case BlaPackage.COMPARE_VALUE__VARIABLE_VALUE:
				setVariableValue((Var)newValue);
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
			case BlaPackage.COMPARE_VALUE__VARIABLE_VALUE:
				setVariableValue((Var)null);
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
			case BlaPackage.COMPARE_VALUE__VARIABLE_VALUE:
				return variableValue != null;
		}
		return super.eIsSet(featureID);
	}

} //CompareValueImpl
