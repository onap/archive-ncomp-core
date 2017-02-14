
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

import org.openecomp.ncomp.core.CorePackage;

import org.openecomp.ncomp.core.function.Function;
import org.openecomp.ncomp.core.function.FunctionAction;
import org.openecomp.ncomp.core.function.FunctionFactory;
import org.openecomp.ncomp.core.function.FunctionMatch;
import org.openecomp.ncomp.core.function.FunctionMatchAttribute;
import org.openecomp.ncomp.core.function.FunctionMatchInstanceOf;
import org.openecomp.ncomp.core.function.FunctionMatchMetric;
import org.openecomp.ncomp.core.function.FunctionPackage;
import org.openecomp.ncomp.core.function.FunctionRule;
import org.openecomp.ncomp.core.function.FunctionUpdate;
import org.openecomp.ncomp.core.function.FunctionUpdateAttribute;
import org.openecomp.ncomp.core.function.FunctionUpdateRule;
import org.openecomp.ncomp.core.function.Iterator;
import org.openecomp.ncomp.core.function.IteratorUsingFunction;
import org.openecomp.ncomp.core.function.RuleFunction;

import org.openecomp.ncomp.core.function.RuleUpdateFunction;
import org.openecomp.ncomp.core.function.StringValuePair;
import org.openecomp.ncomp.core.function.ValuePair;
import org.openecomp.ncomp.core.metrics.MetricsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionPackageImpl extends EPackageImpl implements FunctionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorUsingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleUpdateFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionUpdateRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionUpdateAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionMatchAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionMatchMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionMatchInstanceOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValuePairEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FunctionPackageImpl() {
		super(eNS_URI, FunctionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FunctionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FunctionPackage init() {
		if (isInited) return (FunctionPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI);

		// Obtain or create and register package
		FunctionPackageImpl theFunctionPackage = (FunctionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FunctionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FunctionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MetricsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFunctionPackage.createPackageContents();

		// Initialize created meta-data
		theFunctionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFunctionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FunctionPackage.eNS_URI, theFunctionPackage);
		return theFunctionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterator() {
		return iteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteratorUsingFunction() {
		return iteratorUsingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIteratorUsingFunction_Paths() {
		return (EAttribute)iteratorUsingFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIteratorUsingFunction_Recursive() {
		return (EAttribute)iteratorUsingFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteratorUsingFunction_Filter() {
		return (EReference)iteratorUsingFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleFunction() {
		return ruleFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleFunction_Rules() {
		return (EReference)ruleFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionRule() {
		return functionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionRule_Matches() {
		return (EReference)functionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionRule_Action() {
		return (EReference)functionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionAction() {
		return functionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionAction_Value() {
		return (EAttribute)functionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleUpdateFunction() {
		return ruleUpdateFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleUpdateFunction_Rules() {
		return (EReference)ruleUpdateFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionUpdateRule() {
		return functionUpdateRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionUpdateRule_Matches() {
		return (EReference)functionUpdateRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionUpdateRule_Updates() {
		return (EReference)functionUpdateRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionUpdate() {
		return functionUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionUpdateAttribute() {
		return functionUpdateAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionUpdateAttribute_Path() {
		return (EAttribute)functionUpdateAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionUpdateAttribute_Value() {
		return (EAttribute)functionUpdateAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionMatch() {
		return functionMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionMatchAttribute() {
		return functionMatchAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMatchAttribute_Path() {
		return (EAttribute)functionMatchAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMatchAttribute_Match() {
		return (EAttribute)functionMatchAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMatchAttribute_Negation() {
		return (EAttribute)functionMatchAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionMatchMetric() {
		return functionMatchMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMatchMetric_Path() {
		return (EAttribute)functionMatchMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionMatchMetric_Option() {
		return (EReference)functionMatchMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMatchMetric_LowerBound() {
		return (EAttribute)functionMatchMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMatchMetric_UpperBound() {
		return (EAttribute)functionMatchMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMatchMetric_Negation() {
		return (EAttribute)functionMatchMetricEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionMatchInstanceOf() {
		return functionMatchInstanceOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMatchInstanceOf_EPackage() {
		return (EAttribute)functionMatchInstanceOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMatchInstanceOf_EName() {
		return (EAttribute)functionMatchInstanceOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePair() {
		return valuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePair_Path() {
		return (EAttribute)valuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValuePair() {
		return stringValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValuePair_Value() {
		return (EAttribute)stringValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionFactory getFunctionFactory() {
		return (FunctionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		functionEClass = createEClass(FUNCTION);

		iteratorEClass = createEClass(ITERATOR);

		iteratorUsingFunctionEClass = createEClass(ITERATOR_USING_FUNCTION);
		createEAttribute(iteratorUsingFunctionEClass, ITERATOR_USING_FUNCTION__PATHS);
		createEAttribute(iteratorUsingFunctionEClass, ITERATOR_USING_FUNCTION__RECURSIVE);
		createEReference(iteratorUsingFunctionEClass, ITERATOR_USING_FUNCTION__FILTER);

		ruleFunctionEClass = createEClass(RULE_FUNCTION);
		createEReference(ruleFunctionEClass, RULE_FUNCTION__RULES);

		functionRuleEClass = createEClass(FUNCTION_RULE);
		createEReference(functionRuleEClass, FUNCTION_RULE__MATCHES);
		createEReference(functionRuleEClass, FUNCTION_RULE__ACTION);

		functionActionEClass = createEClass(FUNCTION_ACTION);
		createEAttribute(functionActionEClass, FUNCTION_ACTION__VALUE);

		ruleUpdateFunctionEClass = createEClass(RULE_UPDATE_FUNCTION);
		createEReference(ruleUpdateFunctionEClass, RULE_UPDATE_FUNCTION__RULES);

		functionUpdateRuleEClass = createEClass(FUNCTION_UPDATE_RULE);
		createEReference(functionUpdateRuleEClass, FUNCTION_UPDATE_RULE__MATCHES);
		createEReference(functionUpdateRuleEClass, FUNCTION_UPDATE_RULE__UPDATES);

		functionUpdateEClass = createEClass(FUNCTION_UPDATE);

		functionUpdateAttributeEClass = createEClass(FUNCTION_UPDATE_ATTRIBUTE);
		createEAttribute(functionUpdateAttributeEClass, FUNCTION_UPDATE_ATTRIBUTE__PATH);
		createEAttribute(functionUpdateAttributeEClass, FUNCTION_UPDATE_ATTRIBUTE__VALUE);

		functionMatchEClass = createEClass(FUNCTION_MATCH);

		functionMatchAttributeEClass = createEClass(FUNCTION_MATCH_ATTRIBUTE);
		createEAttribute(functionMatchAttributeEClass, FUNCTION_MATCH_ATTRIBUTE__PATH);
		createEAttribute(functionMatchAttributeEClass, FUNCTION_MATCH_ATTRIBUTE__MATCH);
		createEAttribute(functionMatchAttributeEClass, FUNCTION_MATCH_ATTRIBUTE__NEGATION);

		functionMatchMetricEClass = createEClass(FUNCTION_MATCH_METRIC);
		createEAttribute(functionMatchMetricEClass, FUNCTION_MATCH_METRIC__PATH);
		createEReference(functionMatchMetricEClass, FUNCTION_MATCH_METRIC__OPTION);
		createEAttribute(functionMatchMetricEClass, FUNCTION_MATCH_METRIC__LOWER_BOUND);
		createEAttribute(functionMatchMetricEClass, FUNCTION_MATCH_METRIC__UPPER_BOUND);
		createEAttribute(functionMatchMetricEClass, FUNCTION_MATCH_METRIC__NEGATION);

		functionMatchInstanceOfEClass = createEClass(FUNCTION_MATCH_INSTANCE_OF);
		createEAttribute(functionMatchInstanceOfEClass, FUNCTION_MATCH_INSTANCE_OF__EPACKAGE);
		createEAttribute(functionMatchInstanceOfEClass, FUNCTION_MATCH_INSTANCE_OF__ENAME);

		valuePairEClass = createEClass(VALUE_PAIR);
		createEAttribute(valuePairEClass, VALUE_PAIR__PATH);

		stringValuePairEClass = createEClass(STRING_VALUE_PAIR);
		createEAttribute(stringValuePairEClass, STRING_VALUE_PAIR__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		MetricsPackage theMetricsPackage = (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		iteratorEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		iteratorUsingFunctionEClass.getESuperTypes().add(this.getIterator());
		ruleFunctionEClass.getESuperTypes().add(this.getFunction());
		ruleUpdateFunctionEClass.getESuperTypes().add(this.getFunction());
		functionUpdateAttributeEClass.getESuperTypes().add(this.getFunctionUpdate());
		functionMatchAttributeEClass.getESuperTypes().add(this.getFunctionMatch());
		functionMatchMetricEClass.getESuperTypes().add(this.getFunctionMatch());
		functionMatchInstanceOfEClass.getESuperTypes().add(this.getFunctionMatch());
		stringValuePairEClass.getESuperTypes().add(this.getValuePair());

		// Initialize classes, features, and operations; add parameters
		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iteratorEClass, Iterator.class, "Iterator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iteratorUsingFunctionEClass, IteratorUsingFunction.class, "IteratorUsingFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIteratorUsingFunction_Paths(), theEcorePackage.getEString(), "paths", null, 0, -1, IteratorUsingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIteratorUsingFunction_Recursive(), theEcorePackage.getEBoolean(), "recursive", null, 0, 1, IteratorUsingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIteratorUsingFunction_Filter(), this.getFunction(), null, "filter", null, 0, 1, IteratorUsingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleFunctionEClass, RuleFunction.class, "RuleFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleFunction_Rules(), this.getFunctionRule(), null, "rules", null, 0, -1, RuleFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionRuleEClass, FunctionRule.class, "FunctionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionRule_Matches(), this.getFunctionMatch(), null, "matches", null, 0, -1, FunctionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionRule_Action(), this.getFunctionAction(), null, "action", null, 0, 1, FunctionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionActionEClass, FunctionAction.class, "FunctionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionAction_Value(), theEcorePackage.getEString(), "value", null, 0, 1, FunctionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleUpdateFunctionEClass, RuleUpdateFunction.class, "RuleUpdateFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleUpdateFunction_Rules(), this.getFunctionUpdateRule(), null, "rules", null, 0, -1, RuleUpdateFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionUpdateRuleEClass, FunctionUpdateRule.class, "FunctionUpdateRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionUpdateRule_Matches(), this.getFunctionMatch(), null, "matches", null, 0, -1, FunctionUpdateRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionUpdateRule_Updates(), this.getFunctionUpdate(), null, "updates", null, 0, -1, FunctionUpdateRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionUpdateEClass, FunctionUpdate.class, "FunctionUpdate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionUpdateAttributeEClass, FunctionUpdateAttribute.class, "FunctionUpdateAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionUpdateAttribute_Path(), theEcorePackage.getEString(), "path", null, 0, 1, FunctionUpdateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionUpdateAttribute_Value(), theEcorePackage.getEString(), "value", null, 0, 1, FunctionUpdateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionMatchEClass, FunctionMatch.class, "FunctionMatch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionMatchAttributeEClass, FunctionMatchAttribute.class, "FunctionMatchAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionMatchAttribute_Path(), theEcorePackage.getEString(), "path", null, 0, 1, FunctionMatchAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionMatchAttribute_Match(), theEcorePackage.getEString(), "match", null, 0, 1, FunctionMatchAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionMatchAttribute_Negation(), theEcorePackage.getEBoolean(), "negation", null, 0, 1, FunctionMatchAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionMatchMetricEClass, FunctionMatchMetric.class, "FunctionMatchMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionMatchMetric_Path(), theEcorePackage.getEString(), "path", null, 0, 1, FunctionMatchMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionMatchMetric_Option(), theMetricsPackage.getMetricValueOption(), null, "option", null, 0, 1, FunctionMatchMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionMatchMetric_LowerBound(), theEcorePackage.getEDoubleObject(), "lowerBound", null, 0, 1, FunctionMatchMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionMatchMetric_UpperBound(), theEcorePackage.getEDoubleObject(), "upperBound", null, 0, 1, FunctionMatchMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionMatchMetric_Negation(), theEcorePackage.getEBoolean(), "negation", null, 0, 1, FunctionMatchMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionMatchInstanceOfEClass, FunctionMatchInstanceOf.class, "FunctionMatchInstanceOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionMatchInstanceOf_EPackage(), theEcorePackage.getEString(), "ePackage", null, 0, 1, FunctionMatchInstanceOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionMatchInstanceOf_EName(), theEcorePackage.getEString(), "eName", null, 0, 1, FunctionMatchInstanceOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePairEClass, ValuePair.class, "ValuePair", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValuePair_Path(), theEcorePackage.getEString(), "path", null, 0, 1, ValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValuePairEClass, StringValuePair.class, "StringValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValuePair_Value(), theEcorePackage.getEString(), "value", null, 0, 1, StringValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FunctionPackageImpl
