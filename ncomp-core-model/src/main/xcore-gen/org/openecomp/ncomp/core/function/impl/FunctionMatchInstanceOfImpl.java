
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

import org.openecomp.ncomp.core.function.FunctionMatchInstanceOf;
import org.openecomp.ncomp.core.function.FunctionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Instance Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.function.impl.FunctionMatchInstanceOfImpl#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.impl.FunctionMatchInstanceOfImpl#getEName <em>EName</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionMatchInstanceOfImpl extends FunctionMatchImpl implements FunctionMatchInstanceOf {
	/**
	 * The default value of the '{@link #getEPackage() <em>EPackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String EPACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEPackage() <em>EPackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackage()
	 * @generated
	 * @ordered
	 */
	protected String ePackage = EPACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEName() <em>EName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEName() <em>EName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEName()
	 * @generated
	 * @ordered
	 */
	protected String eName = ENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionMatchInstanceOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionPackage.Literals.FUNCTION_MATCH_INSTANCE_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEPackage() {
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEPackage(String newEPackage) {
		String oldEPackage = ePackage;
		ePackage = newEPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNCTION_MATCH_INSTANCE_OF__EPACKAGE, oldEPackage, ePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEName() {
		return eName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEName(String newEName) {
		String oldEName = eName;
		eName = newEName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNCTION_MATCH_INSTANCE_OF__ENAME, oldEName, eName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionPackage.FUNCTION_MATCH_INSTANCE_OF__EPACKAGE:
				return getEPackage();
			case FunctionPackage.FUNCTION_MATCH_INSTANCE_OF__ENAME:
				return getEName();
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
			case FunctionPackage.FUNCTION_MATCH_INSTANCE_OF__EPACKAGE:
				setEPackage((String)newValue);
				return;
			case FunctionPackage.FUNCTION_MATCH_INSTANCE_OF__ENAME:
				setEName((String)newValue);
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
			case FunctionPackage.FUNCTION_MATCH_INSTANCE_OF__EPACKAGE:
				setEPackage(EPACKAGE_EDEFAULT);
				return;
			case FunctionPackage.FUNCTION_MATCH_INSTANCE_OF__ENAME:
				setEName(ENAME_EDEFAULT);
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
			case FunctionPackage.FUNCTION_MATCH_INSTANCE_OF__EPACKAGE:
				return EPACKAGE_EDEFAULT == null ? ePackage != null : !EPACKAGE_EDEFAULT.equals(ePackage);
			case FunctionPackage.FUNCTION_MATCH_INSTANCE_OF__ENAME:
				return ENAME_EDEFAULT == null ? eName != null : !ENAME_EDEFAULT.equals(eName);
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
		result.append(" (ePackage: ");
		result.append(ePackage);
		result.append(", eName: ");
		result.append(eName);
		result.append(')');
		return result.toString();
	}

} //FunctionMatchInstanceOfImpl
