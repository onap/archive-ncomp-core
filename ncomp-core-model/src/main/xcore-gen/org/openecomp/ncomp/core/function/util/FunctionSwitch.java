
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
/**
 */
package org.openecomp.ncomp.core.function.util;

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.core.function.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.core.function.FunctionPackage
 * @generated
 */
public class FunctionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FunctionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionSwitch() {
		if (modelPackage == null) {
			modelPackage = FunctionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FunctionPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseNamedEntity(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.ITERATOR: {
				Iterator iterator = (Iterator)theEObject;
				T result = caseIterator(iterator);
				if (result == null) result = caseNamedEntity(iterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.ITERATOR_USING_FUNCTION: {
				IteratorUsingFunction iteratorUsingFunction = (IteratorUsingFunction)theEObject;
				T result = caseIteratorUsingFunction(iteratorUsingFunction);
				if (result == null) result = caseIterator(iteratorUsingFunction);
				if (result == null) result = caseNamedEntity(iteratorUsingFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.RULE_FUNCTION: {
				RuleFunction ruleFunction = (RuleFunction)theEObject;
				T result = caseRuleFunction(ruleFunction);
				if (result == null) result = caseFunction(ruleFunction);
				if (result == null) result = caseNamedEntity(ruleFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.FUNCTION_RULE: {
				FunctionRule functionRule = (FunctionRule)theEObject;
				T result = caseFunctionRule(functionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.FUNCTION_ACTION: {
				FunctionAction functionAction = (FunctionAction)theEObject;
				T result = caseFunctionAction(functionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.RULE_UPDATE_FUNCTION: {
				RuleUpdateFunction ruleUpdateFunction = (RuleUpdateFunction)theEObject;
				T result = caseRuleUpdateFunction(ruleUpdateFunction);
				if (result == null) result = caseFunction(ruleUpdateFunction);
				if (result == null) result = caseNamedEntity(ruleUpdateFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.FUNCTION_UPDATE_RULE: {
				FunctionUpdateRule functionUpdateRule = (FunctionUpdateRule)theEObject;
				T result = caseFunctionUpdateRule(functionUpdateRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.FUNCTION_UPDATE: {
				FunctionUpdate functionUpdate = (FunctionUpdate)theEObject;
				T result = caseFunctionUpdate(functionUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.FUNCTION_UPDATE_ATTRIBUTE: {
				FunctionUpdateAttribute functionUpdateAttribute = (FunctionUpdateAttribute)theEObject;
				T result = caseFunctionUpdateAttribute(functionUpdateAttribute);
				if (result == null) result = caseFunctionUpdate(functionUpdateAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.FUNCTION_MATCH: {
				FunctionMatch functionMatch = (FunctionMatch)theEObject;
				T result = caseFunctionMatch(functionMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE: {
				FunctionMatchAttribute functionMatchAttribute = (FunctionMatchAttribute)theEObject;
				T result = caseFunctionMatchAttribute(functionMatchAttribute);
				if (result == null) result = caseFunctionMatch(functionMatchAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.FUNCTION_MATCH_METRIC: {
				FunctionMatchMetric functionMatchMetric = (FunctionMatchMetric)theEObject;
				T result = caseFunctionMatchMetric(functionMatchMetric);
				if (result == null) result = caseFunctionMatch(functionMatchMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.FUNCTION_MATCH_INSTANCE_OF: {
				FunctionMatchInstanceOf functionMatchInstanceOf = (FunctionMatchInstanceOf)theEObject;
				T result = caseFunctionMatchInstanceOf(functionMatchInstanceOf);
				if (result == null) result = caseFunctionMatch(functionMatchInstanceOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.VALUE_PAIR: {
				ValuePair valuePair = (ValuePair)theEObject;
				T result = caseValuePair(valuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionPackage.STRING_VALUE_PAIR: {
				StringValuePair stringValuePair = (StringValuePair)theEObject;
				T result = caseStringValuePair(stringValuePair);
				if (result == null) result = caseValuePair(stringValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterator(Iterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Using Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Using Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorUsingFunction(IteratorUsingFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleFunction(RuleFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionRule(FunctionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionAction(FunctionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Update Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Update Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleUpdateFunction(RuleUpdateFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionUpdateRule(FunctionUpdateRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionUpdate(FunctionUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionUpdateAttribute(FunctionUpdateAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionMatch(FunctionMatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionMatchAttribute(FunctionMatchAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionMatchMetric(FunctionMatchMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Instance Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Instance Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionMatchInstanceOf(FunctionMatchInstanceOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePair(ValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValuePair(StringValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FunctionSwitch
