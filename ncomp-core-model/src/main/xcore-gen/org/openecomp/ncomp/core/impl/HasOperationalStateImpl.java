
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
import org.openecomp.ncomp.core.HasOperationalState;
import org.openecomp.ncomp.core.OperationalState;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Operational State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.impl.HasOperationalStateImpl#getOperationalState <em>Operational State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HasOperationalStateImpl extends MinimalEObjectImpl.Container implements HasOperationalState {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasOperationalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.HAS_OPERATIONAL_STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HAS_OPERATIONAL_STATE__OPERATIONAL_STATE, oldOperationalState, operationalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.HAS_OPERATIONAL_STATE__OPERATIONAL_STATE:
				return getOperationalState();
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
			case CorePackage.HAS_OPERATIONAL_STATE__OPERATIONAL_STATE:
				setOperationalState((OperationalState)newValue);
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
			case CorePackage.HAS_OPERATIONAL_STATE__OPERATIONAL_STATE:
				setOperationalState(OPERATIONAL_STATE_EDEFAULT);
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
			case CorePackage.HAS_OPERATIONAL_STATE__OPERATIONAL_STATE:
				return operationalState != OPERATIONAL_STATE_EDEFAULT;
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
		result.append(" (operationalState: ");
		result.append(operationalState);
		result.append(')');
		return result.toString();
	}

} //HasOperationalStateImpl
