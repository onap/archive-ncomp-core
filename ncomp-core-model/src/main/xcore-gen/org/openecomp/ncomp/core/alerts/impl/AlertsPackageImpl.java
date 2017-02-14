
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
package org.openecomp.ncomp.core.alerts.impl;

import org.openecomp.ncomp.core.CorePackage;

import org.openecomp.ncomp.core.alerts.Alert;
import org.openecomp.ncomp.core.alerts.AlertContainer;
import org.openecomp.ncomp.core.alerts.AlertingTemplate;
import org.openecomp.ncomp.core.alerts.AlertsFactory;
import org.openecomp.ncomp.core.alerts.AlertsPackage;
import org.openecomp.ncomp.core.alerts.DampingRule;
import org.openecomp.ncomp.core.alerts.MaxAlertPerInterval;
import org.openecomp.ncomp.core.alerts.ThresholdAlert;

import org.openecomp.ncomp.core.logs.LogsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class AlertsPackageImpl extends EPackageImpl implements AlertsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thresholdAlertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertingTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dampingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxAlertPerIntervalEClass = null;

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
	 * @see org.openecomp.ncomp.core.alerts.AlertsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlertsPackageImpl() {
		super(eNS_URI, AlertsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AlertsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlertsPackage init() {
		if (isInited) return (AlertsPackage)EPackage.Registry.INSTANCE.getEPackage(AlertsPackage.eNS_URI);

		// Obtain or create and register package
		AlertsPackageImpl theAlertsPackage = (AlertsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AlertsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AlertsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LogsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAlertsPackage.createPackageContents();

		// Initialize created meta-data
		theAlertsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlertsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlertsPackage.eNS_URI, theAlertsPackage);
		return theAlertsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlert() {
		return alertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlert_Severity() {
		return (EAttribute)alertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlert_DampingRule() {
		return (EReference)alertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlert_NumAlerts() {
		return (EAttribute)alertEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlert_NumAlertsSuppressed() {
		return (EAttribute)alertEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThresholdAlert() {
		return thresholdAlertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThresholdAlert_MetricName() {
		return (EAttribute)thresholdAlertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThresholdAlert_LowerBound() {
		return (EAttribute)thresholdAlertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThresholdAlert_UpperBound() {
		return (EAttribute)thresholdAlertEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThresholdAlert_Duration() {
		return (EAttribute)thresholdAlertEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThresholdAlert_MaxDelay() {
		return (EAttribute)thresholdAlertEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertContainer() {
		return alertContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlertContainer_Alerts() {
		return (EReference)alertContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlertContainer_AlertingTemplate() {
		return (EReference)alertContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlertingTemplate() {
		return alertingTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlertingTemplate_Alerts() {
		return (EReference)alertingTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDampingRule() {
		return dampingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxAlertPerInterval() {
		return maxAlertPerIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxAlertPerInterval_Interval() {
		return (EAttribute)maxAlertPerIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxAlertPerInterval_MaxAlerts() {
		return (EAttribute)maxAlertPerIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertsFactory getAlertsFactory() {
		return (AlertsFactory)getEFactoryInstance();
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
		alertEClass = createEClass(ALERT);
		createEAttribute(alertEClass, ALERT__SEVERITY);
		createEReference(alertEClass, ALERT__DAMPING_RULE);
		createEAttribute(alertEClass, ALERT__NUM_ALERTS);
		createEAttribute(alertEClass, ALERT__NUM_ALERTS_SUPPRESSED);

		thresholdAlertEClass = createEClass(THRESHOLD_ALERT);
		createEAttribute(thresholdAlertEClass, THRESHOLD_ALERT__METRIC_NAME);
		createEAttribute(thresholdAlertEClass, THRESHOLD_ALERT__LOWER_BOUND);
		createEAttribute(thresholdAlertEClass, THRESHOLD_ALERT__UPPER_BOUND);
		createEAttribute(thresholdAlertEClass, THRESHOLD_ALERT__DURATION);
		createEAttribute(thresholdAlertEClass, THRESHOLD_ALERT__MAX_DELAY);

		alertContainerEClass = createEClass(ALERT_CONTAINER);
		createEReference(alertContainerEClass, ALERT_CONTAINER__ALERTS);
		createEReference(alertContainerEClass, ALERT_CONTAINER__ALERTING_TEMPLATE);

		alertingTemplateEClass = createEClass(ALERTING_TEMPLATE);
		createEReference(alertingTemplateEClass, ALERTING_TEMPLATE__ALERTS);

		dampingRuleEClass = createEClass(DAMPING_RULE);

		maxAlertPerIntervalEClass = createEClass(MAX_ALERT_PER_INTERVAL);
		createEAttribute(maxAlertPerIntervalEClass, MAX_ALERT_PER_INTERVAL__INTERVAL);
		createEAttribute(maxAlertPerIntervalEClass, MAX_ALERT_PER_INTERVAL__MAX_ALERTS);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		LogsPackage theLogsPackage = (LogsPackage)EPackage.Registry.INSTANCE.getEPackage(LogsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		alertEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		alertEClass.getESuperTypes().add(theCorePackage.getHasOperationalState());
		thresholdAlertEClass.getESuperTypes().add(this.getAlert());
		alertingTemplateEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		maxAlertPerIntervalEClass.getESuperTypes().add(this.getDampingRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(alertEClass, Alert.class, "Alert", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlert_Severity(), theLogsPackage.getLogSeverity(), "severity", null, 0, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlert_DampingRule(), this.getDampingRule(), null, "dampingRule", null, 0, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlert_NumAlerts(), theCorePackage.getIncreasingULongMetricAttribute(), "numAlerts", null, 0, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlert_NumAlertsSuppressed(), theCorePackage.getIncreasingULongMetricAttribute(), "numAlertsSuppressed", null, 0, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thresholdAlertEClass, ThresholdAlert.class, "ThresholdAlert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThresholdAlert_MetricName(), theEcorePackage.getEString(), "metricName", null, 0, 1, ThresholdAlert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThresholdAlert_LowerBound(), theEcorePackage.getEDoubleObject(), "lowerBound", null, 0, 1, ThresholdAlert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThresholdAlert_UpperBound(), theEcorePackage.getEDoubleObject(), "upperBound", null, 0, 1, ThresholdAlert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThresholdAlert_Duration(), theEcorePackage.getEString(), "duration", null, 0, 1, ThresholdAlert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThresholdAlert_MaxDelay(), theEcorePackage.getEString(), "maxDelay", null, 0, 1, ThresholdAlert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alertContainerEClass, AlertContainer.class, "AlertContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlertContainer_Alerts(), this.getAlert(), null, "alerts", null, 0, -1, AlertContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlertContainer_AlertingTemplate(), this.getAlertingTemplate(), null, "alertingTemplate", null, 0, 1, AlertContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alertingTemplateEClass, AlertingTemplate.class, "AlertingTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlertingTemplate_Alerts(), this.getAlert(), null, "alerts", null, 0, -1, AlertingTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dampingRuleEClass, DampingRule.class, "DampingRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxAlertPerIntervalEClass, MaxAlertPerInterval.class, "MaxAlertPerInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxAlertPerInterval_Interval(), theEcorePackage.getEString(), "interval", null, 0, 1, MaxAlertPerInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaxAlertPerInterval_MaxAlerts(), theEcorePackage.getEInt(), "maxAlerts", "1", 0, 1, MaxAlertPerInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AlertsPackageImpl
