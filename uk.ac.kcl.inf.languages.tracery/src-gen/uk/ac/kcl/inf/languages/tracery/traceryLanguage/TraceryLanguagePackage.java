/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface TraceryLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "traceryLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/kcl/inf/languages/tracery/TraceryLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "traceryLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TraceryLanguagePackage eINSTANCE = uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryProgramImpl <em>Tracery Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryProgramImpl
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getTraceryProgram()
   * @generated
   */
  int TRACERY_PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Initial Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACERY_PROGRAM__INITIAL_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACERY_PROGRAM__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Tracery Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACERY_PROGRAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InnerStatementImpl <em>Inner Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InnerStatementImpl
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getInnerStatement()
   * @generated
   */
  int INNER_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_STATEMENT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Inner Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.VariableDeclerationImpl <em>Variable Decleration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.VariableDeclerationImpl
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getVariableDecleration()
   * @generated
   */
  int VARIABLE_DECLERATION = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLERATION__VALUE = INNER_STATEMENT__VALUE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLERATION__NAME = INNER_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Decleration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLERATION_FEATURE_COUNT = INNER_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InitialStatementImpl <em>Initial Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InitialStatementImpl
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getInitialStatement()
   * @generated
   */
  int INITIAL_STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Start Val</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_STATEMENT__START_VAL = 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_STATEMENT__VALS = 1;

  /**
   * The number of structural features of the '<em>Initial Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.StatementImpl
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.startValueImpl <em>start Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.startValueImpl
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getstartValue()
   * @generated
   */
  int START_VALUE = 4;

  /**
   * The feature id for the '<em><b>Innards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_VALUE__INNARDS = 0;

  /**
   * The number of structural features of the '<em>start Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.normalValueImpl <em>normal Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.normalValueImpl
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getnormalValue()
   * @generated
   */
  int NORMAL_VALUE = 5;

  /**
   * The feature id for the '<em><b>Innards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_VALUE__INNARDS = 0;

  /**
   * The number of structural features of the '<em>normal Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.StartingJSONExpressionImpl <em>Starting JSON Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.StartingJSONExpressionImpl
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getStartingJSONExpression()
   * @generated
   */
  int STARTING_JSON_EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Start Val</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STARTING_JSON_EXPRESSION__START_VAL = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STARTING_JSON_EXPRESSION__VALS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STARTING_JSON_EXPRESSION__VAR = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Starting JSON Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STARTING_JSON_EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram <em>Tracery Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tracery Program</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram
   * @generated
   */
  EClass getTraceryProgram();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram#getInitialStatement <em>Initial Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Statement</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram#getInitialStatement()
   * @see #getTraceryProgram()
   * @generated
   */
  EReference getTraceryProgram_InitialStatement();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram#getStatements()
   * @see #getTraceryProgram()
   * @generated
   */
  EReference getTraceryProgram_Statements();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.VariableDecleration <em>Variable Decleration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Decleration</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.VariableDecleration
   * @generated
   */
  EClass getVariableDecleration();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.VariableDecleration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.VariableDecleration#getName()
   * @see #getVariableDecleration()
   * @generated
   */
  EAttribute getVariableDecleration_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialStatement <em>Initial Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initial Statement</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialStatement
   * @generated
   */
  EClass getInitialStatement();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialStatement#getStartVal <em>Start Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Start Val</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialStatement#getStartVal()
   * @see #getInitialStatement()
   * @generated
   */
  EReference getInitialStatement_StartVal();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialStatement#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialStatement#getVals()
   * @see #getInitialStatement()
   * @generated
   */
  EReference getInitialStatement_Vals();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.startValue <em>start Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>start Value</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.startValue
   * @generated
   */
  EClass getstartValue();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.startValue#getInnards <em>Innards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Innards</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.startValue#getInnards()
   * @see #getstartValue()
   * @generated
   */
  EReference getstartValue_Innards();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.normalValue <em>normal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>normal Value</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.normalValue
   * @generated
   */
  EClass getnormalValue();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.normalValue#getInnards <em>Innards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Innards</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.normalValue#getInnards()
   * @see #getnormalValue()
   * @generated
   */
  EReference getnormalValue_Innards();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InnerStatement <em>Inner Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inner Statement</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.InnerStatement
   * @generated
   */
  EClass getInnerStatement();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.InnerStatement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.InnerStatement#getValue()
   * @see #getInnerStatement()
   * @generated
   */
  EAttribute getInnerStatement_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.StartingJSONExpression <em>Starting JSON Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Starting JSON Expression</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.StartingJSONExpression
   * @generated
   */
  EClass getStartingJSONExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.StartingJSONExpression#getStartVal <em>Start Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Start Val</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.StartingJSONExpression#getStartVal()
   * @see #getStartingJSONExpression()
   * @generated
   */
  EReference getStartingJSONExpression_StartVal();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.StartingJSONExpression#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.StartingJSONExpression#getVals()
   * @see #getStartingJSONExpression()
   * @generated
   */
  EReference getStartingJSONExpression_Vals();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.StartingJSONExpression#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.StartingJSONExpression#getVar()
   * @see #getStartingJSONExpression()
   * @generated
   */
  EReference getStartingJSONExpression_Var();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TraceryLanguageFactory getTraceryLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryProgramImpl <em>Tracery Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryProgramImpl
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getTraceryProgram()
     * @generated
     */
    EClass TRACERY_PROGRAM = eINSTANCE.getTraceryProgram();

    /**
     * The meta object literal for the '<em><b>Initial Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACERY_PROGRAM__INITIAL_STATEMENT = eINSTANCE.getTraceryProgram_InitialStatement();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACERY_PROGRAM__STATEMENTS = eINSTANCE.getTraceryProgram_Statements();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.VariableDeclerationImpl <em>Variable Decleration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.VariableDeclerationImpl
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getVariableDecleration()
     * @generated
     */
    EClass VARIABLE_DECLERATION = eINSTANCE.getVariableDecleration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLERATION__NAME = eINSTANCE.getVariableDecleration_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InitialStatementImpl <em>Initial Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InitialStatementImpl
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getInitialStatement()
     * @generated
     */
    EClass INITIAL_STATEMENT = eINSTANCE.getInitialStatement();

    /**
     * The meta object literal for the '<em><b>Start Val</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIAL_STATEMENT__START_VAL = eINSTANCE.getInitialStatement_StartVal();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIAL_STATEMENT__VALS = eINSTANCE.getInitialStatement_Vals();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.StatementImpl
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.startValueImpl <em>start Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.startValueImpl
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getstartValue()
     * @generated
     */
    EClass START_VALUE = eINSTANCE.getstartValue();

    /**
     * The meta object literal for the '<em><b>Innards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_VALUE__INNARDS = eINSTANCE.getstartValue_Innards();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.normalValueImpl <em>normal Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.normalValueImpl
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getnormalValue()
     * @generated
     */
    EClass NORMAL_VALUE = eINSTANCE.getnormalValue();

    /**
     * The meta object literal for the '<em><b>Innards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_VALUE__INNARDS = eINSTANCE.getnormalValue_Innards();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InnerStatementImpl <em>Inner Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InnerStatementImpl
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getInnerStatement()
     * @generated
     */
    EClass INNER_STATEMENT = eINSTANCE.getInnerStatement();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_STATEMENT__VALUE = eINSTANCE.getInnerStatement_Value();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.StartingJSONExpressionImpl <em>Starting JSON Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.StartingJSONExpressionImpl
     * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.TraceryLanguagePackageImpl#getStartingJSONExpression()
     * @generated
     */
    EClass STARTING_JSON_EXPRESSION = eINSTANCE.getStartingJSONExpression();

    /**
     * The meta object literal for the '<em><b>Start Val</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STARTING_JSON_EXPRESSION__START_VAL = eINSTANCE.getStartingJSONExpression_StartVal();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STARTING_JSON_EXPRESSION__VALS = eINSTANCE.getStartingJSONExpression_Vals();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STARTING_JSON_EXPRESSION__VAR = eINSTANCE.getStartingJSONExpression_Var();

  }

} //TraceryLanguagePackage
