
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
 * A representation of the model object '<em><b>Threshold Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getMetricName <em>Metric Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getMaxDelay <em>Max Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getThresholdAlert()
 * @model
 * @generated
 */
public interface ThresholdAlert extends Alert {
	/**
	 * Returns the value of the '<em><b>Metric Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Name</em>' attribute.
	 * @see #setMetricName(String)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getThresholdAlert_MetricName()
	 * @model unique="false"
	 * @generated
	 */
	String getMetricName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getMetricName <em>Metric Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Name</em>' attribute.
	 * @see #getMetricName()
	 * @generated
	 */
	void setMetricName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Double)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getThresholdAlert_LowerBound()
	 * @model unique="false"
	 * @generated
	 */
	Double getLowerBound();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Double value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Double)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getThresholdAlert_UpperBound()
	 * @model unique="false"
	 * @generated
	 */
	Double getUpperBound();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Double value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getThresholdAlert_Duration()
	 * @model unique="false"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Max Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Delay</em>' attribute.
	 * @see #setMaxDelay(String)
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#getThresholdAlert_MaxDelay()
	 * @model unique="false"
	 * @generated
	 */
	String getMaxDelay();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.alerts.ThresholdAlert#getMaxDelay <em>Max Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Delay</em>' attribute.
	 * @see #getMaxDelay()
	 * @generated
	 */
	void setMaxDelay(String value);

} // ThresholdAlert
