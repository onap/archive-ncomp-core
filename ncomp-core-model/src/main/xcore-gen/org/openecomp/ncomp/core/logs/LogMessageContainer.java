
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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Message Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageContainer#getLogMessageConfiguration <em>Log Message Configuration</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageContainer#getLogMessageCategories <em>Log Message Categories</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageContainer#getLogMessageStats <em>Log Message Stats</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageContainer()
 * @model abstract="true"
 * @generated
 */
public interface LogMessageContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Log Message Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Message Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Message Configuration</em>' containment reference.
	 * @see #setLogMessageConfiguration(LogMessageContainerConfiguration)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageContainer_LogMessageConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	LogMessageContainerConfiguration getLogMessageConfiguration();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageContainer#getLogMessageConfiguration <em>Log Message Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Message Configuration</em>' containment reference.
	 * @see #getLogMessageConfiguration()
	 * @generated
	 */
	void setLogMessageConfiguration(LogMessageContainerConfiguration value);

	/**
	 * Returns the value of the '<em><b>Log Message Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.logs.LogMessageCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Message Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Message Categories</em>' containment reference list.
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageContainer_LogMessageCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogMessageCategory> getLogMessageCategories();

	/**
	 * Returns the value of the '<em><b>Log Message Stats</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.logs.LogMessageStats}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Message Stats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Message Stats</em>' containment reference list.
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageContainer_LogMessageStats()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogMessageStats> getLogMessageStats();

} // LogMessageContainer
