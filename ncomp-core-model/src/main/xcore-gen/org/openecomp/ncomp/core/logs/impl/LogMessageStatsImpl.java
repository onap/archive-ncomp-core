
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

import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.openecomp.ncomp.core.logs.LogLevel;
import org.openecomp.ncomp.core.logs.LogMessageStats;
import org.openecomp.ncomp.core.logs.LogSeverity;
import org.openecomp.ncomp.core.logs.LogsPackage;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Message Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageStatsImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageStatsImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageStatsImpl#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogMessageStatsImpl extends NamedEntityImpl implements LogMessageStats {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LogLevel LEVEL_EDEFAULT = LogLevel.UNKNOWN;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected LogLevel level = LEVEL_EDEFAULT;

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
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute count = COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogMessageStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogsPackage.Literals.LOG_MESSAGE_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(LogLevel newLevel) {
		LogLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_STATS__LEVEL, oldLevel, level));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_STATS__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(IncreasingULongMetricAttribute newCount) {
		IncreasingULongMetricAttribute oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_STATS__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogsPackage.LOG_MESSAGE_STATS__LEVEL:
				return getLevel();
			case LogsPackage.LOG_MESSAGE_STATS__SEVERITY:
				return getSeverity();
			case LogsPackage.LOG_MESSAGE_STATS__COUNT:
				return getCount();
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
			case LogsPackage.LOG_MESSAGE_STATS__LEVEL:
				setLevel((LogLevel)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_STATS__SEVERITY:
				setSeverity((LogSeverity)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_STATS__COUNT:
				setCount((IncreasingULongMetricAttribute)newValue);
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
			case LogsPackage.LOG_MESSAGE_STATS__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE_STATS__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE_STATS__COUNT:
				setCount(COUNT_EDEFAULT);
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
			case LogsPackage.LOG_MESSAGE_STATS__LEVEL:
				return level != LEVEL_EDEFAULT;
			case LogsPackage.LOG_MESSAGE_STATS__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case LogsPackage.LOG_MESSAGE_STATS__COUNT:
				return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
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
		result.append(" (level: ");
		result.append(level);
		result.append(", severity: ");
		result.append(severity);
		result.append(", count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //LogMessageStatsImpl
