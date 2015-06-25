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
import org.xtext.bot.language.bla.CompareValue;
import org.xtext.bot.language.bla.IfCompareExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Compare Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.impl.IfCompareExpressionImpl#getLeftFeature <em>Left Feature</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.IfCompareExpressionImpl#getCompareOperant <em>Compare Operant</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.IfCompareExpressionImpl#getRightFeature <em>Right Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfCompareExpressionImpl extends IfExpressionImpl implements IfCompareExpression
{
  /**
	 * The cached value of the '{@link #getLeftFeature() <em>Left Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLeftFeature()
	 * @generated
	 * @ordered
	 */
  protected CompareFeature leftFeature;

  /**
	 * The default value of the '{@link #getCompareOperant() <em>Compare Operant</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCompareOperant()
	 * @generated
	 * @ordered
	 */
  protected static final String COMPARE_OPERANT_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getCompareOperant() <em>Compare Operant</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCompareOperant()
	 * @generated
	 * @ordered
	 */
  protected String compareOperant = COMPARE_OPERANT_EDEFAULT;

  /**
	 * The cached value of the '{@link #getRightFeature() <em>Right Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRightFeature()
	 * @generated
	 * @ordered
	 */
  protected CompareValue rightFeature;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected IfCompareExpressionImpl()
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
		return BlaPackage.Literals.IF_COMPARE_EXPRESSION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CompareFeature getLeftFeature()
  {
		return leftFeature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetLeftFeature(CompareFeature newLeftFeature, NotificationChain msgs)
  {
		CompareFeature oldLeftFeature = leftFeature;
		leftFeature = newLeftFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlaPackage.IF_COMPARE_EXPRESSION__LEFT_FEATURE, oldLeftFeature, newLeftFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLeftFeature(CompareFeature newLeftFeature)
  {
		if (newLeftFeature != leftFeature) {
			NotificationChain msgs = null;
			if (leftFeature != null)
				msgs = ((InternalEObject)leftFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_COMPARE_EXPRESSION__LEFT_FEATURE, null, msgs);
			if (newLeftFeature != null)
				msgs = ((InternalEObject)newLeftFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_COMPARE_EXPRESSION__LEFT_FEATURE, null, msgs);
			msgs = basicSetLeftFeature(newLeftFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.IF_COMPARE_EXPRESSION__LEFT_FEATURE, newLeftFeature, newLeftFeature));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getCompareOperant()
  {
		return compareOperant;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCompareOperant(String newCompareOperant)
  {
		String oldCompareOperant = compareOperant;
		compareOperant = newCompareOperant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.IF_COMPARE_EXPRESSION__COMPARE_OPERANT, oldCompareOperant, compareOperant));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CompareValue getRightFeature()
  {
		return rightFeature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRightFeature(CompareValue newRightFeature, NotificationChain msgs)
  {
		CompareValue oldRightFeature = rightFeature;
		rightFeature = newRightFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlaPackage.IF_COMPARE_EXPRESSION__RIGHT_FEATURE, oldRightFeature, newRightFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRightFeature(CompareValue newRightFeature)
  {
		if (newRightFeature != rightFeature) {
			NotificationChain msgs = null;
			if (rightFeature != null)
				msgs = ((InternalEObject)rightFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_COMPARE_EXPRESSION__RIGHT_FEATURE, null, msgs);
			if (newRightFeature != null)
				msgs = ((InternalEObject)newRightFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_COMPARE_EXPRESSION__RIGHT_FEATURE, null, msgs);
			msgs = basicSetRightFeature(newRightFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.IF_COMPARE_EXPRESSION__RIGHT_FEATURE, newRightFeature, newRightFeature));
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
			case BlaPackage.IF_COMPARE_EXPRESSION__LEFT_FEATURE:
				return basicSetLeftFeature(null, msgs);
			case BlaPackage.IF_COMPARE_EXPRESSION__RIGHT_FEATURE:
				return basicSetRightFeature(null, msgs);
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
			case BlaPackage.IF_COMPARE_EXPRESSION__LEFT_FEATURE:
				return getLeftFeature();
			case BlaPackage.IF_COMPARE_EXPRESSION__COMPARE_OPERANT:
				return getCompareOperant();
			case BlaPackage.IF_COMPARE_EXPRESSION__RIGHT_FEATURE:
				return getRightFeature();
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
			case BlaPackage.IF_COMPARE_EXPRESSION__LEFT_FEATURE:
				setLeftFeature((CompareFeature)newValue);
				return;
			case BlaPackage.IF_COMPARE_EXPRESSION__COMPARE_OPERANT:
				setCompareOperant((String)newValue);
				return;
			case BlaPackage.IF_COMPARE_EXPRESSION__RIGHT_FEATURE:
				setRightFeature((CompareValue)newValue);
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
			case BlaPackage.IF_COMPARE_EXPRESSION__LEFT_FEATURE:
				setLeftFeature((CompareFeature)null);
				return;
			case BlaPackage.IF_COMPARE_EXPRESSION__COMPARE_OPERANT:
				setCompareOperant(COMPARE_OPERANT_EDEFAULT);
				return;
			case BlaPackage.IF_COMPARE_EXPRESSION__RIGHT_FEATURE:
				setRightFeature((CompareValue)null);
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
			case BlaPackage.IF_COMPARE_EXPRESSION__LEFT_FEATURE:
				return leftFeature != null;
			case BlaPackage.IF_COMPARE_EXPRESSION__COMPARE_OPERANT:
				return COMPARE_OPERANT_EDEFAULT == null ? compareOperant != null : !COMPARE_OPERANT_EDEFAULT.equals(compareOperant);
			case BlaPackage.IF_COMPARE_EXPRESSION__RIGHT_FEATURE:
				return rightFeature != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (compareOperant: ");
		result.append(compareOperant);
		result.append(')');
		return result.toString();
	}

} //IfCompareExpressionImpl
