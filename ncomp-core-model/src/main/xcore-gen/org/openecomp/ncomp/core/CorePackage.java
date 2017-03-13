
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
 * @see org.openecomp.ncomp.core.CoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-core-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore ecomp='http://openecomp.org'"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.openecomp.ncomp.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.impl.NamedEntityImpl <em>Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.impl.NamedEntityImpl
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getNamedEntity()
	 * @generated
	 */
	int NAMED_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__LAST_POLLED = 1;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__LAST_CHANGED = 2;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__CREATED = 3;

	/**
	 * The number of structural features of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.impl.EventImpl
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.impl.HasOperationalStateImpl <em>Has Operational State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.impl.HasOperationalStateImpl
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getHasOperationalState()
	 * @generated
	 */
	int HAS_OPERATIONAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Operational State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPERATIONAL_STATE__OPERATIONAL_STATE = 0;

	/**
	 * The number of structural features of the '<em>Has Operational State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPERATIONAL_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Operational State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPERATIONAL_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.impl.UserImpl
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_POLLED = NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_CHANGED = NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREATED = NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PUBLIC_KEY = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DEPLOYMENT_STATUS = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.OperationalState <em>Operational State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.OperationalState
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getOperationalState()
	 * @generated
	 */
	int OPERATIONAL_STATE = 4;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.core.DeploymentStatus <em>Deployment Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.DeploymentStatus
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getDeploymentStatus()
	 * @generated
	 */
	int DEPLOYMENT_STATUS = 5;

	/**
	 * The meta object id for the '<em>Json Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.json.JSONObject
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getJsonObject()
	 * @generated
	 */
	int JSON_OBJECT = 6;

	/**
	 * The meta object id for the '<em>Remote Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.json.JSONObject
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getRemoteContext()
	 * @generated
	 */
	int REMOTE_CONTEXT = 7;

	/**
	 * The meta object id for the '<em>Increasing ULong Metric Attribute</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getIncreasingULongMetricAttribute()
	 * @generated
	 */
	int INCREASING_ULONG_METRIC_ATTRIBUTE = 8;

	/**
	 * The meta object id for the '<em>Long Metric Attribute</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.types.metrics.LongMetricAttribute
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getLongMetricAttribute()
	 * @generated
	 */
	int LONG_METRIC_ATTRIBUTE = 9;

	/**
	 * The meta object id for the '<em>Double Metric Attribute</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getDoubleMetricAttribute()
	 * @generated
	 */
	int DOUBLE_METRIC_ATTRIBUTE = 10;

	/**
	 * The meta object id for the '<em>String Metric Attribute</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.types.metrics.StringMetricAttribute
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getStringMetricAttribute()
	 * @generated
	 */
	int STRING_METRIC_ATTRIBUTE = 11;

	/**
	 * The meta object id for the '<em>Date Metric Attribute</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.core.types.metrics.DateMetricAttribute
	 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getDateMetricAttribute()
	 * @generated
	 */
	int DATE_METRIC_ATTRIBUTE = 12;

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity</em>'.
	 * @see org.openecomp.ncomp.core.NamedEntity
	 * @generated
	 */
	EClass getNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.NamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.core.NamedEntity#getName()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.NamedEntity#getLastPolled <em>Last Polled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Polled</em>'.
	 * @see org.openecomp.ncomp.core.NamedEntity#getLastPolled()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_LastPolled();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.NamedEntity#getLastChanged <em>Last Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Changed</em>'.
	 * @see org.openecomp.ncomp.core.NamedEntity#getLastChanged()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_LastChanged();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.NamedEntity#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.openecomp.ncomp.core.NamedEntity#getCreated()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Created();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.openecomp.ncomp.core.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.HasOperationalState <em>Has Operational State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Operational State</em>'.
	 * @see org.openecomp.ncomp.core.HasOperationalState
	 * @generated
	 */
	EClass getHasOperationalState();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.HasOperationalState#getOperationalState <em>Operational State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational State</em>'.
	 * @see org.openecomp.ncomp.core.HasOperationalState#getOperationalState()
	 * @see #getHasOperationalState()
	 * @generated
	 */
	EAttribute getHasOperationalState_OperationalState();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.core.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.openecomp.ncomp.core.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.User#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Key</em>'.
	 * @see org.openecomp.ncomp.core.User#getPublicKey()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_PublicKey();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.core.User#getDeploymentStatus <em>Deployment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Status</em>'.
	 * @see org.openecomp.ncomp.core.User#getDeploymentStatus()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_DeploymentStatus();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.core.OperationalState <em>Operational State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operational State</em>'.
	 * @see org.openecomp.ncomp.core.OperationalState
	 * @generated
	 */
	EEnum getOperationalState();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.core.DeploymentStatus <em>Deployment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployment Status</em>'.
	 * @see org.openecomp.ncomp.core.DeploymentStatus
	 * @generated
	 */
	EEnum getDeploymentStatus();

	/**
	 * Returns the meta object for data type '{@link org.json.JSONObject <em>Json Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Json Object</em>'.
	 * @see org.json.JSONObject
	 * @model instanceClass="org.json.JSONObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel create='<%org.json.JSONObject%> _xtrycatchfinallyexpression = null;\ntry\n{\n\t<%org.json.JSONObject%> _xifexpression = null;\n\tboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(it, null));\n\tif (_notEquals)\n\t{\n\t\t_xifexpression = new <%org.json.JSONObject%>(it);\n\t}\n\t_xtrycatchfinallyexpression = _xifexpression;\n}\ncatch (final Throwable _t) {\n\tif (_t instanceof <%java.lang.Exception%>) {\n\t\tfinal <%java.lang.Exception%> e = (<%java.lang.Exception%>)_t;\n\t\tthrow new <%java.lang.RuntimeException%>((((\"Bad JSON String: \" + it) + \" \") + e));\n\t}\n\telse\n\t{\n\t\tthrow <%org.eclipse.xtext.xbase.lib.Exceptions%>.sneakyThrow(_t);\n\t}\n}\nreturn _xtrycatchfinallyexpression;'"
	 * @generated
	 */
	EDataType getJsonObject();

	/**
	 * Returns the meta object for data type '{@link org.json.JSONObject <em>Remote Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Remote Context</em>'.
	 * @see org.json.JSONObject
	 * @model instanceClass="org.json.JSONObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel create='<%org.json.JSONObject%> _xtrycatchfinallyexpression = null;\ntry\n{\n\t<%org.json.JSONObject%> _xifexpression = null;\n\tboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(it, null));\n\tif (_notEquals)\n\t{\n\t\t_xifexpression = new <%org.json.JSONObject%>(it);\n\t}\n\t_xtrycatchfinallyexpression = _xifexpression;\n}\ncatch (final Throwable _t) {\n\tif (_t instanceof <%java.lang.Exception%>) {\n\t\tfinal <%java.lang.Exception%> e = (<%java.lang.Exception%>)_t;\n\t\tthrow new <%java.lang.RuntimeException%>((((\"Bad JSON String: \" + it) + \" \") + e));\n\t}\n\telse\n\t{\n\t\tthrow <%org.eclipse.xtext.xbase.lib.Exceptions%>.sneakyThrow(_t);\n\t}\n}\nreturn _xtrycatchfinallyexpression;'"
	 * @generated
	 */
	EDataType getRemoteContext();

	/**
	 * Returns the meta object for data type '{@link org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute <em>Increasing ULong Metric Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Increasing ULong Metric Attribute</em>'.
	 * @see org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute
	 * @model instanceClass="org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel convert='try\n{\n\treturn it.toStringValue();\n}\ncatch (final Throwable _t) {\n\tif (_t instanceof <%java.lang.Exception%>) {\n\t\tfinal <%java.lang.Exception%> e = (<%java.lang.Exception%>)_t;\n\t\treturn null;\n\t}\n\telse\n\t{\n\t\tthrow <%org.eclipse.xtext.xbase.lib.Exceptions%>.sneakyThrow(_t);\n\t}\n}'"
	 * @generated
	 */
	EDataType getIncreasingULongMetricAttribute();

	/**
	 * Returns the meta object for data type '{@link org.openecomp.ncomp.core.types.metrics.LongMetricAttribute <em>Long Metric Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Long Metric Attribute</em>'.
	 * @see org.openecomp.ncomp.core.types.metrics.LongMetricAttribute
	 * @model instanceClass="org.openecomp.ncomp.core.types.metrics.LongMetricAttribute"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel convert='try\n{\n\treturn it.toStringValue();\n}\ncatch (final Throwable _t) {\n\tif (_t instanceof <%java.lang.Exception%>) {\n\t\tfinal <%java.lang.Exception%> e = (<%java.lang.Exception%>)_t;\n\t\treturn null;\n\t}\n\telse\n\t{\n\t\tthrow <%org.eclipse.xtext.xbase.lib.Exceptions%>.sneakyThrow(_t);\n\t}\n}'"
	 * @generated
	 */
	EDataType getLongMetricAttribute();

	/**
	 * Returns the meta object for data type '{@link org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute <em>Double Metric Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double Metric Attribute</em>'.
	 * @see org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute
	 * @model instanceClass="org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel convert='try\n{\n\treturn it.toStringValue();\n}\ncatch (final Throwable _t) {\n\tif (_t instanceof <%java.lang.Exception%>) {\n\t\tfinal <%java.lang.Exception%> e = (<%java.lang.Exception%>)_t;\n\t\treturn null;\n\t}\n\telse\n\t{\n\t\tthrow <%org.eclipse.xtext.xbase.lib.Exceptions%>.sneakyThrow(_t);\n\t}\n}'"
	 * @generated
	 */
	EDataType getDoubleMetricAttribute();

	/**
	 * Returns the meta object for data type '{@link org.openecomp.ncomp.core.types.metrics.StringMetricAttribute <em>String Metric Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Metric Attribute</em>'.
	 * @see org.openecomp.ncomp.core.types.metrics.StringMetricAttribute
	 * @model instanceClass="org.openecomp.ncomp.core.types.metrics.StringMetricAttribute"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel convert='try\n{\n\treturn it.toStringValue();\n}\ncatch (final Throwable _t) {\n\tif (_t instanceof <%java.lang.Exception%>) {\n\t\tfinal <%java.lang.Exception%> e = (<%java.lang.Exception%>)_t;\n\t\treturn null;\n\t}\n\telse\n\t{\n\t\tthrow <%org.eclipse.xtext.xbase.lib.Exceptions%>.sneakyThrow(_t);\n\t}\n}'"
	 * @generated
	 */
	EDataType getStringMetricAttribute();

	/**
	 * Returns the meta object for data type '{@link org.openecomp.ncomp.core.types.metrics.DateMetricAttribute <em>Date Metric Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Metric Attribute</em>'.
	 * @see org.openecomp.ncomp.core.types.metrics.DateMetricAttribute
	 * @model instanceClass="org.openecomp.ncomp.core.types.metrics.DateMetricAttribute"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel convert='try\n{\n\treturn it.toStringValue();\n}\ncatch (final Throwable _t) {\n\tif (_t instanceof <%java.lang.Exception%>) {\n\t\tfinal <%java.lang.Exception%> e = (<%java.lang.Exception%>)_t;\n\t\treturn null;\n\t}\n\telse\n\t{\n\t\tthrow <%org.eclipse.xtext.xbase.lib.Exceptions%>.sneakyThrow(_t);\n\t}\n}'"
	 * @generated
	 */
	EDataType getDateMetricAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.impl.NamedEntityImpl <em>Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.impl.NamedEntityImpl
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getNamedEntity()
		 * @generated
		 */
		EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Last Polled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__LAST_POLLED = eINSTANCE.getNamedEntity_LastPolled();

		/**
		 * The meta object literal for the '<em><b>Last Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__LAST_CHANGED = eINSTANCE.getNamedEntity_LastChanged();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__CREATED = eINSTANCE.getNamedEntity_Created();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.impl.EventImpl
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.impl.HasOperationalStateImpl <em>Has Operational State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.impl.HasOperationalStateImpl
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getHasOperationalState()
		 * @generated
		 */
		EClass HAS_OPERATIONAL_STATE = eINSTANCE.getHasOperationalState();

		/**
		 * The meta object literal for the '<em><b>Operational State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_OPERATIONAL_STATE__OPERATIONAL_STATE = eINSTANCE.getHasOperationalState_OperationalState();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.impl.UserImpl
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Public Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PUBLIC_KEY = eINSTANCE.getUser_PublicKey();

		/**
		 * The meta object literal for the '<em><b>Deployment Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DEPLOYMENT_STATUS = eINSTANCE.getUser_DeploymentStatus();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.OperationalState <em>Operational State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.OperationalState
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getOperationalState()
		 * @generated
		 */
		EEnum OPERATIONAL_STATE = eINSTANCE.getOperationalState();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.core.DeploymentStatus <em>Deployment Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.DeploymentStatus
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getDeploymentStatus()
		 * @generated
		 */
		EEnum DEPLOYMENT_STATUS = eINSTANCE.getDeploymentStatus();

		/**
		 * The meta object literal for the '<em>Json Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.json.JSONObject
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getJsonObject()
		 * @generated
		 */
		EDataType JSON_OBJECT = eINSTANCE.getJsonObject();

		/**
		 * The meta object literal for the '<em>Remote Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.json.JSONObject
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getRemoteContext()
		 * @generated
		 */
		EDataType REMOTE_CONTEXT = eINSTANCE.getRemoteContext();

		/**
		 * The meta object literal for the '<em>Increasing ULong Metric Attribute</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getIncreasingULongMetricAttribute()
		 * @generated
		 */
		EDataType INCREASING_ULONG_METRIC_ATTRIBUTE = eINSTANCE.getIncreasingULongMetricAttribute();

		/**
		 * The meta object literal for the '<em>Long Metric Attribute</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.types.metrics.LongMetricAttribute
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getLongMetricAttribute()
		 * @generated
		 */
		EDataType LONG_METRIC_ATTRIBUTE = eINSTANCE.getLongMetricAttribute();

		/**
		 * The meta object literal for the '<em>Double Metric Attribute</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getDoubleMetricAttribute()
		 * @generated
		 */
		EDataType DOUBLE_METRIC_ATTRIBUTE = eINSTANCE.getDoubleMetricAttribute();

		/**
		 * The meta object literal for the '<em>String Metric Attribute</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.types.metrics.StringMetricAttribute
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getStringMetricAttribute()
		 * @generated
		 */
		EDataType STRING_METRIC_ATTRIBUTE = eINSTANCE.getStringMetricAttribute();

		/**
		 * The meta object literal for the '<em>Date Metric Attribute</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.core.types.metrics.DateMetricAttribute
		 * @see org.openecomp.ncomp.core.impl.CorePackageImpl#getDateMetricAttribute()
		 * @generated
		 */
		EDataType DATE_METRIC_ATTRIBUTE = eINSTANCE.getDateMetricAttribute();

	}

} //CorePackage
