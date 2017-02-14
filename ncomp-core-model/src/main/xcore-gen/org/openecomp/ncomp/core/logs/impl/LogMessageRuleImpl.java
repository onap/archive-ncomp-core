
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

import org.openecomp.ncomp.core.function.Function;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.core.logs.LogLevel;
import org.openecomp.ncomp.core.logs.LogMessageRule;
import org.openecomp.ncomp.core.logs.LogSeverity;
import org.openecomp.ncomp.core.logs.LogsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl#getMessageFilter <em>Message Filter</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl#getResourcePathFilter <em>Resource Path Filter</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl#getNewLevel <em>New Level</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl#getNewSeverity <em>New Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl#getNewCategory <em>New Category</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.logs.impl.LogMessageRuleImpl#getUpdateFunction <em>Update Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogMessageRuleImpl extends NamedEntityImpl implements LogMessageRule {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageFilter() <em>Message Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageFilter() <em>Message Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFilter()
	 * @generated
	 * @ordered
	 */
	protected String messageFilter = MESSAGE_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourcePathFilter() <em>Resource Path Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcePathFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_PATH_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourcePathFilter() <em>Resource Path Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcePathFilter()
	 * @generated
	 * @ordered
	 */
	protected String resourcePathFilter = RESOURCE_PATH_FILTER_EDEFAULT;

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
	 * The default value of the '{@link #getNewLevel() <em>New Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LogLevel NEW_LEVEL_EDEFAULT = LogLevel.UNKNOWN;

	/**
	 * The cached value of the '{@link #getNewLevel() <em>New Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewLevel()
	 * @generated
	 * @ordered
	 */
	protected LogLevel newLevel = NEW_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewSeverity() <em>New Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final LogSeverity NEW_SEVERITY_EDEFAULT = LogSeverity.UNKNOWN;

	/**
	 * The cached value of the '{@link #getNewSeverity() <em>New Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewSeverity()
	 * @generated
	 * @ordered
	 */
	protected LogSeverity newSeverity = NEW_SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewCategory() <em>New Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewCategory() <em>New Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewCategory()
	 * @generated
	 * @ordered
	 */
	protected String newCategory = NEW_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean disabled = DISABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdateFunction() <em>Update Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateFunction()
	 * @generated
	 * @ordered
	 */
	protected Function updateFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogsPackage.Literals.LOG_MESSAGE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_RULE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageFilter() {
		return messageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageFilter(String newMessageFilter) {
		String oldMessageFilter = messageFilter;
		messageFilter = newMessageFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_RULE__MESSAGE_FILTER, oldMessageFilter, messageFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourcePathFilter() {
		return resourcePathFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourcePathFilter(String newResourcePathFilter) {
		String oldResourcePathFilter = resourcePathFilter;
		resourcePathFilter = newResourcePathFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_RULE__RESOURCE_PATH_FILTER, oldResourcePathFilter, resourcePathFilter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_RULE__LEVEL, oldLevel, level));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_RULE__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogLevel getNewLevel() {
		return newLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewLevel(LogLevel newNewLevel) {
		LogLevel oldNewLevel = newLevel;
		newLevel = newNewLevel == null ? NEW_LEVEL_EDEFAULT : newNewLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_RULE__NEW_LEVEL, oldNewLevel, newLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogSeverity getNewSeverity() {
		return newSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewSeverity(LogSeverity newNewSeverity) {
		LogSeverity oldNewSeverity = newSeverity;
		newSeverity = newNewSeverity == null ? NEW_SEVERITY_EDEFAULT : newNewSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_RULE__NEW_SEVERITY, oldNewSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewCategory() {
		return newCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewCategory(String newNewCategory) {
		String oldNewCategory = newCategory;
		newCategory = newNewCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_RULE__NEW_CATEGORY, oldNewCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		boolean oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_RULE__DISABLED, oldDisabled, disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getUpdateFunction() {
		if (updateFunction != null && updateFunction.eIsProxy()) {
			InternalEObject oldUpdateFunction = (InternalEObject)updateFunction;
			updateFunction = (Function)eResolveProxy(oldUpdateFunction);
			if (updateFunction != oldUpdateFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogsPackage.LOG_MESSAGE_RULE__UPDATE_FUNCTION, oldUpdateFunction, updateFunction));
			}
		}
		return updateFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetUpdateFunction() {
		return updateFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateFunction(Function newUpdateFunction) {
		Function oldUpdateFunction = updateFunction;
		updateFunction = newUpdateFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogsPackage.LOG_MESSAGE_RULE__UPDATE_FUNCTION, oldUpdateFunction, updateFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogsPackage.LOG_MESSAGE_RULE__DESCRIPTION:
				return getDescription();
			case LogsPackage.LOG_MESSAGE_RULE__MESSAGE_FILTER:
				return getMessageFilter();
			case LogsPackage.LOG_MESSAGE_RULE__RESOURCE_PATH_FILTER:
				return getResourcePathFilter();
			case LogsPackage.LOG_MESSAGE_RULE__LEVEL:
				return getLevel();
			case LogsPackage.LOG_MESSAGE_RULE__SEVERITY:
				return getSeverity();
			case LogsPackage.LOG_MESSAGE_RULE__NEW_LEVEL:
				return getNewLevel();
			case LogsPackage.LOG_MESSAGE_RULE__NEW_SEVERITY:
				return getNewSeverity();
			case LogsPackage.LOG_MESSAGE_RULE__NEW_CATEGORY:
				return getNewCategory();
			case LogsPackage.LOG_MESSAGE_RULE__DISABLED:
				return isDisabled();
			case LogsPackage.LOG_MESSAGE_RULE__UPDATE_FUNCTION:
				if (resolve) return getUpdateFunction();
				return basicGetUpdateFunction();
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
			case LogsPackage.LOG_MESSAGE_RULE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__MESSAGE_FILTER:
				setMessageFilter((String)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__RESOURCE_PATH_FILTER:
				setResourcePathFilter((String)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__LEVEL:
				setLevel((LogLevel)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__SEVERITY:
				setSeverity((LogSeverity)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__NEW_LEVEL:
				setNewLevel((LogLevel)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__NEW_SEVERITY:
				setNewSeverity((LogSeverity)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__NEW_CATEGORY:
				setNewCategory((String)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__UPDATE_FUNCTION:
				setUpdateFunction((Function)newValue);
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
			case LogsPackage.LOG_MESSAGE_RULE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__MESSAGE_FILTER:
				setMessageFilter(MESSAGE_FILTER_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__RESOURCE_PATH_FILTER:
				setResourcePathFilter(RESOURCE_PATH_FILTER_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__NEW_LEVEL:
				setNewLevel(NEW_LEVEL_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__NEW_SEVERITY:
				setNewSeverity(NEW_SEVERITY_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__NEW_CATEGORY:
				setNewCategory(NEW_CATEGORY_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case LogsPackage.LOG_MESSAGE_RULE__UPDATE_FUNCTION:
				setUpdateFunction((Function)null);
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
			case LogsPackage.LOG_MESSAGE_RULE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LogsPackage.LOG_MESSAGE_RULE__MESSAGE_FILTER:
				return MESSAGE_FILTER_EDEFAULT == null ? messageFilter != null : !MESSAGE_FILTER_EDEFAULT.equals(messageFilter);
			case LogsPackage.LOG_MESSAGE_RULE__RESOURCE_PATH_FILTER:
				return RESOURCE_PATH_FILTER_EDEFAULT == null ? resourcePathFilter != null : !RESOURCE_PATH_FILTER_EDEFAULT.equals(resourcePathFilter);
			case LogsPackage.LOG_MESSAGE_RULE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case LogsPackage.LOG_MESSAGE_RULE__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case LogsPackage.LOG_MESSAGE_RULE__NEW_LEVEL:
				return newLevel != NEW_LEVEL_EDEFAULT;
			case LogsPackage.LOG_MESSAGE_RULE__NEW_SEVERITY:
				return newSeverity != NEW_SEVERITY_EDEFAULT;
			case LogsPackage.LOG_MESSAGE_RULE__NEW_CATEGORY:
				return NEW_CATEGORY_EDEFAULT == null ? newCategory != null : !NEW_CATEGORY_EDEFAULT.equals(newCategory);
			case LogsPackage.LOG_MESSAGE_RULE__DISABLED:
				return disabled != DISABLED_EDEFAULT;
			case LogsPackage.LOG_MESSAGE_RULE__UPDATE_FUNCTION:
				return updateFunction != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", messageFilter: ");
		result.append(messageFilter);
		result.append(", resourcePathFilter: ");
		result.append(resourcePathFilter);
		result.append(", level: ");
		result.append(level);
		result.append(", severity: ");
		result.append(severity);
		result.append(", newLevel: ");
		result.append(newLevel);
		result.append(", newSeverity: ");
		result.append(newSeverity);
		result.append(", newCategory: ");
		result.append(newCategory);
		result.append(", disabled: ");
		result.append(disabled);
		result.append(')');
		return result.toString();
	}

} //LogMessageRuleImpl
