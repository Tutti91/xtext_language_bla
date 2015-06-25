/**
 */
package org.xtext.bot.language.bla.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.bot.language.bla.BlaPackage;
import org.xtext.bot.language.bla.Block;
import org.xtext.bot.language.bla.IfExpression;
import org.xtext.bot.language.bla.WhileLoop;
import org.xtext.bot.language.bla.Write;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.impl.WhileLoopImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.WhileLoopImpl#getWhile <em>While</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.WhileLoopImpl#getDoLoop <em>Do Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileLoopImpl extends ProcedureImpl implements WhileLoop
{
  /**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
  protected Write action;

  /**
	 * The cached value of the '{@link #getWhile() <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWhile()
	 * @generated
	 * @ordered
	 */
  protected IfExpression while_;

  /**
	 * The cached value of the '{@link #getDoLoop() <em>Do Loop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDoLoop()
	 * @generated
	 * @ordered
	 */
  protected EList<Block> doLoop;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WhileLoopImpl()
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
		return BlaPackage.Literals.WHILE_LOOP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Write getAction()
  {
		return action;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAction(Write newAction, NotificationChain msgs)
  {
		Write oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlaPackage.WHILE_LOOP__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAction(Write newAction)
  {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlaPackage.WHILE_LOOP__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlaPackage.WHILE_LOOP__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.WHILE_LOOP__ACTION, newAction, newAction));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IfExpression getWhile()
  {
		return while_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetWhile(IfExpression newWhile, NotificationChain msgs)
  {
		IfExpression oldWhile = while_;
		while_ = newWhile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlaPackage.WHILE_LOOP__WHILE, oldWhile, newWhile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWhile(IfExpression newWhile)
  {
		if (newWhile != while_) {
			NotificationChain msgs = null;
			if (while_ != null)
				msgs = ((InternalEObject)while_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlaPackage.WHILE_LOOP__WHILE, null, msgs);
			if (newWhile != null)
				msgs = ((InternalEObject)newWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlaPackage.WHILE_LOOP__WHILE, null, msgs);
			msgs = basicSetWhile(newWhile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.WHILE_LOOP__WHILE, newWhile, newWhile));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Block> getDoLoop()
  {
		if (doLoop == null) {
			doLoop = new EObjectContainmentEList<Block>(Block.class, this, BlaPackage.WHILE_LOOP__DO_LOOP);
		}
		return doLoop;
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
			case BlaPackage.WHILE_LOOP__ACTION:
				return basicSetAction(null, msgs);
			case BlaPackage.WHILE_LOOP__WHILE:
				return basicSetWhile(null, msgs);
			case BlaPackage.WHILE_LOOP__DO_LOOP:
				return ((InternalEList<?>)getDoLoop()).basicRemove(otherEnd, msgs);
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
			case BlaPackage.WHILE_LOOP__ACTION:
				return getAction();
			case BlaPackage.WHILE_LOOP__WHILE:
				return getWhile();
			case BlaPackage.WHILE_LOOP__DO_LOOP:
				return getDoLoop();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case BlaPackage.WHILE_LOOP__ACTION:
				setAction((Write)newValue);
				return;
			case BlaPackage.WHILE_LOOP__WHILE:
				setWhile((IfExpression)newValue);
				return;
			case BlaPackage.WHILE_LOOP__DO_LOOP:
				getDoLoop().clear();
				getDoLoop().addAll((Collection<? extends Block>)newValue);
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
			case BlaPackage.WHILE_LOOP__ACTION:
				setAction((Write)null);
				return;
			case BlaPackage.WHILE_LOOP__WHILE:
				setWhile((IfExpression)null);
				return;
			case BlaPackage.WHILE_LOOP__DO_LOOP:
				getDoLoop().clear();
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
			case BlaPackage.WHILE_LOOP__ACTION:
				return action != null;
			case BlaPackage.WHILE_LOOP__WHILE:
				return while_ != null;
			case BlaPackage.WHILE_LOOP__DO_LOOP:
				return doLoop != null && !doLoop.isEmpty();
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
		if (baseClass == Block.class) {
			switch (derivedFeatureID) {
				case BlaPackage.WHILE_LOOP__ACTION: return BlaPackage.BLOCK__ACTION;
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
		if (baseClass == Block.class) {
			switch (baseFeatureID) {
				case BlaPackage.BLOCK__ACTION: return BlaPackage.WHILE_LOOP__ACTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WhileLoopImpl
