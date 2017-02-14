
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

import org.openecomp.ncomp.core.CorePackage;

import org.openecomp.ncomp.core.function.FunctionPackage;

import org.openecomp.ncomp.core.logs.LogConfiguration;
import org.openecomp.ncomp.core.logs.LogFile;
import org.openecomp.ncomp.core.logs.LogLevel;
import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.core.logs.LogMessageCategory;
import org.openecomp.ncomp.core.logs.LogMessageContainer;
import org.openecomp.ncomp.core.logs.LogMessageContainerConfiguration;
import org.openecomp.ncomp.core.logs.LogMessageRule;
import org.openecomp.ncomp.core.logs.LogMessageState;
import org.openecomp.ncomp.core.logs.LogMessageStats;
import org.openecomp.ncomp.core.logs.LogPattern;
import org.openecomp.ncomp.core.logs.LogSeverity;
import org.openecomp.ncomp.core.logs.LogsFactory;
import org.openecomp.ncomp.core.logs.LogsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogsPackageImpl extends EPackageImpl implements LogsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logMessageRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logMessageContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logMessageContainerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logMessageCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logMessageStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logMessageStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logSeverityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.ncomp.core.logs.LogsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogsPackageImpl() {
		super(eNS_URI, LogsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LogsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogsPackage init() {
		if (isInited) return (LogsPackage)EPackage.Registry.INSTANCE.getEPackage(LogsPackage.eNS_URI);

		// Obtain or create and register package
		LogsPackageImpl theLogsPackage = (LogsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FunctionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLogsPackage.createPackageContents();

		// Initialize created meta-data
		theLogsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogsPackage.eNS_URI, theLogsPackage);
		return theLogsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogMessage() {
		return logMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_Time() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_ResourceName() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_Severity() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_Level() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_Message() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_Category() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_NumberOfSuppressed() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessage_SuppressedStartTime() {
		return (EAttribute)logMessageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogMessageRule() {
		return logMessageRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageRule_Description() {
		return (EAttribute)logMessageRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageRule_MessageFilter() {
		return (EAttribute)logMessageRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageRule_ResourcePathFilter() {
		return (EAttribute)logMessageRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageRule_Level() {
		return (EAttribute)logMessageRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageRule_Severity() {
		return (EAttribute)logMessageRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageRule_NewLevel() {
		return (EAttribute)logMessageRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageRule_NewSeverity() {
		return (EAttribute)logMessageRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageRule_NewCategory() {
		return (EAttribute)logMessageRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageRule_Disabled() {
		return (EAttribute)logMessageRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogMessageRule_UpdateFunction() {
		return (EReference)logMessageRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogMessageContainer() {
		return logMessageContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogMessageContainer_LogMessageConfiguration() {
		return (EReference)logMessageContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogMessageContainer_LogMessageCategories() {
		return (EReference)logMessageContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogMessageContainer_LogMessageStats() {
		return (EReference)logMessageContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogMessageContainerConfiguration() {
		return logMessageContainerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogMessageCategory() {
		return logMessageCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogMessageCategory_Stats() {
		return (EReference)logMessageCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogMessageStats() {
		return logMessageStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageStats_Level() {
		return (EAttribute)logMessageStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageStats_Severity() {
		return (EAttribute)logMessageStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageStats_Count() {
		return (EAttribute)logMessageStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogMessageState() {
		return logMessageStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogMessageState_Suspended() {
		return (EAttribute)logMessageStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogMessageState_Log() {
		return (EReference)logMessageStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogMessageState_Category() {
		return (EReference)logMessageStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogConfiguration() {
		return logConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogConfiguration_Files() {
		return (EReference)logConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogFile() {
		return logFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogFile_Filename() {
		return (EAttribute)logFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogFile_Patterns() {
		return (EReference)logFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogPattern() {
		return logPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogPattern_Pattern() {
		return (EAttribute)logPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogPattern_Message() {
		return (EAttribute)logPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogPattern_Level() {
		return (EAttribute)logPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogPattern_Severity() {
		return (EAttribute)logPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogPattern_Path() {
		return (EAttribute)logPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogLevel() {
		return logLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogSeverity() {
		return logSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogsFactory getLogsFactory() {
		return (LogsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		logMessageEClass = createEClass(LOG_MESSAGE);
		createEAttribute(logMessageEClass, LOG_MESSAGE__TIME);
		createEAttribute(logMessageEClass, LOG_MESSAGE__RESOURCE_NAME);
		createEAttribute(logMessageEClass, LOG_MESSAGE__SEVERITY);
		createEAttribute(logMessageEClass, LOG_MESSAGE__LEVEL);
		createEAttribute(logMessageEClass, LOG_MESSAGE__MESSAGE);
		createEAttribute(logMessageEClass, LOG_MESSAGE__CATEGORY);
		createEAttribute(logMessageEClass, LOG_MESSAGE__NUMBER_OF_SUPPRESSED);
		createEAttribute(logMessageEClass, LOG_MESSAGE__SUPPRESSED_START_TIME);

		logMessageRuleEClass = createEClass(LOG_MESSAGE_RULE);
		createEAttribute(logMessageRuleEClass, LOG_MESSAGE_RULE__DESCRIPTION);
		createEAttribute(logMessageRuleEClass, LOG_MESSAGE_RULE__MESSAGE_FILTER);
		createEAttribute(logMessageRuleEClass, LOG_MESSAGE_RULE__RESOURCE_PATH_FILTER);
		createEAttribute(logMessageRuleEClass, LOG_MESSAGE_RULE__LEVEL);
		createEAttribute(logMessageRuleEClass, LOG_MESSAGE_RULE__SEVERITY);
		createEAttribute(logMessageRuleEClass, LOG_MESSAGE_RULE__NEW_LEVEL);
		createEAttribute(logMessageRuleEClass, LOG_MESSAGE_RULE__NEW_SEVERITY);
		createEAttribute(logMessageRuleEClass, LOG_MESSAGE_RULE__NEW_CATEGORY);
		createEAttribute(logMessageRuleEClass, LOG_MESSAGE_RULE__DISABLED);
		createEReference(logMessageRuleEClass, LOG_MESSAGE_RULE__UPDATE_FUNCTION);

		logMessageContainerEClass = createEClass(LOG_MESSAGE_CONTAINER);
		createEReference(logMessageContainerEClass, LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION);
		createEReference(logMessageContainerEClass, LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CATEGORIES);
		createEReference(logMessageContainerEClass, LOG_MESSAGE_CONTAINER__LOG_MESSAGE_STATS);

		logMessageContainerConfigurationEClass = createEClass(LOG_MESSAGE_CONTAINER_CONFIGURATION);

		logMessageCategoryEClass = createEClass(LOG_MESSAGE_CATEGORY);
		createEReference(logMessageCategoryEClass, LOG_MESSAGE_CATEGORY__STATS);

		logMessageStatsEClass = createEClass(LOG_MESSAGE_STATS);
		createEAttribute(logMessageStatsEClass, LOG_MESSAGE_STATS__LEVEL);
		createEAttribute(logMessageStatsEClass, LOG_MESSAGE_STATS__SEVERITY);
		createEAttribute(logMessageStatsEClass, LOG_MESSAGE_STATS__COUNT);

		logMessageStateEClass = createEClass(LOG_MESSAGE_STATE);
		createEAttribute(logMessageStateEClass, LOG_MESSAGE_STATE__SUSPENDED);
		createEReference(logMessageStateEClass, LOG_MESSAGE_STATE__LOG);
		createEReference(logMessageStateEClass, LOG_MESSAGE_STATE__CATEGORY);

		logConfigurationEClass = createEClass(LOG_CONFIGURATION);
		createEReference(logConfigurationEClass, LOG_CONFIGURATION__FILES);

		logFileEClass = createEClass(LOG_FILE);
		createEAttribute(logFileEClass, LOG_FILE__FILENAME);
		createEReference(logFileEClass, LOG_FILE__PATTERNS);

		logPatternEClass = createEClass(LOG_PATTERN);
		createEAttribute(logPatternEClass, LOG_PATTERN__PATTERN);
		createEAttribute(logPatternEClass, LOG_PATTERN__MESSAGE);
		createEAttribute(logPatternEClass, LOG_PATTERN__LEVEL);
		createEAttribute(logPatternEClass, LOG_PATTERN__SEVERITY);
		createEAttribute(logPatternEClass, LOG_PATTERN__PATH);

		// Create enums
		logLevelEEnum = createEEnum(LOG_LEVEL);
		logSeverityEEnum = createEEnum(LOG_SEVERITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		FunctionPackage theFunctionPackage = (FunctionPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		logMessageRuleEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		logMessageCategoryEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		logMessageStatsEClass.getESuperTypes().add(theCorePackage.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(logMessageEClass, LogMessage.class, "LogMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogMessage_Time(), theEcorePackage.getELong(), "time", null, 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessage_ResourceName(), theEcorePackage.getEString(), "resourceName", null, 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessage_Severity(), this.getLogSeverity(), "severity", null, 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessage_Level(), this.getLogLevel(), "level", null, 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessage_Message(), theEcorePackage.getEString(), "message", null, 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessage_Category(), theEcorePackage.getEString(), "category", null, 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessage_NumberOfSuppressed(), theEcorePackage.getEInt(), "numberOfSuppressed", "0", 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessage_SuppressedStartTime(), theEcorePackage.getELongObject(), "suppressedStartTime", null, 0, 1, LogMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logMessageRuleEClass, LogMessageRule.class, "LogMessageRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogMessageRule_Description(), theEcorePackage.getEString(), "description", null, 0, 1, LogMessageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessageRule_MessageFilter(), theEcorePackage.getEString(), "messageFilter", null, 0, 1, LogMessageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessageRule_ResourcePathFilter(), theEcorePackage.getEString(), "resourcePathFilter", null, 0, 1, LogMessageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessageRule_Level(), this.getLogLevel(), "level", null, 0, 1, LogMessageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessageRule_Severity(), this.getLogSeverity(), "severity", null, 0, 1, LogMessageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessageRule_NewLevel(), this.getLogLevel(), "newLevel", null, 0, 1, LogMessageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessageRule_NewSeverity(), this.getLogSeverity(), "newSeverity", null, 0, 1, LogMessageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessageRule_NewCategory(), theEcorePackage.getEString(), "newCategory", null, 0, 1, LogMessageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessageRule_Disabled(), theEcorePackage.getEBoolean(), "disabled", "false", 0, 1, LogMessageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogMessageRule_UpdateFunction(), theFunctionPackage.getFunction(), null, "updateFunction", null, 0, 1, LogMessageRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logMessageContainerEClass, LogMessageContainer.class, "LogMessageContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogMessageContainer_LogMessageConfiguration(), this.getLogMessageContainerConfiguration(), null, "logMessageConfiguration", null, 0, 1, LogMessageContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogMessageContainer_LogMessageCategories(), this.getLogMessageCategory(), null, "logMessageCategories", null, 0, -1, LogMessageContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogMessageContainer_LogMessageStats(), this.getLogMessageStats(), null, "logMessageStats", null, 0, -1, LogMessageContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logMessageContainerConfigurationEClass, LogMessageContainerConfiguration.class, "LogMessageContainerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logMessageCategoryEClass, LogMessageCategory.class, "LogMessageCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogMessageCategory_Stats(), this.getLogMessageStats(), null, "stats", null, 0, -1, LogMessageCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logMessageStatsEClass, LogMessageStats.class, "LogMessageStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogMessageStats_Level(), this.getLogLevel(), "level", null, 0, 1, LogMessageStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessageStats_Severity(), this.getLogSeverity(), "severity", null, 0, 1, LogMessageStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogMessageStats_Count(), theCorePackage.getIncreasingULongMetricAttribute(), "count", null, 0, 1, LogMessageStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logMessageStateEClass, LogMessageState.class, "LogMessageState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogMessageState_Suspended(), theEcorePackage.getEBoolean(), "suspended", null, 0, 1, LogMessageState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogMessageState_Log(), this.getLogMessage(), null, "log", null, 0, 1, LogMessageState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogMessageState_Category(), this.getLogMessageCategory(), null, "category", null, 0, 1, LogMessageState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logConfigurationEClass, LogConfiguration.class, "LogConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogConfiguration_Files(), this.getLogFile(), null, "files", null, 0, -1, LogConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logFileEClass, LogFile.class, "LogFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogFile_Filename(), theEcorePackage.getEString(), "filename", null, 0, 1, LogFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogFile_Patterns(), this.getLogPattern(), null, "patterns", null, 0, -1, LogFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logPatternEClass, LogPattern.class, "LogPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogPattern_Pattern(), theEcorePackage.getEString(), "pattern", null, 0, 1, LogPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogPattern_Message(), theEcorePackage.getEString(), "message", null, 0, 1, LogPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogPattern_Level(), theEcorePackage.getEString(), "level", null, 0, 1, LogPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogPattern_Severity(), theEcorePackage.getEString(), "severity", null, 0, 1, LogPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogPattern_Path(), theEcorePackage.getEString(), "path", null, 0, 1, LogPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(logLevelEEnum, LogLevel.class, "LogLevel");
		addEEnumLiteral(logLevelEEnum, LogLevel.UNKNOWN);
		addEEnumLiteral(logLevelEEnum, LogLevel.TRACE);
		addEEnumLiteral(logLevelEEnum, LogLevel.DEBUG);
		addEEnumLiteral(logLevelEEnum, LogLevel.INFO);
		addEEnumLiteral(logLevelEEnum, LogLevel.WARN);
		addEEnumLiteral(logLevelEEnum, LogLevel.ERROR);
		addEEnumLiteral(logLevelEEnum, LogLevel.FATAL);

		initEEnum(logSeverityEEnum, LogSeverity.class, "LogSeverity");
		addEEnumLiteral(logSeverityEEnum, LogSeverity.UNKNOWN);
		addEEnumLiteral(logSeverityEEnum, LogSeverity.SEV1);
		addEEnumLiteral(logSeverityEEnum, LogSeverity.SEV2);
		addEEnumLiteral(logSeverityEEnum, LogSeverity.SEV3);
		addEEnumLiteral(logSeverityEEnum, LogSeverity.SEV4);

		// Create resource
		createResource(eNS_URI);
	}

} //LogsPackageImpl
