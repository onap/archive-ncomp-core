
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Operational State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.HasOperationalState#getOperationalState <em>Operational State</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.CorePackage#getHasOperationalState()
 * @model abstract="true"
 * @generated
 */
public interface HasOperationalState extends EObject {
	/**
	 * Returns the value of the '<em><b>Operational State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.core.OperationalState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational State</em>' attribute.
	 * @see org.openecomp.ncomp.core.OperationalState
	 * @see #setOperationalState(OperationalState)
	 * @see org.openecomp.ncomp.core.CorePackage#getHasOperationalState_OperationalState()
	 * @model unique="false"
	 * @generated
	 */
	OperationalState getOperationalState();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.HasOperationalState#getOperationalState <em>Operational State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational State</em>' attribute.
	 * @see org.openecomp.ncomp.core.OperationalState
	 * @see #getOperationalState()
	 * @generated
	 */
	void setOperationalState(OperationalState value);

} // HasOperationalState
