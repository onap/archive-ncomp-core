
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionMatchAttribute#getPath <em>Path</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionMatchAttribute#getMatch <em>Match</em>}</li>
 *   <li>{@link org.openecomp.ncomp.core.function.FunctionMatchAttribute#isNegation <em>Negation</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchAttribute()
 * @model
 * @generated
 */
public interface FunctionMatchAttribute extends FunctionMatch {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchAttribute_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.FunctionMatchAttribute#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' attribute.
	 * @see #setMatch(String)
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchAttribute_Match()
	 * @model unique="false"
	 * @generated
	 */
	String getMatch();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.FunctionMatchAttribute#getMatch <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' attribute.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(String value);

	/**
	 * Returns the value of the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negation</em>' attribute.
	 * @see #setNegation(boolean)
	 * @see org.openecomp.ncomp.core.function.FunctionPackage#getFunctionMatchAttribute_Negation()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNegation();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.core.function.FunctionMatchAttribute#isNegation <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negation</em>' attribute.
	 * @see #isNegation()
	 * @generated
	 */
	void setNegation(boolean value);

} // FunctionMatchAttribute
