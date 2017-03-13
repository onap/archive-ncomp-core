
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
import org.openecomp.ncomp.core.HasOperationalState;
import org.openecomp.ncomp.core.OperationalState;

import org.openecomp.ncomp.core.alerts.Alert;
import org.openecomp.ncomp.core.alerts.AlertsPackage;
import org.openecomp.ncomp.core.alerts.DampingRule;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.core.logs.LogSeverity;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.AlertImpl#getOperationalState <em>Operational State</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.AlertImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.AlertImpl#getDampingRule <em>Damping Rule</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.AlertImpl#getNumAlerts <em>Num Alerts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.alerts.impl.AlertImpl#getNumAlertsSuppressed <em>Num Alerts Suppressed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AlertImpl extends NamedEntityImpl implements Alert {
	/**
	 * The default value of the '{@link #getOperationalState() <em>Operational State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalState()
	 * @generated
	 * @ordered
	 */
	protected static final OperationalState OPERATIONAL_STATE_EDEFAULT = OperationalState.OPERATIONAL;

	/**
	 * The cached value of the '{@link #getOperationalState() <em>Operational State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalState()
	 * @generated
	 * @ordered
	 */
	protected OperationalState operationalState = OPERATIONAL_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final LogSeverity SEVERITY_EDEFAULT = LogSeverity.UNKNOWN;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected LogSeverity severity = SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDampingRule() <em>Damping Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDampingRule()
	 * @generated
	 * @ordered
	 */
	protected DampingRule dampingRule;

	/**
	 * The default value of the '{@link #getNumAlerts() <em>Num Alerts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumAlerts()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUM_ALERTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumAlerts() <em>Num Alerts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumAlerts()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numAlerts = NUM_ALERTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumAlertsSuppressed() <em>Num Alerts Suppressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumAlertsSuppressed()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUM_ALERTS_SUPPRESSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumAlertsSuppressed() <em>Num Alerts Suppressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumAlertsSuppressed()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numAlertsSuppressed = NUM_ALERTS_SUPPRESSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlertsPackage.Literals.ALERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalState getOperationalState() {
		return operationalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalState(OperationalState newOperationalState) {
		OperationalState oldOperationalState = operationalState;
		operationalState = newOperationalState == null ? OPERATIONAL_STATE_EDEFAULT : newOperationalState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.ALERT__OPERATIONAL_STATE, oldOperationalState, operationalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogSeverity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(LogSeverity newSeverity) {
		LogSeverity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.ALERT__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DampingRule getDampingRule() {
		return dampingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDampingRule(DampingRule newDampingRule, NotificationChain msgs) {
		DampingRule oldDampingRule = dampingRule;
		dampingRule = newDampingRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlertsPackage.ALERT__DAMPING_RULE, oldDampingRule, newDampingRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDampingRule(DampingRule newDampingRule) {
		if (newDampingRule != dampingRule) {
			NotificationChain msgs = null;
			if (dampingRule != null)
				msgs = ((InternalEObject)dampingRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlertsPackage.ALERT__DAMPING_RULE, null, msgs);
			if (newDampingRule != null)
				msgs = ((InternalEObject)newDampingRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlertsPackage.ALERT__DAMPING_RULE, null, msgs);
			msgs = basicSetDampingRule(newDampingRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.ALERT__DAMPING_RULE, newDampingRule, newDampingRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumAlerts() {
		return numAlerts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumAlerts(IncreasingULongMetricAttribute newNumAlerts) {
		IncreasingULongMetricAttribute oldNumAlerts = numAlerts;
		numAlerts = newNumAlerts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.ALERT__NUM_ALERTS, oldNumAlerts, numAlerts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumAlertsSuppressed() {
		return numAlertsSuppressed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumAlertsSuppressed(IncreasingULongMetricAttribute newNumAlertsSuppressed) {
		IncreasingULongMetricAttribute oldNumAlertsSuppressed = numAlertsSuppressed;
		numAlertsSuppressed = newNumAlertsSuppressed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlertsPackage.ALERT__NUM_ALERTS_SUPPRESSED, oldNumAlertsSuppressed, numAlertsSuppressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlertsPackage.ALERT__DAMPING_RULE:
				return basicSetDampingRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlertsPackage.ALERT__OPERATIONAL_STATE:
				return getOperationalState();
			case AlertsPackage.ALERT__SEVERITY:
				return getSeverity();
			case AlertsPackage.ALERT__DAMPING_RULE:
				return getDampingRule();
			case AlertsPackage.ALERT__NUM_ALERTS:
				return getNumAlerts();
			case AlertsPackage.ALERT__NUM_ALERTS_SUPPRESSED:
				return getNumAlertsSuppressed();
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
			case AlertsPackage.ALERT__OPERATIONAL_STATE:
				setOperationalState((OperationalState)newValue);
				return;
			case AlertsPackage.ALERT__SEVERITY:
				setSeverity((LogSeverity)newValue);
				return;
			case AlertsPackage.ALERT__DAMPING_RULE:
				setDampingRule((DampingRule)newValue);
				return;
			case AlertsPackage.ALERT__NUM_ALERTS:
				setNumAlerts((IncreasingULongMetricAttribute)newValue);
				return;
			case AlertsPackage.ALERT__NUM_ALERTS_SUPPRESSED:
				setNumAlertsSuppressed((IncreasingULongMetricAttribute)newValue);
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
			case AlertsPackage.ALERT__OPERATIONAL_STATE:
				setOperationalState(OPERATIONAL_STATE_EDEFAULT);
				return;
			case AlertsPackage.ALERT__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case AlertsPackage.ALERT__DAMPING_RULE:
				setDampingRule((DampingRule)null);
				return;
			case AlertsPackage.ALERT__NUM_ALERTS:
				setNumAlerts(NUM_ALERTS_EDEFAULT);
				return;
			case AlertsPackage.ALERT__NUM_ALERTS_SUPPRESSED:
				setNumAlertsSuppressed(NUM_ALERTS_SUPPRESSED_EDEFAULT);
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
			case AlertsPackage.ALERT__OPERATIONAL_STATE:
				return operationalState != OPERATIONAL_STATE_EDEFAULT;
			case AlertsPackage.ALERT__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case AlertsPackage.ALERT__DAMPING_RULE:
				return dampingRule != null;
			case AlertsPackage.ALERT__NUM_ALERTS:
				return NUM_ALERTS_EDEFAULT == null ? numAlerts != null : !NUM_ALERTS_EDEFAULT.equals(numAlerts);
			case AlertsPackage.ALERT__NUM_ALERTS_SUPPRESSED:
				return NUM_ALERTS_SUPPRESSED_EDEFAULT == null ? numAlertsSuppressed != null : !NUM_ALERTS_SUPPRESSED_EDEFAULT.equals(numAlertsSuppressed);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HasOperationalState.class) {
			switch (derivedFeatureID) {
				case AlertsPackage.ALERT__OPERATIONAL_STATE: return CorePackage.HAS_OPERATIONAL_STATE__OPERATIONAL_STATE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HasOperationalState.class) {
			switch (baseFeatureID) {
				case CorePackage.HAS_OPERATIONAL_STATE__OPERATIONAL_STATE: return AlertsPackage.ALERT__OPERATIONAL_STATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (operationalState: ");
		result.append(operationalState);
		result.append(", severity: ");
		result.append(severity);
		result.append(", numAlerts: ");
		result.append(numAlerts);
		result.append(", numAlertsSuppressed: ");
		result.append(numAlertsSuppressed);
		result.append(')');
		return result.toString();
	}

} //AlertImpl
