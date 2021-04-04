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

import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialJSONEnding;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.NormalValue;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.StartValue;
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial JSON Ending</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InitialJSONEndingImpl#getStartVal <em>Start Val</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InitialJSONEndingImpl#getVals <em>Vals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialJSONEndingImpl extends MinimalEObjectImpl.Container implements InitialJSONEnding
{
  /**
   * The cached value of the '{@link #getStartVal() <em>Start Val</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartVal()
   * @generated
   * @ordered
   */
  protected EList<StartValue> startVal;

  /**
   * The cached value of the '{@link #getVals() <em>Vals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVals()
   * @generated
   * @ordered
   */
  protected EList<NormalValue> vals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitialJSONEndingImpl()
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
    return TraceryLanguagePackage.Literals.INITIAL_JSON_ENDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StartValue> getStartVal()
  {
    if (startVal == null)
    {
      startVal = new EObjectContainmentEList<StartValue>(StartValue.class, this, TraceryLanguagePackage.INITIAL_JSON_ENDING__START_VAL);
    }
    return startVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NormalValue> getVals()
  {
    if (vals == null)
    {
      vals = new EObjectContainmentEList<NormalValue>(NormalValue.class, this, TraceryLanguagePackage.INITIAL_JSON_ENDING__VALS);
    }
    return vals;
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
      case TraceryLanguagePackage.INITIAL_JSON_ENDING__START_VAL:
        return ((InternalEList<?>)getStartVal()).basicRemove(otherEnd, msgs);
      case TraceryLanguagePackage.INITIAL_JSON_ENDING__VALS:
        return ((InternalEList<?>)getVals()).basicRemove(otherEnd, msgs);
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
      case TraceryLanguagePackage.INITIAL_JSON_ENDING__START_VAL:
        return getStartVal();
      case TraceryLanguagePackage.INITIAL_JSON_ENDING__VALS:
        return getVals();
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
      case TraceryLanguagePackage.INITIAL_JSON_ENDING__START_VAL:
        getStartVal().clear();
        getStartVal().addAll((Collection<? extends StartValue>)newValue);
        return;
      case TraceryLanguagePackage.INITIAL_JSON_ENDING__VALS:
        getVals().clear();
        getVals().addAll((Collection<? extends NormalValue>)newValue);
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
      case TraceryLanguagePackage.INITIAL_JSON_ENDING__START_VAL:
        getStartVal().clear();
        return;
      case TraceryLanguagePackage.INITIAL_JSON_ENDING__VALS:
        getVals().clear();
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
      case TraceryLanguagePackage.INITIAL_JSON_ENDING__START_VAL:
        return startVal != null && !startVal.isEmpty();
      case TraceryLanguagePackage.INITIAL_JSON_ENDING__VALS:
        return vals != null && !vals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InitialJSONEndingImpl
