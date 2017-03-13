
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
package org.openecomp.ncomp.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deployment Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.core.CorePackage#getDeploymentStatus()
 * @model
 * @generated
 */
public enum DeploymentStatus implements Enumerator {
	/**
	 * The '<em><b>UNDEPLOYED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEPLOYED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEPLOYED(0, "UNDEPLOYED", "UNDEPLOYED"),

	/**
	 * The '<em><b>DEPLOYED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYED_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYED(0, "DEPLOYED", "DEPLOYED"),

	/**
	 * The '<em><b>DEPLOYED PARTIALLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYED_PARTIALLY_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYED_PARTIALLY(0, "DEPLOYED_PARTIALLY", "DEPLOYED_PARTIALLY"),

	/**
	 * The '<em><b>DEPLOYED ERRORS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYED_ERRORS_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYED_ERRORS(0, "DEPLOYED_ERRORS", "DEPLOYED_ERRORS");

	/**
	 * The '<em><b>UNDEPLOYED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDEPLOYED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEPLOYED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEPLOYED_VALUE = 0;

	/**
	 * The '<em><b>DEPLOYED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPLOYED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOYED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYED_VALUE = 0;

	/**
	 * The '<em><b>DEPLOYED PARTIALLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPLOYED PARTIALLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOYED_PARTIALLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYED_PARTIALLY_VALUE = 0;

	/**
	 * The '<em><b>DEPLOYED ERRORS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPLOYED ERRORS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOYED_ERRORS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYED_ERRORS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Deployment Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeploymentStatus[] VALUES_ARRAY =
		new DeploymentStatus[] {
			UNDEPLOYED,
			DEPLOYED,
			DEPLOYED_PARTIALLY,
			DEPLOYED_ERRORS,
		};

	/**
	 * A public read-only list of all the '<em><b>Deployment Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeploymentStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deployment Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentStatus get(int value) {
		switch (value) {
			case UNDEPLOYED_VALUE: return UNDEPLOYED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeploymentStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DeploymentStatus
