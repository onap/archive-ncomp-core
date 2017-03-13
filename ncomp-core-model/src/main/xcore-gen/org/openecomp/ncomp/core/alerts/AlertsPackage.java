
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
package org.openecomp.ncomp.core.alerts;

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
 * @see org.openecomp.ncomp.core.alerts.AlertsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-core-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.core'"
 * @generated
 */
public interface AlertsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "alerts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.core.alerts";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "alerts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlertsPackage eINSTANCE = org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.alerts.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.alerts.impl.AlertImpl
	 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Operational State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__OPERATIONAL_STATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__SEVERITY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Damping Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__DAMPING_RULE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num Alerts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__NUM_ALERTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Alerts Suppressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__NUM_ALERTS_SUPPRESSED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.alerts.impl.ThresholdAlertImpl <em>Threshold Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.alerts.impl.ThresholdAlertImpl
	 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getThresholdAlert()
	 * @generated
	 */
	int THRESHOLD_ALERT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__NAME = ALERT__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__LAST_POLLED = ALERT__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__LAST_CHANGED = ALERT__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__CREATED = ALERT__CREATED;

	/**
	 * The feature id for the '<em><b>Operational State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__OPERATIONAL_STATE = ALERT__OPERATIONAL_STATE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__SEVERITY = ALERT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Damping Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__DAMPING_RULE = ALERT__DAMPING_RULE;

	/**
	 * The feature id for the '<em><b>Num Alerts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__NUM_ALERTS = ALERT__NUM_ALERTS;

	/**
	 * The feature id for the '<em><b>Num Alerts Suppressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__NUM_ALERTS_SUPPRESSED = ALERT__NUM_ALERTS_SUPPRESSED;

	/**
	 * The feature id for the '<em><b>Metric Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__METRIC_NAME = ALERT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__LOWER_BOUND = ALERT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__UPPER_BOUND = ALERT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__DURATION = ALERT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT__MAX_DELAY = ALERT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Threshold Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT_FEATURE_COUNT = ALERT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Threshold Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ALERT_OPERATION_COUNT = ALERT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.alerts.impl.AlertContainerImpl <em>Alert Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.alerts.impl.AlertContainerImpl
	 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getAlertContainer()
	 * @generated
	 */
	int ALERT_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_CONTAINER__ALERTS = 0;

	/**
	 * The feature id for the '<em><b>Alerting Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_CONTAINER__ALERTING_TEMPLATE = 1;

	/**
	 * The number of structural features of the '<em>Alert Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Alert Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.alerts.impl.AlertingTemplateImpl <em>Alerting Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.alerts.impl.AlertingTemplateImpl
	 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getAlertingTemplate()
	 * @generated
	 */
	int ALERTING_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERTING_TEMPLATE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERTING_TEMPLATE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERTING_TEMPLATE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERTING_TEMPLATE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERTING_TEMPLATE__ALERTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alerting Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERTING_TEMPLATE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alerting Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERTING_TEMPLATE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.alerts.impl.DampingRuleImpl <em>Damping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.alerts.impl.DampingRuleImpl
	 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getDampingRule()
	 * @generated
	 */
	int DAMPING_RULE = 4;

	/**
	 * The number of structural features of the '<em>Damping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMPING_RULE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Damping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMPING_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.alerts.impl.MaxAlertPerIntervalImpl <em>Max Alert Per Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.alerts.impl.MaxAlertPerIntervalImpl
	 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getMaxAlertPerInterval()
	 * @generated
	 */
	int MAX_ALERT_PER_INTERVAL = 5;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ALERT_PER_INTERVAL__INTERVAL = DAMPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Alerts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ALERT_PER_INTERVAL__MAX_ALERTS = DAMPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Max Alert Per Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ALERT_PER_INTERVAL_FEATURE_COUNT = DAMPING_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Max Alert Per Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ALERT_PER_INTERVAL_OPERATION_COUNT = DAMPING_RULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.alerts.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert</em>'.
	 * @see org.openecomp.ncomp.core.alerts.Alert
	 * @generated
	 */
	EClass getAlert();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.alerts.Alert#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openecomp.ncomp.core.alerts.Alert#getSeverity()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Severity();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.core.alerts.Alert#getDampingRule <em>Damping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Damping Rule</em>'.
	 * @see org.openecomp.ncomp.core.alerts.Alert#getDampingRule()
	 * @see #getAlert()
	 * @generated
	 */
	EReference getAlert_DampingRule();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.alerts.Alert#getNumAlerts <em>Num Alerts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Alerts</em>'.
	 * @see org.openecomp.ncomp.core.alerts.Alert#getNumAlerts()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_NumAlerts();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.alerts.Alert#getNumAlertsSuppressed <em>Num Alerts Suppressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Alerts Suppressed</em>'.
	 * @see org.openecomp.ncomp.core.alerts.Alert#getNumAlertsSuppressed()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_NumAlertsSuppressed();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.alerts.ThresholdAlert <em>Threshold Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold Alert</em>'.
	 * @see org.openecomp.ncomp.core.alerts.ThresholdAlert
	 * @generated
	 */
	EClass getThresholdAlert();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getMetricName <em>Metric Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric Name</em>'.
	 * @see org.openecomp.ncomp.core.alerts.ThresholdAlert#getMetricName()
	 * @see #getThresholdAlert()
	 * @generated
	 */
	EAttribute getThresholdAlert_MetricName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.openecomp.ncomp.core.alerts.ThresholdAlert#getLowerBound()
	 * @see #getThresholdAlert()
	 * @generated
	 */
	EAttribute getThresholdAlert_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.openecomp.ncomp.core.alerts.ThresholdAlert#getUpperBound()
	 * @see #getThresholdAlert()
	 * @generated
	 */
	EAttribute getThresholdAlert_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.openecomp.ncomp.core.alerts.ThresholdAlert#getDuration()
	 * @see #getThresholdAlert()
	 * @generated
	 */
	EAttribute getThresholdAlert_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getMaxDelay <em>Max Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Delay</em>'.
	 * @see org.openecomp.ncomp.core.alerts.ThresholdAlert#getMaxDelay()
	 * @see #getThresholdAlert()
	 * @generated
	 */
	EAttribute getThresholdAlert_MaxDelay();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.alerts.AlertContainer <em>Alert Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert Container</em>'.
	 * @see org.openecomp.ncomp.core.alerts.AlertContainer
	 * @generated
	 */
	EClass getAlertContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.alerts.AlertContainer#getAlerts <em>Alerts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alerts</em>'.
	 * @see org.openecomp.ncomp.core.alerts.AlertContainer#getAlerts()
	 * @see #getAlertContainer()
	 * @generated
	 */
	EReference getAlertContainer_Alerts();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.ncomp.core.alerts.AlertContainer#getAlertingTemplate <em>Alerting Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alerting Template</em>'.
	 * @see org.openecomp.ncomp.core.alerts.AlertContainer#getAlertingTemplate()
	 * @see #getAlertContainer()
	 * @generated
	 */
	EReference getAlertContainer_AlertingTemplate();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.alerts.AlertingTemplate <em>Alerting Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alerting Template</em>'.
	 * @see org.openecomp.ncomp.core.alerts.AlertingTemplate
	 * @generated
	 */
	EClass getAlertingTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.alerts.AlertingTemplate#getAlerts <em>Alerts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alerts</em>'.
	 * @see org.openecomp.ncomp.core.alerts.AlertingTemplate#getAlerts()
	 * @see #getAlertingTemplate()
	 * @generated
	 */
	EReference getAlertingTemplate_Alerts();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.alerts.DampingRule <em>Damping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Damping Rule</em>'.
	 * @see org.openecomp.ncomp.core.alerts.DampingRule
	 * @generated
	 */
	EClass getDampingRule();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.alerts.MaxAlertPerInterval <em>Max Alert Per Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Alert Per Interval</em>'.
	 * @see org.openecomp.ncomp.core.alerts.MaxAlertPerInterval
	 * @generated
	 */
	EClass getMaxAlertPerInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.alerts.MaxAlertPerInterval#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see org.openecomp.ncomp.core.alerts.MaxAlertPerInterval#getInterval()
	 * @see #getMaxAlertPerInterval()
	 * @generated
	 */
	EAttribute getMaxAlertPerInterval_Interval();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.alerts.MaxAlertPerInterval#getMaxAlerts <em>Max Alerts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Alerts</em>'.
	 * @see org.openecomp.ncomp.core.alerts.MaxAlertPerInterval#getMaxAlerts()
	 * @see #getMaxAlertPerInterval()
	 * @generated
	 */
	EAttribute getMaxAlertPerInterval_MaxAlerts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlertsFactory getAlertsFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.alerts.impl.AlertImpl <em>Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.alerts.impl.AlertImpl
		 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getAlert()
		 * @generated
		 */
		EClass ALERT = eINSTANCE.getAlert();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__SEVERITY = eINSTANCE.getAlert_Severity();

		/**
		 * The meta object literal for the '<em><b>Damping Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALERT__DAMPING_RULE = eINSTANCE.getAlert_DampingRule();

		/**
		 * The meta object literal for the '<em><b>Num Alerts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__NUM_ALERTS = eINSTANCE.getAlert_NumAlerts();

		/**
		 * The meta object literal for the '<em><b>Num Alerts Suppressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__NUM_ALERTS_SUPPRESSED = eINSTANCE.getAlert_NumAlertsSuppressed();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.alerts.impl.ThresholdAlertImpl <em>Threshold Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.alerts.impl.ThresholdAlertImpl
		 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getThresholdAlert()
		 * @generated
		 */
		EClass THRESHOLD_ALERT = eINSTANCE.getThresholdAlert();

		/**
		 * The meta object literal for the '<em><b>Metric Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_ALERT__METRIC_NAME = eINSTANCE.getThresholdAlert_MetricName();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_ALERT__LOWER_BOUND = eINSTANCE.getThresholdAlert_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_ALERT__UPPER_BOUND = eINSTANCE.getThresholdAlert_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_ALERT__DURATION = eINSTANCE.getThresholdAlert_Duration();

		/**
		 * The meta object literal for the '<em><b>Max Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_ALERT__MAX_DELAY = eINSTANCE.getThresholdAlert_MaxDelay();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.alerts.impl.AlertContainerImpl <em>Alert Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.alerts.impl.AlertContainerImpl
		 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getAlertContainer()
		 * @generated
		 */
		EClass ALERT_CONTAINER = eINSTANCE.getAlertContainer();

		/**
		 * The meta object literal for the '<em><b>Alerts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALERT_CONTAINER__ALERTS = eINSTANCE.getAlertContainer_Alerts();

		/**
		 * The meta object literal for the '<em><b>Alerting Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALERT_CONTAINER__ALERTING_TEMPLATE = eINSTANCE.getAlertContainer_AlertingTemplate();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.alerts.impl.AlertingTemplateImpl <em>Alerting Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.alerts.impl.AlertingTemplateImpl
		 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getAlertingTemplate()
		 * @generated
		 */
		EClass ALERTING_TEMPLATE = eINSTANCE.getAlertingTemplate();

		/**
		 * The meta object literal for the '<em><b>Alerts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALERTING_TEMPLATE__ALERTS = eINSTANCE.getAlertingTemplate_Alerts();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.alerts.impl.DampingRuleImpl <em>Damping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.alerts.impl.DampingRuleImpl
		 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getDampingRule()
		 * @generated
		 */
		EClass DAMPING_RULE = eINSTANCE.getDampingRule();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.alerts.impl.MaxAlertPerIntervalImpl <em>Max Alert Per Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.alerts.impl.MaxAlertPerIntervalImpl
		 * @see org.openecomp.ncomp.core.alerts.impl.AlertsPackageImpl#getMaxAlertPerInterval()
		 * @generated
		 */
		EClass MAX_ALERT_PER_INTERVAL = eINSTANCE.getMaxAlertPerInterval();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_ALERT_PER_INTERVAL__INTERVAL = eINSTANCE.getMaxAlertPerInterval_Interval();

		/**
		 * The meta object literal for the '<em><b>Max Alerts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_ALERT_PER_INTERVAL__MAX_ALERTS = eINSTANCE.getMaxAlertPerInterval_MaxAlerts();

	}

} //AlertsPackage
