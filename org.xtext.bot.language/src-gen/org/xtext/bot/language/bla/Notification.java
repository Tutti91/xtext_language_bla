/**
 */
package org.xtext.bot.language.bla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bot.language.bla.Notification#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.bot.language.bla.Notification#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bot.language.bla.BlaPackage#getNotification()
 * @model
 * @generated
 */
public interface Notification extends Procedure, Block
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.bot.language.bla.BlaPackage#getNotification_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.Notification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.xtext.bot.language.bla.BlaPackage#getNotification_Address()
	 * @model
	 * @generated
	 */
  String getAddress();

  /**
	 * Sets the value of the '{@link org.xtext.bot.language.bla.Notification#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
  void setAddress(String value);

} // Notification
