/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
		private final RuleCall cInitialStatementInitialJSONLineParserRuleCall_1_0 = (RuleCall)cInitialStatementAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//TraceryProgram:
		//	'{'
		//	initialStatement+=InitialJSONLine
		//	/* statements += NormalJSONLine* */
		//	/* finalStatement = FinalJSONLine */
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{'
		//initialStatement+=InitialJSONLine
		///* statements += NormalJSONLine* */
		///* finalStatement = FinalJSONLine */
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//initialStatement+=InitialJSONLine
		public Assignment getInitialStatementAssignment_1() { return cInitialStatementAssignment_1; }
		
		//InitialJSONLine
		public RuleCall getInitialStatementInitialJSONLineParserRuleCall_1_0() { return cInitialStatementInitialJSONLineParserRuleCall_1_0; }
		
		///* statements += NormalJSONLine* */
		///* finalStatement = FinalJSONLine */
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class InitialJSONLineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialJSONLine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAmpersandKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cAmpersandKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueInitialJSONEndingParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		
		//InitialJSONLine hidden():
		//	'&' name=ID '&' ':' value=InitialJSONEnding;
		@Override public ParserRule getRule() { return rule; }
		
		//'&' name=ID '&' ':' value=InitialJSONEnding
		public Group getGroup() { return cGroup; }
		
		//'&'
		public Keyword getAmpersandKeyword_0() { return cAmpersandKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_2() { return cAmpersandKeyword_2; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//value=InitialJSONEnding
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//InitialJSONEnding
		public RuleCall getValueInitialJSONEndingParserRuleCall_4_0() { return cValueInitialJSONEndingParserRuleCall_4_0; }
	}
	public class InitialJSONEndingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialJSONEnding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStartValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStartValStartValueParserRuleCall_1_0 = (RuleCall)cStartValAssignment_1.eContents().get(0);
		private final Assignment cValsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValsNormalValueParserRuleCall_2_0 = (RuleCall)cValsAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		///* 
		// * FinalJSONLine hidden(WS):
		// * 	"," "&origin&" ":" "[" startVal+=finalStartValue vals+=finalNormalValue* "]"
		// * ;
		// */
		//InitialJSONEnding hidden(WS):
		//	'[' startVal+=StartValue vals+=NormalValue* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' startVal+=StartValue vals+=NormalValue* ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//startVal+=StartValue
		public Assignment getStartValAssignment_1() { return cStartValAssignment_1; }
		
		//StartValue
		public RuleCall getStartValStartValueParserRuleCall_1_0() { return cStartValStartValueParserRuleCall_1_0; }
		
		//vals+=NormalValue*
		public Assignment getValsAssignment_2() { return cValsAssignment_2; }
		
		//NormalValue
		public RuleCall getValsNormalValueParserRuleCall_2_0() { return cValsNormalValueParserRuleCall_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class StartValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.StartValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAmpersandKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueInnerStatementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueInnerStatementsInnerStatementsParserRuleCall_1_0 = (RuleCall)cValueInnerStatementsAssignment_1.eContents().get(0);
		private final Keyword cAmpersandKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//StartValue hidden(WS):
		//	'&' valueInnerStatements+=InnerStatements '&';
		@Override public ParserRule getRule() { return rule; }
		
		//'&' valueInnerStatements+=InnerStatements '&'
		public Group getGroup() { return cGroup; }
		
		//'&'
		public Keyword getAmpersandKeyword_0() { return cAmpersandKeyword_0; }
		
		//valueInnerStatements+=InnerStatements
		public Assignment getValueInnerStatementsAssignment_1() { return cValueInnerStatementsAssignment_1; }
		
		//InnerStatements
		public RuleCall getValueInnerStatementsInnerStatementsParserRuleCall_1_0() { return cValueInnerStatementsInnerStatementsParserRuleCall_1_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_2() { return cAmpersandKeyword_2; }
	}
	public class NormalValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.NormalValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAmpersandKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueInnerStatementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueInnerStatementsInnerStatementsParserRuleCall_2_0 = (RuleCall)cValueInnerStatementsAssignment_2.eContents().get(0);
		private final Keyword cAmpersandKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//NormalValue hidden(WS):
		//	',' '&' valueInnerStatements+=InnerStatements '&';
		@Override public ParserRule getRule() { return rule; }
		
		//',' '&' valueInnerStatements+=InnerStatements '&'
		public Group getGroup() { return cGroup; }
		
		//','
		public Keyword getCommaKeyword_0() { return cCommaKeyword_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_1() { return cAmpersandKeyword_1; }
		
		//valueInnerStatements+=InnerStatements
		public Assignment getValueInnerStatementsAssignment_2() { return cValueInnerStatementsAssignment_2; }
		
		//InnerStatements
		public RuleCall getValueInnerStatementsInnerStatementsParserRuleCall_2_0() { return cValueInnerStatementsInnerStatementsParserRuleCall_2_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_3() { return cAmpersandKeyword_3; }
	}
	public class InnerStatementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InnerStatements");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cValSTRINGTerminalRuleCall_0_0 = (RuleCall)cValAssignment_0.eContents().get(0);
		private final RuleCall cDeclaredVariableParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//InnerStatements hidden():
		//	val=STRING | DeclaredVariable;
		@Override public ParserRule getRule() { return rule; }
		
		//val=STRING | DeclaredVariable
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//val=STRING
		public Assignment getValAssignment_0() { return cValAssignment_0; }
		
		//STRING
		public RuleCall getValSTRINGTerminalRuleCall_0_0() { return cValSTRINGTerminalRuleCall_0_0; }
		
		//DeclaredVariable
		public RuleCall getDeclaredVariableParserRuleCall_1() { return cDeclaredVariableParserRuleCall_1; }
	}
	public class DeclaredVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.DeclaredVariable");
		private final Assignment cVarAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cVarInitialJSONLineCrossReference_0 = (CrossReference)cVarAssignment.eContents().get(0);
		private final RuleCall cVarInitialJSONLineIDTerminalRuleCall_0_1 = (RuleCall)cVarInitialJSONLineCrossReference_0.eContents().get(1);
		
		//DeclaredVariable:
		//	var=[InitialJSONLine];
		@Override public ParserRule getRule() { return rule; }
		
		//var=[InitialJSONLine]
		public Assignment getVarAssignment() { return cVarAssignment; }
		
		//[InitialJSONLine]
		public CrossReference getVarInitialJSONLineCrossReference_0() { return cVarInitialJSONLineCrossReference_0; }
		
		//ID
		public RuleCall getVarInitialJSONLineIDTerminalRuleCall_0_1() { return cVarInitialJSONLineIDTerminalRuleCall_0_1; }
	}
	
	
	private final TraceryProgramElements pTraceryProgram;
	private final InitialJSONLineElements pInitialJSONLine;
	private final InitialJSONEndingElements pInitialJSONEnding;
	private final StartValueElements pStartValue;
	private final NormalValueElements pNormalValue;
	private final InnerStatementsElements pInnerStatements;
	private final DeclaredVariableElements pDeclaredVariable;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TraceryLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTraceryProgram = new TraceryProgramElements();
		this.pInitialJSONLine = new InitialJSONLineElements();
		this.pInitialJSONEnding = new InitialJSONEndingElements();
		this.pStartValue = new StartValueElements();
		this.pNormalValue = new NormalValueElements();
		this.pInnerStatements = new InnerStatementsElements();
		this.pDeclaredVariable = new DeclaredVariableElements();
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
	//	initialStatement+=InitialJSONLine
	//	/* statements += NormalJSONLine* */
	//	/* finalStatement = FinalJSONLine */
	//	'}';
	public TraceryProgramElements getTraceryProgramAccess() {
		return pTraceryProgram;
	}
	
	public ParserRule getTraceryProgramRule() {
		return getTraceryProgramAccess().getRule();
	}
	
	//InitialJSONLine hidden():
	//	'&' name=ID '&' ':' value=InitialJSONEnding;
	public InitialJSONLineElements getInitialJSONLineAccess() {
		return pInitialJSONLine;
	}
	
	public ParserRule getInitialJSONLineRule() {
		return getInitialJSONLineAccess().getRule();
	}
	
	///* 
	// * FinalJSONLine hidden(WS):
	// * 	"," "&origin&" ":" "[" startVal+=finalStartValue vals+=finalNormalValue* "]"
	// * ;
	// */
	//InitialJSONEnding hidden(WS):
	//	'[' startVal+=StartValue vals+=NormalValue* ']';
	public InitialJSONEndingElements getInitialJSONEndingAccess() {
		return pInitialJSONEnding;
	}
	
	public ParserRule getInitialJSONEndingRule() {
		return getInitialJSONEndingAccess().getRule();
	}
	
	//StartValue hidden(WS):
	//	'&' valueInnerStatements+=InnerStatements '&';
	public StartValueElements getStartValueAccess() {
		return pStartValue;
	}
	
	public ParserRule getStartValueRule() {
		return getStartValueAccess().getRule();
	}
	
	//NormalValue hidden(WS):
	//	',' '&' valueInnerStatements+=InnerStatements '&';
	public NormalValueElements getNormalValueAccess() {
		return pNormalValue;
	}
	
	public ParserRule getNormalValueRule() {
		return getNormalValueAccess().getRule();
	}
	
	//InnerStatements hidden():
	//	val=STRING | DeclaredVariable;
	public InnerStatementsElements getInnerStatementsAccess() {
		return pInnerStatements;
	}
	
	public ParserRule getInnerStatementsRule() {
		return getInnerStatementsAccess().getRule();
	}
	
	//DeclaredVariable:
	//	var=[InitialJSONLine];
	public DeclaredVariableElements getDeclaredVariableAccess() {
		return pDeclaredVariable;
	}
	
	public ParserRule getDeclaredVariableRule() {
		return getDeclaredVariableAccess().getRule();
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
