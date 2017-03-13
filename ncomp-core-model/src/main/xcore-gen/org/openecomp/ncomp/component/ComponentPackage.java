
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
package org.openecomp.ncomp.component;

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
 * @see org.openecomp.ncomp.component.ComponentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-core-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp'"
 * @generated
 */
public interface ComponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "component";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.component";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "component";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentPackage eINSTANCE = org.openecomp.ncomp.component.impl.ComponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.component.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.component.impl.ComponentImpl
	 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CLASSES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Drools Runtimes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DROOLS_RUNTIMES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.component.impl.ComponentClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.component.impl.ComponentClassImpl
	 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getComponentClass()
	 * @generated
	 */
	int COMPONENT_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASS__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASS__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASS__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASS__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Apis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASS__APIS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASS__NUMBER_OF_RESOURCES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Update Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASS__NUMBER_OF_UPDATE_REQUESTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Of Create Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASS__NUMBER_OF_CREATE_REQUESTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Number Of Delete Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASS__NUMBER_OF_DELETE_REQUESTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASS_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLASS_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.component.impl.ApiImpl <em>Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.component.impl.ApiImpl
	 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getApi()
	 * @generated
	 */
	int API = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Number Of Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NUMBER_OF_REQUESTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Error Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NUMBER_OF_ERROR_REQUESTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Completed Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NUMBER_OF_COMPLETED_REQUESTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outstanding Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__OUTSTANDING_REQUESTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Request Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__LAST_REQUEST_DURATION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Current Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___CURRENT_REQUESTS = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.component.impl.ApiRequestImpl <em>Api Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.component.impl.ApiRequestImpl
	 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getApiRequest()
	 * @generated
	 */
	int API_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__COMPONENT_NAME = CorePackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__RESOURCE_PATH = CorePackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__TRANSACTION_ID = CorePackage.EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__PARENT_TRANSACTION_ID = CorePackage.EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__ACTION = CorePackage.EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__DURATION = CorePackage.EVENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST__STATUS = CorePackage.EVENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Api Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST_FEATURE_COUNT = CorePackage.EVENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Api Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_REQUEST_OPERATION_COUNT = CorePackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.component.impl.DroolsRuntimeImpl <em>Drools Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.component.impl.DroolsRuntimeImpl
	 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getDroolsRuntime()
	 * @generated
	 */
	int DROOLS_RUNTIME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RUNTIME__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RUNTIME__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RUNTIME__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RUNTIME__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RUNTIME__RULES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drools Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RUNTIME_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drools Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RUNTIME_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.component.impl.DroolsRuleImpl <em>Drools Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.component.impl.DroolsRuleImpl
	 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getDroolsRule()
	 * @generated
	 */
	int DROOLS_RULE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RULE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RULE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RULE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RULE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Number Of Fires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RULE__NUMBER_OF_FIRES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drools Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RULE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drools Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOLS_RULE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.component.ApiRequestStatus <em>Api Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.component.ApiRequestStatus
	 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getApiRequestStatus()
	 * @generated
	 */
	int API_REQUEST_STATUS = 6;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.component.DroolsObjectChange <em>Drools Object Change</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.component.DroolsObjectChange
	 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getDroolsObjectChange()
	 * @generated
	 */
	int DROOLS_OBJECT_CHANGE = 7;

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.component.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.openecomp.ncomp.component.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.component.Component#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see org.openecomp.ncomp.component.Component#getClasses()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.component.Component#getDroolsRuntimes <em>Drools Runtimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drools Runtimes</em>'.
	 * @see org.openecomp.ncomp.component.Component#getDroolsRuntimes()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_DroolsRuntimes();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.component.ComponentClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.openecomp.ncomp.component.ComponentClass
	 * @generated
	 */
	EClass getComponentClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.component.ComponentClass#getApis <em>Apis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apis</em>'.
	 * @see org.openecomp.ncomp.component.ComponentClass#getApis()
	 * @see #getComponentClass()
	 * @generated
	 */
	EReference getComponentClass_Apis();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfResources <em>Number Of Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Resources</em>'.
	 * @see org.openecomp.ncomp.component.ComponentClass#getNumberOfResources()
	 * @see #getComponentClass()
	 * @generated
	 */
	EAttribute getComponentClass_NumberOfResources();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfUpdateRequests <em>Number Of Update Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Update Requests</em>'.
	 * @see org.openecomp.ncomp.component.ComponentClass#getNumberOfUpdateRequests()
	 * @see #getComponentClass()
	 * @generated
	 */
	EAttribute getComponentClass_NumberOfUpdateRequests();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfCreateRequests <em>Number Of Create Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Create Requests</em>'.
	 * @see org.openecomp.ncomp.component.ComponentClass#getNumberOfCreateRequests()
	 * @see #getComponentClass()
	 * @generated
	 */
	EAttribute getComponentClass_NumberOfCreateRequests();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfDeleteRequests <em>Number Of Delete Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Delete Requests</em>'.
	 * @see org.openecomp.ncomp.component.ComponentClass#getNumberOfDeleteRequests()
	 * @see #getComponentClass()
	 * @generated
	 */
	EAttribute getComponentClass_NumberOfDeleteRequests();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.component.Api <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api</em>'.
	 * @see org.openecomp.ncomp.component.Api
	 * @generated
	 */
	EClass getApi();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.Api#getNumberOfRequests <em>Number Of Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Requests</em>'.
	 * @see org.openecomp.ncomp.component.Api#getNumberOfRequests()
	 * @see #getApi()
	 * @generated
	 */
	EAttribute getApi_NumberOfRequests();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.Api#getNumberOfErrorRequests <em>Number Of Error Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Error Requests</em>'.
	 * @see org.openecomp.ncomp.component.Api#getNumberOfErrorRequests()
	 * @see #getApi()
	 * @generated
	 */
	EAttribute getApi_NumberOfErrorRequests();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.Api#getNumberOfCompletedRequests <em>Number Of Completed Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Completed Requests</em>'.
	 * @see org.openecomp.ncomp.component.Api#getNumberOfCompletedRequests()
	 * @see #getApi()
	 * @generated
	 */
	EAttribute getApi_NumberOfCompletedRequests();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.Api#getOutstandingRequests <em>Outstanding Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outstanding Requests</em>'.
	 * @see org.openecomp.ncomp.component.Api#getOutstandingRequests()
	 * @see #getApi()
	 * @generated
	 */
	EAttribute getApi_OutstandingRequests();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.Api#getLastRequestDuration <em>Last Request Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Request Duration</em>'.
	 * @see org.openecomp.ncomp.component.Api#getLastRequestDuration()
	 * @see #getApi()
	 * @generated
	 */
	EAttribute getApi_LastRequestDuration();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.component.Api#currentRequests() <em>Current Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Current Requests</em>' operation.
	 * @see org.openecomp.ncomp.component.Api#currentRequests()
	 * @generated
	 */
	EOperation getApi__CurrentRequests();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.component.ApiRequest <em>Api Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api Request</em>'.
	 * @see org.openecomp.ncomp.component.ApiRequest
	 * @generated
	 */
	EClass getApiRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.ApiRequest#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see org.openecomp.ncomp.component.ApiRequest#getComponentName()
	 * @see #getApiRequest()
	 * @generated
	 */
	EAttribute getApiRequest_ComponentName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.ApiRequest#getResourcePath <em>Resource Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Path</em>'.
	 * @see org.openecomp.ncomp.component.ApiRequest#getResourcePath()
	 * @see #getApiRequest()
	 * @generated
	 */
	EAttribute getApiRequest_ResourcePath();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.ApiRequest#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see org.openecomp.ncomp.component.ApiRequest#getTransactionId()
	 * @see #getApiRequest()
	 * @generated
	 */
	EAttribute getApiRequest_TransactionId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.ApiRequest#getParentTransactionId <em>Parent Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Transaction Id</em>'.
	 * @see org.openecomp.ncomp.component.ApiRequest#getParentTransactionId()
	 * @see #getApiRequest()
	 * @generated
	 */
	EAttribute getApiRequest_ParentTransactionId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.ApiRequest#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.openecomp.ncomp.component.ApiRequest#getAction()
	 * @see #getApiRequest()
	 * @generated
	 */
	EAttribute getApiRequest_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.ApiRequest#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.openecomp.ncomp.component.ApiRequest#getDuration()
	 * @see #getApiRequest()
	 * @generated
	 */
	EAttribute getApiRequest_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.ApiRequest#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.component.ApiRequest#getStatus()
	 * @see #getApiRequest()
	 * @generated
	 */
	EAttribute getApiRequest_Status();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.component.DroolsRuntime <em>Drools Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drools Runtime</em>'.
	 * @see org.openecomp.ncomp.component.DroolsRuntime
	 * @generated
	 */
	EClass getDroolsRuntime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.component.DroolsRuntime#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.openecomp.ncomp.component.DroolsRuntime#getRules()
	 * @see #getDroolsRuntime()
	 * @generated
	 */
	EReference getDroolsRuntime_Rules();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.component.DroolsRule <em>Drools Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drools Rule</em>'.
	 * @see org.openecomp.ncomp.component.DroolsRule
	 * @generated
	 */
	EClass getDroolsRule();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.component.DroolsRule#getNumberOfFires <em>Number Of Fires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Fires</em>'.
	 * @see org.openecomp.ncomp.component.DroolsRule#getNumberOfFires()
	 * @see #getDroolsRule()
	 * @generated
	 */
	EAttribute getDroolsRule_NumberOfFires();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.component.ApiRequestStatus <em>Api Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Api Request Status</em>'.
	 * @see org.openecomp.ncomp.component.ApiRequestStatus
	 * @generated
	 */
	EEnum getApiRequestStatus();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.component.DroolsObjectChange <em>Drools Object Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Drools Object Change</em>'.
	 * @see org.openecomp.ncomp.component.DroolsObjectChange
	 * @generated
	 */
	EEnum getDroolsObjectChange();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentFactory getComponentFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.component.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.component.impl.ComponentImpl
		 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CLASSES = eINSTANCE.getComponent_Classes();

		/**
		 * The meta object literal for the '<em><b>Drools Runtimes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DROOLS_RUNTIMES = eINSTANCE.getComponent_DroolsRuntimes();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.component.impl.ComponentClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.component.impl.ComponentClassImpl
		 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getComponentClass()
		 * @generated
		 */
		EClass COMPONENT_CLASS = eINSTANCE.getComponentClass();

		/**
		 * The meta object literal for the '<em><b>Apis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CLASS__APIS = eINSTANCE.getComponentClass_Apis();

		/**
		 * The meta object literal for the '<em><b>Number Of Resources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CLASS__NUMBER_OF_RESOURCES = eINSTANCE.getComponentClass_NumberOfResources();

		/**
		 * The meta object literal for the '<em><b>Number Of Update Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CLASS__NUMBER_OF_UPDATE_REQUESTS = eINSTANCE.getComponentClass_NumberOfUpdateRequests();

		/**
		 * The meta object literal for the '<em><b>Number Of Create Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CLASS__NUMBER_OF_CREATE_REQUESTS = eINSTANCE.getComponentClass_NumberOfCreateRequests();

		/**
		 * The meta object literal for the '<em><b>Number Of Delete Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_CLASS__NUMBER_OF_DELETE_REQUESTS = eINSTANCE.getComponentClass_NumberOfDeleteRequests();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.component.impl.ApiImpl <em>Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.component.impl.ApiImpl
		 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getApi()
		 * @generated
		 */
		EClass API = eINSTANCE.getApi();

		/**
		 * The meta object literal for the '<em><b>Number Of Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__NUMBER_OF_REQUESTS = eINSTANCE.getApi_NumberOfRequests();

		/**
		 * The meta object literal for the '<em><b>Number Of Error Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__NUMBER_OF_ERROR_REQUESTS = eINSTANCE.getApi_NumberOfErrorRequests();

		/**
		 * The meta object literal for the '<em><b>Number Of Completed Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__NUMBER_OF_COMPLETED_REQUESTS = eINSTANCE.getApi_NumberOfCompletedRequests();

		/**
		 * The meta object literal for the '<em><b>Outstanding Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__OUTSTANDING_REQUESTS = eINSTANCE.getApi_OutstandingRequests();

		/**
		 * The meta object literal for the '<em><b>Last Request Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__LAST_REQUEST_DURATION = eINSTANCE.getApi_LastRequestDuration();

		/**
		 * The meta object literal for the '<em><b>Current Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation API___CURRENT_REQUESTS = eINSTANCE.getApi__CurrentRequests();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.component.impl.ApiRequestImpl <em>Api Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.component.impl.ApiRequestImpl
		 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getApiRequest()
		 * @generated
		 */
		EClass API_REQUEST = eINSTANCE.getApiRequest();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REQUEST__COMPONENT_NAME = eINSTANCE.getApiRequest_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Resource Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REQUEST__RESOURCE_PATH = eINSTANCE.getApiRequest_ResourcePath();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REQUEST__TRANSACTION_ID = eINSTANCE.getApiRequest_TransactionId();

		/**
		 * The meta object literal for the '<em><b>Parent Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REQUEST__PARENT_TRANSACTION_ID = eINSTANCE.getApiRequest_ParentTransactionId();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REQUEST__ACTION = eINSTANCE.getApiRequest_Action();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REQUEST__DURATION = eINSTANCE.getApiRequest_Duration();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_REQUEST__STATUS = eINSTANCE.getApiRequest_Status();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.component.impl.DroolsRuntimeImpl <em>Drools Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.component.impl.DroolsRuntimeImpl
		 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getDroolsRuntime()
		 * @generated
		 */
		EClass DROOLS_RUNTIME = eINSTANCE.getDroolsRuntime();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROOLS_RUNTIME__RULES = eINSTANCE.getDroolsRuntime_Rules();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.component.impl.DroolsRuleImpl <em>Drools Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.component.impl.DroolsRuleImpl
		 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getDroolsRule()
		 * @generated
		 */
		EClass DROOLS_RULE = eINSTANCE.getDroolsRule();

		/**
		 * The meta object literal for the '<em><b>Number Of Fires</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROOLS_RULE__NUMBER_OF_FIRES = eINSTANCE.getDroolsRule_NumberOfFires();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.component.ApiRequestStatus <em>Api Request Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.component.ApiRequestStatus
		 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getApiRequestStatus()
		 * @generated
		 */
		EEnum API_REQUEST_STATUS = eINSTANCE.getApiRequestStatus();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.component.DroolsObjectChange <em>Drools Object Change</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.component.DroolsObjectChange
		 * @see org.openecomp.ncomp.component.impl.ComponentPackageImpl#getDroolsObjectChange()
		 * @generated
		 */
		EEnum DROOLS_OBJECT_CHANGE = eINSTANCE.getDroolsObjectChange();

	}

} //ComponentPackage
