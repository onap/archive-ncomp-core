
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
package org.openecomp.ncomp.core.logs;

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.openecomp.ncomp.core.logs.LogsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-core-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.core'"
 * @generated
 */
public interface LogsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.core.logs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogsPackage eINSTANCE = org.openecomp.ncomp.core.logs.impl.LogsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageImpl <em>Log Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.impl.LogMessageImpl
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessage()
	 * @generated
	 */
	int LOG_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE__TIME = 0;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE__RESOURCE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE__MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE__CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Number Of Suppressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE__NUMBER_OF_SUPPRESSED = 6;

	/**
	 * The feature id for the '<em><b>Suppressed Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE__SUPPRESSED_START_TIME = 7;

	/**
	 * The number of structural features of the '<em>Log Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Log Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl <em>Log Message Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageRule()
	 * @generated
	 */
	int LOG_MESSAGE_RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__DESCRIPTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__MESSAGE_FILTER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Path Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__RESOURCE_PATH_FILTER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__LEVEL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__SEVERITY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>New Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__NEW_LEVEL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>New Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__NEW_SEVERITY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>New Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__NEW_CATEGORY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__DISABLED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Update Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE__UPDATE_FUNCTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Log Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Log Message Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_RULE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageContainerImpl <em>Log Message Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.impl.LogMessageContainerImpl
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageContainer()
	 * @generated
	 */
	int LOG_MESSAGE_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Log Message Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Log Message Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Log Message Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CONTAINER__LOG_MESSAGE_STATS = 2;

	/**
	 * The number of structural features of the '<em>Log Message Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Log Message Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageContainerConfigurationImpl <em>Log Message Container Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.impl.LogMessageContainerConfigurationImpl
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageContainerConfiguration()
	 * @generated
	 */
	int LOG_MESSAGE_CONTAINER_CONFIGURATION = 3;

	/**
	 * The number of structural features of the '<em>Log Message Container Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CONTAINER_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Log Message Container Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CONTAINER_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageCategoryImpl <em>Log Message Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.impl.LogMessageCategoryImpl
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageCategory()
	 * @generated
	 */
	int LOG_MESSAGE_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CATEGORY__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CATEGORY__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CATEGORY__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CATEGORY__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CATEGORY__STATS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Log Message Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CATEGORY_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Log Message Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_CATEGORY_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageStatsImpl <em>Log Message Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.impl.LogMessageStatsImpl
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageStats()
	 * @generated
	 */
	int LOG_MESSAGE_STATS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATS__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATS__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATS__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATS__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATS__LEVEL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATS__SEVERITY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATS__COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Log Message Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATS_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Log Message Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATS_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageStateImpl <em>Log Message State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.impl.LogMessageStateImpl
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageState()
	 * @generated
	 */
	int LOG_MESSAGE_STATE = 6;

	/**
	 * The feature id for the '<em><b>Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATE__SUSPENDED = 0;

	/**
	 * The feature id for the '<em><b>Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATE__LOG = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATE__CATEGORY = 2;

	/**
	 * The number of structural features of the '<em>Log Message State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Log Message State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_MESSAGE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.impl.LogConfigurationImpl <em>Log Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.impl.LogConfigurationImpl
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogConfiguration()
	 * @generated
	 */
	int LOG_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_CONFIGURATION__FILES = 0;

	/**
	 * The number of structural features of the '<em>Log Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Log Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.impl.LogFileImpl <em>Log File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.impl.LogFileImpl
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogFile()
	 * @generated
	 */
	int LOG_FILE = 8;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FILE__FILENAME = 0;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FILE__PATTERNS = 1;

	/**
	 * The number of structural features of the '<em>Log File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Log File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.impl.LogPatternImpl <em>Log Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.impl.LogPatternImpl
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogPattern()
	 * @generated
	 */
	int LOG_PATTERN = 9;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PATTERN__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PATTERN__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PATTERN__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PATTERN__SEVERITY = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PATTERN__PATH = 4;

	/**
	 * The number of structural features of the '<em>Log Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PATTERN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Log Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.LogLevel <em>Log Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.LogLevel
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogLevel()
	 * @generated
	 */
	int LOG_LEVEL = 10;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.logs.LogSeverity <em>Log Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.logs.LogSeverity
	 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogSeverity()
	 * @generated
	 */
	int LOG_SEVERITY = 11;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.logs.LogMessage <em>Log Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Message</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessage
	 * @generated
	 */
	EClass getLogMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessage#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessage#getTime()
	 * @see #getLogMessage()
	 * @generated
	 */
	EAttribute getLogMessage_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessage#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessage#getResourceName()
	 * @see #getLogMessage()
	 * @generated
	 */
	EAttribute getLogMessage_ResourceName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessage#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessage#getSeverity()
	 * @see #getLogMessage()
	 * @generated
	 */
	EAttribute getLogMessage_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessage#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessage#getLevel()
	 * @see #getLogMessage()
	 * @generated
	 */
	EAttribute getLogMessage_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessage#getMessage()
	 * @see #getLogMessage()
	 * @generated
	 */
	EAttribute getLogMessage_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessage#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessage#getCategory()
	 * @see #getLogMessage()
	 * @generated
	 */
	EAttribute getLogMessage_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessage#getNumberOfSuppressed <em>Number Of Suppressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Suppressed</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessage#getNumberOfSuppressed()
	 * @see #getLogMessage()
	 * @generated
	 */
	EAttribute getLogMessage_NumberOfSuppressed();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessage#getSuppressedStartTime <em>Suppressed Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppressed Start Time</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessage#getSuppressedStartTime()
	 * @see #getLogMessage()
	 * @generated
	 */
	EAttribute getLogMessage_SuppressedStartTime();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.logs.LogMessageRule <em>Log Message Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Message Rule</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageRule
	 * @generated
	 */
	EClass getLogMessageRule();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageRule#getDescription()
	 * @see #getLogMessageRule()
	 * @generated
	 */
	EAttribute getLogMessageRule_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getMessageFilter <em>Message Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Filter</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageRule#getMessageFilter()
	 * @see #getLogMessageRule()
	 * @generated
	 */
	EAttribute getLogMessageRule_MessageFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getResourcePathFilter <em>Resource Path Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Path Filter</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageRule#getResourcePathFilter()
	 * @see #getLogMessageRule()
	 * @generated
	 */
	EAttribute getLogMessageRule_ResourcePathFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageRule#getLevel()
	 * @see #getLogMessageRule()
	 * @generated
	 */
	EAttribute getLogMessageRule_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageRule#getSeverity()
	 * @see #getLogMessageRule()
	 * @generated
	 */
	EAttribute getLogMessageRule_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getNewLevel <em>New Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Level</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageRule#getNewLevel()
	 * @see #getLogMessageRule()
	 * @generated
	 */
	EAttribute getLogMessageRule_NewLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getNewSeverity <em>New Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Severity</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageRule#getNewSeverity()
	 * @see #getLogMessageRule()
	 * @generated
	 */
	EAttribute getLogMessageRule_NewSeverity();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getNewCategory <em>New Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Category</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageRule#getNewCategory()
	 * @see #getLogMessageRule()
	 * @generated
	 */
	EAttribute getLogMessageRule_NewCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageRule#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageRule#isDisabled()
	 * @see #getLogMessageRule()
	 * @generated
	 */
	EAttribute getLogMessageRule_Disabled();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getUpdateFunction <em>Update Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Update Function</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageRule#getUpdateFunction()
	 * @see #getLogMessageRule()
	 * @generated
	 */
	EReference getLogMessageRule_UpdateFunction();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.logs.LogMessageContainer <em>Log Message Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Message Container</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageContainer
	 * @generated
	 */
	EClass getLogMessageContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.core.logs.LogMessageContainer#getLogMessageConfiguration <em>Log Message Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Log Message Configuration</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageContainer#getLogMessageConfiguration()
	 * @see #getLogMessageContainer()
	 * @generated
	 */
	EReference getLogMessageContainer_LogMessageConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.logs.LogMessageContainer#getLogMessageCategories <em>Log Message Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Message Categories</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageContainer#getLogMessageCategories()
	 * @see #getLogMessageContainer()
	 * @generated
	 */
	EReference getLogMessageContainer_LogMessageCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.logs.LogMessageContainer#getLogMessageStats <em>Log Message Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Message Stats</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageContainer#getLogMessageStats()
	 * @see #getLogMessageContainer()
	 * @generated
	 */
	EReference getLogMessageContainer_LogMessageStats();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.logs.LogMessageContainerConfiguration <em>Log Message Container Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Message Container Configuration</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageContainerConfiguration
	 * @generated
	 */
	EClass getLogMessageContainerConfiguration();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.logs.LogMessageCategory <em>Log Message Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Message Category</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageCategory
	 * @generated
	 */
	EClass getLogMessageCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.logs.LogMessageCategory#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stats</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageCategory#getStats()
	 * @see #getLogMessageCategory()
	 * @generated
	 */
	EReference getLogMessageCategory_Stats();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.logs.LogMessageStats <em>Log Message Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Message Stats</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageStats
	 * @generated
	 */
	EClass getLogMessageStats();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageStats#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageStats#getLevel()
	 * @see #getLogMessageStats()
	 * @generated
	 */
	EAttribute getLogMessageStats_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageStats#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageStats#getSeverity()
	 * @see #getLogMessageStats()
	 * @generated
	 */
	EAttribute getLogMessageStats_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageStats#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageStats#getCount()
	 * @see #getLogMessageStats()
	 * @generated
	 */
	EAttribute getLogMessageStats_Count();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.logs.LogMessageState <em>Log Message State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Message State</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageState
	 * @generated
	 */
	EClass getLogMessageState();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogMessageState#isSuspended <em>Suspended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspended</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageState#isSuspended()
	 * @see #getLogMessageState()
	 * @generated
	 */
	EAttribute getLogMessageState_Suspended();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.ncomp.core.logs.LogMessageState#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Log</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageState#getLog()
	 * @see #getLogMessageState()
	 * @generated
	 */
	EReference getLogMessageState_Log();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.ncomp.core.logs.LogMessageState#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogMessageState#getCategory()
	 * @see #getLogMessageState()
	 * @generated
	 */
	EReference getLogMessageState_Category();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.logs.LogConfiguration <em>Log Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Configuration</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogConfiguration
	 * @generated
	 */
	EClass getLogConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.logs.LogConfiguration#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogConfiguration#getFiles()
	 * @see #getLogConfiguration()
	 * @generated
	 */
	EReference getLogConfiguration_Files();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.logs.LogFile <em>Log File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log File</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogFile
	 * @generated
	 */
	EClass getLogFile();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogFile#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogFile#getFilename()
	 * @see #getLogFile()
	 * @generated
	 */
	EAttribute getLogFile_Filename();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.logs.LogFile#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogFile#getPatterns()
	 * @see #getLogFile()
	 * @generated
	 */
	EReference getLogFile_Patterns();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.logs.LogPattern <em>Log Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Pattern</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogPattern
	 * @generated
	 */
	EClass getLogPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogPattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogPattern#getPattern()
	 * @see #getLogPattern()
	 * @generated
	 */
	EAttribute getLogPattern_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogPattern#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogPattern#getMessage()
	 * @see #getLogPattern()
	 * @generated
	 */
	EAttribute getLogPattern_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogPattern#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogPattern#getLevel()
	 * @see #getLogPattern()
	 * @generated
	 */
	EAttribute getLogPattern_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogPattern#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogPattern#getSeverity()
	 * @see #getLogPattern()
	 * @generated
	 */
	EAttribute getLogPattern_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.logs.LogPattern#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogPattern#getPath()
	 * @see #getLogPattern()
	 * @generated
	 */
	EAttribute getLogPattern_Path();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.core.logs.LogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Log Level</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogLevel
	 * @generated
	 */
	EEnum getLogLevel();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.core.logs.LogSeverity <em>Log Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Log Severity</em>'.
	 * @see org.openecomp.ncomp.core.logs.LogSeverity
	 * @generated
	 */
	EEnum getLogSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogsFactory getLogsFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageImpl <em>Log Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.impl.LogMessageImpl
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessage()
		 * @generated
		 */
		EClass LOG_MESSAGE = eINSTANCE.getLogMessage();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE__TIME = eINSTANCE.getLogMessage_Time();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE__RESOURCE_NAME = eINSTANCE.getLogMessage_ResourceName();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE__SEVERITY = eINSTANCE.getLogMessage_Severity();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE__LEVEL = eINSTANCE.getLogMessage_Level();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE__MESSAGE = eINSTANCE.getLogMessage_Message();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE__CATEGORY = eINSTANCE.getLogMessage_Category();

		/**
		 * The meta object literal for the '<em><b>Number Of Suppressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE__NUMBER_OF_SUPPRESSED = eINSTANCE.getLogMessage_NumberOfSuppressed();

		/**
		 * The meta object literal for the '<em><b>Suppressed Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE__SUPPRESSED_START_TIME = eINSTANCE.getLogMessage_SuppressedStartTime();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl <em>Log Message Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageRule()
		 * @generated
		 */
		EClass LOG_MESSAGE_RULE = eINSTANCE.getLogMessageRule();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_RULE__DESCRIPTION = eINSTANCE.getLogMessageRule_Description();

		/**
		 * The meta object literal for the '<em><b>Message Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_RULE__MESSAGE_FILTER = eINSTANCE.getLogMessageRule_MessageFilter();

		/**
		 * The meta object literal for the '<em><b>Resource Path Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_RULE__RESOURCE_PATH_FILTER = eINSTANCE.getLogMessageRule_ResourcePathFilter();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_RULE__LEVEL = eINSTANCE.getLogMessageRule_Level();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_RULE__SEVERITY = eINSTANCE.getLogMessageRule_Severity();

		/**
		 * The meta object literal for the '<em><b>New Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_RULE__NEW_LEVEL = eINSTANCE.getLogMessageRule_NewLevel();

		/**
		 * The meta object literal for the '<em><b>New Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_RULE__NEW_SEVERITY = eINSTANCE.getLogMessageRule_NewSeverity();

		/**
		 * The meta object literal for the '<em><b>New Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_RULE__NEW_CATEGORY = eINSTANCE.getLogMessageRule_NewCategory();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_RULE__DISABLED = eINSTANCE.getLogMessageRule_Disabled();

		/**
		 * The meta object literal for the '<em><b>Update Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MESSAGE_RULE__UPDATE_FUNCTION = eINSTANCE.getLogMessageRule_UpdateFunction();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageContainerImpl <em>Log Message Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.impl.LogMessageContainerImpl
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageContainer()
		 * @generated
		 */
		EClass LOG_MESSAGE_CONTAINER = eINSTANCE.getLogMessageContainer();

		/**
		 * The meta object literal for the '<em><b>Log Message Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION = eINSTANCE.getLogMessageContainer_LogMessageConfiguration();

		/**
		 * The meta object literal for the '<em><b>Log Message Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CATEGORIES = eINSTANCE.getLogMessageContainer_LogMessageCategories();

		/**
		 * The meta object literal for the '<em><b>Log Message Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MESSAGE_CONTAINER__LOG_MESSAGE_STATS = eINSTANCE.getLogMessageContainer_LogMessageStats();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageContainerConfigurationImpl <em>Log Message Container Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.impl.LogMessageContainerConfigurationImpl
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageContainerConfiguration()
		 * @generated
		 */
		EClass LOG_MESSAGE_CONTAINER_CONFIGURATION = eINSTANCE.getLogMessageContainerConfiguration();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageCategoryImpl <em>Log Message Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.impl.LogMessageCategoryImpl
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageCategory()
		 * @generated
		 */
		EClass LOG_MESSAGE_CATEGORY = eINSTANCE.getLogMessageCategory();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MESSAGE_CATEGORY__STATS = eINSTANCE.getLogMessageCategory_Stats();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageStatsImpl <em>Log Message Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.impl.LogMessageStatsImpl
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageStats()
		 * @generated
		 */
		EClass LOG_MESSAGE_STATS = eINSTANCE.getLogMessageStats();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_STATS__LEVEL = eINSTANCE.getLogMessageStats_Level();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_STATS__SEVERITY = eINSTANCE.getLogMessageStats_Severity();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_STATS__COUNT = eINSTANCE.getLogMessageStats_Count();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.impl.LogMessageStateImpl <em>Log Message State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.impl.LogMessageStateImpl
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogMessageState()
		 * @generated
		 */
		EClass LOG_MESSAGE_STATE = eINSTANCE.getLogMessageState();

		/**
		 * The meta object literal for the '<em><b>Suspended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_MESSAGE_STATE__SUSPENDED = eINSTANCE.getLogMessageState_Suspended();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MESSAGE_STATE__LOG = eINSTANCE.getLogMessageState_Log();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_MESSAGE_STATE__CATEGORY = eINSTANCE.getLogMessageState_Category();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.impl.LogConfigurationImpl <em>Log Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.impl.LogConfigurationImpl
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogConfiguration()
		 * @generated
		 */
		EClass LOG_CONFIGURATION = eINSTANCE.getLogConfiguration();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_CONFIGURATION__FILES = eINSTANCE.getLogConfiguration_Files();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.impl.LogFileImpl <em>Log File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.impl.LogFileImpl
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogFile()
		 * @generated
		 */
		EClass LOG_FILE = eINSTANCE.getLogFile();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_FILE__FILENAME = eINSTANCE.getLogFile_Filename();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_FILE__PATTERNS = eINSTANCE.getLogFile_Patterns();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.impl.LogPatternImpl <em>Log Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.impl.LogPatternImpl
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogPattern()
		 * @generated
		 */
		EClass LOG_PATTERN = eINSTANCE.getLogPattern();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_PATTERN__PATTERN = eINSTANCE.getLogPattern_Pattern();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_PATTERN__MESSAGE = eINSTANCE.getLogPattern_Message();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_PATTERN__LEVEL = eINSTANCE.getLogPattern_Level();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_PATTERN__SEVERITY = eINSTANCE.getLogPattern_Severity();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_PATTERN__PATH = eINSTANCE.getLogPattern_Path();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.LogLevel <em>Log Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.LogLevel
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogLevel()
		 * @generated
		 */
		EEnum LOG_LEVEL = eINSTANCE.getLogLevel();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.logs.LogSeverity <em>Log Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.logs.LogSeverity
		 * @see org.openecomp.ncomp.core.logs.impl.LogsPackageImpl#getLogSeverity()
		 * @generated
		 */
		EEnum LOG_SEVERITY = eINSTANCE.getLogSeverity();

	}

} //LogsPackage
