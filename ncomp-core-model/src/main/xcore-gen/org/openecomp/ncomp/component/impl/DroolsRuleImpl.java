
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
package org.openecomp.ncomp.component.impl;

import org.openecomp.ncomp.component.ComponentPackage;
import org.openecomp.ncomp.component.DroolsRule;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drools Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.component.impl.DroolsRuleImpl#getNumberOfFires <em>Number Of Fires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DroolsRuleImpl extends NamedEntityImpl implements DroolsRule {
	/**
	 * The default value of the '{@link #getNumberOfFires() <em>Number Of Fires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFires()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_OF_FIRES_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNumberOfFires() <em>Number Of Fires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFires()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberOfFires = NUMBER_OF_FIRES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroolsRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.DROOLS_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberOfFires() {
		return numberOfFires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfFires(IncreasingULongMetricAttribute newNumberOfFires) {
		IncreasingULongMetricAttribute oldNumberOfFires = numberOfFires;
		numberOfFires = newNumberOfFires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DROOLS_RULE__NUMBER_OF_FIRES, oldNumberOfFires, numberOfFires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.DROOLS_RULE__NUMBER_OF_FIRES:
				return getNumberOfFires();
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
			case ComponentPackage.DROOLS_RULE__NUMBER_OF_FIRES:
				setNumberOfFires((IncreasingULongMetricAttribute)newValue);
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
			case ComponentPackage.DROOLS_RULE__NUMBER_OF_FIRES:
				setNumberOfFires(NUMBER_OF_FIRES_EDEFAULT);
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
			case ComponentPackage.DROOLS_RULE__NUMBER_OF_FIRES:
				return NUMBER_OF_FIRES_EDEFAULT == null ? numberOfFires != null : !NUMBER_OF_FIRES_EDEFAULT.equals(numberOfFires);
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
		result.append(" (numberOfFires: ");
		result.append(numberOfFires);
		result.append(')');
		return result.toString();
	}

} //DroolsRuleImpl
