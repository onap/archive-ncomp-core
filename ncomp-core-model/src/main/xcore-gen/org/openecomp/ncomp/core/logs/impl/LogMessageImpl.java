
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

import org.openecomp.ncomp.core.logs.LogLevel;
import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.core.logs.LogSeverity;
import org.openecomp.ncomp.core.logs.LogsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageImpl#getNumberOfSuppressed <em>Number Of Suppressed</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageImpl#getSuppressedStartTime <em>Suppressed Start Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogMessageImpl extends MinimalEObjectImpl.Container implements LogMessage {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected long time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected String resourceName = RESOURCE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSuppressed() <em>Number Of Suppressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSuppressed()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SUPPRESSED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSuppressed() <em>Number Of Suppressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSuppressed()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSuppressed = NUMBER_OF_SUPPRESSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuppressedStartTime() <em>Suppressed Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressedStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long SUPPRESSED_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuppressedStartTime() <em>Suppressed Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressedStartTime()
	 * @generated
	 * @ordered
	 */
	protected Long suppressedStartTime = SUPPRESSED_START_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogsPackage.Literals.LOG_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		long oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceName(String newResourceName) {
		String oldResourceName = resourceName;
		resourceName = newResourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE__RESOURCE_NAME, oldResourceName, resourceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE__SEVERITY, oldSeverity, severity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSuppressed() {
		return numberOfSuppressed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSuppressed(int newNumberOfSuppressed) {
		int oldNumberOfSuppressed = numberOfSuppressed;
		numberOfSuppressed = newNumberOfSuppressed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE__NUMBER_OF_SUPPRESSED, oldNumberOfSuppressed, numberOfSuppressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSuppressedStartTime() {
		return suppressedStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppressedStartTime(Long newSuppressedStartTime) {
		Long oldSuppressedStartTime = suppressedStartTime;
		suppressedStartTime = newSuppressedStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE__SUPPRESSED_START_TIME, oldSuppressedStartTime, suppressedStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogsPackage.LOG_MESSAGE__TIME:
				return getTime();
			case LogsPackage.LOG_MESSAGE__RESOURCE_NAME:
				return getResourceName();
			case LogsPackage.LOG_MESSAGE__SEVERITY:
				return getSeverity();
			case LogsPackage.LOG_MESSAGE__LEVEL:
				return getLevel();
			case LogsPackage.LOG_MESSAGE__MESSAGE:
				return getMessage();
			case LogsPackage.LOG_MESSAGE__CATEGORY:
				return getCategory();
			case LogsPackage.LOG_MESSAGE__NUMBER_OF_SUPPRESSED:
				return getNumberOfSuppressed();
			case LogsPackage.LOG_MESSAGE__SUPPRESSED_START_TIME:
				return getSuppressedStartTime();
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
			case LogsPackage.LOG_MESSAGE__TIME:
				setTime((Long)newValue);
				return;
			case LogsPackage.LOG_MESSAGE__RESOURCE_NAME:
				setResourceName((String)newValue);
				return;
			case LogsPackage.LOG_MESSAGE__SEVERITY:
				setSeverity((LogSeverity)newValue);
				return;
			case LogsPackage.LOG_MESSAGE__LEVEL:
				setLevel((LogLevel)newValue);
				return;
			case LogsPackage.LOG_MESSAGE__MESSAGE:
				setMessage((String)newValue);
				return;
			case LogsPackage.LOG_MESSAGE__CATEGORY:
				setCategory((String)newValue);
				return;
			case LogsPackage.LOG_MESSAGE__NUMBER_OF_SUPPRESSED:
				setNumberOfSuppressed((Integer)newValue);
				return;
			case LogsPackage.LOG_MESSAGE__SUPPRESSED_START_TIME:
				setSuppressedStartTime((Long)newValue);
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
			case LogsPackage.LOG_MESSAGE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE__RESOURCE_NAME:
				setResourceName(RESOURCE_NAME_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE__NUMBER_OF_SUPPRESSED:
				setNumberOfSuppressed(NUMBER_OF_SUPPRESSED_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE__SUPPRESSED_START_TIME:
				setSuppressedStartTime(SUPPRESSED_START_TIME_EDEFAULT);
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
			case LogsPackage.LOG_MESSAGE__TIME:
				return time != TIME_EDEFAULT;
			case LogsPackage.LOG_MESSAGE__RESOURCE_NAME:
				return RESOURCE_NAME_EDEFAULT == null ? resourceName != null : !RESOURCE_NAME_EDEFAULT.equals(resourceName);
			case LogsPackage.LOG_MESSAGE__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case LogsPackage.LOG_MESSAGE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case LogsPackage.LOG_MESSAGE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case LogsPackage.LOG_MESSAGE__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case LogsPackage.LOG_MESSAGE__NUMBER_OF_SUPPRESSED:
				return numberOfSuppressed != NUMBER_OF_SUPPRESSED_EDEFAULT;
			case LogsPackage.LOG_MESSAGE__SUPPRESSED_START_TIME:
				return SUPPRESSED_START_TIME_EDEFAULT == null ? suppressedStartTime != null : !SUPPRESSED_START_TIME_EDEFAULT.equals(suppressedStartTime);
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
		result.append(" (time: ");
		result.append(time);
		result.append(", resourceName: ");
		result.append(resourceName);
		result.append(", severity: ");
		result.append(severity);
		result.append(", level: ");
		result.append(level);
		result.append(", message: ");
		result.append(message);
		result.append(", category: ");
		result.append(category);
		result.append(", numberOfSuppressed: ");
		result.append(numberOfSuppressed);
		result.append(", suppressedStartTime: ");
		result.append(suppressedStartTime);
		result.append(')');
		return result.toString();
	}

} //LogMessageImpl
