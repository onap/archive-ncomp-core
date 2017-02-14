
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Message State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageState#isSuspended <em>Suspended</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageState#getLog <em>Log</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageState#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageState()
 * @model
 * @generated
 */
public interface LogMessageState extends EObject {
	/**
	 * Returns the value of the '<em><b>Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspended</em>' attribute.
	 * @see #setSuspended(boolean)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageState_Suspended()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSuspended();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageState#isSuspended <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspended</em>' attribute.
	 * @see #isSuspended()
	 * @generated
	 */
	void setSuspended(boolean value);

	/**
	 * Returns the value of the '<em><b>Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' reference.
	 * @see #setLog(LogMessage)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageState_Log()
	 * @model
	 * @generated
	 */
	LogMessage getLog();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageState#getLog <em>Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' reference.
	 * @see #getLog()
	 * @generated
	 */
	void setLog(LogMessage value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(LogMessageCategory)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageState_Category()
	 * @model
	 * @generated
	 */
	LogMessageCategory getCategory();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageState#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(LogMessageCategory value);

} // LogMessageState
