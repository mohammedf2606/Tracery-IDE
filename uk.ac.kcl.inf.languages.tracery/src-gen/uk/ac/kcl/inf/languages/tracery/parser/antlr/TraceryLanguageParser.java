/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.inf.languages.tracery.parser.antlr.internal.InternalTraceryLanguageParser;
import uk.ac.kcl.inf.languages.tracery.services.TraceryLanguageGrammarAccess;

public class TraceryLanguageParser extends AbstractAntlrParser {

	@Inject
	private TraceryLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTraceryLanguageParser createParser(XtextTokenStream stream) {
		return new InternalTraceryLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TraceryProgram";
	}

	public TraceryLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TraceryLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
