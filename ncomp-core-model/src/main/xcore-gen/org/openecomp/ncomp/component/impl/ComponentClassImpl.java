
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

import org.openecomp.ncomp.component.Api;
import org.openecomp.ncomp.component.ComponentClass;
import org.openecomp.ncomp.component.ComponentPackage;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.LongMetricAttribute;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.component.impl.ComponentClassImpl#getApis <em>Apis</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.impl.ComponentClassImpl#getNumberOfResources <em>Number Of Resources</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.impl.ComponentClassImpl#getNumberOfUpdateRequests <em>Number Of Update Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.impl.ComponentClassImpl#getNumberOfCreateRequests <em>Number Of Create Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.impl.ComponentClassImpl#getNumberOfDeleteRequests <em>Number Of Delete Requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentClassImpl extends NamedEntityImpl implements ComponentClass {
	/**
	 * The cached value of the '{@link #getApis() <em>Apis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApis()
	 * @generated
	 * @ordered
	 */
	protected EList<Api> apis;

	/**
	 * The default value of the '{@link #getNumberOfResources() <em>Number Of Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfResources()
	 * @generated
	 * @ordered
	 */
	protected static final LongMetricAttribute NUMBER_OF_RESOURCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfResources() <em>Number Of Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfResources()
	 * @generated
	 * @ordered
	 */
	protected LongMetricAttribute numberOfResources = NUMBER_OF_RESOURCES_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumberOfUpdateRequests() <em>Number Of Update Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfUpdateRequests()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_OF_UPDATE_REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfUpdateRequests() <em>Number Of Update Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfUpdateRequests()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberOfUpdateRequests = NUMBER_OF_UPDATE_REQUESTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumberOfCreateRequests() <em>Number Of Create Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCreateRequests()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_OF_CREATE_REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfCreateRequests() <em>Number Of Create Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCreateRequests()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberOfCreateRequests = NUMBER_OF_CREATE_REQUESTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumberOfDeleteRequests() <em>Number Of Delete Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDeleteRequests()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_OF_DELETE_REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfDeleteRequests() <em>Number Of Delete Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDeleteRequests()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberOfDeleteRequests = NUMBER_OF_DELETE_REQUESTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Api> getApis() {
		if (apis == null) {
			apis = new EObjectContainmentEList<Api>(Api.class, this, ComponentPackage.COMPONENT_CLASS__APIS);
		}
		return apis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongMetricAttribute getNumberOfResources() {
		return numberOfResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfResources(LongMetricAttribute newNumberOfResources) {
		LongMetricAttribute oldNumberOfResources = numberOfResources;
		numberOfResources = newNumberOfResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CLASS__NUMBER_OF_RESOURCES, oldNumberOfResources, numberOfResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberOfUpdateRequests() {
		return numberOfUpdateRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfUpdateRequests(IncreasingULongMetricAttribute newNumberOfUpdateRequests) {
		IncreasingULongMetricAttribute oldNumberOfUpdateRequests = numberOfUpdateRequests;
		numberOfUpdateRequests = newNumberOfUpdateRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CLASS__NUMBER_OF_UPDATE_REQUESTS, oldNumberOfUpdateRequests, numberOfUpdateRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberOfCreateRequests() {
		return numberOfCreateRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCreateRequests(IncreasingULongMetricAttribute newNumberOfCreateRequests) {
		IncreasingULongMetricAttribute oldNumberOfCreateRequests = numberOfCreateRequests;
		numberOfCreateRequests = newNumberOfCreateRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CLASS__NUMBER_OF_CREATE_REQUESTS, oldNumberOfCreateRequests, numberOfCreateRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberOfDeleteRequests() {
		return numberOfDeleteRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDeleteRequests(IncreasingULongMetricAttribute newNumberOfDeleteRequests) {
		IncreasingULongMetricAttribute oldNumberOfDeleteRequests = numberOfDeleteRequests;
		numberOfDeleteRequests = newNumberOfDeleteRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_CLASS__NUMBER_OF_DELETE_REQUESTS, oldNumberOfDeleteRequests, numberOfDeleteRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_CLASS__APIS:
				return ((InternalEList<?>)getApis()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.COMPONENT_CLASS__APIS:
				return getApis();
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_RESOURCES:
				return getNumberOfResources();
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_UPDATE_REQUESTS:
				return getNumberOfUpdateRequests();
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_CREATE_REQUESTS:
				return getNumberOfCreateRequests();
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_DELETE_REQUESTS:
				return getNumberOfDeleteRequests();
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
			case ComponentPackage.COMPONENT_CLASS__APIS:
				getApis().clear();
				getApis().addAll((Collection<? extends Api>)newValue);
				return;
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_RESOURCES:
				setNumberOfResources((LongMetricAttribute)newValue);
				return;
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_UPDATE_REQUESTS:
				setNumberOfUpdateRequests((IncreasingULongMetricAttribute)newValue);
				return;
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_CREATE_REQUESTS:
				setNumberOfCreateRequests((IncreasingULongMetricAttribute)newValue);
				return;
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_DELETE_REQUESTS:
				setNumberOfDeleteRequests((IncreasingULongMetricAttribute)newValue);
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
			case ComponentPackage.COMPONENT_CLASS__APIS:
				getApis().clear();
				return;
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_RESOURCES:
				setNumberOfResources(NUMBER_OF_RESOURCES_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_UPDATE_REQUESTS:
				setNumberOfUpdateRequests(NUMBER_OF_UPDATE_REQUESTS_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_CREATE_REQUESTS:
				setNumberOfCreateRequests(NUMBER_OF_CREATE_REQUESTS_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_DELETE_REQUESTS:
				setNumberOfDeleteRequests(NUMBER_OF_DELETE_REQUESTS_EDEFAULT);
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
			case ComponentPackage.COMPONENT_CLASS__APIS:
				return apis != null && !apis.isEmpty();
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_RESOURCES:
				return NUMBER_OF_RESOURCES_EDEFAULT == null ? numberOfResources != null : !NUMBER_OF_RESOURCES_EDEFAULT.equals(numberOfResources);
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_UPDATE_REQUESTS:
				return NUMBER_OF_UPDATE_REQUESTS_EDEFAULT == null ? numberOfUpdateRequests != null : !NUMBER_OF_UPDATE_REQUESTS_EDEFAULT.equals(numberOfUpdateRequests);
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_CREATE_REQUESTS:
				return NUMBER_OF_CREATE_REQUESTS_EDEFAULT == null ? numberOfCreateRequests != null : !NUMBER_OF_CREATE_REQUESTS_EDEFAULT.equals(numberOfCreateRequests);
			case ComponentPackage.COMPONENT_CLASS__NUMBER_OF_DELETE_REQUESTS:
				return NUMBER_OF_DELETE_REQUESTS_EDEFAULT == null ? numberOfDeleteRequests != null : !NUMBER_OF_DELETE_REQUESTS_EDEFAULT.equals(numberOfDeleteRequests);
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
		result.append(" (numberOfResources: ");
		result.append(numberOfResources);
		result.append(", numberOfUpdateRequests: ");
		result.append(numberOfUpdateRequests);
		result.append(", numberOfCreateRequests: ");
		result.append(numberOfCreateRequests);
		result.append(", numberOfDeleteRequests: ");
		result.append(numberOfDeleteRequests);
		result.append(')');
		return result.toString();
	}

} //ComponentClassImpl
