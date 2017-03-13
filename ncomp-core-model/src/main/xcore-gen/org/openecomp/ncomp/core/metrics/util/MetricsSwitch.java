
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
package org.openecomp.ncomp.core.metrics.util;

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.core.metrics.*;

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
 * @see org.openecomp.ncomp.core.metrics.MetricsPackage
 * @generated
 */
public class MetricsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetricsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsSwitch() {
		if (modelPackage == null) {
			modelPackage = MetricsPackage.eINSTANCE;
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
			case MetricsPackage.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.DOUBLE_METRIC: {
				DoubleMetric doubleMetric = (DoubleMetric)theEObject;
				T result = caseDoubleMetric(doubleMetric);
				if (result == null) result = caseMetric(doubleMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.LONG_METRIC: {
				LongMetric longMetric = (LongMetric)theEObject;
				T result = caseLongMetric(longMetric);
				if (result == null) result = caseMetric(longMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.STRING_METRIC: {
				StringMetric stringMetric = (StringMetric)theEObject;
				T result = caseStringMetric(stringMetric);
				if (result == null) result = caseMetric(stringMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.METRIC_VALUE_OPTION: {
				MetricValueOption metricValueOption = (MetricValueOption)theEObject;
				T result = caseMetricValueOption(metricValueOption);
				if (result == null) result = caseNamedEntity(metricValueOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.AGGREGATION_METRIC_VALUE_OPTION: {
				AggregationMetricValueOption aggregationMetricValueOption = (AggregationMetricValueOption)theEObject;
				T result = caseAggregationMetricValueOption(aggregationMetricValueOption);
				if (result == null) result = caseMetricValueOption(aggregationMetricValueOption);
				if (result == null) result = caseNamedEntity(aggregationMetricValueOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.BASIC_METRIC_VALUE_OPTION: {
				BasicMetricValueOption basicMetricValueOption = (BasicMetricValueOption)theEObject;
				T result = caseBasicMetricValueOption(basicMetricValueOption);
				if (result == null) result = caseMetricValueOption(basicMetricValueOption);
				if (result == null) result = caseNamedEntity(basicMetricValueOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.SEQUENCE_METRIC_VALUE_OPTION: {
				SequenceMetricValueOption sequenceMetricValueOption = (SequenceMetricValueOption)theEObject;
				T result = caseSequenceMetricValueOption(sequenceMetricValueOption);
				if (result == null) result = caseMetricValueOption(sequenceMetricValueOption);
				if (result == null) result = caseNamedEntity(sequenceMetricValueOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.METRICS_CONTAINER: {
				MetricsContainer metricsContainer = (MetricsContainer)theEObject;
				T result = caseMetricsContainer(metricsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.BASIC_METRICS: {
				BasicMetrics basicMetrics = (BasicMetrics)theEObject;
				T result = caseBasicMetrics(basicMetrics);
				if (result == null) result = caseMetricsContainer(basicMetrics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.BASIC_METRIC: {
				BasicMetric basicMetric = (BasicMetric)theEObject;
				T result = caseBasicMetric(basicMetric);
				if (result == null) result = caseNamedEntity(basicMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.BASIC_INCREASING_ULONG_METRIC: {
				BasicIncreasingULongMetric basicIncreasingULongMetric = (BasicIncreasingULongMetric)theEObject;
				T result = caseBasicIncreasingULongMetric(basicIncreasingULongMetric);
				if (result == null) result = caseBasicMetric(basicIncreasingULongMetric);
				if (result == null) result = caseNamedEntity(basicIncreasingULongMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.BASIC_LONG_METRIC: {
				BasicLongMetric basicLongMetric = (BasicLongMetric)theEObject;
				T result = caseBasicLongMetric(basicLongMetric);
				if (result == null) result = caseBasicMetric(basicLongMetric);
				if (result == null) result = caseNamedEntity(basicLongMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.BASIC_DOUBLE_METRIC: {
				BasicDoubleMetric basicDoubleMetric = (BasicDoubleMetric)theEObject;
				T result = caseBasicDoubleMetric(basicDoubleMetric);
				if (result == null) result = caseBasicMetric(basicDoubleMetric);
				if (result == null) result = caseNamedEntity(basicDoubleMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleMetric(DoubleMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongMetric(LongMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringMetric(StringMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric Value Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric Value Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricValueOption(MetricValueOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Metric Value Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Metric Value Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationMetricValueOption(AggregationMetricValueOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Metric Value Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Metric Value Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicMetricValueOption(BasicMetricValueOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Metric Value Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Metric Value Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceMetricValueOption(SequenceMetricValueOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricsContainer(MetricsContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Metrics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicMetrics(BasicMetrics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicMetric(BasicMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Increasing ULong Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Increasing ULong Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicIncreasingULongMetric(BasicIncreasingULongMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Long Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Long Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicLongMetric(BasicLongMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Double Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Double Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicDoubleMetric(BasicDoubleMetric object) {
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

} //MetricsSwitch
