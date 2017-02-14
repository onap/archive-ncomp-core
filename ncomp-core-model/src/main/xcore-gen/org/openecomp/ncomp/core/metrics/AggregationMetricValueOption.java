
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
package org.openecomp.ncomp.core.metrics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Metric Value Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.metrics.AggregationMetricValueOption#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.metrics.AggregationMetricValueOption#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.core.metrics.MetricsPackage#getAggregationMetricValueOption()
 * @model
 * @generated
 */
public interface AggregationMetricValueOption extends MetricValueOption {
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
	 * @see org.openecomp.ncomp.core.metrics.MetricsPackage#getAggregationMetricValueOption_Duration()
	 * @model unique="false"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.metrics.AggregationMetricValueOption#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.core.metrics.AggregationMetricValueOptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see org.openecomp.ncomp.core.metrics.AggregationMetricValueOptionType
	 * @see #setAggregationType(AggregationMetricValueOptionType)
	 * @see org.openecomp.ncomp.core.metrics.MetricsPackage#getAggregationMetricValueOption_AggregationType()
	 * @model unique="false"
	 * @generated
	 */
	AggregationMetricValueOptionType getAggregationType();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.metrics.AggregationMetricValueOption#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Type</em>' attribute.
	 * @see org.openecomp.ncomp.core.metrics.AggregationMetricValueOptionType
	 * @see #getAggregationType()
	 * @generated
	 */
	void setAggregationType(AggregationMetricValueOptionType value);

} // AggregationMetricValueOption
