
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
import org.openecomp.ncomp.component.ApiRequest;
import org.openecomp.ncomp.component.ComponentPackage;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.LongMetricAttribute;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.component.impl.ApiImpl#getNumberOfRequests <em>Number Of Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.impl.ApiImpl#getNumberOfErrorRequests <em>Number Of Error Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.impl.ApiImpl#getNumberOfCompletedRequests <em>Number Of Completed Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.impl.ApiImpl#getOutstandingRequests <em>Outstanding Requests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.component.impl.ApiImpl#getLastRequestDuration <em>Last Request Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApiImpl extends NamedEntityImpl implements Api {
	/**
	 * The default value of the '{@link #getNumberOfRequests() <em>Number Of Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRequests()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_OF_REQUESTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNumberOfRequests() <em>Number Of Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRequests()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberOfRequests = NUMBER_OF_REQUESTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumberOfErrorRequests() <em>Number Of Error Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfErrorRequests()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_OF_ERROR_REQUESTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNumberOfErrorRequests() <em>Number Of Error Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfErrorRequests()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberOfErrorRequests = NUMBER_OF_ERROR_REQUESTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumberOfCompletedRequests() <em>Number Of Completed Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCompletedRequests()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_OF_COMPLETED_REQUESTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNumberOfCompletedRequests() <em>Number Of Completed Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCompletedRequests()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberOfCompletedRequests = NUMBER_OF_COMPLETED_REQUESTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getOutstandingRequests() <em>Outstanding Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutstandingRequests()
	 * @generated
	 * @ordered
	 */
	protected static final LongMetricAttribute OUTSTANDING_REQUESTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOutstandingRequests() <em>Outstanding Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutstandingRequests()
	 * @generated
	 * @ordered
	 */
	protected LongMetricAttribute outstandingRequests = OUTSTANDING_REQUESTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastRequestDuration() <em>Last Request Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRequestDuration()
	 * @generated
	 * @ordered
	 */
	protected static final LongMetricAttribute LAST_REQUEST_DURATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastRequestDuration() <em>Last Request Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRequestDuration()
	 * @generated
	 * @ordered
	 */
	protected LongMetricAttribute lastRequestDuration = LAST_REQUEST_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberOfRequests() {
		return numberOfRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRequests(IncreasingULongMetricAttribute newNumberOfRequests) {
		IncreasingULongMetricAttribute oldNumberOfRequests = numberOfRequests;
		numberOfRequests = newNumberOfRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.API__NUMBER_OF_REQUESTS, oldNumberOfRequests, numberOfRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberOfErrorRequests() {
		return numberOfErrorRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfErrorRequests(IncreasingULongMetricAttribute newNumberOfErrorRequests) {
		IncreasingULongMetricAttribute oldNumberOfErrorRequests = numberOfErrorRequests;
		numberOfErrorRequests = newNumberOfErrorRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.API__NUMBER_OF_ERROR_REQUESTS, oldNumberOfErrorRequests, numberOfErrorRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberOfCompletedRequests() {
		return numberOfCompletedRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCompletedRequests(IncreasingULongMetricAttribute newNumberOfCompletedRequests) {
		IncreasingULongMetricAttribute oldNumberOfCompletedRequests = numberOfCompletedRequests;
		numberOfCompletedRequests = newNumberOfCompletedRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.API__NUMBER_OF_COMPLETED_REQUESTS, oldNumberOfCompletedRequests, numberOfCompletedRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongMetricAttribute getOutstandingRequests() {
		return outstandingRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutstandingRequests(LongMetricAttribute newOutstandingRequests) {
		LongMetricAttribute oldOutstandingRequests = outstandingRequests;
		outstandingRequests = newOutstandingRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.API__OUTSTANDING_REQUESTS, oldOutstandingRequests, outstandingRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongMetricAttribute getLastRequestDuration() {
		return lastRequestDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRequestDuration(LongMetricAttribute newLastRequestDuration) {
		LongMetricAttribute oldLastRequestDuration = lastRequestDuration;
		lastRequestDuration = newLastRequestDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.API__LAST_REQUEST_DURATION, oldLastRequestDuration, lastRequestDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApiRequest> currentRequests() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.API__NUMBER_OF_REQUESTS:
				return getNumberOfRequests();
			case ComponentPackage.API__NUMBER_OF_ERROR_REQUESTS:
				return getNumberOfErrorRequests();
			case ComponentPackage.API__NUMBER_OF_COMPLETED_REQUESTS:
				return getNumberOfCompletedRequests();
			case ComponentPackage.API__OUTSTANDING_REQUESTS:
				return getOutstandingRequests();
			case ComponentPackage.API__LAST_REQUEST_DURATION:
				return getLastRequestDuration();
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
			case ComponentPackage.API__NUMBER_OF_REQUESTS:
				setNumberOfRequests((IncreasingULongMetricAttribute)newValue);
				return;
			case ComponentPackage.API__NUMBER_OF_ERROR_REQUESTS:
				setNumberOfErrorRequests((IncreasingULongMetricAttribute)newValue);
				return;
			case ComponentPackage.API__NUMBER_OF_COMPLETED_REQUESTS:
				setNumberOfCompletedRequests((IncreasingULongMetricAttribute)newValue);
				return;
			case ComponentPackage.API__OUTSTANDING_REQUESTS:
				setOutstandingRequests((LongMetricAttribute)newValue);
				return;
			case ComponentPackage.API__LAST_REQUEST_DURATION:
				setLastRequestDuration((LongMetricAttribute)newValue);
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
			case ComponentPackage.API__NUMBER_OF_REQUESTS:
				setNumberOfRequests(NUMBER_OF_REQUESTS_EDEFAULT);
				return;
			case ComponentPackage.API__NUMBER_OF_ERROR_REQUESTS:
				setNumberOfErrorRequests(NUMBER_OF_ERROR_REQUESTS_EDEFAULT);
				return;
			case ComponentPackage.API__NUMBER_OF_COMPLETED_REQUESTS:
				setNumberOfCompletedRequests(NUMBER_OF_COMPLETED_REQUESTS_EDEFAULT);
				return;
			case ComponentPackage.API__OUTSTANDING_REQUESTS:
				setOutstandingRequests(OUTSTANDING_REQUESTS_EDEFAULT);
				return;
			case ComponentPackage.API__LAST_REQUEST_DURATION:
				setLastRequestDuration(LAST_REQUEST_DURATION_EDEFAULT);
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
			case ComponentPackage.API__NUMBER_OF_REQUESTS:
				return NUMBER_OF_REQUESTS_EDEFAULT == null ? numberOfRequests != null : !NUMBER_OF_REQUESTS_EDEFAULT.equals(numberOfRequests);
			case ComponentPackage.API__NUMBER_OF_ERROR_REQUESTS:
				return NUMBER_OF_ERROR_REQUESTS_EDEFAULT == null ? numberOfErrorRequests != null : !NUMBER_OF_ERROR_REQUESTS_EDEFAULT.equals(numberOfErrorRequests);
			case ComponentPackage.API__NUMBER_OF_COMPLETED_REQUESTS:
				return NUMBER_OF_COMPLETED_REQUESTS_EDEFAULT == null ? numberOfCompletedRequests != null : !NUMBER_OF_COMPLETED_REQUESTS_EDEFAULT.equals(numberOfCompletedRequests);
			case ComponentPackage.API__OUTSTANDING_REQUESTS:
				return OUTSTANDING_REQUESTS_EDEFAULT == null ? outstandingRequests != null : !OUTSTANDING_REQUESTS_EDEFAULT.equals(outstandingRequests);
			case ComponentPackage.API__LAST_REQUEST_DURATION:
				return LAST_REQUEST_DURATION_EDEFAULT == null ? lastRequestDuration != null : !LAST_REQUEST_DURATION_EDEFAULT.equals(lastRequestDuration);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ComponentPackage.API___CURRENT_REQUESTS:
				return currentRequests();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (numberOfRequests: ");
		result.append(numberOfRequests);
		result.append(", numberOfErrorRequests: ");
		result.append(numberOfErrorRequests);
		result.append(", numberOfCompletedRequests: ");
		result.append(numberOfCompletedRequests);
		result.append(", outstandingRequests: ");
		result.append(outstandingRequests);
		result.append(", lastRequestDuration: ");
		result.append(lastRequestDuration);
		result.append(')');
		return result.toString();
	}

} //ApiImpl
