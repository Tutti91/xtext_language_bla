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
import org.xtext.bot.language.bla.IFStatement;
import org.xtext.bot.language.bla.IfExpression;
import org.xtext.bot.language.bla.Write;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IF Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.impl.IFStatementImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.IFStatementImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.IFStatementImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.IFStatementImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFStatementImpl extends ProcedureImpl implements IFStatement
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
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
  protected IfExpression if_;

  /**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
  protected EList<Block> then;

  /**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
  protected EList<Block> else_;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected IFStatementImpl()
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
		return BlaPackage.Literals.IF_STATEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlaPackage.IF_STATEMENT__ACTION, oldAction, newAction);
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
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_STATEMENT__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_STATEMENT__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.IF_STATEMENT__ACTION, newAction, newAction));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IfExpression getIf()
  {
		return if_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetIf(IfExpression newIf, NotificationChain msgs)
  {
		IfExpression oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlaPackage.IF_STATEMENT__IF, oldIf, newIf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setIf(IfExpression newIf)
  {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_STATEMENT__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlaPackage.IF_STATEMENT__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.IF_STATEMENT__IF, newIf, newIf));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Block> getThen()
  {
		if (then == null) {
			then = new EObjectContainmentEList<Block>(Block.class, this, BlaPackage.IF_STATEMENT__THEN);
		}
		return then;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Block> getElse()
  {
		if (else_ == null) {
			else_ = new EObjectContainmentEList<Block>(Block.class, this, BlaPackage.IF_STATEMENT__ELSE);
		}
		return else_;
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
			case BlaPackage.IF_STATEMENT__ACTION:
				return basicSetAction(null, msgs);
			case BlaPackage.IF_STATEMENT__IF:
				return basicSetIf(null, msgs);
			case BlaPackage.IF_STATEMENT__THEN:
				return ((InternalEList<?>)getThen()).basicRemove(otherEnd, msgs);
			case BlaPackage.IF_STATEMENT__ELSE:
				return ((InternalEList<?>)getElse()).basicRemove(otherEnd, msgs);
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
			case BlaPackage.IF_STATEMENT__ACTION:
				return getAction();
			case BlaPackage.IF_STATEMENT__IF:
				return getIf();
			case BlaPackage.IF_STATEMENT__THEN:
				return getThen();
			case BlaPackage.IF_STATEMENT__ELSE:
				return getElse();
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
			case BlaPackage.IF_STATEMENT__ACTION:
				setAction((Write)newValue);
				return;
			case BlaPackage.IF_STATEMENT__IF:
				setIf((IfExpression)newValue);
				return;
			case BlaPackage.IF_STATEMENT__THEN:
				getThen().clear();
				getThen().addAll((Collection<? extends Block>)newValue);
				return;
			case BlaPackage.IF_STATEMENT__ELSE:
				getElse().clear();
				getElse().addAll((Collection<? extends Block>)newValue);
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
			case BlaPackage.IF_STATEMENT__ACTION:
				setAction((Write)null);
				return;
			case BlaPackage.IF_STATEMENT__IF:
				setIf((IfExpression)null);
				return;
			case BlaPackage.IF_STATEMENT__THEN:
				getThen().clear();
				return;
			case BlaPackage.IF_STATEMENT__ELSE:
				getElse().clear();
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
			case BlaPackage.IF_STATEMENT__ACTION:
				return action != null;
			case BlaPackage.IF_STATEMENT__IF:
				return if_ != null;
			case BlaPackage.IF_STATEMENT__THEN:
				return then != null && !then.isEmpty();
			case BlaPackage.IF_STATEMENT__ELSE:
				return else_ != null && !else_.isEmpty();
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
				case BlaPackage.IF_STATEMENT__ACTION: return BlaPackage.BLOCK__ACTION;
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
				case BlaPackage.BLOCK__ACTION: return BlaPackage.IF_STATEMENT__ACTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IFStatementImpl
