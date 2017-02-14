
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

import org.openecomp.ncomp.core.HasOperationalState;
import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.core.logs.LogSeverity;

import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.alerts.Alert#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.Alert#getDampingRule <em>Damping Rule</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.Alert#getNumAlerts <em>Num Alerts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.Alert#getNumAlertsSuppressed <em>Num Alerts Suppressed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getAlert()
 * @model abstract="true"
 * @generated
 */
public interface Alert extends NamedEntity, HasOperationalState {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.core.logs.LogSeverity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogSeverity
	 * @see #setSeverity(LogSeverity)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getAlert_Severity()
	 * @model unique="false"
	 * @generated
	 */
	LogSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.Alert#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(LogSeverity value);

	/**
	 * Returns the value of the '<em><b>Damping Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damping Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damping Rule</em>' containment reference.
	 * @see #setDampingRule(DampingRule)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getAlert_DampingRule()
	 * @model containment="true"
	 * @generated
	 */
	DampingRule getDampingRule();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.Alert#getDampingRule <em>Damping Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damping Rule</em>' containment reference.
	 * @see #getDampingRule()
	 * @generated
	 */
	void setDampingRule(DampingRule value);

	/**
	 * Returns the value of the '<em><b>Num Alerts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Alerts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Alerts</em>' attribute.
	 * @see #setNumAlerts(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getAlert_NumAlerts()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumAlerts();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.Alert#getNumAlerts <em>Num Alerts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Alerts</em>' attribute.
	 * @see #getNumAlerts()
	 * @generated
	 */
	void setNumAlerts(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Num Alerts Suppressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Alerts Suppressed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Alerts Suppressed</em>' attribute.
	 * @see #setNumAlertsSuppressed(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getAlert_NumAlertsSuppressed()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumAlertsSuppressed();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.Alert#getNumAlertsSuppressed <em>Num Alerts Suppressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Alerts Suppressed</em>' attribute.
	 * @see #getNumAlertsSuppressed()
	 * @generated
	 */
	void setNumAlertsSuppressed(IncreasingULongMetricAttribute value);

} // Alert
