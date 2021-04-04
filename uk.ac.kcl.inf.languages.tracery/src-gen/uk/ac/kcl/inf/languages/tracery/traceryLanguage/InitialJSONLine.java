/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial JSON Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialJSONLine#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialJSONLine#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getInitialJSONLine()
 * @model
 * @generated
 */
public interface InitialJSONLine extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getInitialJSONLine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialJSONLine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(InitialJSONEnding)
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getInitialJSONLine_Value()
   * @model containment="true"
   * @generated
   */
  InitialJSONEnding getValue();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialJSONLine#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(InitialJSONEnding value);

} // InitialJSONLine
