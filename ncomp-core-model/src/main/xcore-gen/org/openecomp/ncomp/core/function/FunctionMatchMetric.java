
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

import org.openecomp.ncomp.core.metrics.MetricValueOption;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getPath <em>Path</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getOption <em>Option</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#isNegation <em>Negation</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchMetric()
 * @model
 * @generated
 */
public interface FunctionMatchMetric extends FunctionMatch {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchMetric_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(MetricValueOption)
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchMetric_Option()
	 * @model
	 * @generated
	 */
	MetricValueOption getOption();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(MetricValueOption value);

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
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchMetric_LowerBound()
	 * @model unique="false"
	 * @generated
	 */
	Double getLowerBound();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getLowerBound <em>Lower Bound</em>}' attribute.
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
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchMetric_UpperBound()
	 * @model unique="false"
	 * @generated
	 */
	Double getUpperBound();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Double value);

	/**
	 * Returns the value of the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negation</em>' attribute.
	 * @see #setNegation(boolean)
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchMetric_Negation()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNegation();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.FunctionMatchMetric#isNegation <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negation</em>' attribute.
	 * @see #isNegation()
	 * @generated
	 */
	void setNegation(boolean value);

} // FunctionMatchMetric
