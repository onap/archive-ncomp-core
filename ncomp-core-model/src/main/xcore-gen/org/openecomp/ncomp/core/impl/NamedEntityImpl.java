
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
package org.openecomp.ncomp.core.impl;

import org.openecomp.ncomp.core.CorePackage;
import org.openecomp.ncomp.core.NamedEntity;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.impl.NamedEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.impl.NamedEntityImpl#getLastPolled <em>Last Polled</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.impl.NamedEntityImpl#getLastChanged <em>Last Changed</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.impl.NamedEntityImpl#getCreated <em>Created</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamedEntityImpl extends MinimalEObjectImpl.Container implements NamedEntity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastPolled() <em>Last Polled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPolled()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_POLLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastPolled() <em>Last Polled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPolled()
	 * @generated
	 * @ordered
	 */
	protected Date lastPolled = LAST_POLLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastChanged() <em>Last Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChanged()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_CHANGED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastChanged() <em>Last Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChanged()
	 * @generated
	 * @ordered
	 */
	protected Date lastChanged = LAST_CHANGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.NAMED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAMED_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastPolled() {
		return lastPolled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastPolled(Date newLastPolled) {
		Date oldLastPolled = lastPolled;
		lastPolled = newLastPolled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAMED_ENTITY__LAST_POLLED, oldLastPolled, lastPolled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastChanged() {
		return lastChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastChanged(Date newLastChanged) {
		Date oldLastChanged = lastChanged;
		lastChanged = newLastChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAMED_ENTITY__LAST_CHANGED, oldLastChanged, lastChanged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAMED_ENTITY__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.NAMED_ENTITY__NAME:
				return getName();
			case CorePackage.NAMED_ENTITY__LAST_POLLED:
				return getLastPolled();
			case CorePackage.NAMED_ENTITY__LAST_CHANGED:
				return getLastChanged();
			case CorePackage.NAMED_ENTITY__CREATED:
				return getCreated();
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
			case CorePackage.NAMED_ENTITY__NAME:
				setName((String)newValue);
				return;
			case CorePackage.NAMED_ENTITY__LAST_POLLED:
				setLastPolled((Date)newValue);
				return;
			case CorePackage.NAMED_ENTITY__LAST_CHANGED:
				setLastChanged((Date)newValue);
				return;
			case CorePackage.NAMED_ENTITY__CREATED:
				setCreated((Date)newValue);
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
			case CorePackage.NAMED_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.NAMED_ENTITY__LAST_POLLED:
				setLastPolled(LAST_POLLED_EDEFAULT);
				return;
			case CorePackage.NAMED_ENTITY__LAST_CHANGED:
				setLastChanged(LAST_CHANGED_EDEFAULT);
				return;
			case CorePackage.NAMED_ENTITY__CREATED:
				setCreated(CREATED_EDEFAULT);
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
			case CorePackage.NAMED_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.NAMED_ENTITY__LAST_POLLED:
				return LAST_POLLED_EDEFAULT == null ? lastPolled != null : !LAST_POLLED_EDEFAULT.equals(lastPolled);
			case CorePackage.NAMED_ENTITY__LAST_CHANGED:
				return LAST_CHANGED_EDEFAULT == null ? lastChanged != null : !LAST_CHANGED_EDEFAULT.equals(lastChanged);
			case CorePackage.NAMED_ENTITY__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", lastPolled: ");
		result.append(lastPolled);
		result.append(", lastChanged: ");
		result.append(lastChanged);
		result.append(", created: ");
		result.append(created);
		result.append(')');
		return result.toString();
	}

} //NamedEntityImpl
