
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
package org.openecomp.ncomp.component;

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.LongMetricAttribute;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.component.ComponentClass#getApis <em>Apis</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfResources <em>Number Of Resources</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfUpdateRequests <em>Number Of Update Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfCreateRequests <em>Number Of Create Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfDeleteRequests <em>Number Of Delete Requests</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.component.ComponentPackage#getComponentClass()
 * @model
 * @generated
 */
public interface ComponentClass extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Apis</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.component.Api}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apis</em>' containment reference list.
	 * @see org.openecomp.ncomp.component.ComponentPackage#getComponentClass_Apis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Api> getApis();

	/**
	 * Returns the value of the '<em><b>Number Of Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Resources</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Resources</em>' attribute.
	 * @see #setNumberOfResources(LongMetricAttribute)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getComponentClass_NumberOfResources()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.LongMetricAttribute"
	 * @generated
	 */
	LongMetricAttribute getNumberOfResources();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfResources <em>Number Of Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Resources</em>' attribute.
	 * @see #getNumberOfResources()
	 * @generated
	 */
	void setNumberOfResources(LongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Of Update Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Update Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Update Requests</em>' attribute.
	 * @see #setNumberOfUpdateRequests(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getComponentClass_NumberOfUpdateRequests()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfUpdateRequests();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfUpdateRequests <em>Number Of Update Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Update Requests</em>' attribute.
	 * @see #getNumberOfUpdateRequests()
	 * @generated
	 */
	void setNumberOfUpdateRequests(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Of Create Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Create Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Create Requests</em>' attribute.
	 * @see #setNumberOfCreateRequests(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getComponentClass_NumberOfCreateRequests()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfCreateRequests();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfCreateRequests <em>Number Of Create Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Create Requests</em>' attribute.
	 * @see #getNumberOfCreateRequests()
	 * @generated
	 */
	void setNumberOfCreateRequests(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Of Delete Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Delete Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Delete Requests</em>' attribute.
	 * @see #setNumberOfDeleteRequests(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.component.ComponentPackage#getComponentClass_NumberOfDeleteRequests()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfDeleteRequests();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.component.ComponentClass#getNumberOfDeleteRequests <em>Number Of Delete Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Delete Requests</em>' attribute.
	 * @see #getNumberOfDeleteRequests()
	 * @generated
	 */
	void setNumberOfDeleteRequests(IncreasingULongMetricAttribute value);

} // ComponentClass
