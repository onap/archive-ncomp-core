
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.core.logs.LogsPackage
 * @generated
 */
public interface LogsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogsFactory eINSTANCE = org.openecomp.ncomp.core.logs.impl.LogsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Log Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Message</em>'.
	 * @generated
	 */
	LogMessage createLogMessage();

	/**
	 * Returns a new object of class '<em>Log Message Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Message Rule</em>'.
	 * @generated
	 */
	LogMessageRule createLogMessageRule();

	/**
	 * Returns a new object of class '<em>Log Message Container Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Message Container Configuration</em>'.
	 * @generated
	 */
	LogMessageContainerConfiguration createLogMessageContainerConfiguration();

	/**
	 * Returns a new object of class '<em>Log Message Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Message Category</em>'.
	 * @generated
	 */
	LogMessageCategory createLogMessageCategory();

	/**
	 * Returns a new object of class '<em>Log Message Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Message Stats</em>'.
	 * @generated
	 */
	LogMessageStats createLogMessageStats();

	/**
	 * Returns a new object of class '<em>Log Message State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Message State</em>'.
	 * @generated
	 */
	LogMessageState createLogMessageState();

	/**
	 * Returns a new object of class '<em>Log Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Configuration</em>'.
	 * @generated
	 */
	LogConfiguration createLogConfiguration();

	/**
	 * Returns a new object of class '<em>Log File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log File</em>'.
	 * @generated
	 */
	LogFile createLogFile();

	/**
	 * Returns a new object of class '<em>Log Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Pattern</em>'.
	 * @generated
	 */
	LogPattern createLogPattern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogsPackage getLogsPackage();

} //LogsFactory
