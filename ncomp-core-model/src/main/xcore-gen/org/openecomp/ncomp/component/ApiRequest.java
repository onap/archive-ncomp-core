
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

import org.openecomp.ncomp.core.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.component.ApiRequest#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.ApiRequest#getResourcePath <em>Resource Path</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.ApiRequest#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.ApiRequest#getParentTransactionId <em>Parent Transaction Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.ApiRequest#getAction <em>Action</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.ApiRequest#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.ApiRequest#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.component.ComponentPackage#getApiRequest()
 * @model
 * @generated
 */
public interface ApiRequest extends Event {
	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' attribute.
	 * @see #setComponentName(String)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApiRequest_ComponentName()
	 * @model unique="false"
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.ApiRequest#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Path</em>' attribute.
	 * @see #setResourcePath(String)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApiRequest_ResourcePath()
	 * @model unique="false"
	 * @generated
	 */
	String getResourcePath();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.ApiRequest#getResourcePath <em>Resource Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Path</em>' attribute.
	 * @see #getResourcePath()
	 * @generated
	 */
	void setResourcePath(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Id</em>' attribute.
	 * @see #setTransactionId(String)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApiRequest_TransactionId()
	 * @model unique="false"
	 * @generated
	 */
	String getTransactionId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.ApiRequest#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Transaction Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Transaction Id</em>' attribute.
	 * @see #setParentTransactionId(String)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApiRequest_ParentTransactionId()
	 * @model unique="false"
	 * @generated
	 */
	String getParentTransactionId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.ApiRequest#getParentTransactionId <em>Parent Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Transaction Id</em>' attribute.
	 * @see #getParentTransactionId()
	 * @generated
	 */
	void setParentTransactionId(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApiRequest_Action()
	 * @model unique="false"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.ApiRequest#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Long)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApiRequest_Duration()
	 * @model unique="false"
	 * @generated
	 */
	Long getDuration();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.ApiRequest#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Long value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.component.ApiRequestStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openecomp.ncomp.component.ApiRequestStatus
	 * @see #setStatus(ApiRequestStatus)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getApiRequest_Status()
	 * @model unique="false"
	 * @generated
	 */
	ApiRequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.ApiRequest#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openecomp.ncomp.component.ApiRequestStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ApiRequestStatus value);

} // ApiRequest
