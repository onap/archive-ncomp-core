
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

import org.openecomp.ncomp.core.types.metrics.LongMetricAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Long Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.metrics.BasicLongMetric#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.core.metrics.MetricsPackage#getBasicLongMetric()
 * @model
 * @generated
 */
public interface BasicLongMetric extends BasicMetric {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(LongMetricAttribute)
	 * @see org.openecomp.ncomp.core.metrics.MetricsPackage#getBasicLongMetric_Value()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.LongMetricAttribute" transient="true"
	 * @generated
	 */
	LongMetricAttribute getValue();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.metrics.BasicLongMetric#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(LongMetricAttribute value);

} // BasicLongMetric
