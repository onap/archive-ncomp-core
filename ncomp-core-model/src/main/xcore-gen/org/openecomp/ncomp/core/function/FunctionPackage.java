
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

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.core.function.FunctionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-core-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.core'"
 * @generated
 */
public interface FunctionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "function";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.core.function";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "function";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionPackage eINSTANCE = org.openecomp.ncomp.core.function.impl.FunctionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.FunctionImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.IteratorImpl <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.IteratorImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getIterator()
	 * @generated
	 */
	int ITERATOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.IteratorUsingFunctionImpl <em>Iterator Using Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.IteratorUsingFunctionImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getIteratorUsingFunction()
	 * @generated
	 */
	int ITERATOR_USING_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_USING_FUNCTION__NAME = ITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_USING_FUNCTION__LAST_POLLED = ITERATOR__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_USING_FUNCTION__LAST_CHANGED = ITERATOR__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_USING_FUNCTION__CREATED = ITERATOR__CREATED;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_USING_FUNCTION__PATHS = ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recursive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_USING_FUNCTION__RECURSIVE = ITERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_USING_FUNCTION__FILTER = ITERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Iterator Using Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_USING_FUNCTION_FEATURE_COUNT = ITERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Iterator Using Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_USING_FUNCTION_OPERATION_COUNT = ITERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.RuleFunctionImpl <em>Rule Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.RuleFunctionImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getRuleFunction()
	 * @generated
	 */
	int RULE_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FUNCTION__LAST_POLLED = FUNCTION__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FUNCTION__LAST_CHANGED = FUNCTION__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FUNCTION__CREATED = FUNCTION__CREATED;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FUNCTION__RULES = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rule Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.FunctionRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.FunctionRuleImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionRule()
	 * @generated
	 */
	int FUNCTION_RULE = 4;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RULE__MATCHES = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RULE__ACTION = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.FunctionActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.FunctionActionImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionAction()
	 * @generated
	 */
	int FUNCTION_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ACTION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.RuleUpdateFunctionImpl <em>Rule Update Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.RuleUpdateFunctionImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getRuleUpdateFunction()
	 * @generated
	 */
	int RULE_UPDATE_FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UPDATE_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UPDATE_FUNCTION__LAST_POLLED = FUNCTION__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UPDATE_FUNCTION__LAST_CHANGED = FUNCTION__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UPDATE_FUNCTION__CREATED = FUNCTION__CREATED;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UPDATE_FUNCTION__RULES = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Update Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UPDATE_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rule Update Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_UPDATE_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.FunctionUpdateRuleImpl <em>Update Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.FunctionUpdateRuleImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionUpdateRule()
	 * @generated
	 */
	int FUNCTION_UPDATE_RULE = 7;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_UPDATE_RULE__MATCHES = 0;

	/**
	 * The feature id for the '<em><b>Updates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_UPDATE_RULE__UPDATES = 1;

	/**
	 * The number of structural features of the '<em>Update Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_UPDATE_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Update Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_UPDATE_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.FunctionUpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.FunctionUpdateImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionUpdate()
	 * @generated
	 */
	int FUNCTION_UPDATE = 8;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_UPDATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_UPDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.FunctionUpdateAttributeImpl <em>Update Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.FunctionUpdateAttributeImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionUpdateAttribute()
	 * @generated
	 */
	int FUNCTION_UPDATE_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_UPDATE_ATTRIBUTE__PATH = FUNCTION_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_UPDATE_ATTRIBUTE__VALUE = FUNCTION_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_UPDATE_ATTRIBUTE_FEATURE_COUNT = FUNCTION_UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_UPDATE_ATTRIBUTE_OPERATION_COUNT = FUNCTION_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.FunctionMatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.FunctionMatchImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionMatch()
	 * @generated
	 */
	int FUNCTION_MATCH = 10;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.FunctionMatchAttributeImpl <em>Match Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.FunctionMatchAttributeImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionMatchAttribute()
	 * @generated
	 */
	int FUNCTION_MATCH_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_ATTRIBUTE__PATH = FUNCTION_MATCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_ATTRIBUTE__MATCH = FUNCTION_MATCH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_ATTRIBUTE__NEGATION = FUNCTION_MATCH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Match Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_ATTRIBUTE_FEATURE_COUNT = FUNCTION_MATCH_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Match Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_ATTRIBUTE_OPERATION_COUNT = FUNCTION_MATCH_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.FunctionMatchMetricImpl <em>Match Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.FunctionMatchMetricImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionMatchMetric()
	 * @generated
	 */
	int FUNCTION_MATCH_METRIC = 12;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_METRIC__PATH = FUNCTION_MATCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_METRIC__OPTION = FUNCTION_MATCH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_METRIC__LOWER_BOUND = FUNCTION_MATCH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_METRIC__UPPER_BOUND = FUNCTION_MATCH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_METRIC__NEGATION = FUNCTION_MATCH_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Match Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_METRIC_FEATURE_COUNT = FUNCTION_MATCH_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Match Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_METRIC_OPERATION_COUNT = FUNCTION_MATCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.FunctionMatchInstanceOfImpl <em>Match Instance Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.FunctionMatchInstanceOfImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionMatchInstanceOf()
	 * @generated
	 */
	int FUNCTION_MATCH_INSTANCE_OF = 13;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_INSTANCE_OF__EPACKAGE = FUNCTION_MATCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_INSTANCE_OF__ENAME = FUNCTION_MATCH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Match Instance Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_INSTANCE_OF_FEATURE_COUNT = FUNCTION_MATCH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Match Instance Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MATCH_INSTANCE_OF_OPERATION_COUNT = FUNCTION_MATCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.ValuePairImpl <em>Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.ValuePairImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getValuePair()
	 * @generated
	 */
	int VALUE_PAIR = 14;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PAIR__PATH = 0;

	/**
	 * The number of structural features of the '<em>Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PAIR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.function.impl.StringValuePairImpl <em>String Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.function.impl.StringValuePairImpl
	 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getStringValuePair()
	 * @generated
	 */
	int STRING_VALUE_PAIR = 15;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_PAIR__PATH = VALUE_PAIR__PATH;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_PAIR__VALUE = VALUE_PAIR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_PAIR_FEATURE_COUNT = VALUE_PAIR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_PAIR_OPERATION_COUNT = VALUE_PAIR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.openecomp.ncomp.core.function.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see org.openecomp.ncomp.core.function.Iterator
	 * @generated
	 */
	EClass getIterator();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.IteratorUsingFunction <em>Iterator Using Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Using Function</em>'.
	 * @see org.openecomp.ncomp.core.function.IteratorUsingFunction
	 * @generated
	 */
	EClass getIteratorUsingFunction();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.core.function.IteratorUsingFunction#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see org.openecomp.ncomp.core.function.IteratorUsingFunction#getPaths()
	 * @see #getIteratorUsingFunction()
	 * @generated
	 */
	EAttribute getIteratorUsingFunction_Paths();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.IteratorUsingFunction#isRecursive <em>Recursive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recursive</em>'.
	 * @see org.openecomp.ncomp.core.function.IteratorUsingFunction#isRecursive()
	 * @see #getIteratorUsingFunction()
	 * @generated
	 */
	EAttribute getIteratorUsingFunction_Recursive();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.core.function.IteratorUsingFunction#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.openecomp.ncomp.core.function.IteratorUsingFunction#getFilter()
	 * @see #getIteratorUsingFunction()
	 * @generated
	 */
	EReference getIteratorUsingFunction_Filter();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.RuleFunction <em>Rule Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Function</em>'.
	 * @see org.openecomp.ncomp.core.function.RuleFunction
	 * @generated
	 */
	EClass getRuleFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.function.RuleFunction#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.openecomp.ncomp.core.function.RuleFunction#getRules()
	 * @see #getRuleFunction()
	 * @generated
	 */
	EReference getRuleFunction_Rules();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.FunctionRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionRule
	 * @generated
	 */
	EClass getFunctionRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.function.FunctionRule#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionRule#getMatches()
	 * @see #getFunctionRule()
	 * @generated
	 */
	EReference getFunctionRule_Matches();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.core.function.FunctionRule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionRule#getAction()
	 * @see #getFunctionRule()
	 * @generated
	 */
	EReference getFunctionRule_Action();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.FunctionAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionAction
	 * @generated
	 */
	EClass getFunctionAction();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionAction#getValue()
	 * @see #getFunctionAction()
	 * @generated
	 */
	EAttribute getFunctionAction_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.RuleUpdateFunction <em>Rule Update Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Update Function</em>'.
	 * @see org.openecomp.ncomp.core.function.RuleUpdateFunction
	 * @generated
	 */
	EClass getRuleUpdateFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.function.RuleUpdateFunction#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.openecomp.ncomp.core.function.RuleUpdateFunction#getRules()
	 * @see #getRuleUpdateFunction()
	 * @generated
	 */
	EReference getRuleUpdateFunction_Rules();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.FunctionUpdateRule <em>Update Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Rule</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionUpdateRule
	 * @generated
	 */
	EClass getFunctionUpdateRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.function.FunctionUpdateRule#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionUpdateRule#getMatches()
	 * @see #getFunctionUpdateRule()
	 * @generated
	 */
	EReference getFunctionUpdateRule_Matches();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.function.FunctionUpdateRule#getUpdates <em>Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Updates</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionUpdateRule#getUpdates()
	 * @see #getFunctionUpdateRule()
	 * @generated
	 */
	EReference getFunctionUpdateRule_Updates();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.FunctionUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionUpdate
	 * @generated
	 */
	EClass getFunctionUpdate();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.FunctionUpdateAttribute <em>Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Attribute</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionUpdateAttribute
	 * @generated
	 */
	EClass getFunctionUpdateAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionUpdateAttribute#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionUpdateAttribute#getPath()
	 * @see #getFunctionUpdateAttribute()
	 * @generated
	 */
	EAttribute getFunctionUpdateAttribute_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionUpdateAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionUpdateAttribute#getValue()
	 * @see #getFunctionUpdateAttribute()
	 * @generated
	 */
	EAttribute getFunctionUpdateAttribute_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.FunctionMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatch
	 * @generated
	 */
	EClass getFunctionMatch();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.FunctionMatchAttribute <em>Match Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Attribute</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchAttribute
	 * @generated
	 */
	EClass getFunctionMatchAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionMatchAttribute#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchAttribute#getPath()
	 * @see #getFunctionMatchAttribute()
	 * @generated
	 */
	EAttribute getFunctionMatchAttribute_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionMatchAttribute#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchAttribute#getMatch()
	 * @see #getFunctionMatchAttribute()
	 * @generated
	 */
	EAttribute getFunctionMatchAttribute_Match();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionMatchAttribute#isNegation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negation</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchAttribute#isNegation()
	 * @see #getFunctionMatchAttribute()
	 * @generated
	 */
	EAttribute getFunctionMatchAttribute_Negation();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.FunctionMatchMetric <em>Match Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Metric</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchMetric
	 * @generated
	 */
	EClass getFunctionMatchMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchMetric#getPath()
	 * @see #getFunctionMatchMetric()
	 * @generated
	 */
	EAttribute getFunctionMatchMetric_Path();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchMetric#getOption()
	 * @see #getFunctionMatchMetric()
	 * @generated
	 */
	EReference getFunctionMatchMetric_Option();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchMetric#getLowerBound()
	 * @see #getFunctionMatchMetric()
	 * @generated
	 */
	EAttribute getFunctionMatchMetric_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchMetric#getUpperBound()
	 * @see #getFunctionMatchMetric()
	 * @generated
	 */
	EAttribute getFunctionMatchMetric_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#isNegation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negation</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchMetric#isNegation()
	 * @see #getFunctionMatchMetric()
	 * @generated
	 */
	EAttribute getFunctionMatchMetric_Negation();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.FunctionMatchInstanceOf <em>Match Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Instance Of</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchInstanceOf
	 * @generated
	 */
	EClass getFunctionMatchInstanceOf();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionMatchInstanceOf#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EPackage</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchInstanceOf#getEPackage()
	 * @see #getFunctionMatchInstanceOf()
	 * @generated
	 */
	EAttribute getFunctionMatchInstanceOf_EPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.FunctionMatchInstanceOf#getEName <em>EName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EName</em>'.
	 * @see org.openecomp.ncomp.core.function.FunctionMatchInstanceOf#getEName()
	 * @see #getFunctionMatchInstanceOf()
	 * @generated
	 */
	EAttribute getFunctionMatchInstanceOf_EName();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.ValuePair <em>Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Pair</em>'.
	 * @see org.openecomp.ncomp.core.function.ValuePair
	 * @generated
	 */
	EClass getValuePair();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.ValuePair#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openecomp.ncomp.core.function.ValuePair#getPath()
	 * @see #getValuePair()
	 * @generated
	 */
	EAttribute getValuePair_Path();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.function.StringValuePair <em>String Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value Pair</em>'.
	 * @see org.openecomp.ncomp.core.function.StringValuePair
	 * @generated
	 */
	EClass getStringValuePair();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.function.StringValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.core.function.StringValuePair#getValue()
	 * @see #getStringValuePair()
	 * @generated
	 */
	EAttribute getStringValuePair_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionFactory getFunctionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.FunctionImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.IteratorImpl <em>Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.IteratorImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getIterator()
		 * @generated
		 */
		EClass ITERATOR = eINSTANCE.getIterator();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.IteratorUsingFunctionImpl <em>Iterator Using Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.IteratorUsingFunctionImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getIteratorUsingFunction()
		 * @generated
		 */
		EClass ITERATOR_USING_FUNCTION = eINSTANCE.getIteratorUsingFunction();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_USING_FUNCTION__PATHS = eINSTANCE.getIteratorUsingFunction_Paths();

		/**
		 * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_USING_FUNCTION__RECURSIVE = eINSTANCE.getIteratorUsingFunction_Recursive();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_USING_FUNCTION__FILTER = eINSTANCE.getIteratorUsingFunction_Filter();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.RuleFunctionImpl <em>Rule Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.RuleFunctionImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getRuleFunction()
		 * @generated
		 */
		EClass RULE_FUNCTION = eINSTANCE.getRuleFunction();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FUNCTION__RULES = eINSTANCE.getRuleFunction_Rules();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.FunctionRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.FunctionRuleImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionRule()
		 * @generated
		 */
		EClass FUNCTION_RULE = eINSTANCE.getFunctionRule();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_RULE__MATCHES = eINSTANCE.getFunctionRule_Matches();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_RULE__ACTION = eINSTANCE.getFunctionRule_Action();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.FunctionActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.FunctionActionImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionAction()
		 * @generated
		 */
		EClass FUNCTION_ACTION = eINSTANCE.getFunctionAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ACTION__VALUE = eINSTANCE.getFunctionAction_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.RuleUpdateFunctionImpl <em>Rule Update Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.RuleUpdateFunctionImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getRuleUpdateFunction()
		 * @generated
		 */
		EClass RULE_UPDATE_FUNCTION = eINSTANCE.getRuleUpdateFunction();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_UPDATE_FUNCTION__RULES = eINSTANCE.getRuleUpdateFunction_Rules();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.FunctionUpdateRuleImpl <em>Update Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.FunctionUpdateRuleImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionUpdateRule()
		 * @generated
		 */
		EClass FUNCTION_UPDATE_RULE = eINSTANCE.getFunctionUpdateRule();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_UPDATE_RULE__MATCHES = eINSTANCE.getFunctionUpdateRule_Matches();

		/**
		 * The meta object literal for the '<em><b>Updates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_UPDATE_RULE__UPDATES = eINSTANCE.getFunctionUpdateRule_Updates();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.FunctionUpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.FunctionUpdateImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionUpdate()
		 * @generated
		 */
		EClass FUNCTION_UPDATE = eINSTANCE.getFunctionUpdate();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.FunctionUpdateAttributeImpl <em>Update Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.FunctionUpdateAttributeImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionUpdateAttribute()
		 * @generated
		 */
		EClass FUNCTION_UPDATE_ATTRIBUTE = eINSTANCE.getFunctionUpdateAttribute();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_UPDATE_ATTRIBUTE__PATH = eINSTANCE.getFunctionUpdateAttribute_Path();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_UPDATE_ATTRIBUTE__VALUE = eINSTANCE.getFunctionUpdateAttribute_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.FunctionMatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.FunctionMatchImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionMatch()
		 * @generated
		 */
		EClass FUNCTION_MATCH = eINSTANCE.getFunctionMatch();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.FunctionMatchAttributeImpl <em>Match Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.FunctionMatchAttributeImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionMatchAttribute()
		 * @generated
		 */
		EClass FUNCTION_MATCH_ATTRIBUTE = eINSTANCE.getFunctionMatchAttribute();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MATCH_ATTRIBUTE__PATH = eINSTANCE.getFunctionMatchAttribute_Path();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MATCH_ATTRIBUTE__MATCH = eINSTANCE.getFunctionMatchAttribute_Match();

		/**
		 * The meta object literal for the '<em><b>Negation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MATCH_ATTRIBUTE__NEGATION = eINSTANCE.getFunctionMatchAttribute_Negation();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.FunctionMatchMetricImpl <em>Match Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.FunctionMatchMetricImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionMatchMetric()
		 * @generated
		 */
		EClass FUNCTION_MATCH_METRIC = eINSTANCE.getFunctionMatchMetric();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MATCH_METRIC__PATH = eINSTANCE.getFunctionMatchMetric_Path();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_MATCH_METRIC__OPTION = eINSTANCE.getFunctionMatchMetric_Option();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MATCH_METRIC__LOWER_BOUND = eINSTANCE.getFunctionMatchMetric_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MATCH_METRIC__UPPER_BOUND = eINSTANCE.getFunctionMatchMetric_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Negation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MATCH_METRIC__NEGATION = eINSTANCE.getFunctionMatchMetric_Negation();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.FunctionMatchInstanceOfImpl <em>Match Instance Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.FunctionMatchInstanceOfImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getFunctionMatchInstanceOf()
		 * @generated
		 */
		EClass FUNCTION_MATCH_INSTANCE_OF = eINSTANCE.getFunctionMatchInstanceOf();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MATCH_INSTANCE_OF__EPACKAGE = eINSTANCE.getFunctionMatchInstanceOf_EPackage();

		/**
		 * The meta object literal for the '<em><b>EName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_MATCH_INSTANCE_OF__ENAME = eINSTANCE.getFunctionMatchInstanceOf_EName();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.ValuePairImpl <em>Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.ValuePairImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getValuePair()
		 * @generated
		 */
		EClass VALUE_PAIR = eINSTANCE.getValuePair();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_PAIR__PATH = eINSTANCE.getValuePair_Path();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.function.impl.StringValuePairImpl <em>String Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.function.impl.StringValuePairImpl
		 * @see org.openecomp.ncomp.core.function.impl.FunctionPackageImpl#getStringValuePair()
		 * @generated
		 */
		EClass STRING_VALUE_PAIR = eINSTANCE.getStringValuePair();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE_PAIR__VALUE = eINSTANCE.getStringValuePair_Value();

	}

} //FunctionPackage
