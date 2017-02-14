
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

import org.openecomp.ncomp.component.Component;
import org.openecomp.ncomp.component.ComponentClass;
import org.openecomp.ncomp.component.ComponentPackage;
import org.openecomp.ncomp.component.DroolsRuntime;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.component.impl.ComponentImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.impl.ComponentImpl#getDroolsRuntimes <em>Drools Runtimes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends NamedEntityImpl implements Component {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentClass> classes;
	/**
	 * The cached value of the '{@link #getDroolsRuntimes() <em>Drools Runtimes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroolsRuntimes()
	 * @generated
	 * @ordered
	 */
	protected EList<DroolsRuntime> droolsRuntimes;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<ComponentClass>(ComponentClass.class, this, ComponentPackage.COMPONENT__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DroolsRuntime> getDroolsRuntimes() {
		if (droolsRuntimes == null) {
			droolsRuntimes = new EObjectContainmentEList<DroolsRuntime>(DroolsRuntime.class, this, ComponentPackage.COMPONENT__DROOLS_RUNTIMES);
		}
		return droolsRuntimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.COMPONENT__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT__DROOLS_RUNTIMES:
				return ((InternalEList<?>)getDroolsRuntimes()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.COMPONENT__CLASSES:
				return getClasses();
			case ComponentPackage.COMPONENT__DROOLS_RUNTIMES:
				return getDroolsRuntimes();
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
			case ComponentPackage.COMPONENT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ComponentClass>)newValue);
				return;
			case ComponentPackage.COMPONENT__DROOLS_RUNTIMES:
				getDroolsRuntimes().clear();
				getDroolsRuntimes().addAll((Collection<? extends DroolsRuntime>)newValue);
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
			case ComponentPackage.COMPONENT__CLASSES:
				getClasses().clear();
				return;
			case ComponentPackage.COMPONENT__DROOLS_RUNTIMES:
				getDroolsRuntimes().clear();
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
			case ComponentPackage.COMPONENT__CLASSES:
				return classes != null && !classes.isEmpty();
			case ComponentPackage.COMPONENT__DROOLS_RUNTIMES:
				return droolsRuntimes != null && !droolsRuntimes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
