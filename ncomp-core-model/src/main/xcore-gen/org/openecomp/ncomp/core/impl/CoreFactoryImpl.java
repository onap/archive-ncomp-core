
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
package org.openecomp.ncomp.core.impl;

import org.openecomp.ncomp.core.*;

import org.openecomp.ncomp.core.types.metrics.DateMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.LongMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.StringMetricAttribute;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.USER: return createUser();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.OPERATIONAL_STATE:
				return createOperationalStateFromString(eDataType, initialValue);
			case CorePackage.DEPLOYMENT_STATUS:
				return createDeploymentStatusFromString(eDataType, initialValue);
			case CorePackage.JSON_OBJECT:
				return createJsonObjectFromString(eDataType, initialValue);
			case CorePackage.REMOTE_CONTEXT:
				return createRemoteContextFromString(eDataType, initialValue);
			case CorePackage.INCREASING_ULONG_METRIC_ATTRIBUTE:
				return createIncreasingULongMetricAttributeFromString(eDataType, initialValue);
			case CorePackage.LONG_METRIC_ATTRIBUTE:
				return createLongMetricAttributeFromString(eDataType, initialValue);
			case CorePackage.DOUBLE_METRIC_ATTRIBUTE:
				return createDoubleMetricAttributeFromString(eDataType, initialValue);
			case CorePackage.STRING_METRIC_ATTRIBUTE:
				return createStringMetricAttributeFromString(eDataType, initialValue);
			case CorePackage.DATE_METRIC_ATTRIBUTE:
				return createDateMetricAttributeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.OPERATIONAL_STATE:
				return convertOperationalStateToString(eDataType, instanceValue);
			case CorePackage.DEPLOYMENT_STATUS:
				return convertDeploymentStatusToString(eDataType, instanceValue);
			case CorePackage.JSON_OBJECT:
				return convertJsonObjectToString(eDataType, instanceValue);
			case CorePackage.REMOTE_CONTEXT:
				return convertRemoteContextToString(eDataType, instanceValue);
			case CorePackage.INCREASING_ULONG_METRIC_ATTRIBUTE:
				return convertIncreasingULongMetricAttributeToString(eDataType, instanceValue);
			case CorePackage.LONG_METRIC_ATTRIBUTE:
				return convertLongMetricAttributeToString(eDataType, instanceValue);
			case CorePackage.DOUBLE_METRIC_ATTRIBUTE:
				return convertDoubleMetricAttributeToString(eDataType, instanceValue);
			case CorePackage.STRING_METRIC_ATTRIBUTE:
				return convertStringMetricAttributeToString(eDataType, instanceValue);
			case CorePackage.DATE_METRIC_ATTRIBUTE:
				return convertDateMetricAttributeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalState createOperationalStateFromString(EDataType eDataType, String initialValue) {
		OperationalState result = OperationalState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationalStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentStatus createDeploymentStatusFromString(EDataType eDataType, String initialValue) {
		DeploymentStatus result = DeploymentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeploymentStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject createJsonObject(final String it) {
		JSONObject _xtrycatchfinallyexpression = null;
		try {
			JSONObject _xifexpression = null;
			boolean _notEquals = (!Objects.equal(it, null));
			if (_notEquals) {
				_xifexpression = new JSONObject(it);
			}
			_xtrycatchfinallyexpression = _xifexpression;
		}
		catch (final Throwable _t) {
			if (_t instanceof Exception) {
				final Exception e = (Exception)_t;
				throw new RuntimeException(((("Bad JSON String: " + it) + " ") + e));
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
		return _xtrycatchfinallyexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject createJsonObjectFromString(EDataType eDataType, String initialValue) {
		return createJsonObject(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject createRemoteContext(final String it) {
		JSONObject _xtrycatchfinallyexpression = null;
		try {
			JSONObject _xifexpression = null;
			boolean _notEquals = (!Objects.equal(it, null));
			if (_notEquals) {
				_xifexpression = new JSONObject(it);
			}
			_xtrycatchfinallyexpression = _xifexpression;
		}
		catch (final Throwable _t) {
			if (_t instanceof Exception) {
				final Exception e = (Exception)_t;
				throw new RuntimeException(((("Bad JSON String: " + it) + " ") + e));
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
		return _xtrycatchfinallyexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject createRemoteContextFromString(EDataType eDataType, String initialValue) {
		return createRemoteContext(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemoteContextToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute createIncreasingULongMetricAttributeFromString(EDataType eDataType, String initialValue) {
		return (IncreasingULongMetricAttribute)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncreasingULongMetricAttribute(IncreasingULongMetricAttribute it) {
		try {
			return it.toStringValue();
		}
		catch (final Throwable _t) {
			if (_t instanceof Exception) {
				final Exception e = (Exception)_t;
				return null;
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncreasingULongMetricAttributeToString(EDataType eDataType, Object instanceValue) {
		return convertIncreasingULongMetricAttribute((IncreasingULongMetricAttribute)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongMetricAttribute createLongMetricAttributeFromString(EDataType eDataType, String initialValue) {
		return (LongMetricAttribute)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongMetricAttribute(LongMetricAttribute it) {
		try {
			return it.toStringValue();
		}
		catch (final Throwable _t) {
			if (_t instanceof Exception) {
				final Exception e = (Exception)_t;
				return null;
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongMetricAttributeToString(EDataType eDataType, Object instanceValue) {
		return convertLongMetricAttribute((LongMetricAttribute)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute createDoubleMetricAttributeFromString(EDataType eDataType, String initialValue) {
		return (DoubleMetricAttribute)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleMetricAttribute(DoubleMetricAttribute it) {
		try {
			return it.toStringValue();
		}
		catch (final Throwable _t) {
			if (_t instanceof Exception) {
				final Exception e = (Exception)_t;
				return null;
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleMetricAttributeToString(EDataType eDataType, Object instanceValue) {
		return convertDoubleMetricAttribute((DoubleMetricAttribute)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringMetricAttribute createStringMetricAttributeFromString(EDataType eDataType, String initialValue) {
		return (StringMetricAttribute)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringMetricAttribute(StringMetricAttribute it) {
		try {
			return it.toStringValue();
		}
		catch (final Throwable _t) {
			if (_t instanceof Exception) {
				final Exception e = (Exception)_t;
				return null;
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringMetricAttributeToString(EDataType eDataType, Object instanceValue) {
		return convertStringMetricAttribute((StringMetricAttribute)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateMetricAttribute createDateMetricAttributeFromString(EDataType eDataType, String initialValue) {
		return (DateMetricAttribute)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateMetricAttribute(DateMetricAttribute it) {
		try {
			return it.toStringValue();
		}
		catch (final Throwable _t) {
			if (_t instanceof Exception) {
				final Exception e = (Exception)_t;
				return null;
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateMetricAttributeToString(EDataType eDataType, Object instanceValue) {
		return convertDateMetricAttribute((DateMetricAttribute)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
