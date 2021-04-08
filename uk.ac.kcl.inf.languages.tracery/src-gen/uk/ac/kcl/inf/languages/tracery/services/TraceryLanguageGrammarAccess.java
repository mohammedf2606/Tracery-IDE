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
		private final Assignment cStatementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_1_0 = (RuleCall)cStatementsAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//TraceryProgram:
		//	'{'
		//	statements+=Statement
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{'
		//statements+=Statement
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//statements+=Statement
		public Assignment getStatementsAssignment_1() { return cStatementsAssignment_1; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_1_0() { return cStatementsStatementParserRuleCall_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.Statement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInitialStatementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cInitialStatementInitialJSONLinesParserRuleCall_0_0 = (RuleCall)cInitialStatementAssignment_0.eContents().get(0);
		private final Assignment cFinalStatementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFinalStatementFinalJSONLineParserRuleCall_1_0 = (RuleCall)cFinalStatementAssignment_1.eContents().get(0);
		
		//Statement hidden(WS):
		//	initialStatement+=InitialJSONLines*
		//	finalStatement=FinalJSONLine;
		@Override public ParserRule getRule() { return rule; }
		
		//initialStatement+=InitialJSONLines*
		//finalStatement=FinalJSONLine
		public Group getGroup() { return cGroup; }
		
		//initialStatement+=InitialJSONLines*
		public Assignment getInitialStatementAssignment_0() { return cInitialStatementAssignment_0; }
		
		//InitialJSONLines
		public RuleCall getInitialStatementInitialJSONLinesParserRuleCall_0_0() { return cInitialStatementInitialJSONLinesParserRuleCall_0_0; }
		
		//finalStatement=FinalJSONLine
		public Assignment getFinalStatementAssignment_1() { return cFinalStatementAssignment_1; }
		
		//FinalJSONLine
		public RuleCall getFinalStatementFinalJSONLineParserRuleCall_1_0() { return cFinalStatementFinalJSONLineParserRuleCall_1_0; }
	}
	public class InitialJSONLinesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialJSONLines");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAmpersandKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cAmpersandKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueInitialJSONEndingParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		
		//InitialJSONLines hidden(WS):
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
	public class FinalJSONLineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.FinalJSONLine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOriginKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueFinalJSONEndingParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//FinalJSONLine hidden(WS):
		//	'&origin&' ':' value=FinalJSONEnding;
		@Override public ParserRule getRule() { return rule; }
		
		//'&origin&' ':' value=FinalJSONEnding
		public Group getGroup() { return cGroup; }
		
		//'&origin&'
		public Keyword getOriginKeyword_0() { return cOriginKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//value=FinalJSONEnding
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//FinalJSONEnding
		public RuleCall getValueFinalJSONEndingParserRuleCall_2_0() { return cValueFinalJSONEndingParserRuleCall_2_0; }
	}
	public class InitialJSONEndingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialJSONEnding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cStartValueParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cValsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValsNormalValueParserRuleCall_2_0 = (RuleCall)cValsAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//InitialJSONEnding hidden(WS):
		//	'[' StartValue vals+=NormalValue* ']' ',';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' StartValue vals+=NormalValue* ']' ','
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//StartValue
		public RuleCall getStartValueParserRuleCall_1() { return cStartValueParserRuleCall_1; }
		
		//vals+=NormalValue*
		public Assignment getValsAssignment_2() { return cValsAssignment_2; }
		
		//NormalValue
		public RuleCall getValsNormalValueParserRuleCall_2_0() { return cValsNormalValueParserRuleCall_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
		
		//','
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
	}
	public class FinalJSONEndingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.FinalJSONEnding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cStartValueParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cValsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValsNormalValueParserRuleCall_2_0 = (RuleCall)cValsAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FinalJSONEnding hidden(WS):
		//	'[' StartValue vals+=NormalValue* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' StartValue vals+=NormalValue* ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//StartValue
		public RuleCall getStartValueParserRuleCall_1() { return cStartValueParserRuleCall_1; }
		
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
		//	'&' valueInnerStatements+=InnerStatements+ '&';
		@Override public ParserRule getRule() { return rule; }
		
		//'&' valueInnerStatements+=InnerStatements+ '&'
		public Group getGroup() { return cGroup; }
		
		//'&'
		public Keyword getAmpersandKeyword_0() { return cAmpersandKeyword_0; }
		
		//valueInnerStatements+=InnerStatements+
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
		//	',' '&' valueInnerStatements+=InnerStatements+ '&';
		@Override public ParserRule getRule() { return rule; }
		
		//',' '&' valueInnerStatements+=InnerStatements+ '&'
		public Group getGroup() { return cGroup; }
		
		//','
		public Keyword getCommaKeyword_0() { return cCommaKeyword_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_1() { return cAmpersandKeyword_1; }
		
		//valueInnerStatements+=InnerStatements+
		public Assignment getValueInnerStatementsAssignment_2() { return cValueInnerStatementsAssignment_2; }
		
		//InnerStatements
		public RuleCall getValueInnerStatementsInnerStatementsParserRuleCall_2_0() { return cValueInnerStatementsInnerStatementsParserRuleCall_2_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_3() { return cAmpersandKeyword_3; }
	}
	public class InnerStatementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InnerStatements");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStringDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDeclaredVariableParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//InnerStatements hidden():
		//	StringDeclaration | DeclaredVariable;
		@Override public ParserRule getRule() { return rule; }
		
		//StringDeclaration | DeclaredVariable
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//StringDeclaration
		public RuleCall getStringDeclarationParserRuleCall_0() { return cStringDeclarationParserRuleCall_0; }
		
		//DeclaredVariable
		public RuleCall getDeclaredVariableParserRuleCall_1() { return cDeclaredVariableParserRuleCall_1; }
	}
	public class StringDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.StringDeclaration");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//StringDeclaration hidden():
		//	value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}
	public class DeclaredVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.languages.tracery.TraceryLanguage.DeclaredVariable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVariableAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cVariableInitialJSONLinesCrossReference_1_0 = (CrossReference)cVariableAssignment_1.eContents().get(0);
		private final RuleCall cVariableInitialJSONLinesIDTerminalRuleCall_1_0_1 = (RuleCall)cVariableInitialJSONLinesCrossReference_1_0.eContents().get(1);
		private final Keyword cNumberSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DeclaredVariable hidden():
		//	'#' variable=[InitialJSONLines] '#';
		@Override public ParserRule getRule() { return rule; }
		
		//'#' variable=[InitialJSONLines] '#'
		public Group getGroup() { return cGroup; }
		
		//'#'
		public Keyword getNumberSignKeyword_0() { return cNumberSignKeyword_0; }
		
		//variable=[InitialJSONLines]
		public Assignment getVariableAssignment_1() { return cVariableAssignment_1; }
		
		//[InitialJSONLines]
		public CrossReference getVariableInitialJSONLinesCrossReference_1_0() { return cVariableInitialJSONLinesCrossReference_1_0; }
		
		//ID
		public RuleCall getVariableInitialJSONLinesIDTerminalRuleCall_1_0_1() { return cVariableInitialJSONLinesIDTerminalRuleCall_1_0_1; }
		
		//'#'
		public Keyword getNumberSignKeyword_2() { return cNumberSignKeyword_2; }
	}
	
	
	private final TraceryProgramElements pTraceryProgram;
	private final StatementElements pStatement;
	private final InitialJSONLinesElements pInitialJSONLines;
	private final FinalJSONLineElements pFinalJSONLine;
	private final InitialJSONEndingElements pInitialJSONEnding;
	private final FinalJSONEndingElements pFinalJSONEnding;
	private final StartValueElements pStartValue;
	private final NormalValueElements pNormalValue;
	private final InnerStatementsElements pInnerStatements;
	private final StringDeclarationElements pStringDeclaration;
	private final DeclaredVariableElements pDeclaredVariable;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TraceryLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTraceryProgram = new TraceryProgramElements();
		this.pStatement = new StatementElements();
		this.pInitialJSONLines = new InitialJSONLinesElements();
		this.pFinalJSONLine = new FinalJSONLineElements();
		this.pInitialJSONEnding = new InitialJSONEndingElements();
		this.pFinalJSONEnding = new FinalJSONEndingElements();
		this.pStartValue = new StartValueElements();
		this.pNormalValue = new NormalValueElements();
		this.pInnerStatements = new InnerStatementsElements();
		this.pStringDeclaration = new StringDeclarationElements();
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
	//	statements+=Statement
	//	'}';
	public TraceryProgramElements getTraceryProgramAccess() {
		return pTraceryProgram;
	}
	
	public ParserRule getTraceryProgramRule() {
		return getTraceryProgramAccess().getRule();
	}
	
	//Statement hidden(WS):
	//	initialStatement+=InitialJSONLines*
	//	finalStatement=FinalJSONLine;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//InitialJSONLines hidden(WS):
	//	'&' name=ID '&' ':' value=InitialJSONEnding;
	public InitialJSONLinesElements getInitialJSONLinesAccess() {
		return pInitialJSONLines;
	}
	
	public ParserRule getInitialJSONLinesRule() {
		return getInitialJSONLinesAccess().getRule();
	}
	
	//FinalJSONLine hidden(WS):
	//	'&origin&' ':' value=FinalJSONEnding;
	public FinalJSONLineElements getFinalJSONLineAccess() {
		return pFinalJSONLine;
	}
	
	public ParserRule getFinalJSONLineRule() {
		return getFinalJSONLineAccess().getRule();
	}
	
	//InitialJSONEnding hidden(WS):
	//	'[' StartValue vals+=NormalValue* ']' ',';
	public InitialJSONEndingElements getInitialJSONEndingAccess() {
		return pInitialJSONEnding;
	}
	
	public ParserRule getInitialJSONEndingRule() {
		return getInitialJSONEndingAccess().getRule();
	}
	
	//FinalJSONEnding hidden(WS):
	//	'[' StartValue vals+=NormalValue* ']';
	public FinalJSONEndingElements getFinalJSONEndingAccess() {
		return pFinalJSONEnding;
	}
	
	public ParserRule getFinalJSONEndingRule() {
		return getFinalJSONEndingAccess().getRule();
	}
	
	//StartValue hidden(WS):
	//	'&' valueInnerStatements+=InnerStatements+ '&';
	public StartValueElements getStartValueAccess() {
		return pStartValue;
	}
	
	public ParserRule getStartValueRule() {
		return getStartValueAccess().getRule();
	}
	
	//NormalValue hidden(WS):
	//	',' '&' valueInnerStatements+=InnerStatements+ '&';
	public NormalValueElements getNormalValueAccess() {
		return pNormalValue;
	}
	
	public ParserRule getNormalValueRule() {
		return getNormalValueAccess().getRule();
	}
	
	//InnerStatements hidden():
	//	StringDeclaration | DeclaredVariable;
	public InnerStatementsElements getInnerStatementsAccess() {
		return pInnerStatements;
	}
	
	public ParserRule getInnerStatementsRule() {
		return getInnerStatementsAccess().getRule();
	}
	
	//StringDeclaration hidden():
	//	value=STRING;
	public StringDeclarationElements getStringDeclarationAccess() {
		return pStringDeclaration;
	}
	
	public ParserRule getStringDeclarationRule() {
		return getStringDeclarationAccess().getRule();
	}
	
	//DeclaredVariable hidden():
	//	'#' variable=[InitialJSONLines] '#';
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
