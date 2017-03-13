
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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.NamedEntity#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.NamedEntity#getLastPolled <em>Last Polled</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.NamedEntity#getLastChanged <em>Last Changed</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.NamedEntity#getCreated <em>Created</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.CorePackage#getNamedEntity()
 * @model abstract="true"
 * @generated
 */
public interface NamedEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openecomp.ncomp.core.CorePackage#getNamedEntity_Name()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.NamedEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Polled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Polled</em>' attribute.
	 * @see #setLastPolled(Date)
	 * @see org.openecomp.ncomp.core.CorePackage#getNamedEntity_LastPolled()
	 * @model unique="false"
	 * @generated
	 */
	Date getLastPolled();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.NamedEntity#getLastPolled <em>Last Polled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Polled</em>' attribute.
	 * @see #getLastPolled()
	 * @generated
	 */
	void setLastPolled(Date value);

	/**
	 * Returns the value of the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Changed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Changed</em>' attribute.
	 * @see #setLastChanged(Date)
	 * @see org.openecomp.ncomp.core.CorePackage#getNamedEntity_LastChanged()
	 * @model unique="false"
	 * @generated
	 */
	Date getLastChanged();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.NamedEntity#getLastChanged <em>Last Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Changed</em>' attribute.
	 * @see #getLastChanged()
	 * @generated
	 */
	void setLastChanged(Date value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see org.openecomp.ncomp.core.CorePackage#getNamedEntity_Created()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.NamedEntity#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

} // NamedEntity
