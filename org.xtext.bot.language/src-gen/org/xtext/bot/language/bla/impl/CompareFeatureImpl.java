/**
 */
package org.xtext.bot.language.bla.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.bot.language.bla.BlaPackage;
import org.xtext.bot.language.bla.CompareFeature;
import org.xtext.bot.language.bla.Var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.impl.CompareFeatureImpl#getVariableFeature <em>Variable Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompareFeatureImpl extends MinimalEObjectImpl.Container implements CompareFeature
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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CompareFeatureImpl()
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
		return BlaPackage.Literals.COMPARE_FEATURE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlaPackage.COMPARE_FEATURE__VARIABLE_FEATURE, oldVariableFeature, variableFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.COMPARE_FEATURE__VARIABLE_FEATURE, oldVariableFeature, variableFeature));
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
			case BlaPackage.COMPARE_FEATURE__VARIABLE_FEATURE:
				if (resolve) return getVariableFeature();
				return basicGetVariableFeature();
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
			case BlaPackage.COMPARE_FEATURE__VARIABLE_FEATURE:
				setVariableFeature((Var)newValue);
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
			case BlaPackage.COMPARE_FEATURE__VARIABLE_FEATURE:
				setVariableFeature((Var)null);
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
			case BlaPackage.COMPARE_FEATURE__VARIABLE_FEATURE:
				return variableFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //CompareFeatureImpl
