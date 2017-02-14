
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
import org.openecomp.ncomp.core.alerts.MaxAlertPerInterval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Alert Per Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.MaxAlertPerIntervalImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.MaxAlertPerIntervalImpl#getMaxAlerts <em>Max Alerts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaxAlertPerIntervalImpl extends DampingRuleImpl implements MaxAlertPerInterval {
	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected String interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAlerts() <em>Max Alerts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAlerts()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ALERTS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxAlerts() <em>Max Alerts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAlerts()
	 * @generated
	 * @ordered
	 */
	protected int maxAlerts = MAX_ALERTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxAlertPerIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlertsPackage.Literals.MAX_ALERT_PER_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(String newInterval) {
		String oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.MAX_ALERT_PER_INTERVAL__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxAlerts() {
		return maxAlerts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAlerts(int newMaxAlerts) {
		int oldMaxAlerts = maxAlerts;
		maxAlerts = newMaxAlerts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.MAX_ALERT_PER_INTERVAL__MAX_ALERTS, oldMaxAlerts, maxAlerts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlertsPackage.MAX_ALERT_PER_INTERVAL__INTERVAL:
				return getInterval();
			case AlertsPackage.MAX_ALERT_PER_INTERVAL__MAX_ALERTS:
				return getMaxAlerts();
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
			case AlertsPackage.MAX_ALERT_PER_INTERVAL__INTERVAL:
				setInterval((String)newValue);
				return;
			case AlertsPackage.MAX_ALERT_PER_INTERVAL__MAX_ALERTS:
				setMaxAlerts((Integer)newValue);
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
			case AlertsPackage.MAX_ALERT_PER_INTERVAL__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case AlertsPackage.MAX_ALERT_PER_INTERVAL__MAX_ALERTS:
				setMaxAlerts(MAX_ALERTS_EDEFAULT);
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
			case AlertsPackage.MAX_ALERT_PER_INTERVAL__INTERVAL:
				return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
			case AlertsPackage.MAX_ALERT_PER_INTERVAL__MAX_ALERTS:
				return maxAlerts != MAX_ALERTS_EDEFAULT;
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
		result.append(" (interval: ");
		result.append(interval);
		result.append(", maxAlerts: ");
		result.append(maxAlerts);
		result.append(')');
		return result.toString();
	}

} //MaxAlertPerIntervalImpl
