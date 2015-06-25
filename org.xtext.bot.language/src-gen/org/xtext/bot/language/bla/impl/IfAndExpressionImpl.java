/**
 */
package org.xtext.bot.language.bla.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.bot.language.bla.BlaPackage;
import org.xtext.bot.language.bla.IfAndExpression;
import org.xtext.bot.language.bla.IfCompareExpression;
import org.xtext.bot.language.bla.IfExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If And Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.impl.IfAndExpressionImpl#getLeftFeature <em>Left Feature</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.IfAndExpressionImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.IfAndExpressionImpl#getRightFeature <em>Right Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfAndExpressionImpl extends IfExpressionImpl implements IfAndExpression
{
  /**
	 * The cached value of the '{@link #getLeftFeature() <em>Left Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLeftFeature()
	 * @generated
	 * @ordered
	 */
  protected IfCompareExpression leftFeature;

  /**
	 * The default value of the '{@link #getAnd() <em>And</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnd()
	 * @generated
	 * @ordered
	 */
  protected static final String AND_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getAnd() <em>And</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnd()
	 * @generated
	 * @ordered
	 */
  protected String and = AND_EDEFAULT;

  /**
	 * The cached value of the '{@link #getRightFeature() <em>Right Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRightFeature()
	 * @generated
	 * @ordered
	 */
  protected IfExpression rightFeature;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected IfAndExpressionImpl()
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
		return BlaPackage.Literals.IF_AND_EXPRESSION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IfCompareExpression getLeftFeature()
  {
		return leftFeature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetLeftFeature(IfCompareExpression newLeftFeature, NotificationChain msgs)
  {
		IfCompareExpression oldLeftFeature = leftFeature;
		leftFeature = newLeftFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlaPackage.IF_AND_EXPRESSION__LEFT_FEATURE, oldLeftFeature, newLeftFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLeftFeature(IfCompareExpression newLeftFeature)
  {
		if (newLeftFeature != leftFeature) {
			NotificationChain msgs = null;
			if (leftFeature != null)
				msgs = ((InternalEObject)leftFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_AND_EXPRESSION__LEFT_FEATURE, null, msgs);
			if (newLeftFeature != null)
				msgs = ((InternalEObject)newLeftFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_AND_EXPRESSION__LEFT_FEATURE, null, msgs);
			msgs = basicSetLeftFeature(newLeftFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.IF_AND_EXPRESSION__LEFT_FEATURE, newLeftFeature, newLeftFeature));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getAnd()
  {
		return and;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAnd(String newAnd)
  {
		String oldAnd = and;
		and = newAnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.IF_AND_EXPRESSION__AND, oldAnd, and));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IfExpression getRightFeature()
  {
		return rightFeature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRightFeature(IfExpression newRightFeature, NotificationChain msgs)
  {
		IfExpression oldRightFeature = rightFeature;
		rightFeature = newRightFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlaPackage.IF_AND_EXPRESSION__RIGHT_FEATURE, oldRightFeature, newRightFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRightFeature(IfExpression newRightFeature)
  {
		if (newRightFeature != rightFeature) {
			NotificationChain msgs = null;
			if (rightFeature != null)
				msgs = ((InternalEObject)rightFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_AND_EXPRESSION__RIGHT_FEATURE, null, msgs);
			if (newRightFeature != null)
				msgs = ((InternalEObject)newRightFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_AND_EXPRESSION__RIGHT_FEATURE, null, msgs);
			msgs = basicSetRightFeature(newRightFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.IF_AND_EXPRESSION__RIGHT_FEATURE, newRightFeature, newRightFeature));
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
			case BlaPackage.IF_AND_EXPRESSION__LEFT_FEATURE:
				return basicSetLeftFeature(null, msgs);
			case BlaPackage.IF_AND_EXPRESSION__RIGHT_FEATURE:
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
			case BlaPackage.IF_AND_EXPRESSION__LEFT_FEATURE:
				return getLeftFeature();
			case BlaPackage.IF_AND_EXPRESSION__AND:
				return getAnd();
			case BlaPackage.IF_AND_EXPRESSION__RIGHT_FEATURE:
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
			case BlaPackage.IF_AND_EXPRESSION__LEFT_FEATURE:
				setLeftFeature((IfCompareExpression)newValue);
				return;
			case BlaPackage.IF_AND_EXPRESSION__AND:
				setAnd((String)newValue);
				return;
			case BlaPackage.IF_AND_EXPRESSION__RIGHT_FEATURE:
				setRightFeature((IfExpression)newValue);
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
			case BlaPackage.IF_AND_EXPRESSION__LEFT_FEATURE:
				setLeftFeature((IfCompareExpression)null);
				return;
			case BlaPackage.IF_AND_EXPRESSION__AND:
				setAnd(AND_EDEFAULT);
				return;
			case BlaPackage.IF_AND_EXPRESSION__RIGHT_FEATURE:
				setRightFeature((IfExpression)null);
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
			case BlaPackage.IF_AND_EXPRESSION__LEFT_FEATURE:
				return leftFeature != null;
			case BlaPackage.IF_AND_EXPRESSION__AND:
				return AND_EDEFAULT == null ? and != null : !AND_EDEFAULT.equals(and);
			case BlaPackage.IF_AND_EXPRESSION__RIGHT_FEATURE:
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
		result.append(" (and: ");
		result.append(and);
		result.append(')');
		return result.toString();
	}

} //IfAndExpressionImpl
