
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
package org.openecomp.ncomp.core.function.impl;

import org.openecomp.ncomp.core.function.FunctionMatch;
import org.openecomp.ncomp.core.function.FunctionPackage;
import org.openecomp.ncomp.core.function.FunctionUpdate;
import org.openecomp.ncomp.core.function.FunctionUpdateRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.function.impl.FunctionUpdateRuleImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.impl.FunctionUpdateRuleImpl#getUpdates <em>Updates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionUpdateRuleImpl extends MinimalEObjectImpl.Container implements FunctionUpdateRule {
	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionMatch> matches;

	/**
	 * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdates()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionUpdate> updates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionUpdateRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionPackage.Literals.FUNCTION_UPDATE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionMatch> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentEList<FunctionMatch>(FunctionMatch.class, this, FunctionPackage.FUNCTION_UPDATE_RULE__MATCHES);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionUpdate> getUpdates() {
		if (updates == null) {
			updates = new EObjectContainmentEList<FunctionUpdate>(FunctionUpdate.class, this, FunctionPackage.FUNCTION_UPDATE_RULE__UPDATES);
		}
		return updates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionPackage.FUNCTION_UPDATE_RULE__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case FunctionPackage.FUNCTION_UPDATE_RULE__UPDATES:
				return ((InternalEList<?>)getUpdates()).basicRemove(otherEnd, msgs);
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
			case FunctionPackage.FUNCTION_UPDATE_RULE__MATCHES:
				return getMatches();
			case FunctionPackage.FUNCTION_UPDATE_RULE__UPDATES:
				return getUpdates();
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
			case FunctionPackage.FUNCTION_UPDATE_RULE__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends FunctionMatch>)newValue);
				return;
			case FunctionPackage.FUNCTION_UPDATE_RULE__UPDATES:
				getUpdates().clear();
				getUpdates().addAll((Collection<? extends FunctionUpdate>)newValue);
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
			case FunctionPackage.FUNCTION_UPDATE_RULE__MATCHES:
				getMatches().clear();
				return;
			case FunctionPackage.FUNCTION_UPDATE_RULE__UPDATES:
				getUpdates().clear();
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
			case FunctionPackage.FUNCTION_UPDATE_RULE__MATCHES:
				return matches != null && !matches.isEmpty();
			case FunctionPackage.FUNCTION_UPDATE_RULE__UPDATES:
				return updates != null && !updates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionUpdateRuleImpl
