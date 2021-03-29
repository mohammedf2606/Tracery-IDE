/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uk.ac.kcl.inf.languages.tracery.ide.contentassist.antlr.internal.InternalTraceryLanguageParser;
import uk.ac.kcl.inf.languages.tracery.services.TraceryLanguageGrammarAccess;

public class TraceryLanguageParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TraceryLanguageGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TraceryLanguageGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getInnerStatementAccess().getAlternatives(), "rule__InnerStatement__Alternatives");
			builder.put(grammarAccess.getTraceryProgramAccess().getGroup(), "rule__TraceryProgram__Group__0");
			builder.put(grammarAccess.getInitialStatementAccess().getGroup(), "rule__InitialStatement__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
			builder.put(grammarAccess.getStartValueAccess().getGroup(), "rule__StartValue__Group__0");
			builder.put(grammarAccess.getNormalValueAccess().getGroup(), "rule__NormalValue__Group__0");
			builder.put(grammarAccess.getInnerStatementAccess().getGroup_1(), "rule__InnerStatement__Group_1__0");
			builder.put(grammarAccess.getInnerStatementAccess().getGroup_2(), "rule__InnerStatement__Group_2__0");
			builder.put(grammarAccess.getInnerStatementAccess().getGroup_3(), "rule__InnerStatement__Group_3__0");
			builder.put(grammarAccess.getInnerStatementAccess().getGroup_4(), "rule__InnerStatement__Group_4__0");
			builder.put(grammarAccess.getInnerStatementAccess().getGroup_5(), "rule__InnerStatement__Group_5__0");
			builder.put(grammarAccess.getTraceryProgramAccess().getInitialStatementAssignment_1(), "rule__TraceryProgram__InitialStatementAssignment_1");
			builder.put(grammarAccess.getTraceryProgramAccess().getStatementsAssignment_2(), "rule__TraceryProgram__StatementsAssignment_2");
			builder.put(grammarAccess.getVariableDeclerationAccess().getNameAssignment(), "rule__VariableDecleration__NameAssignment");
			builder.put(grammarAccess.getInitialStatementAccess().getStartValAssignment_3(), "rule__InitialStatement__StartValAssignment_3");
			builder.put(grammarAccess.getInitialStatementAccess().getValsAssignment_4(), "rule__InitialStatement__ValsAssignment_4");
			builder.put(grammarAccess.getStatementAccess().getStartValAssignment_6(), "rule__Statement__StartValAssignment_6");
			builder.put(grammarAccess.getStatementAccess().getValsAssignment_7(), "rule__Statement__ValsAssignment_7");
			builder.put(grammarAccess.getStartValueAccess().getInnardsAssignment_2(), "rule__StartValue__InnardsAssignment_2");
			builder.put(grammarAccess.getNormalValueAccess().getInnardsAssignment_3(), "rule__NormalValue__InnardsAssignment_3");
			builder.put(grammarAccess.getInnerStatementAccess().getValueAssignment_0(), "rule__InnerStatement__ValueAssignment_0");
			builder.put(grammarAccess.getStartingJSONExpressionAccess().getVarAssignment(), "rule__StartingJSONExpression__VarAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TraceryLanguageGrammarAccess grammarAccess;

	@Override
	protected InternalTraceryLanguageParser createParser() {
		InternalTraceryLanguageParser result = new InternalTraceryLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TraceryLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TraceryLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
