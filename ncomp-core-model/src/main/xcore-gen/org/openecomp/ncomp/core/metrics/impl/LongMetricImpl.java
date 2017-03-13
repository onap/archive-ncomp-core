
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

import org.openecomp.ncomp.core.metrics.LongMetric;
import org.openecomp.ncomp.core.metrics.MetricsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.metrics.impl.LongMetricImpl#isIncreasing <em>Increasing</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.metrics.impl.LongMetricImpl#isDelta <em>Delta</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.metrics.impl.LongMetricImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LongMetricImpl extends MetricImpl implements LongMetric {
	/**
	 * The default value of the '{@link #isIncreasing() <em>Increasing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncreasing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCREASING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncreasing() <em>Increasing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncreasing()
	 * @generated
	 * @ordered
	 */
	protected boolean increasing = INCREASING_EDEFAULT;

	/**
	 * The default value of the '{@link #isDelta() <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelta()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELTA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDelta() <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelta()
	 * @generated
	 * @ordered
	 */
	protected boolean delta = DELTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final long VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected long value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.LONG_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncreasing() {
		return increasing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncreasing(boolean newIncreasing) {
		boolean oldIncreasing = increasing;
		increasing = newIncreasing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.LONG_METRIC__INCREASING, oldIncreasing, increasing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDelta() {
		return delta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelta(boolean newDelta) {
		boolean oldDelta = delta;
		delta = newDelta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.LONG_METRIC__DELTA, oldDelta, delta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(long newValue) {
		long oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.LONG_METRIC__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.LONG_METRIC__INCREASING:
				return isIncreasing();
			case MetricsPackage.LONG_METRIC__DELTA:
				return isDelta();
			case MetricsPackage.LONG_METRIC__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetricsPackage.LONG_METRIC__INCREASING:
				setIncreasing((Boolean)newValue);
				return;
			case MetricsPackage.LONG_METRIC__DELTA:
				setDelta((Boolean)newValue);
				return;
			case MetricsPackage.LONG_METRIC__VALUE:
				setValue((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetricsPackage.LONG_METRIC__INCREASING:
				setIncreasing(INCREASING_EDEFAULT);
				return;
			case MetricsPackage.LONG_METRIC__DELTA:
				setDelta(DELTA_EDEFAULT);
				return;
			case MetricsPackage.LONG_METRIC__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetricsPackage.LONG_METRIC__INCREASING:
				return increasing != INCREASING_EDEFAULT;
			case MetricsPackage.LONG_METRIC__DELTA:
				return delta != DELTA_EDEFAULT;
			case MetricsPackage.LONG_METRIC__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (increasing: ");
		result.append(increasing);
		result.append(", delta: ");
		result.append(delta);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //LongMetricImpl
