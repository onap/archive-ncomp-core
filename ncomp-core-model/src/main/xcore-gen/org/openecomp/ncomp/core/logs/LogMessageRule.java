
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

import org.openecomp.ncomp.core.function.Function;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Message Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageRule#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageRule#getMessageFilter <em>Message Filter</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageRule#getResourcePathFilter <em>Resource Path Filter</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageRule#getLevel <em>Level</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageRule#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageRule#getNewLevel <em>New Level</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageRule#getNewSeverity <em>New Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageRule#getNewCategory <em>New Category</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageRule#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.LogMessageRule#getUpdateFunction <em>Update Function</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageRule()
 * @model
 * @generated
 */
public interface LogMessageRule extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageRule_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Message Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Filter</em>' attribute.
	 * @see #setMessageFilter(String)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageRule_MessageFilter()
	 * @model unique="false"
	 * @generated
	 */
	String getMessageFilter();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getMessageFilter <em>Message Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Filter</em>' attribute.
	 * @see #getMessageFilter()
	 * @generated
	 */
	void setMessageFilter(String value);

	/**
	 * Returns the value of the '<em><b>Resource Path Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Path Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Path Filter</em>' attribute.
	 * @see #setResourcePathFilter(String)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageRule_ResourcePathFilter()
	 * @model unique="false"
	 * @generated
	 */
	String getResourcePathFilter();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getResourcePathFilter <em>Resource Path Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Path Filter</em>' attribute.
	 * @see #getResourcePathFilter()
	 * @generated
	 */
	void setResourcePathFilter(String value);

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
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageRule_Level()
	 * @model unique="false"
	 * @generated
	 */
	LogLevel getLevel();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getLevel <em>Level</em>}' attribute.
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
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageRule_Severity()
	 * @model unique="false"
	 * @generated
	 */
	LogSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(LogSeverity value);

	/**
	 * Returns the value of the '<em><b>New Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.core.logs.LogLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Level</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogLevel
	 * @see #setNewLevel(LogLevel)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageRule_NewLevel()
	 * @model unique="false"
	 * @generated
	 */
	LogLevel getNewLevel();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getNewLevel <em>New Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Level</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogLevel
	 * @see #getNewLevel()
	 * @generated
	 */
	void setNewLevel(LogLevel value);

	/**
	 * Returns the value of the '<em><b>New Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.core.logs.LogSeverity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Severity</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogSeverity
	 * @see #setNewSeverity(LogSeverity)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageRule_NewSeverity()
	 * @model unique="false"
	 * @generated
	 */
	LogSeverity getNewSeverity();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getNewSeverity <em>New Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Severity</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogSeverity
	 * @see #getNewSeverity()
	 * @generated
	 */
	void setNewSeverity(LogSeverity value);

	/**
	 * Returns the value of the '<em><b>New Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Category</em>' attribute.
	 * @see #setNewCategory(String)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageRule_NewCategory()
	 * @model unique="false"
	 * @generated
	 */
	String getNewCategory();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getNewCategory <em>New Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Category</em>' attribute.
	 * @see #getNewCategory()
	 * @generated
	 */
	void setNewCategory(String value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageRule_Disabled()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageRule#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Update Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Function</em>' reference.
	 * @see #setUpdateFunction(Function)
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#getLogMessageRule_UpdateFunction()
	 * @model
	 * @generated
	 */
	Function getUpdateFunction();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.logs.LogMessageRule#getUpdateFunction <em>Update Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Function</em>' reference.
	 * @see #getUpdateFunction()
	 * @generated
	 */
	void setUpdateFunction(Function value);

} // LogMessageRule
