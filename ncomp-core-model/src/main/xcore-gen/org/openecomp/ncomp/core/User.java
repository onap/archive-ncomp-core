
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
package org.openecomp.ncomp.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.User#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.User#getDeploymentStatus <em>Deployment Status</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.CorePackage#getUser()
 * @model
 * @generated
 */
public interface User extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute.
	 * @see #setPublicKey(String)
	 * @see org.openecomp.ncomp.core.CorePackage#getUser_PublicKey()
	 * @model unique="false"
	 * @generated
	 */
	String getPublicKey();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.User#getPublicKey <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key</em>' attribute.
	 * @see #getPublicKey()
	 * @generated
	 */
	void setPublicKey(String value);

	/**
	 * Returns the value of the '<em><b>Deployment Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.core.DeploymentStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Status</em>' attribute.
	 * @see org.openecomp.ncomp.core.DeploymentStatus
	 * @see #setDeploymentStatus(DeploymentStatus)
	 * @see org.openecomp.ncomp.core.CorePackage#getUser_DeploymentStatus()
	 * @model unique="false"
	 * @generated
	 */
	DeploymentStatus getDeploymentStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.User#getDeploymentStatus <em>Deployment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Status</em>' attribute.
	 * @see org.openecomp.ncomp.core.DeploymentStatus
	 * @see #getDeploymentStatus()
	 * @generated
	 */
	void setDeploymentStatus(DeploymentStatus value);

} // User
