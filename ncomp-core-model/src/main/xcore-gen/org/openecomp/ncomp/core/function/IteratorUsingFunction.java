
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
package org.openecomp.ncomp.core.function;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator Using Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.function.IteratorUsingFunction#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.IteratorUsingFunction#isRecursive <em>Recursive</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.IteratorUsingFunction#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.core.function.FunctionPackage#getIteratorUsingFunction()
 * @model
 * @generated
 */
public interface IteratorUsingFunction extends Iterator {
	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' attribute list.
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getIteratorUsingFunction_Paths()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPaths();

	/**
	 * Returns the value of the '<em><b>Recursive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive</em>' attribute.
	 * @see #setRecursive(boolean)
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getIteratorUsingFunction_Recursive()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRecursive();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.IteratorUsingFunction#isRecursive <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive</em>' attribute.
	 * @see #isRecursive()
	 * @generated
	 */
	void setRecursive(boolean value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(Function)
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getIteratorUsingFunction_Filter()
	 * @model containment="true"
	 * @generated
	 */
	Function getFilter();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.IteratorUsingFunction#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Function value);

} // IteratorUsingFunction
