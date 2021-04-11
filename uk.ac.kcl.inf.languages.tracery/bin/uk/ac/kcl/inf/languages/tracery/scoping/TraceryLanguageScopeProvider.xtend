/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EReference


import static extension org.eclipse.xtext.EcoreUtil2.*



import static org.eclipse.xtext.scoping.Scopes.*
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.DeclaredVariable
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialJSONLines
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.Statement
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.InitialJSONEnding

/** 
 * This class contains custom scoping description.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class TraceryLanguageScopeProvider extends AbstractDeclarativeScopeProvider {

	def IScope scope_DeclaredVariable_variable(DeclaredVariable context, EReference ref) {
		/* 
		 val containingProgram = context.getContainerOfType(InitialJSONLines)
		 return scopeFor(containingProgram.initialStatement.filter(InitialJSONEnding))
		*/
	}
 	
}
