/**
 */
package org.xtext.bot.language.bla.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.bot.language.bla.BlaPackage;
import org.xtext.bot.language.bla.Block;
import org.xtext.bot.language.bla.CompareFeature;
import org.xtext.bot.language.bla.CompareValue;
import org.xtext.bot.language.bla.MathValue1;
import org.xtext.bot.language.bla.MathValue2;
import org.xtext.bot.language.bla.Read;
import org.xtext.bot.language.bla.Var;
import org.xtext.bot.language.bla.Write;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.impl.ReadImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.ReadImpl#getVariableValue <em>Variable Value</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.ReadImpl#getVariableFeature <em>Variable Feature</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.impl.ReadImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadImpl extends ProcedureImpl implements Read
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
	 * The cached value of the '{@link #getVariableValue() <em>Variable Value</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariableValue()
	 * @generated
	 * @ordered
	 */
  protected Var variableValue;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ReadImpl()
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
		return BlaPackage.Literals.READ;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlaPackage.READ__ACTION, oldAction, newAction);
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
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlaPackage.READ__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlaPackage.READ__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.READ__ACTION, newAction, newAction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlaPackage.READ__VARIABLE_VALUE, oldVariableValue, variableValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.READ__VARIABLE_VALUE, oldVariableValue, variableValue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlaPackage.READ__VARIABLE_FEATURE, oldVariableFeature, variableFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.READ__VARIABLE_FEATURE, oldVariableFeature, variableFeature));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlaPackage.READ__NAME, oldName, name));
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
			case BlaPackage.READ__ACTION:
				return basicSetAction(null, msgs);
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
			case BlaPackage.READ__ACTION:
				return getAction();
			case BlaPackage.READ__VARIABLE_VALUE:
				if (resolve) return getVariableValue();
				return basicGetVariableValue();
			case BlaPackage.READ__VARIABLE_FEATURE:
				if (resolve) return getVariableFeature();
				return basicGetVariableFeature();
			case BlaPackage.READ__NAME:
				return getName();
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
			case BlaPackage.READ__ACTION:
				setAction((Write)newValue);
				return;
			case BlaPackage.READ__VARIABLE_VALUE:
				setVariableValue((Var)newValue);
				return;
			case BlaPackage.READ__VARIABLE_FEATURE:
				setVariableFeature((Var)newValue);
				return;
			case BlaPackage.READ__NAME:
				setName((String)newValue);
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
			case BlaPackage.READ__ACTION:
				setAction((Write)null);
				return;
			case BlaPackage.READ__VARIABLE_VALUE:
				setVariableValue((Var)null);
				return;
			case BlaPackage.READ__VARIABLE_FEATURE:
				setVariableFeature((Var)null);
				return;
			case BlaPackage.READ__NAME:
				setName(NAME_EDEFAULT);
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
			case BlaPackage.READ__ACTION:
				return action != null;
			case BlaPackage.READ__VARIABLE_VALUE:
				return variableValue != null;
			case BlaPackage.READ__VARIABLE_FEATURE:
				return variableFeature != null;
			case BlaPackage.READ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
				case BlaPackage.READ__ACTION: return BlaPackage.BLOCK__ACTION;
				default: return -1;
			}
		}
		if (baseClass == CompareValue.class) {
			switch (derivedFeatureID) {
				case BlaPackage.READ__VARIABLE_VALUE: return BlaPackage.COMPARE_VALUE__VARIABLE_VALUE;
				default: return -1;
			}
		}
		if (baseClass == CompareFeature.class) {
			switch (derivedFeatureID) {
				case BlaPackage.READ__VARIABLE_FEATURE: return BlaPackage.COMPARE_FEATURE__VARIABLE_FEATURE;
				default: return -1;
			}
		}
		if (baseClass == MathValue1.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MathValue2.class) {
			switch (derivedFeatureID) {
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
				case BlaPackage.BLOCK__ACTION: return BlaPackage.READ__ACTION;
				default: return -1;
			}
		}
		if (baseClass == CompareValue.class) {
			switch (baseFeatureID) {
				case BlaPackage.COMPARE_VALUE__VARIABLE_VALUE: return BlaPackage.READ__VARIABLE_VALUE;
				default: return -1;
			}
		}
		if (baseClass == CompareFeature.class) {
			switch (baseFeatureID) {
				case BlaPackage.COMPARE_FEATURE__VARIABLE_FEATURE: return BlaPackage.READ__VARIABLE_FEATURE;
				default: return -1;
			}
		}
		if (baseClass == MathValue1.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MathValue2.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ReadImpl
