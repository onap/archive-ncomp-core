
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
package org.openecomp.ncomp.core.function;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.core.function.FunctionPackage
 * @generated
 */
public interface FunctionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionFactory eINSTANCE = org.openecomp.ncomp.core.function.impl.FunctionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Iterator Using Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator Using Function</em>'.
	 * @generated
	 */
	IteratorUsingFunction createIteratorUsingFunction();

	/**
	 * Returns a new object of class '<em>Rule Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Function</em>'.
	 * @generated
	 */
	RuleFunction createRuleFunction();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	FunctionRule createFunctionRule();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	FunctionAction createFunctionAction();

	/**
	 * Returns a new object of class '<em>Rule Update Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Update Function</em>'.
	 * @generated
	 */
	RuleUpdateFunction createRuleUpdateFunction();

	/**
	 * Returns a new object of class '<em>Update Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Rule</em>'.
	 * @generated
	 */
	FunctionUpdateRule createFunctionUpdateRule();

	/**
	 * Returns a new object of class '<em>Update Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Attribute</em>'.
	 * @generated
	 */
	FunctionUpdateAttribute createFunctionUpdateAttribute();

	/**
	 * Returns a new object of class '<em>Match Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Attribute</em>'.
	 * @generated
	 */
	FunctionMatchAttribute createFunctionMatchAttribute();

	/**
	 * Returns a new object of class '<em>Match Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Metric</em>'.
	 * @generated
	 */
	FunctionMatchMetric createFunctionMatchMetric();

	/**
	 * Returns a new object of class '<em>Match Instance Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Instance Of</em>'.
	 * @generated
	 */
	FunctionMatchInstanceOf createFunctionMatchInstanceOf();

	/**
	 * Returns a new object of class '<em>String Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value Pair</em>'.
	 * @generated
	 */
	StringValuePair createStringValuePair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionPackage getFunctionPackage();

} //FunctionFactory
