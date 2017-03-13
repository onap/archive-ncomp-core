
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
package org.openecomp.ncomp.core.metrics;

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
 * @see org.openecomp.ncomp.core.metrics.MetricsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-core-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.core'"
 * @generated
 */
public interface MetricsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metrics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.core.metrics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metrics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsPackage eINSTANCE = org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__TIME = 0;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__RESOURCE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Metric Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__METRIC_NAME = 2;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.DoubleMetricImpl <em>Double Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.DoubleMetricImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getDoubleMetric()
	 * @generated
	 */
	int DOUBLE_METRIC = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METRIC__TIME = METRIC__TIME;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METRIC__RESOURCE_NAME = METRIC__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Metric Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METRIC__METRIC_NAME = METRIC__METRIC_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METRIC__VALUE = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METRIC_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.LongMetricImpl <em>Long Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.LongMetricImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getLongMetric()
	 * @generated
	 */
	int LONG_METRIC = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_METRIC__TIME = METRIC__TIME;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_METRIC__RESOURCE_NAME = METRIC__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Metric Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_METRIC__METRIC_NAME = METRIC__METRIC_NAME;

	/**
	 * The feature id for the '<em><b>Increasing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_METRIC__INCREASING = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_METRIC__DELTA = METRIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_METRIC__VALUE = METRIC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Long Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Long Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_METRIC_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.StringMetricImpl <em>String Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.StringMetricImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getStringMetric()
	 * @generated
	 */
	int STRING_METRIC = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METRIC__TIME = METRIC__TIME;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METRIC__RESOURCE_NAME = METRIC__RESOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Metric Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METRIC__METRIC_NAME = METRIC__METRIC_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METRIC__VALUE = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METRIC_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.MetricValueOptionImpl <em>Metric Value Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricValueOptionImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getMetricValueOption()
	 * @generated
	 */
	int METRIC_VALUE_OPTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_VALUE_OPTION__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_VALUE_OPTION__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_VALUE_OPTION__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_VALUE_OPTION__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Metric Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_VALUE_OPTION_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Metric Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_VALUE_OPTION_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.AggregationMetricValueOptionImpl <em>Aggregation Metric Value Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.AggregationMetricValueOptionImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getAggregationMetricValueOption()
	 * @generated
	 */
	int AGGREGATION_METRIC_VALUE_OPTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_METRIC_VALUE_OPTION__NAME = METRIC_VALUE_OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_METRIC_VALUE_OPTION__LAST_POLLED = METRIC_VALUE_OPTION__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_METRIC_VALUE_OPTION__LAST_CHANGED = METRIC_VALUE_OPTION__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_METRIC_VALUE_OPTION__CREATED = METRIC_VALUE_OPTION__CREATED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_METRIC_VALUE_OPTION__DURATION = METRIC_VALUE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_METRIC_VALUE_OPTION__AGGREGATION_TYPE = METRIC_VALUE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregation Metric Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_METRIC_VALUE_OPTION_FEATURE_COUNT = METRIC_VALUE_OPTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aggregation Metric Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_METRIC_VALUE_OPTION_OPERATION_COUNT = METRIC_VALUE_OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicMetricValueOptionImpl <em>Basic Metric Value Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.BasicMetricValueOptionImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicMetricValueOption()
	 * @generated
	 */
	int BASIC_METRIC_VALUE_OPTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC_VALUE_OPTION__NAME = METRIC_VALUE_OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC_VALUE_OPTION__LAST_POLLED = METRIC_VALUE_OPTION__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC_VALUE_OPTION__LAST_CHANGED = METRIC_VALUE_OPTION__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC_VALUE_OPTION__CREATED = METRIC_VALUE_OPTION__CREATED;

	/**
	 * The number of structural features of the '<em>Basic Metric Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC_VALUE_OPTION_FEATURE_COUNT = METRIC_VALUE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Metric Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC_VALUE_OPTION_OPERATION_COUNT = METRIC_VALUE_OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.SequenceMetricValueOptionImpl <em>Sequence Metric Value Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.SequenceMetricValueOptionImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getSequenceMetricValueOption()
	 * @generated
	 */
	int SEQUENCE_METRIC_VALUE_OPTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_METRIC_VALUE_OPTION__NAME = METRIC_VALUE_OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_METRIC_VALUE_OPTION__LAST_POLLED = METRIC_VALUE_OPTION__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_METRIC_VALUE_OPTION__LAST_CHANGED = METRIC_VALUE_OPTION__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_METRIC_VALUE_OPTION__CREATED = METRIC_VALUE_OPTION__CREATED;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_METRIC_VALUE_OPTION__OPTIONS = METRIC_VALUE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Metric Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_METRIC_VALUE_OPTION_FEATURE_COUNT = METRIC_VALUE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence Metric Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_METRIC_VALUE_OPTION_OPERATION_COUNT = METRIC_VALUE_OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.MetricsContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsContainerImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getMetricsContainer()
	 * @generated
	 */
	int METRICS_CONTAINER = 8;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicMetricsImpl <em>Basic Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.BasicMetricsImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicMetrics()
	 * @generated
	 */
	int BASIC_METRICS = 9;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRICS__METRICS = METRICS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRICS_FEATURE_COUNT = METRICS_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRICS_OPERATION_COUNT = METRICS_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicMetricImpl <em>Basic Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.BasicMetricImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicMetric()
	 * @generated
	 */
	int BASIC_METRIC = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Basic Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_METRIC_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicIncreasingULongMetricImpl <em>Basic Increasing ULong Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.BasicIncreasingULongMetricImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicIncreasingULongMetric()
	 * @generated
	 */
	int BASIC_INCREASING_ULONG_METRIC = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INCREASING_ULONG_METRIC__NAME = BASIC_METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INCREASING_ULONG_METRIC__LAST_POLLED = BASIC_METRIC__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INCREASING_ULONG_METRIC__LAST_CHANGED = BASIC_METRIC__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INCREASING_ULONG_METRIC__CREATED = BASIC_METRIC__CREATED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INCREASING_ULONG_METRIC__VALUE = BASIC_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Increasing ULong Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INCREASING_ULONG_METRIC_FEATURE_COUNT = BASIC_METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Increasing ULong Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_INCREASING_ULONG_METRIC_OPERATION_COUNT = BASIC_METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicLongMetricImpl <em>Basic Long Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.BasicLongMetricImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicLongMetric()
	 * @generated
	 */
	int BASIC_LONG_METRIC = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LONG_METRIC__NAME = BASIC_METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LONG_METRIC__LAST_POLLED = BASIC_METRIC__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LONG_METRIC__LAST_CHANGED = BASIC_METRIC__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LONG_METRIC__CREATED = BASIC_METRIC__CREATED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LONG_METRIC__VALUE = BASIC_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Long Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LONG_METRIC_FEATURE_COUNT = BASIC_METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Long Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LONG_METRIC_OPERATION_COUNT = BASIC_METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicDoubleMetricImpl <em>Basic Double Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.impl.BasicDoubleMetricImpl
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicDoubleMetric()
	 * @generated
	 */
	int BASIC_DOUBLE_METRIC = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DOUBLE_METRIC__NAME = BASIC_METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DOUBLE_METRIC__LAST_POLLED = BASIC_METRIC__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DOUBLE_METRIC__LAST_CHANGED = BASIC_METRIC__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DOUBLE_METRIC__CREATED = BASIC_METRIC__CREATED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DOUBLE_METRIC__VALUE = BASIC_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Double Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DOUBLE_METRIC_FEATURE_COUNT = BASIC_METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Double Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DOUBLE_METRIC_OPERATION_COUNT = BASIC_METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.metrics.AggregationMetricValueOptionType <em>Aggregation Metric Value Option Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.metrics.AggregationMetricValueOptionType
	 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getAggregationMetricValueOptionType()
	 * @generated
	 */
	int AGGREGATION_METRIC_VALUE_OPTION_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see org.openecomp.ncomp.core.metrics.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.Metric#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.openecomp.ncomp.core.metrics.Metric#getTime()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.Metric#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see org.openecomp.ncomp.core.metrics.Metric#getResourceName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_ResourceName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.Metric#getMetricName <em>Metric Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric Name</em>'.
	 * @see org.openecomp.ncomp.core.metrics.Metric#getMetricName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_MetricName();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.DoubleMetric <em>Double Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Metric</em>'.
	 * @see org.openecomp.ncomp.core.metrics.DoubleMetric
	 * @generated
	 */
	EClass getDoubleMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.DoubleMetric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.core.metrics.DoubleMetric#getValue()
	 * @see #getDoubleMetric()
	 * @generated
	 */
	EAttribute getDoubleMetric_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.LongMetric <em>Long Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Metric</em>'.
	 * @see org.openecomp.ncomp.core.metrics.LongMetric
	 * @generated
	 */
	EClass getLongMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.LongMetric#isIncreasing <em>Increasing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increasing</em>'.
	 * @see org.openecomp.ncomp.core.metrics.LongMetric#isIncreasing()
	 * @see #getLongMetric()
	 * @generated
	 */
	EAttribute getLongMetric_Increasing();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.LongMetric#isDelta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta</em>'.
	 * @see org.openecomp.ncomp.core.metrics.LongMetric#isDelta()
	 * @see #getLongMetric()
	 * @generated
	 */
	EAttribute getLongMetric_Delta();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.LongMetric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.core.metrics.LongMetric#getValue()
	 * @see #getLongMetric()
	 * @generated
	 */
	EAttribute getLongMetric_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.StringMetric <em>String Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Metric</em>'.
	 * @see org.openecomp.ncomp.core.metrics.StringMetric
	 * @generated
	 */
	EClass getStringMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.StringMetric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.core.metrics.StringMetric#getValue()
	 * @see #getStringMetric()
	 * @generated
	 */
	EAttribute getStringMetric_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.MetricValueOption <em>Metric Value Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Value Option</em>'.
	 * @see org.openecomp.ncomp.core.metrics.MetricValueOption
	 * @generated
	 */
	EClass getMetricValueOption();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.AggregationMetricValueOption <em>Aggregation Metric Value Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Metric Value Option</em>'.
	 * @see org.openecomp.ncomp.core.metrics.AggregationMetricValueOption
	 * @generated
	 */
	EClass getAggregationMetricValueOption();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.AggregationMetricValueOption#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.openecomp.ncomp.core.metrics.AggregationMetricValueOption#getDuration()
	 * @see #getAggregationMetricValueOption()
	 * @generated
	 */
	EAttribute getAggregationMetricValueOption_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.AggregationMetricValueOption#getAggregationType <em>Aggregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Type</em>'.
	 * @see org.openecomp.ncomp.core.metrics.AggregationMetricValueOption#getAggregationType()
	 * @see #getAggregationMetricValueOption()
	 * @generated
	 */
	EAttribute getAggregationMetricValueOption_AggregationType();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.BasicMetricValueOption <em>Basic Metric Value Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Metric Value Option</em>'.
	 * @see org.openecomp.ncomp.core.metrics.BasicMetricValueOption
	 * @generated
	 */
	EClass getBasicMetricValueOption();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.SequenceMetricValueOption <em>Sequence Metric Value Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Metric Value Option</em>'.
	 * @see org.openecomp.ncomp.core.metrics.SequenceMetricValueOption
	 * @generated
	 */
	EClass getSequenceMetricValueOption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.metrics.SequenceMetricValueOption#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.openecomp.ncomp.core.metrics.SequenceMetricValueOption#getOptions()
	 * @see #getSequenceMetricValueOption()
	 * @generated
	 */
	EReference getSequenceMetricValueOption_Options();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.MetricsContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.openecomp.ncomp.core.metrics.MetricsContainer
	 * @generated
	 */
	EClass getMetricsContainer();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.BasicMetrics <em>Basic Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Metrics</em>'.
	 * @see org.openecomp.ncomp.core.metrics.BasicMetrics
	 * @generated
	 */
	EClass getBasicMetrics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.core.metrics.BasicMetrics#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see org.openecomp.ncomp.core.metrics.BasicMetrics#getMetrics()
	 * @see #getBasicMetrics()
	 * @generated
	 */
	EReference getBasicMetrics_Metrics();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.BasicMetric <em>Basic Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Metric</em>'.
	 * @see org.openecomp.ncomp.core.metrics.BasicMetric
	 * @generated
	 */
	EClass getBasicMetric();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.BasicIncreasingULongMetric <em>Basic Increasing ULong Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Increasing ULong Metric</em>'.
	 * @see org.openecomp.ncomp.core.metrics.BasicIncreasingULongMetric
	 * @generated
	 */
	EClass getBasicIncreasingULongMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.BasicIncreasingULongMetric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.core.metrics.BasicIncreasingULongMetric#getValue()
	 * @see #getBasicIncreasingULongMetric()
	 * @generated
	 */
	EAttribute getBasicIncreasingULongMetric_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.BasicLongMetric <em>Basic Long Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Long Metric</em>'.
	 * @see org.openecomp.ncomp.core.metrics.BasicLongMetric
	 * @generated
	 */
	EClass getBasicLongMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.BasicLongMetric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.core.metrics.BasicLongMetric#getValue()
	 * @see #getBasicLongMetric()
	 * @generated
	 */
	EAttribute getBasicLongMetric_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.metrics.BasicDoubleMetric <em>Basic Double Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Double Metric</em>'.
	 * @see org.openecomp.ncomp.core.metrics.BasicDoubleMetric
	 * @generated
	 */
	EClass getBasicDoubleMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.metrics.BasicDoubleMetric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.core.metrics.BasicDoubleMetric#getValue()
	 * @see #getBasicDoubleMetric()
	 * @generated
	 */
	EAttribute getBasicDoubleMetric_Value();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.core.metrics.AggregationMetricValueOptionType <em>Aggregation Metric Value Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Metric Value Option Type</em>'.
	 * @see org.openecomp.ncomp.core.metrics.AggregationMetricValueOptionType
	 * @generated
	 */
	EEnum getAggregationMetricValueOptionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetricsFactory getMetricsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__TIME = eINSTANCE.getMetric_Time();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__RESOURCE_NAME = eINSTANCE.getMetric_ResourceName();

		/**
		 * The meta object literal for the '<em><b>Metric Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__METRIC_NAME = eINSTANCE.getMetric_MetricName();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.DoubleMetricImpl <em>Double Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.DoubleMetricImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getDoubleMetric()
		 * @generated
		 */
		EClass DOUBLE_METRIC = eINSTANCE.getDoubleMetric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_METRIC__VALUE = eINSTANCE.getDoubleMetric_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.LongMetricImpl <em>Long Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.LongMetricImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getLongMetric()
		 * @generated
		 */
		EClass LONG_METRIC = eINSTANCE.getLongMetric();

		/**
		 * The meta object literal for the '<em><b>Increasing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_METRIC__INCREASING = eINSTANCE.getLongMetric_Increasing();

		/**
		 * The meta object literal for the '<em><b>Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_METRIC__DELTA = eINSTANCE.getLongMetric_Delta();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_METRIC__VALUE = eINSTANCE.getLongMetric_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.StringMetricImpl <em>String Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.StringMetricImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getStringMetric()
		 * @generated
		 */
		EClass STRING_METRIC = eINSTANCE.getStringMetric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_METRIC__VALUE = eINSTANCE.getStringMetric_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.MetricValueOptionImpl <em>Metric Value Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricValueOptionImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getMetricValueOption()
		 * @generated
		 */
		EClass METRIC_VALUE_OPTION = eINSTANCE.getMetricValueOption();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.AggregationMetricValueOptionImpl <em>Aggregation Metric Value Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.AggregationMetricValueOptionImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getAggregationMetricValueOption()
		 * @generated
		 */
		EClass AGGREGATION_METRIC_VALUE_OPTION = eINSTANCE.getAggregationMetricValueOption();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_METRIC_VALUE_OPTION__DURATION = eINSTANCE.getAggregationMetricValueOption_Duration();

		/**
		 * The meta object literal for the '<em><b>Aggregation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_METRIC_VALUE_OPTION__AGGREGATION_TYPE = eINSTANCE.getAggregationMetricValueOption_AggregationType();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicMetricValueOptionImpl <em>Basic Metric Value Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.BasicMetricValueOptionImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicMetricValueOption()
		 * @generated
		 */
		EClass BASIC_METRIC_VALUE_OPTION = eINSTANCE.getBasicMetricValueOption();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.SequenceMetricValueOptionImpl <em>Sequence Metric Value Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.SequenceMetricValueOptionImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getSequenceMetricValueOption()
		 * @generated
		 */
		EClass SEQUENCE_METRIC_VALUE_OPTION = eINSTANCE.getSequenceMetricValueOption();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_METRIC_VALUE_OPTION__OPTIONS = eINSTANCE.getSequenceMetricValueOption_Options();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.MetricsContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsContainerImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getMetricsContainer()
		 * @generated
		 */
		EClass METRICS_CONTAINER = eINSTANCE.getMetricsContainer();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicMetricsImpl <em>Basic Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.BasicMetricsImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicMetrics()
		 * @generated
		 */
		EClass BASIC_METRICS = eINSTANCE.getBasicMetrics();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_METRICS__METRICS = eINSTANCE.getBasicMetrics_Metrics();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicMetricImpl <em>Basic Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.BasicMetricImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicMetric()
		 * @generated
		 */
		EClass BASIC_METRIC = eINSTANCE.getBasicMetric();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicIncreasingULongMetricImpl <em>Basic Increasing ULong Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.BasicIncreasingULongMetricImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicIncreasingULongMetric()
		 * @generated
		 */
		EClass BASIC_INCREASING_ULONG_METRIC = eINSTANCE.getBasicIncreasingULongMetric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_INCREASING_ULONG_METRIC__VALUE = eINSTANCE.getBasicIncreasingULongMetric_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicLongMetricImpl <em>Basic Long Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.BasicLongMetricImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicLongMetric()
		 * @generated
		 */
		EClass BASIC_LONG_METRIC = eINSTANCE.getBasicLongMetric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_LONG_METRIC__VALUE = eINSTANCE.getBasicLongMetric_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.impl.BasicDoubleMetricImpl <em>Basic Double Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.impl.BasicDoubleMetricImpl
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getBasicDoubleMetric()
		 * @generated
		 */
		EClass BASIC_DOUBLE_METRIC = eINSTANCE.getBasicDoubleMetric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_DOUBLE_METRIC__VALUE = eINSTANCE.getBasicDoubleMetric_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.metrics.AggregationMetricValueOptionType <em>Aggregation Metric Value Option Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.metrics.AggregationMetricValueOptionType
		 * @see org.openecomp.ncomp.core.metrics.impl.MetricsPackageImpl#getAggregationMetricValueOptionType()
		 * @generated
		 */
		EEnum AGGREGATION_METRIC_VALUE_OPTION_TYPE = eINSTANCE.getAggregationMetricValueOptionType();

	}

} //MetricsPackage
