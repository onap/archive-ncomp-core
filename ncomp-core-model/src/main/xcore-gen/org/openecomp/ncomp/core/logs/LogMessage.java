
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
 * A representation of the model object '<em><b>Log Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessage#getTime <em>Time</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessage#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessage#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessage#getLevel <em>Level</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessage#getMessage <em>Message</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessage#getCategory <em>Category</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessage#getNumberOfSuppressed <em>Number Of Suppressed</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessage#getSuppressedStartTime <em>Suppressed Start Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessage()
 * @model
 * @generated
 */
public interface LogMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessage_Time()
	 * @model unique="false"
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessage#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * Returns the value of the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Name</em>' attribute.
	 * @see #setResourceName(String)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessage_ResourceName()
	 * @model unique="false"
	 * @generated
	 */
	String getResourceName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessage#getResourceName <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Name</em>' attribute.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(String value);

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
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessage_Severity()
	 * @model unique="false"
	 * @generated
	 */
	LogSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessage#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(LogSeverity value);

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
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessage_Level()
	 * @model unique="false"
	 * @generated
	 */
	LogLevel getLevel();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessage#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LogLevel value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessage_Message()
	 * @model unique="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessage#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessage_Category()
	 * @model unique="false"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessage#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Suppressed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Suppressed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Suppressed</em>' attribute.
	 * @see #setNumberOfSuppressed(int)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessage_NumberOfSuppressed()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getNumberOfSuppressed();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessage#getNumberOfSuppressed <em>Number Of Suppressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Suppressed</em>' attribute.
	 * @see #getNumberOfSuppressed()
	 * @generated
	 */
	void setNumberOfSuppressed(int value);

	/**
	 * Returns the value of the '<em><b>Suppressed Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppressed Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppressed Start Time</em>' attribute.
	 * @see #setSuppressedStartTime(Long)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessage_SuppressedStartTime()
	 * @model unique="false"
	 * @generated
	 */
	Long getSuppressedStartTime();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessage#getSuppressedStartTime <em>Suppressed Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppressed Start Time</em>' attribute.
	 * @see #getSuppressedStartTime()
	 * @generated
	 */
	void setSuppressedStartTime(Long value);

} // LogMessage
