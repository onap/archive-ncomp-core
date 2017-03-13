
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

import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Message Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageStats#getLevel <em>Level</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageStats#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageStats#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageStats()
 * @model
 * @generated
 */
public interface LogMessageStats extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.core.logs.LogLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogLevel
	 * @see #setLevel(LogLevel)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageStats_Level()
	 * @model unique="false"
	 * @generated
	 */
	LogLevel getLevel();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageStats#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LogLevel value);

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
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageStats_Severity()
	 * @model unique="false"
	 * @generated
	 */
	LogSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageStats#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(LogSeverity value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageStats_Count()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getCount();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageStats#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(IncreasingULongMetricAttribute value);

} // LogMessageStats
