/*
 * generated by Xtext 2.24.0
 */
grammar InternalTraceryLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uk.ac.kcl.inf.languages.tracery.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uk.ac.kcl.inf.languages.tracery.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.languages.tracery.services.TraceryLanguageGrammarAccess;

}
@parser::members {
	private TraceryLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(TraceryLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleTraceryProgram
entryRuleTraceryProgram
:
{ before(grammarAccess.getTraceryProgramRule()); }
	 ruleTraceryProgram
{ after(grammarAccess.getTraceryProgramRule()); } 
	 EOF 
;

// Rule TraceryProgram
ruleTraceryProgram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTraceryProgramAccess().getGroup()); }
		(rule__TraceryProgram__Group__0)
		{ after(grammarAccess.getTraceryProgramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatement
entryRuleStatement
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Statement
ruleStatement 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatementAccess().getGroup()); }
		(rule__Statement__Group__0)
		{ after(grammarAccess.getStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInitialJSONLines
entryRuleInitialJSONLines
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getInitialJSONLinesRule()); }
	 ruleInitialJSONLines
{ after(grammarAccess.getInitialJSONLinesRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule InitialJSONLines
ruleInitialJSONLines 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInitialJSONLinesAccess().getGroup()); }
		(rule__InitialJSONLines__Group__0)
		{ after(grammarAccess.getInitialJSONLinesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleFinalJSONLine
entryRuleFinalJSONLine
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getFinalJSONLineRule()); }
	 ruleFinalJSONLine
{ after(grammarAccess.getFinalJSONLineRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule FinalJSONLine
ruleFinalJSONLine 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFinalJSONLineAccess().getGroup()); }
		(rule__FinalJSONLine__Group__0)
		{ after(grammarAccess.getFinalJSONLineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInitialJSONEnding
entryRuleInitialJSONEnding
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getInitialJSONEndingRule()); }
	 ruleInitialJSONEnding
{ after(grammarAccess.getInitialJSONEndingRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule InitialJSONEnding
ruleInitialJSONEnding 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInitialJSONEndingAccess().getGroup()); }
		(rule__InitialJSONEnding__Group__0)
		{ after(grammarAccess.getInitialJSONEndingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleFinalJSONEnding
entryRuleFinalJSONEnding
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getFinalJSONEndingRule()); }
	 ruleFinalJSONEnding
{ after(grammarAccess.getFinalJSONEndingRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule FinalJSONEnding
ruleFinalJSONEnding 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFinalJSONEndingAccess().getGroup()); }
		(rule__FinalJSONEnding__Group__0)
		{ after(grammarAccess.getFinalJSONEndingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleStartValue
entryRuleStartValue
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getStartValueRule()); }
	 ruleStartValue
{ after(grammarAccess.getStartValueRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule StartValue
ruleStartValue 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStartValueAccess().getGroup()); }
		(rule__StartValue__Group__0)
		{ after(grammarAccess.getStartValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNormalValue
entryRuleNormalValue
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
:
{ before(grammarAccess.getNormalValueRule()); }
	 ruleNormalValue
{ after(grammarAccess.getNormalValueRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule NormalValue
ruleNormalValue 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNormalValueAccess().getGroup()); }
		(rule__NormalValue__Group__0)
		{ after(grammarAccess.getNormalValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInnerStatements
entryRuleInnerStatements
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getInnerStatementsRule()); }
	 ruleInnerStatements
{ after(grammarAccess.getInnerStatementsRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule InnerStatements
ruleInnerStatements 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInnerStatementsAccess().getAlternatives()); }
		(rule__InnerStatements__Alternatives)
		{ after(grammarAccess.getInnerStatementsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleStringDeclaration
entryRuleStringDeclaration
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getStringDeclarationRule()); }
	 ruleStringDeclaration
{ after(grammarAccess.getStringDeclarationRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule StringDeclaration
ruleStringDeclaration 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringDeclarationAccess().getValueAssignment()); }
		(rule__StringDeclaration__ValueAssignment)
		{ after(grammarAccess.getStringDeclarationAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleDeclaredVariable
entryRuleDeclaredVariable
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getDeclaredVariableRule()); }
	 ruleDeclaredVariable
{ after(grammarAccess.getDeclaredVariableRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule DeclaredVariable
ruleDeclaredVariable 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclaredVariableAccess().getGroup()); }
		(rule__DeclaredVariable__Group__0)
		{ after(grammarAccess.getDeclaredVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

rule__InnerStatements__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInnerStatementsAccess().getStringDeclarationParserRuleCall_0()); }
		ruleStringDeclaration
		{ after(grammarAccess.getInnerStatementsAccess().getStringDeclarationParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getInnerStatementsAccess().getDeclaredVariableParserRuleCall_1()); }
		ruleDeclaredVariable
		{ after(grammarAccess.getInnerStatementsAccess().getDeclaredVariableParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TraceryProgram__Group__0__Impl
	rule__TraceryProgram__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TraceryProgram__Group__1__Impl
	rule__TraceryProgram__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTraceryProgramAccess().getStatementsAssignment_1()); }
	(rule__TraceryProgram__StatementsAssignment_1)
	{ after(grammarAccess.getTraceryProgramAccess().getStatementsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TraceryProgram__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TraceryProgram__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Statement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statement__Group__0__Impl
	rule__Statement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatementAccess().getInitialStatementAssignment_0()); }
	(rule__Statement__InitialStatementAssignment_0)*
	{ after(grammarAccess.getStatementAccess().getInitialStatementAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatementAccess().getFinalStatementAssignment_1()); }
	(rule__Statement__FinalStatementAssignment_1)
	{ after(grammarAccess.getStatementAccess().getFinalStatementAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InitialJSONLines__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialJSONLines__Group__0__Impl
	rule__InitialJSONLines__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONLines__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_0()); }
	'&'
	{ after(grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONLines__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialJSONLines__Group__1__Impl
	rule__InitialJSONLines__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONLines__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialJSONLinesAccess().getNameAssignment_1()); }
	(rule__InitialJSONLines__NameAssignment_1)
	{ after(grammarAccess.getInitialJSONLinesAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONLines__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialJSONLines__Group__2__Impl
	rule__InitialJSONLines__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONLines__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_2()); }
	'&'
	{ after(grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONLines__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialJSONLines__Group__3__Impl
	rule__InitialJSONLines__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONLines__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialJSONLinesAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getInitialJSONLinesAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONLines__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialJSONLines__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONLines__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialJSONLinesAccess().getValueAssignment_4()); }
	(rule__InitialJSONLines__ValueAssignment_4)
	{ after(grammarAccess.getInitialJSONLinesAccess().getValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FinalJSONLine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalJSONLine__Group__0__Impl
	rule__FinalJSONLine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONLine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalJSONLineAccess().getOriginKeyword_0()); }
	'&origin&'
	{ after(grammarAccess.getFinalJSONLineAccess().getOriginKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONLine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalJSONLine__Group__1__Impl
	rule__FinalJSONLine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONLine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalJSONLineAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getFinalJSONLineAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONLine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalJSONLine__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONLine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalJSONLineAccess().getValueAssignment_2()); }
	(rule__FinalJSONLine__ValueAssignment_2)
	{ after(grammarAccess.getFinalJSONLineAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InitialJSONEnding__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialJSONEnding__Group__0__Impl
	rule__InitialJSONEnding__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONEnding__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialJSONEndingAccess().getLeftSquareBracketKeyword_0()); }
	'['
	{ after(grammarAccess.getInitialJSONEndingAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONEnding__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialJSONEnding__Group__1__Impl
	rule__InitialJSONEnding__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONEnding__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialJSONEndingAccess().getStartValueParserRuleCall_1()); }
	ruleStartValue
	{ after(grammarAccess.getInitialJSONEndingAccess().getStartValueParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONEnding__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialJSONEnding__Group__2__Impl
	rule__InitialJSONEnding__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONEnding__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialJSONEndingAccess().getValsAssignment_2()); }
	(rule__InitialJSONEnding__ValsAssignment_2)*
	{ after(grammarAccess.getInitialJSONEndingAccess().getValsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONEnding__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialJSONEnding__Group__3__Impl
	rule__InitialJSONEnding__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONEnding__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialJSONEndingAccess().getRightSquareBracketKeyword_3()); }
	']'
	{ after(grammarAccess.getInitialJSONEndingAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONEnding__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitialJSONEnding__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONEnding__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialJSONEndingAccess().getCommaKeyword_4()); }
	','
	{ after(grammarAccess.getInitialJSONEndingAccess().getCommaKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FinalJSONEnding__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalJSONEnding__Group__0__Impl
	rule__FinalJSONEnding__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONEnding__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalJSONEndingAccess().getLeftSquareBracketKeyword_0()); }
	'['
	{ after(grammarAccess.getFinalJSONEndingAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONEnding__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalJSONEnding__Group__1__Impl
	rule__FinalJSONEnding__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONEnding__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalJSONEndingAccess().getStartValueParserRuleCall_1()); }
	ruleStartValue
	{ after(grammarAccess.getFinalJSONEndingAccess().getStartValueParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONEnding__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalJSONEnding__Group__2__Impl
	rule__FinalJSONEnding__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONEnding__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalJSONEndingAccess().getValsAssignment_2()); }
	(rule__FinalJSONEnding__ValsAssignment_2)*
	{ after(grammarAccess.getFinalJSONEndingAccess().getValsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONEnding__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalJSONEnding__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONEnding__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalJSONEndingAccess().getRightSquareBracketKeyword_3()); }
	']'
	{ after(grammarAccess.getFinalJSONEndingAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StartValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartValue__Group__0__Impl
	rule__StartValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StartValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartValueAccess().getAmpersandKeyword_0()); }
	'&'
	{ after(grammarAccess.getStartValueAccess().getAmpersandKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartValue__Group__1__Impl
	rule__StartValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StartValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); }
		(rule__StartValue__ValueInnerStatementsAssignment_1)
		{ after(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); }
		(rule__StartValue__ValueInnerStatementsAssignment_1)*
		{ after(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartValue__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StartValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartValueAccess().getAmpersandKeyword_2()); }
	'&'
	{ after(grammarAccess.getStartValueAccess().getAmpersandKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NormalValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalValue__Group__0__Impl
	rule__NormalValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalValueAccess().getCommaKeyword_0()); }
	','
	{ after(grammarAccess.getNormalValueAccess().getCommaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalValue__Group__1__Impl
	rule__NormalValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalValueAccess().getAmpersandKeyword_1()); }
	'&'
	{ after(grammarAccess.getNormalValueAccess().getAmpersandKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalValue__Group__2__Impl
	rule__NormalValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); }
		(rule__NormalValue__ValueInnerStatementsAssignment_2)
		{ after(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); }
		(rule__NormalValue__ValueInnerStatementsAssignment_2)*
		{ after(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalValue__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NormalValue__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalValue__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalValueAccess().getAmpersandKeyword_3()); }
	'&'
	{ after(grammarAccess.getNormalValueAccess().getAmpersandKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DeclaredVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaredVariable__Group__0__Impl
	rule__DeclaredVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_0()); }
	'#'
	{ after(grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaredVariable__Group__1__Impl
	rule__DeclaredVariable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaredVariableAccess().getVariableAssignment_1()); }
	(rule__DeclaredVariable__VariableAssignment_1)
	{ after(grammarAccess.getDeclaredVariableAccess().getVariableAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredVariable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaredVariable__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredVariable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_2()); }
	'#'
	{ after(grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TraceryProgram__StatementsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTraceryProgramAccess().getStatementsStatementParserRuleCall_1_0()); }
		ruleStatement
		{ after(grammarAccess.getTraceryProgramAccess().getStatementsStatementParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__InitialStatementAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementAccess().getInitialStatementInitialJSONLinesParserRuleCall_0_0()); }
		ruleInitialJSONLines
		{ after(grammarAccess.getStatementAccess().getInitialStatementInitialJSONLinesParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__FinalStatementAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementAccess().getFinalStatementFinalJSONLineParserRuleCall_1_0()); }
		ruleFinalJSONLine
		{ after(grammarAccess.getStatementAccess().getFinalStatementFinalJSONLineParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONLines__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitialJSONLinesAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInitialJSONLinesAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONLines__ValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitialJSONLinesAccess().getValueInitialJSONEndingParserRuleCall_4_0()); }
		ruleInitialJSONEnding
		{ after(grammarAccess.getInitialJSONLinesAccess().getValueInitialJSONEndingParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONLine__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFinalJSONLineAccess().getValueFinalJSONEndingParserRuleCall_2_0()); }
		ruleFinalJSONEnding
		{ after(grammarAccess.getFinalJSONLineAccess().getValueFinalJSONEndingParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitialJSONEnding__ValsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitialJSONEndingAccess().getValsNormalValueParserRuleCall_2_0()); }
		ruleNormalValue
		{ after(grammarAccess.getInitialJSONEndingAccess().getValsNormalValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalJSONEnding__ValsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFinalJSONEndingAccess().getValsNormalValueParserRuleCall_2_0()); }
		ruleNormalValue
		{ after(grammarAccess.getFinalJSONEndingAccess().getValsNormalValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartValue__ValueInnerStatementsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStartValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_1_0()); }
		ruleInnerStatements
		{ after(grammarAccess.getStartValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NormalValue__ValueInnerStatementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_2_0()); }
		ruleInnerStatements
		{ after(grammarAccess.getNormalValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringDeclaration__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringDeclarationAccess().getValueSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringDeclarationAccess().getValueSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredVariable__VariableAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclaredVariableAccess().getVariableInitialJSONLinesCrossReference_1_0()); }
		(
			{ before(grammarAccess.getDeclaredVariableAccess().getVariableInitialJSONLinesIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDeclaredVariableAccess().getVariableInitialJSONLinesIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getDeclaredVariableAccess().getVariableInitialJSONLinesCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
