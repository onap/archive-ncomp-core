
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

import org.openecomp.ncomp.core.alerts.AlertsPackage;
import org.openecomp.ncomp.core.alerts.ThresholdAlert;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threshold Alert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.ThresholdAlertImpl#getMetricName <em>Metric Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.ThresholdAlertImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.ThresholdAlertImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.ThresholdAlertImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.ThresholdAlertImpl#getMaxDelay <em>Max Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThresholdAlertImpl extends AlertImpl implements ThresholdAlert {
	/**
	 * The default value of the '{@link #getMetricName() <em>Metric Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricName()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetricName() <em>Metric Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricName()
	 * @generated
	 * @ordered
	 */
	protected String metricName = METRIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Double LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Double lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Double UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Double upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDelay() <em>Max Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDelay() <em>Max Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDelay()
	 * @generated
	 * @ordered
	 */
	protected String maxDelay = MAX_DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThresholdAlertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlertsPackage.Literals.THRESHOLD_ALERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetricName() {
		return metricName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetricName(String newMetricName) {
		String oldMetricName = metricName;
		metricName = newMetricName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.THRESHOLD_ALERT__METRIC_NAME, oldMetricName, metricName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(Double newLowerBound) {
		Double oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.THRESHOLD_ALERT__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(Double newUpperBound) {
		Double oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.THRESHOLD_ALERT__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.THRESHOLD_ALERT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxDelay() {
		return maxDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDelay(String newMaxDelay) {
		String oldMaxDelay = maxDelay;
		maxDelay = newMaxDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.THRESHOLD_ALERT__MAX_DELAY, oldMaxDelay, maxDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlertsPackage.THRESHOLD_ALERT__METRIC_NAME:
				return getMetricName();
			case AlertsPackage.THRESHOLD_ALERT__LOWER_BOUND:
				return getLowerBound();
			case AlertsPackage.THRESHOLD_ALERT__UPPER_BOUND:
				return getUpperBound();
			case AlertsPackage.THRESHOLD_ALERT__DURATION:
				return getDuration();
			case AlertsPackage.THRESHOLD_ALERT__MAX_DELAY:
				return getMaxDelay();
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
			case AlertsPackage.THRESHOLD_ALERT__METRIC_NAME:
				setMetricName((String)newValue);
				return;
			case AlertsPackage.THRESHOLD_ALERT__LOWER_BOUND:
				setLowerBound((Double)newValue);
				return;
			case AlertsPackage.THRESHOLD_ALERT__UPPER_BOUND:
				setUpperBound((Double)newValue);
				return;
			case AlertsPackage.THRESHOLD_ALERT__DURATION:
				setDuration((String)newValue);
				return;
			case AlertsPackage.THRESHOLD_ALERT__MAX_DELAY:
				setMaxDelay((String)newValue);
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
			case AlertsPackage.THRESHOLD_ALERT__METRIC_NAME:
				setMetricName(METRIC_NAME_EDEFAULT);
				return;
			case AlertsPackage.THRESHOLD_ALERT__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case AlertsPackage.THRESHOLD_ALERT__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case AlertsPackage.THRESHOLD_ALERT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case AlertsPackage.THRESHOLD_ALERT__MAX_DELAY:
				setMaxDelay(MAX_DELAY_EDEFAULT);
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
			case AlertsPackage.THRESHOLD_ALERT__METRIC_NAME:
				return METRIC_NAME_EDEFAULT == null ? metricName != null : !METRIC_NAME_EDEFAULT.equals(metricName);
			case AlertsPackage.THRESHOLD_ALERT__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case AlertsPackage.THRESHOLD_ALERT__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case AlertsPackage.THRESHOLD_ALERT__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case AlertsPackage.THRESHOLD_ALERT__MAX_DELAY:
				return MAX_DELAY_EDEFAULT == null ? maxDelay != null : !MAX_DELAY_EDEFAULT.equals(maxDelay);
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
		result.append(" (metricName: ");
		result.append(metricName);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", duration: ");
		result.append(duration);
		result.append(", maxDelay: ");
		result.append(maxDelay);
		result.append(')');
		return result.toString();
	}

} //ThresholdAlertImpl
