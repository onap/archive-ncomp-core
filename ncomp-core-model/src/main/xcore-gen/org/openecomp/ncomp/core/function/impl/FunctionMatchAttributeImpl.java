
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

import org.openecomp.ncomp.core.function.FunctionMatchAttribute;
import org.openecomp.ncomp.core.function.FunctionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.function.impl.FunctionMatchAttributeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.impl.FunctionMatchAttributeImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.impl.FunctionMatchAttributeImpl#isNegation <em>Negation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionMatchAttributeImpl extends FunctionMatchImpl implements FunctionMatchAttribute {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatch() <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected String match = MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #isNegation() <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegation() <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegation()
	 * @generated
	 * @ordered
	 */
	protected boolean negation = NEGATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionMatchAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionPackage.Literals.FUNCTION_MATCH_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatch() {
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatch(String newMatch) {
		String oldMatch = match;
		match = newMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__MATCH, oldMatch, match));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegation() {
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegation(boolean newNegation) {
		boolean oldNegation = negation;
		negation = newNegation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__NEGATION, oldNegation, negation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__PATH:
				return getPath();
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__MATCH:
				return getMatch();
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__NEGATION:
				return isNegation();
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
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__PATH:
				setPath((String)newValue);
				return;
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__MATCH:
				setMatch((String)newValue);
				return;
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__NEGATION:
				setNegation((Boolean)newValue);
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
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__MATCH:
				setMatch(MATCH_EDEFAULT);
				return;
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__NEGATION:
				setNegation(NEGATION_EDEFAULT);
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
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__MATCH:
				return MATCH_EDEFAULT == null ? match != null : !MATCH_EDEFAULT.equals(match);
			case FunctionPackage.FUNCTION_MATCH_ATTRIBUTE__NEGATION:
				return negation != NEGATION_EDEFAULT;
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
		result.append(" (path: ");
		result.append(path);
		result.append(", match: ");
		result.append(match);
		result.append(", negation: ");
		result.append(negation);
		result.append(')');
		return result.toString();
	}

} //FunctionMatchAttributeImpl
