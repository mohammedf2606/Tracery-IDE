/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TraceryLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class TraceryProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.TraceryProgram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cInitialStatementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInitialStatementInitialStatementParserRuleCall_1_0 = (RuleCall)cInitialStatementAssignment_1.eContents().get(0);
		private final Assignment cStatementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatementsStatementParserRuleCall_2_0 = (RuleCall)cStatementsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TraceryProgram:
		//	'{'
		//	initialStatement=InitialStatement
		//	statements+=Statement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{'
		//initialStatement=InitialStatement
		//statements+=Statement*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//initialStatement=InitialStatement
		public Assignment getInitialStatementAssignment_1() { return cInitialStatementAssignment_1; }
		
		//InitialStatement
		public RuleCall getInitialStatementInitialStatementParserRuleCall_1_0() { return cInitialStatementInitialStatementParserRuleCall_1_0; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_2() { return cStatementsAssignment_2; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_2_0() { return cStatementsStatementParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class VariableDeclerationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.VariableDecleration");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//VariableDecleration:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class InitialStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOriginKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStartValAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStartValStartValueParserRuleCall_3_0 = (RuleCall)cStartValAssignment_3.eContents().get(0);
		private final Assignment cValsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValsNormalValueParserRuleCall_4_0 = (RuleCall)cValsAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//InitialStatement:
		//	'&origin&' ':' '[' startVal+=startValue vals+=normalValue* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'&origin&' ':' '[' startVal+=startValue vals+=normalValue* ']'
		public Group getGroup() { return cGroup; }
		
		//'&origin&'
		public Keyword getOriginKeyword_0() { return cOriginKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }
		
		//startVal+=startValue
		public Assignment getStartValAssignment_3() { return cStartValAssignment_3; }
		
		//startValue
		public RuleCall getStartValStartValueParserRuleCall_3_0() { return cStartValStartValueParserRuleCall_3_0; }
		
		//vals+=normalValue*
		public Assignment getValsAssignment_4() { return cValsAssignment_4; }
		
		//normalValue
		public RuleCall getValsNormalValueParserRuleCall_4_0() { return cValsNormalValueParserRuleCall_4_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.Statement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAmpersandKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cStartingJSONExpressionParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cAmpersandKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cStartValAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cStartValStartValueParserRuleCall_6_0 = (RuleCall)cStartValAssignment_6.eContents().get(0);
		private final Assignment cValsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cValsNormalValueParserRuleCall_7_0 = (RuleCall)cValsAssignment_7.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Statement:
		//	',' '&' StartingJSONExpression '&' ':' '[' startVal+=startValue vals+=normalValue* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//',' '&' StartingJSONExpression '&' ':' '[' startVal+=startValue vals+=normalValue* ']'
		public Group getGroup() { return cGroup; }
		
		//','
		public Keyword getCommaKeyword_0() { return cCommaKeyword_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_1() { return cAmpersandKeyword_1; }
		
		//StartingJSONExpression
		public RuleCall getStartingJSONExpressionParserRuleCall_2() { return cStartingJSONExpressionParserRuleCall_2; }
		
		//'&'
		public Keyword getAmpersandKeyword_3() { return cAmpersandKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_5() { return cLeftSquareBracketKeyword_5; }
		
		//startVal+=startValue
		public Assignment getStartValAssignment_6() { return cStartValAssignment_6; }
		
		//startValue
		public RuleCall getStartValStartValueParserRuleCall_6_0() { return cStartValStartValueParserRuleCall_6_0; }
		
		//vals+=normalValue*
		public Assignment getValsAssignment_7() { return cValsAssignment_7; }
		
		//normalValue
		public RuleCall getValsNormalValueParserRuleCall_7_0() { return cValsNormalValueParserRuleCall_7_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_8() { return cRightSquareBracketKeyword_8; }
	}
	public class StartValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.startValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStartValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAmpersandKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInnardsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInnardsInnerStatementParserRuleCall_2_0 = (RuleCall)cInnardsAssignment_2.eContents().get(0);
		private final Keyword cAmpersandKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//startValue:
		//	{startValue} '&' innards+=InnerStatement* '&';
		@Override public ParserRule getRule() { return rule; }
		
		//{startValue} '&' innards+=InnerStatement* '&'
		public Group getGroup() { return cGroup; }
		
		//{startValue}
		public Action getStartValueAction_0() { return cStartValueAction_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_1() { return cAmpersandKeyword_1; }
		
		//innards+=InnerStatement*
		public Assignment getInnardsAssignment_2() { return cInnardsAssignment_2; }
		
		//InnerStatement
		public RuleCall getInnardsInnerStatementParserRuleCall_2_0() { return cInnardsInnerStatementParserRuleCall_2_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_3() { return cAmpersandKeyword_3; }
	}
	public class NormalValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.normalValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNormalValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCommaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAmpersandKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInnardsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInnardsInnerStatementParserRuleCall_3_0 = (RuleCall)cInnardsAssignment_3.eContents().get(0);
		private final Keyword cAmpersandKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//normalValue:
		//	{normalValue} ',' '&' innards+=InnerStatement* '&';
		@Override public ParserRule getRule() { return rule; }
		
		//{normalValue} ',' '&' innards+=InnerStatement* '&'
		public Group getGroup() { return cGroup; }
		
		//{normalValue}
		public Action getNormalValueAction_0() { return cNormalValueAction_0; }
		
		//','
		public Keyword getCommaKeyword_1() { return cCommaKeyword_1; }
		
		//'&'
		public Keyword getAmpersandKeyword_2() { return cAmpersandKeyword_2; }
		
		//innards+=InnerStatement*
		public Assignment getInnardsAssignment_3() { return cInnardsAssignment_3; }
		
		//InnerStatement
		public RuleCall getInnardsInnerStatementParserRuleCall_3_0() { return cInnardsInnerStatementParserRuleCall_3_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_4() { return cAmpersandKeyword_4; }
	}
	public class InnerStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InnerStatement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cNumberSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cVariableDeclerationParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cNumberSignKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cNumberSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cVariableDeclerationParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cEdKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cNumberSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final RuleCall cVariableDeclerationParserRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		private final Keyword cAKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cNumberSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final RuleCall cVariableDeclerationParserRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final Keyword cTheKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cNumberSignKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final RuleCall cVariableDeclerationParserRuleCall_5_1 = (RuleCall)cGroup_5.eContents().get(1);
		private final Keyword cCapitaliseKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		
		//InnerStatement:
		//	value=STRING |
		//	'#' VariableDecleration '#' |
		//	'#' VariableDecleration '.ed#' |
		//	'#' VariableDecleration '.a#' |
		//	'#' VariableDecleration '.the#' |
		//	'#' VariableDecleration '.capitalise#';
		@Override public ParserRule getRule() { return rule; }
		
		//value=STRING |
		//'#' VariableDecleration '#' |
		//'#' VariableDecleration '.ed#' |
		//'#' VariableDecleration '.a#' |
		//'#' VariableDecleration '.the#' |
		//'#' VariableDecleration '.capitalise#'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//value=STRING
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0_0() { return cValueSTRINGTerminalRuleCall_0_0; }
		
		//'#' VariableDecleration '#'
		public Group getGroup_1() { return cGroup_1; }
		
		//'#'
		public Keyword getNumberSignKeyword_1_0() { return cNumberSignKeyword_1_0; }
		
		//VariableDecleration
		public RuleCall getVariableDeclerationParserRuleCall_1_1() { return cVariableDeclerationParserRuleCall_1_1; }
		
		//'#'
		public Keyword getNumberSignKeyword_1_2() { return cNumberSignKeyword_1_2; }
		
		//'#' VariableDecleration '.ed#'
		public Group getGroup_2() { return cGroup_2; }
		
		//'#'
		public Keyword getNumberSignKeyword_2_0() { return cNumberSignKeyword_2_0; }
		
		//VariableDecleration
		public RuleCall getVariableDeclerationParserRuleCall_2_1() { return cVariableDeclerationParserRuleCall_2_1; }
		
		//'.ed#'
		public Keyword getEdKeyword_2_2() { return cEdKeyword_2_2; }
		
		//'#' VariableDecleration '.a#'
		public Group getGroup_3() { return cGroup_3; }
		
		//'#'
		public Keyword getNumberSignKeyword_3_0() { return cNumberSignKeyword_3_0; }
		
		//VariableDecleration
		public RuleCall getVariableDeclerationParserRuleCall_3_1() { return cVariableDeclerationParserRuleCall_3_1; }
		
		//'.a#'
		public Keyword getAKeyword_3_2() { return cAKeyword_3_2; }
		
		//'#' VariableDecleration '.the#'
		public Group getGroup_4() { return cGroup_4; }
		
		//'#'
		public Keyword getNumberSignKeyword_4_0() { return cNumberSignKeyword_4_0; }
		
		//VariableDecleration
		public RuleCall getVariableDeclerationParserRuleCall_4_1() { return cVariableDeclerationParserRuleCall_4_1; }
		
		//'.the#'
		public Keyword getTheKeyword_4_2() { return cTheKeyword_4_2; }
		
		//'#' VariableDecleration '.capitalise#'
		public Group getGroup_5() { return cGroup_5; }
		
		//'#'
		public Keyword getNumberSignKeyword_5_0() { return cNumberSignKeyword_5_0; }
		
		//VariableDecleration
		public RuleCall getVariableDeclerationParserRuleCall_5_1() { return cVariableDeclerationParserRuleCall_5_1; }
		
		//'.capitalise#'
		public Keyword getCapitaliseKeyword_5_2() { return cCapitaliseKeyword_5_2; }
	}
	public class StartingJSONExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.StartingJSONExpression");
		private final Assignment cVarAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cVarVariableDeclerationCrossReference_0 = (CrossReference)cVarAssignment.eContents().get(0);
		private final RuleCall cVarVariableDeclerationIDTerminalRuleCall_0_1 = (RuleCall)cVarVariableDeclerationCrossReference_0.eContents().get(1);
		
		//StartingJSONExpression:
		//	var=[VariableDecleration];
		@Override public ParserRule getRule() { return rule; }
		
		//var=[VariableDecleration]
		public Assignment getVarAssignment() { return cVarAssignment; }
		
		//[VariableDecleration]
		public CrossReference getVarVariableDeclerationCrossReference_0() { return cVarVariableDeclerationCrossReference_0; }
		
		//ID
		public RuleCall getVarVariableDeclerationIDTerminalRuleCall_0_1() { return cVarVariableDeclerationIDTerminalRuleCall_0_1; }
	}
	
	
	private final TraceryProgramElements pTraceryProgram;
	private final VariableDeclerationElements pVariableDecleration;
	private final InitialStatementElements pInitialStatement;
	private final StatementElements pStatement;
	private final StartValueElements pStartValue;
	private final NormalValueElements pNormalValue;
	private final InnerStatementElements pInnerStatement;
	private final StartingJSONExpressionElements pStartingJSONExpression;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TraceryLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTraceryProgram = new TraceryProgramElements();
		this.pVariableDecleration = new VariableDeclerationElements();
		this.pInitialStatement = new InitialStatementElements();
		this.pStatement = new StatementElements();
		this.pStartValue = new StartValueElements();
		this.pNormalValue = new NormalValueElements();
		this.pInnerStatement = new InnerStatementElements();
		this.pStartingJSONExpression = new StartingJSONExpressionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.ac.kcl.inf.languages.tracery.TraceryLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//TraceryProgram:
	//	'{'
	//	initialStatement=InitialStatement
	//	statements+=Statement*
	//	'}';
	public TraceryProgramElements getTraceryProgramAccess() {
		return pTraceryProgram;
	}
	
	public ParserRule getTraceryProgramRule() {
		return getTraceryProgramAccess().getRule();
	}
	
	//VariableDecleration:
	//	name=ID;
	public VariableDeclerationElements getVariableDeclerationAccess() {
		return pVariableDecleration;
	}
	
	public ParserRule getVariableDeclerationRule() {
		return getVariableDeclerationAccess().getRule();
	}
	
	//InitialStatement:
	//	'&origin&' ':' '[' startVal+=startValue vals+=normalValue* ']';
	public InitialStatementElements getInitialStatementAccess() {
		return pInitialStatement;
	}
	
	public ParserRule getInitialStatementRule() {
		return getInitialStatementAccess().getRule();
	}
	
	//Statement:
	//	',' '&' StartingJSONExpression '&' ':' '[' startVal+=startValue vals+=normalValue* ']';
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//startValue:
	//	{startValue} '&' innards+=InnerStatement* '&';
	public StartValueElements getStartValueAccess() {
		return pStartValue;
	}
	
	public ParserRule getStartValueRule() {
		return getStartValueAccess().getRule();
	}
	
	//normalValue:
	//	{normalValue} ',' '&' innards+=InnerStatement* '&';
	public NormalValueElements getNormalValueAccess() {
		return pNormalValue;
	}
	
	public ParserRule getNormalValueRule() {
		return getNormalValueAccess().getRule();
	}
	
	//InnerStatement:
	//	value=STRING |
	//	'#' VariableDecleration '#' |
	//	'#' VariableDecleration '.ed#' |
	//	'#' VariableDecleration '.a#' |
	//	'#' VariableDecleration '.the#' |
	//	'#' VariableDecleration '.capitalise#';
	public InnerStatementElements getInnerStatementAccess() {
		return pInnerStatement;
	}
	
	public ParserRule getInnerStatementRule() {
		return getInnerStatementAccess().getRule();
	}
	
	//StartingJSONExpression:
	//	var=[VariableDecleration];
	public StartingJSONExpressionElements getStartingJSONExpressionAccess() {
		return pStartingJSONExpression;
	}
	
	public ParserRule getStartingJSONExpressionRule() {
		return getStartingJSONExpressionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
