
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

import org.openecomp.ncomp.core.metrics.*;

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
public class MetricsFactoryImpl extends EFactoryImpl implements MetricsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetricsFactory init() {
		try {
			MetricsFactory theMetricsFactory = (MetricsFactory)EPackage.Registry.INSTANCE.getEFactory(MetricsPackage.eNS_URI);
			if (theMetricsFactory != null) {
				return theMetricsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetricsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactoryImpl() {
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
			case MetricsPackage.DOUBLE_METRIC: return createDoubleMetric();
			case MetricsPackage.LONG_METRIC: return createLongMetric();
			case MetricsPackage.STRING_METRIC: return createStringMetric();
			case MetricsPackage.AGGREGATION_METRIC_VALUE_OPTION: return createAggregationMetricValueOption();
			case MetricsPackage.BASIC_METRIC_VALUE_OPTION: return createBasicMetricValueOption();
			case MetricsPackage.SEQUENCE_METRIC_VALUE_OPTION: return createSequenceMetricValueOption();
			case MetricsPackage.BASIC_METRICS: return createBasicMetrics();
			case MetricsPackage.BASIC_INCREASING_ULONG_METRIC: return createBasicIncreasingULongMetric();
			case MetricsPackage.BASIC_LONG_METRIC: return createBasicLongMetric();
			case MetricsPackage.BASIC_DOUBLE_METRIC: return createBasicDoubleMetric();
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
			case MetricsPackage.AGGREGATION_METRIC_VALUE_OPTION_TYPE:
				return createAggregationMetricValueOptionTypeFromString(eDataType, initialValue);
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
			case MetricsPackage.AGGREGATION_METRIC_VALUE_OPTION_TYPE:
				return convertAggregationMetricValueOptionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetric createDoubleMetric() {
		DoubleMetricImpl doubleMetric = new DoubleMetricImpl();
		return doubleMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongMetric createLongMetric() {
		LongMetricImpl longMetric = new LongMetricImpl();
		return longMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringMetric createStringMetric() {
		StringMetricImpl stringMetric = new StringMetricImpl();
		return stringMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationMetricValueOption createAggregationMetricValueOption() {
		AggregationMetricValueOptionImpl aggregationMetricValueOption = new AggregationMetricValueOptionImpl();
		return aggregationMetricValueOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicMetricValueOption createBasicMetricValueOption() {
		BasicMetricValueOptionImpl basicMetricValueOption = new BasicMetricValueOptionImpl();
		return basicMetricValueOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceMetricValueOption createSequenceMetricValueOption() {
		SequenceMetricValueOptionImpl sequenceMetricValueOption = new SequenceMetricValueOptionImpl();
		return sequenceMetricValueOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicMetrics createBasicMetrics() {
		BasicMetricsImpl basicMetrics = new BasicMetricsImpl();
		return basicMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicIncreasingULongMetric createBasicIncreasingULongMetric() {
		BasicIncreasingULongMetricImpl basicIncreasingULongMetric = new BasicIncreasingULongMetricImpl();
		return basicIncreasingULongMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicLongMetric createBasicLongMetric() {
		BasicLongMetricImpl basicLongMetric = new BasicLongMetricImpl();
		return basicLongMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDoubleMetric createBasicDoubleMetric() {
		BasicDoubleMetricImpl basicDoubleMetric = new BasicDoubleMetricImpl();
		return basicDoubleMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationMetricValueOptionType createAggregationMetricValueOptionTypeFromString(EDataType eDataType, String initialValue) {
		AggregationMetricValueOptionType result = AggregationMetricValueOptionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationMetricValueOptionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsPackage getMetricsPackage() {
		return (MetricsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetricsPackage getPackage() {
		return MetricsPackage.eINSTANCE;
	}

} //MetricsFactoryImpl
