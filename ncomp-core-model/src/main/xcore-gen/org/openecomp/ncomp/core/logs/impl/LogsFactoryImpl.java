
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
package org.openecomp.ncomp.core.logs.impl;

import org.openecomp.ncomp.core.logs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogsFactoryImpl extends EFactoryImpl implements LogsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogsFactory init() {
		try {
			LogsFactory theLogsFactory = (LogsFactory)EPackage.Registry.INSTANCE.getEFactory(LogsPackage.eNS_URI);
			if (theLogsFactory != null) {
				return theLogsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogsPackage.LOG_MESSAGE: return createLogMessage();
			case LogsPackage.LOG_MESSAGE_RULE: return createLogMessageRule();
			case LogsPackage.LOG_MESSAGE_CONTAINER_CONFIGURATION: return createLogMessageContainerConfiguration();
			case LogsPackage.LOG_MESSAGE_CATEGORY: return createLogMessageCategory();
			case LogsPackage.LOG_MESSAGE_STATS: return createLogMessageStats();
			case LogsPackage.LOG_MESSAGE_STATE: return createLogMessageState();
			case LogsPackage.LOG_CONFIGURATION: return createLogConfiguration();
			case LogsPackage.LOG_FILE: return createLogFile();
			case LogsPackage.LOG_PATTERN: return createLogPattern();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LogsPackage.LOG_LEVEL:
				return createLogLevelFromString(eDataType, initialValue);
			case LogsPackage.LOG_SEVERITY:
				return createLogSeverityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LogsPackage.LOG_LEVEL:
				return convertLogLevelToString(eDataType, instanceValue);
			case LogsPackage.LOG_SEVERITY:
				return convertLogSeverityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMessage createLogMessage() {
		LogMessageImpl logMessage = new LogMessageImpl();
		return logMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMessageRule createLogMessageRule() {
		LogMessageRuleImpl logMessageRule = new LogMessageRuleImpl();
		return logMessageRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMessageContainerConfiguration createLogMessageContainerConfiguration() {
		LogMessageContainerConfigurationImpl logMessageContainerConfiguration = new LogMessageContainerConfigurationImpl();
		return logMessageContainerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMessageCategory createLogMessageCategory() {
		LogMessageCategoryImpl logMessageCategory = new LogMessageCategoryImpl();
		return logMessageCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMessageStats createLogMessageStats() {
		LogMessageStatsImpl logMessageStats = new LogMessageStatsImpl();
		return logMessageStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMessageState createLogMessageState() {
		LogMessageStateImpl logMessageState = new LogMessageStateImpl();
		return logMessageState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogConfiguration createLogConfiguration() {
		LogConfigurationImpl logConfiguration = new LogConfigurationImpl();
		return logConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogFile createLogFile() {
		LogFileImpl logFile = new LogFileImpl();
		return logFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogPattern createLogPattern() {
		LogPatternImpl logPattern = new LogPatternImpl();
		return logPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogLevel createLogLevelFromString(EDataType eDataType, String initialValue) {
		LogLevel result = LogLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogSeverity createLogSeverityFromString(EDataType eDataType, String initialValue) {
		LogSeverity result = LogSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogsPackage getLogsPackage() {
		return (LogsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogsPackage getPackage() {
		return LogsPackage.eINSTANCE;
	}

} //LogsFactoryImpl
