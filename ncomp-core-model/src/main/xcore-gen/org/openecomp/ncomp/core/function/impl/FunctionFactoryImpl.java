
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
package org.openecomp.ncomp.core.function.impl;

import org.openecomp.ncomp.core.function.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionFactoryImpl extends EFactoryImpl implements FunctionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionFactory init() {
		try {
			FunctionFactory theFunctionFactory = (FunctionFactory)EPackage.Registry.INSTANCE.getEFactory(FunctionPackage.eNS_URI);
			if (theFunctionFactory != null) {
				return theFunctionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FunctionPackage.ITERATOR_USING_FUNCTION: return createIteratorUsingFunction();
			case FunctionPackage.RULE_FUNCTION: return createRuleFunction();
			case FunctionPackage.FUNCTION_RULE: return createFunctionRule();
			case FunctionPackage.FUNCTION_ACTION: return createFunctionAction();
			case FunctionPackage.RULE_UPDATE_FUNCTION: return createRuleUpdateFunction();
			case FunctionPackage.FUNCTION_UPDATE_RULE: return createFunctionUpdateRule();
			case FunctionPackage.FUNCTION_UPDATE_ATTRIBUTE: return createFunctionUpdateAttribute();
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE: return createFunctionMatchAttribute();
			case FunctionPackage.FUNCTION_MATCH_METRIC: return createFunctionMatchMetric();
			case FunctionPackage.FUNCTION_MATCH_INSTANCE_OF: return createFunctionMatchInstanceOf();
			case FunctionPackage.STRING_VALUE_PAIR: return createStringValuePair();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorUsingFunction createIteratorUsingFunction() {
		IteratorUsingFunctionImpl iteratorUsingFunction = new IteratorUsingFunctionImpl();
		return iteratorUsingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFunction createRuleFunction() {
		RuleFunctionImpl ruleFunction = new RuleFunctionImpl();
		return ruleFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionRule createFunctionRule() {
		FunctionRuleImpl functionRule = new FunctionRuleImpl();
		return functionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAction createFunctionAction() {
		FunctionActionImpl functionAction = new FunctionActionImpl();
		return functionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleUpdateFunction createRuleUpdateFunction() {
		RuleUpdateFunctionImpl ruleUpdateFunction = new RuleUpdateFunctionImpl();
		return ruleUpdateFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionUpdateRule createFunctionUpdateRule() {
		FunctionUpdateRuleImpl functionUpdateRule = new FunctionUpdateRuleImpl();
		return functionUpdateRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionUpdateAttribute createFunctionUpdateAttribute() {
		FunctionUpdateAttributeImpl functionUpdateAttribute = new FunctionUpdateAttributeImpl();
		return functionUpdateAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionMatchAttribute createFunctionMatchAttribute() {
		FunctionMatchAttributeImpl functionMatchAttribute = new FunctionMatchAttributeImpl();
		return functionMatchAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionMatchMetric createFunctionMatchMetric() {
		FunctionMatchMetricImpl functionMatchMetric = new FunctionMatchMetricImpl();
		return functionMatchMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionMatchInstanceOf createFunctionMatchInstanceOf() {
		FunctionMatchInstanceOfImpl functionMatchInstanceOf = new FunctionMatchInstanceOfImpl();
		return functionMatchInstanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValuePair createStringValuePair() {
		StringValuePairImpl stringValuePair = new StringValuePairImpl();
		return stringValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPackage getFunctionPackage() {
		return (FunctionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionPackage getPackage() {
		return FunctionPackage.eINSTANCE;
	}

} //FunctionFactoryImpl
