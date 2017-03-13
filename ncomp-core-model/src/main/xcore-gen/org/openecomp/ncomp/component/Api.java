
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

import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.LongMetricAttribute;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.component.Api#getNumberOfRequests <em>Number Of Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.Api#getNumberOfErrorRequests <em>Number Of Error Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.Api#getNumberOfCompletedRequests <em>Number Of Completed Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.Api#getOutstandingRequests <em>Outstanding Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.Api#getLastRequestDuration <em>Last Request Duration</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.component.ComponentPackage#getApi()
 * @model
 * @generated
 */
public interface Api extends NamedEntity {

	/**
	 * Returns the value of the '<em><b>Number Of Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Requests</em>' attribute.
	 * @see #setNumberOfRequests(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApi_NumberOfRequests()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfRequests();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.Api#getNumberOfRequests <em>Number Of Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Requests</em>' attribute.
	 * @see #getNumberOfRequests()
	 * @generated
	 */
	void setNumberOfRequests(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Of Error Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Error Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Error Requests</em>' attribute.
	 * @see #setNumberOfErrorRequests(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApi_NumberOfErrorRequests()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfErrorRequests();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.Api#getNumberOfErrorRequests <em>Number Of Error Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Error Requests</em>' attribute.
	 * @see #getNumberOfErrorRequests()
	 * @generated
	 */
	void setNumberOfErrorRequests(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Of Completed Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Completed Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Completed Requests</em>' attribute.
	 * @see #setNumberOfCompletedRequests(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApi_NumberOfCompletedRequests()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfCompletedRequests();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.Api#getNumberOfCompletedRequests <em>Number Of Completed Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Completed Requests</em>' attribute.
	 * @see #getNumberOfCompletedRequests()
	 * @generated
	 */
	void setNumberOfCompletedRequests(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Outstanding Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outstanding Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outstanding Requests</em>' attribute.
	 * @see #setOutstandingRequests(LongMetricAttribute)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApi_OutstandingRequests()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.LongMetricAttribute"
	 * @generated
	 */
	LongMetricAttribute getOutstandingRequests();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.Api#getOutstandingRequests <em>Outstanding Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outstanding Requests</em>' attribute.
	 * @see #getOutstandingRequests()
	 * @generated
	 */
	void setOutstandingRequests(LongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Last Request Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Request Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Request Duration</em>' attribute.
	 * @see #setLastRequestDuration(LongMetricAttribute)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApi_LastRequestDuration()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.LongMetricAttribute"
	 * @generated
	 */
	LongMetricAttribute getLastRequestDuration();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.Api#getLastRequestDuration <em>Last Request Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Request Duration</em>' attribute.
	 * @see #getLastRequestDuration()
	 * @generated
	 */
	void setLastRequestDuration(LongMetricAttribute value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	EList<ApiRequest> currentRequests();
} // Api
