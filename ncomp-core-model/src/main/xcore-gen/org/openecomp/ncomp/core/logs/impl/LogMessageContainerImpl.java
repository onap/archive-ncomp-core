
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

import org.openecomp.ncomp.core.logs.LogMessageCategory;
import org.openecomp.ncomp.core.logs.LogMessageContainer;
import org.openecomp.ncomp.core.logs.LogMessageContainerConfiguration;
import org.openecomp.ncomp.core.logs.LogMessageStats;
import org.openecomp.ncomp.core.logs.LogsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Message Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageContainerImpl#getLogMessageConfiguration <em>Log Message Configuration</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageContainerImpl#getLogMessageCategories <em>Log Message Categories</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageContainerImpl#getLogMessageStats <em>Log Message Stats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LogMessageContainerImpl extends MinimalEObjectImpl.Container implements LogMessageContainer {
	/**
	 * The cached value of the '{@link #getLogMessageConfiguration() <em>Log Message Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessageConfiguration()
	 * @generated
	 * @ordered
	 */
	protected LogMessageContainerConfiguration logMessageConfiguration;

	/**
	 * The cached value of the '{@link #getLogMessageCategories() <em>Log Message Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessageCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<LogMessageCategory> logMessageCategories;

	/**
	 * The cached value of the '{@link #getLogMessageStats() <em>Log Message Stats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessageStats()
	 * @generated
	 * @ordered
	 */
	protected EList<LogMessageStats> logMessageStats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogMessageContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogsPackage.Literals.LOG_MESSAGE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMessageContainerConfiguration getLogMessageConfiguration() {
		return logMessageConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogMessageConfiguration(LogMessageContainerConfiguration newLogMessageConfiguration, NotificationChain msgs) {
		LogMessageContainerConfiguration oldLogMessageConfiguration = logMessageConfiguration;
		logMessageConfiguration = newLogMessageConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION, oldLogMessageConfiguration, newLogMessageConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogMessageConfiguration(LogMessageContainerConfiguration newLogMessageConfiguration) {
		if (newLogMessageConfiguration != logMessageConfiguration) {
			NotificationChain msgs = null;
			if (logMessageConfiguration != null)
				msgs = ((InternalEObject)logMessageConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION, null, msgs);
			if (newLogMessageConfiguration != null)
				msgs = ((InternalEObject)newLogMessageConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION, null, msgs);
			msgs = basicSetLogMessageConfiguration(newLogMessageConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION, newLogMessageConfiguration, newLogMessageConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogMessageCategory> getLogMessageCategories() {
		if (logMessageCategories == null) {
			logMessageCategories = new EObjectContainmentEList<LogMessageCategory>(LogMessageCategory.class, this, LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CATEGORIES);
		}
		return logMessageCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogMessageStats> getLogMessageStats() {
		if (logMessageStats == null) {
			logMessageStats = new EObjectContainmentEList<LogMessageStats>(LogMessageStats.class, this, LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_STATS);
		}
		return logMessageStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION:
				return basicSetLogMessageConfiguration(null, msgs);
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CATEGORIES:
				return ((InternalEList<?>)getLogMessageCategories()).basicRemove(otherEnd, msgs);
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_STATS:
				return ((InternalEList<?>)getLogMessageStats()).basicRemove(otherEnd, msgs);
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
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION:
				return getLogMessageConfiguration();
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CATEGORIES:
				return getLogMessageCategories();
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_STATS:
				return getLogMessageStats();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION:
				setLogMessageConfiguration((LogMessageContainerConfiguration)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CATEGORIES:
				getLogMessageCategories().clear();
				getLogMessageCategories().addAll((Collection<? extends LogMessageCategory>)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_STATS:
				getLogMessageStats().clear();
				getLogMessageStats().addAll((Collection<? extends LogMessageStats>)newValue);
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
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION:
				setLogMessageConfiguration((LogMessageContainerConfiguration)null);
				return;
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CATEGORIES:
				getLogMessageCategories().clear();
				return;
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_STATS:
				getLogMessageStats().clear();
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
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION:
				return logMessageConfiguration != null;
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CATEGORIES:
				return logMessageCategories != null && !logMessageCategories.isEmpty();
			case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_STATS:
				return logMessageStats != null && !logMessageStats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogMessageContainerImpl
