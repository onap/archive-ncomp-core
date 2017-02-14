
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Alert Per Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.alerts.MaxAlertPerInterval#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.MaxAlertPerInterval#getMaxAlerts <em>Max Alerts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getMaxAlertPerInterval()
 * @model
 * @generated
 */
public interface MaxAlertPerInterval extends DampingRule {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(String)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getMaxAlertPerInterval_Interval()
	 * @model unique="false"
	 * @generated
	 */
	String getInterval();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.MaxAlertPerInterval#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(String value);

	/**
	 * Returns the value of the '<em><b>Max Alerts</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Alerts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Alerts</em>' attribute.
	 * @see #setMaxAlerts(int)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getMaxAlertPerInterval_MaxAlerts()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getMaxAlerts();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.MaxAlertPerInterval#getMaxAlerts <em>Max Alerts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Alerts</em>' attribute.
	 * @see #getMaxAlerts()
	 * @generated
	 */
	void setMaxAlerts(int value);

} // MaxAlertPerInterval
