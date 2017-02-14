
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
package org.openecomp.ncomp.core.metrics.impl;

import org.openecomp.ncomp.core.CorePackage;

import org.openecomp.ncomp.core.metrics.AggregationMetricValueOption;
import org.openecomp.ncomp.core.metrics.AggregationMetricValueOptionType;
import org.openecomp.ncomp.core.metrics.BasicDoubleMetric;
import org.openecomp.ncomp.core.metrics.BasicIncreasingULongMetric;
import org.openecomp.ncomp.core.metrics.BasicLongMetric;
import org.openecomp.ncomp.core.metrics.BasicMetric;
import org.openecomp.ncomp.core.metrics.BasicMetricValueOption;
import org.openecomp.ncomp.core.metrics.BasicMetrics;
import org.openecomp.ncomp.core.metrics.DoubleMetric;
import org.openecomp.ncomp.core.metrics.LongMetric;
import org.openecomp.ncomp.core.metrics.Metric;
import org.openecomp.ncomp.core.metrics.MetricValueOption;
import org.openecomp.ncomp.core.metrics.MetricsContainer;
import org.openecomp.ncomp.core.metrics.MetricsFactory;
import org.openecomp.ncomp.core.metrics.MetricsPackage;
import org.openecomp.ncomp.core.metrics.SequenceMetricValueOption;

import org.openecomp.ncomp.core.metrics.StringMetric;
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
public class MetricsPackageImpl extends EPackageImpl implements MetricsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricValueOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationMetricValueOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicMetricValueOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceMetricValueOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicMetricsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicIncreasingULongMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicLongMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicDoubleMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationMetricValueOptionTypeEEnum = null;

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
	 * @see org.openecomp.ncomp.core.metrics.MetricsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetricsPackageImpl() {
		super(eNS_URI, MetricsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MetricsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetricsPackage init() {
		if (isInited) return (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Obtain or create and register package
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetricsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetricsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetricsPackage.eNS_URI, theMetricsPackage);
		return theMetricsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Time() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_ResourceName() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_MetricName() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleMetric() {
		return doubleMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleMetric_Value() {
		return (EAttribute)doubleMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongMetric() {
		return longMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongMetric_Increasing() {
		return (EAttribute)longMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongMetric_Delta() {
		return (EAttribute)longMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongMetric_Value() {
		return (EAttribute)longMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringMetric() {
		return stringMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringMetric_Value() {
		return (EAttribute)stringMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricValueOption() {
		return metricValueOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationMetricValueOption() {
		return aggregationMetricValueOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationMetricValueOption_Duration() {
		return (EAttribute)aggregationMetricValueOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationMetricValueOption_AggregationType() {
		return (EAttribute)aggregationMetricValueOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicMetricValueOption() {
		return basicMetricValueOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceMetricValueOption() {
		return sequenceMetricValueOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceMetricValueOption_Options() {
		return (EReference)sequenceMetricValueOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricsContainer() {
		return metricsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicMetrics() {
		return basicMetricsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicMetrics_Metrics() {
		return (EReference)basicMetricsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicMetric() {
		return basicMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicIncreasingULongMetric() {
		return basicIncreasingULongMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicIncreasingULongMetric_Value() {
		return (EAttribute)basicIncreasingULongMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicLongMetric() {
		return basicLongMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicLongMetric_Value() {
		return (EAttribute)basicLongMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicDoubleMetric() {
		return basicDoubleMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicDoubleMetric_Value() {
		return (EAttribute)basicDoubleMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationMetricValueOptionType() {
		return aggregationMetricValueOptionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactory getMetricsFactory() {
		return (MetricsFactory)getEFactoryInstance();
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
		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__TIME);
		createEAttribute(metricEClass, METRIC__RESOURCE_NAME);
		createEAttribute(metricEClass, METRIC__METRIC_NAME);

		doubleMetricEClass = createEClass(DOUBLE_METRIC);
		createEAttribute(doubleMetricEClass, DOUBLE_METRIC__VALUE);

		longMetricEClass = createEClass(LONG_METRIC);
		createEAttribute(longMetricEClass, LONG_METRIC__INCREASING);
		createEAttribute(longMetricEClass, LONG_METRIC__DELTA);
		createEAttribute(longMetricEClass, LONG_METRIC__VALUE);

		stringMetricEClass = createEClass(STRING_METRIC);
		createEAttribute(stringMetricEClass, STRING_METRIC__VALUE);

		metricValueOptionEClass = createEClass(METRIC_VALUE_OPTION);

		aggregationMetricValueOptionEClass = createEClass(AGGREGATION_METRIC_VALUE_OPTION);
		createEAttribute(aggregationMetricValueOptionEClass, AGGREGATION_METRIC_VALUE_OPTION__DURATION);
		createEAttribute(aggregationMetricValueOptionEClass, AGGREGATION_METRIC_VALUE_OPTION__AGGREGATION_TYPE);

		basicMetricValueOptionEClass = createEClass(BASIC_METRIC_VALUE_OPTION);

		sequenceMetricValueOptionEClass = createEClass(SEQUENCE_METRIC_VALUE_OPTION);
		createEReference(sequenceMetricValueOptionEClass, SEQUENCE_METRIC_VALUE_OPTION__OPTIONS);

		metricsContainerEClass = createEClass(METRICS_CONTAINER);

		basicMetricsEClass = createEClass(BASIC_METRICS);
		createEReference(basicMetricsEClass, BASIC_METRICS__METRICS);

		basicMetricEClass = createEClass(BASIC_METRIC);

		basicIncreasingULongMetricEClass = createEClass(BASIC_INCREASING_ULONG_METRIC);
		createEAttribute(basicIncreasingULongMetricEClass, BASIC_INCREASING_ULONG_METRIC__VALUE);

		basicLongMetricEClass = createEClass(BASIC_LONG_METRIC);
		createEAttribute(basicLongMetricEClass, BASIC_LONG_METRIC__VALUE);

		basicDoubleMetricEClass = createEClass(BASIC_DOUBLE_METRIC);
		createEAttribute(basicDoubleMetricEClass, BASIC_DOUBLE_METRIC__VALUE);

		// Create enums
		aggregationMetricValueOptionTypeEEnum = createEEnum(AGGREGATION_METRIC_VALUE_OPTION_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		doubleMetricEClass.getESuperTypes().add(this.getMetric());
		longMetricEClass.getESuperTypes().add(this.getMetric());
		stringMetricEClass.getESuperTypes().add(this.getMetric());
		metricValueOptionEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		aggregationMetricValueOptionEClass.getESuperTypes().add(this.getMetricValueOption());
		basicMetricValueOptionEClass.getESuperTypes().add(this.getMetricValueOption());
		sequenceMetricValueOptionEClass.getESuperTypes().add(this.getMetricValueOption());
		basicMetricsEClass.getESuperTypes().add(this.getMetricsContainer());
		basicMetricEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		basicIncreasingULongMetricEClass.getESuperTypes().add(this.getBasicMetric());
		basicLongMetricEClass.getESuperTypes().add(this.getBasicMetric());
		basicDoubleMetricEClass.getESuperTypes().add(this.getBasicMetric());

		// Initialize classes, features, and operations; add parameters
		initEClass(metricEClass, Metric.class, "Metric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Time(), theEcorePackage.getELong(), "time", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_ResourceName(), theEcorePackage.getEString(), "resourceName", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_MetricName(), theEcorePackage.getEString(), "metricName", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleMetricEClass, DoubleMetric.class, "DoubleMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleMetric_Value(), theEcorePackage.getEDouble(), "value", null, 0, 1, DoubleMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longMetricEClass, LongMetric.class, "LongMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongMetric_Increasing(), theEcorePackage.getEBoolean(), "increasing", "false", 0, 1, LongMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongMetric_Delta(), theEcorePackage.getEBoolean(), "delta", "false", 0, 1, LongMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongMetric_Value(), theEcorePackage.getELong(), "value", null, 0, 1, LongMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringMetricEClass, StringMetric.class, "StringMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringMetric_Value(), theEcorePackage.getEString(), "value", null, 0, 1, StringMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricValueOptionEClass, MetricValueOption.class, "MetricValueOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregationMetricValueOptionEClass, AggregationMetricValueOption.class, "AggregationMetricValueOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregationMetricValueOption_Duration(), theEcorePackage.getEString(), "duration", null, 0, 1, AggregationMetricValueOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregationMetricValueOption_AggregationType(), this.getAggregationMetricValueOptionType(), "aggregationType", null, 0, 1, AggregationMetricValueOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicMetricValueOptionEClass, BasicMetricValueOption.class, "BasicMetricValueOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceMetricValueOptionEClass, SequenceMetricValueOption.class, "SequenceMetricValueOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceMetricValueOption_Options(), this.getMetricValueOption(), null, "options", null, 0, -1, SequenceMetricValueOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricsContainerEClass, MetricsContainer.class, "MetricsContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicMetricsEClass, BasicMetrics.class, "BasicMetrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicMetrics_Metrics(), this.getBasicMetric(), null, "metrics", null, 0, -1, BasicMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicMetricEClass, BasicMetric.class, "BasicMetric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicIncreasingULongMetricEClass, BasicIncreasingULongMetric.class, "BasicIncreasingULongMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicIncreasingULongMetric_Value(), theCorePackage.getIncreasingULongMetricAttribute(), "value", null, 0, 1, BasicIncreasingULongMetric.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicLongMetricEClass, BasicLongMetric.class, "BasicLongMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicLongMetric_Value(), theCorePackage.getLongMetricAttribute(), "value", null, 0, 1, BasicLongMetric.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicDoubleMetricEClass, BasicDoubleMetric.class, "BasicDoubleMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicDoubleMetric_Value(), theCorePackage.getDoubleMetricAttribute(), "value", null, 0, 1, BasicDoubleMetric.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aggregationMetricValueOptionTypeEEnum, AggregationMetricValueOptionType.class, "AggregationMetricValueOptionType");
		addEEnumLiteral(aggregationMetricValueOptionTypeEEnum, AggregationMetricValueOptionType.SUM);
		addEEnumLiteral(aggregationMetricValueOptionTypeEEnum, AggregationMetricValueOptionType.AVERAGE);
		addEEnumLiteral(aggregationMetricValueOptionTypeEEnum, AggregationMetricValueOptionType.COUNT);
		addEEnumLiteral(aggregationMetricValueOptionTypeEEnum, AggregationMetricValueOptionType.MAX);
		addEEnumLiteral(aggregationMetricValueOptionTypeEEnum, AggregationMetricValueOptionType.MIN);

		// Create resource
		createResource(eNS_URI);
	}

} //MetricsPackageImpl
