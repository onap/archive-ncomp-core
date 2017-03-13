
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
package org.openecomp.ncomp.core.logs.util;

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.core.logs.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.core.logs.LogsPackage
 * @generated
 */
public class LogsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogsSwitch() {
		if (modelPackage == null) {
			modelPackage = LogsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogsPackage.LOG_MESSAGE: {
				LogMessage logMessage = (LogMessage)theEObject;
				T result = caseLogMessage(logMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogsPackage.LOG_MESSAGE_RULE: {
				LogMessageRule logMessageRule = (LogMessageRule)theEObject;
				T result = caseLogMessageRule(logMessageRule);
				if (result == null) result = caseNamedEntity(logMessageRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogsPackage.LOG_MESSAGE_CONTAINER: {
				LogMessageContainer logMessageContainer = (LogMessageContainer)theEObject;
				T result = caseLogMessageContainer(logMessageContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogsPackage.LOG_MESSAGE_CONTAINER_CONFIGURATION: {
				LogMessageContainerConfiguration logMessageContainerConfiguration = (LogMessageContainerConfiguration)theEObject;
				T result = caseLogMessageContainerConfiguration(logMessageContainerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogsPackage.LOG_MESSAGE_CATEGORY: {
				LogMessageCategory logMessageCategory = (LogMessageCategory)theEObject;
				T result = caseLogMessageCategory(logMessageCategory);
				if (result == null) result = caseNamedEntity(logMessageCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogsPackage.LOG_MESSAGE_STATS: {
				LogMessageStats logMessageStats = (LogMessageStats)theEObject;
				T result = caseLogMessageStats(logMessageStats);
				if (result == null) result = caseNamedEntity(logMessageStats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogsPackage.LOG_MESSAGE_STATE: {
				LogMessageState logMessageState = (LogMessageState)theEObject;
				T result = caseLogMessageState(logMessageState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogsPackage.LOG_CONFIGURATION: {
				LogConfiguration logConfiguration = (LogConfiguration)theEObject;
				T result = caseLogConfiguration(logConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogsPackage.LOG_FILE: {
				LogFile logFile = (LogFile)theEObject;
				T result = caseLogFile(logFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogsPackage.LOG_PATTERN: {
				LogPattern logPattern = (LogPattern)theEObject;
				T result = caseLogPattern(logPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogMessage(LogMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Message Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogMessageRule(LogMessageRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Message Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Message Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogMessageContainer(LogMessageContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Message Container Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Message Container Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogMessageContainerConfiguration(LogMessageContainerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Message Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Message Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogMessageCategory(LogMessageCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Message Stats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Message Stats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogMessageStats(LogMessageStats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Message State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Message State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogMessageState(LogMessageState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogConfiguration(LogConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogFile(LogFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogPattern(LogPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LogsSwitch
