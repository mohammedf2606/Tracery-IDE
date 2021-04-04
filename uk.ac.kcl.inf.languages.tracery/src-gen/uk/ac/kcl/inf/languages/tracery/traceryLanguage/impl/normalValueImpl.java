/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InnerStatement;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.normalValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>normal Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.normalValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class normalValueImpl extends MinimalEObjectImpl.Container implements normalValue
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<InnerStatement> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected normalValueImpl()
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
    return TraceryLanguagePackage.Literals.NORMAL_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InnerStatement> getValue()
  {
    if (value == null)
    {
      value = new EObjectContainmentEList<InnerStatement>(InnerStatement.class, this, TraceryLanguagePackage.NORMAL_VALUE__VALUE);
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TraceryLanguagePackage.NORMAL_VALUE__VALUE:
        return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
    switch (featureID)
    {
      case TraceryLanguagePackage.NORMAL_VALUE__VALUE:
        return getValue();
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
    switch (featureID)
    {
      case TraceryLanguagePackage.NORMAL_VALUE__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends InnerStatement>)newValue);
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
    switch (featureID)
    {
      case TraceryLanguagePackage.NORMAL_VALUE__VALUE:
        getValue().clear();
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
    switch (featureID)
    {
      case TraceryLanguagePackage.NORMAL_VALUE__VALUE:
        return value != null && !value.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //normalValueImpl