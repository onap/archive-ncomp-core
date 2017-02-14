
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
import org.openecomp.ncomp.component.ApiRequestStatus;
import org.openecomp.ncomp.component.Component;
import org.openecomp.ncomp.component.ComponentClass;
import org.openecomp.ncomp.component.ComponentFactory;
import org.openecomp.ncomp.component.ComponentPackage;
import org.openecomp.ncomp.component.DroolsObjectChange;
import org.openecomp.ncomp.component.DroolsRule;
import org.openecomp.ncomp.component.DroolsRuntime;
import org.openecomp.ncomp.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentPackageImpl extends EPackageImpl implements ComponentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droolsRuntimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droolsRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum apiRequestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum droolsObjectChangeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.ncomp.component.ComponentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentPackageImpl() {
		super(eNS_URI, ComponentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComponentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentPackage init() {
		if (isInited) return (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);

		// Obtain or create and register package
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentPackage.createPackageContents();

		// Initialize created meta-data
		theComponentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentPackage.eNS_URI, theComponentPackage);
		return theComponentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Classes() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_DroolsRuntimes() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentClass() {
		return componentClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentClass_Apis() {
		return (EReference)componentClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentClass_NumberOfResources() {
		return (EAttribute)componentClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentClass_NumberOfUpdateRequests() {
		return (EAttribute)componentClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentClass_NumberOfCreateRequests() {
		return (EAttribute)componentClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentClass_NumberOfDeleteRequests() {
		return (EAttribute)componentClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApi() {
		return apiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApi_NumberOfRequests() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApi_NumberOfErrorRequests() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApi_NumberOfCompletedRequests() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApi_OutstandingRequests() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApi_LastRequestDuration() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApi__CurrentRequests() {
		return apiEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiRequest() {
		return apiRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiRequest_ComponentName() {
		return (EAttribute)apiRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiRequest_ResourcePath() {
		return (EAttribute)apiRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiRequest_TransactionId() {
		return (EAttribute)apiRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiRequest_ParentTransactionId() {
		return (EAttribute)apiRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiRequest_Action() {
		return (EAttribute)apiRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiRequest_Duration() {
		return (EAttribute)apiRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiRequest_Status() {
		return (EAttribute)apiRequestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDroolsRuntime() {
		return droolsRuntimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDroolsRuntime_Rules() {
		return (EReference)droolsRuntimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDroolsRule() {
		return droolsRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDroolsRule_NumberOfFires() {
		return (EAttribute)droolsRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApiRequestStatus() {
		return apiRequestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDroolsObjectChange() {
		return droolsObjectChangeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFactory getComponentFactory() {
		return (ComponentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__CLASSES);
		createEReference(componentEClass, COMPONENT__DROOLS_RUNTIMES);

		componentClassEClass = createEClass(COMPONENT_CLASS);
		createEReference(componentClassEClass, COMPONENT_CLASS__APIS);
		createEAttribute(componentClassEClass, COMPONENT_CLASS__NUMBER_OF_RESOURCES);
		createEAttribute(componentClassEClass, COMPONENT_CLASS__NUMBER_OF_UPDATE_REQUESTS);
		createEAttribute(componentClassEClass, COMPONENT_CLASS__NUMBER_OF_CREATE_REQUESTS);
		createEAttribute(componentClassEClass, COMPONENT_CLASS__NUMBER_OF_DELETE_REQUESTS);

		apiEClass = createEClass(API);
		createEAttribute(apiEClass, API__NUMBER_OF_REQUESTS);
		createEAttribute(apiEClass, API__NUMBER_OF_ERROR_REQUESTS);
		createEAttribute(apiEClass, API__NUMBER_OF_COMPLETED_REQUESTS);
		createEAttribute(apiEClass, API__OUTSTANDING_REQUESTS);
		createEAttribute(apiEClass, API__LAST_REQUEST_DURATION);
		createEOperation(apiEClass, API___CURRENT_REQUESTS);

		apiRequestEClass = createEClass(API_REQUEST);
		createEAttribute(apiRequestEClass, API_REQUEST__COMPONENT_NAME);
		createEAttribute(apiRequestEClass, API_REQUEST__RESOURCE_PATH);
		createEAttribute(apiRequestEClass, API_REQUEST__TRANSACTION_ID);
		createEAttribute(apiRequestEClass, API_REQUEST__PARENT_TRANSACTION_ID);
		createEAttribute(apiRequestEClass, API_REQUEST__ACTION);
		createEAttribute(apiRequestEClass, API_REQUEST__DURATION);
		createEAttribute(apiRequestEClass, API_REQUEST__STATUS);

		droolsRuntimeEClass = createEClass(DROOLS_RUNTIME);
		createEReference(droolsRuntimeEClass, DROOLS_RUNTIME__RULES);

		droolsRuleEClass = createEClass(DROOLS_RULE);
		createEAttribute(droolsRuleEClass, DROOLS_RULE__NUMBER_OF_FIRES);

		// Create enums
		apiRequestStatusEEnum = createEEnum(API_REQUEST_STATUS);
		droolsObjectChangeEEnum = createEEnum(DROOLS_OBJECT_CHANGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		componentClassEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		apiEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		apiRequestEClass.getESuperTypes().add(theCorePackage.getEvent());
		droolsRuntimeEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		droolsRuleEClass.getESuperTypes().add(theCorePackage.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Classes(), this.getComponentClass(), null, "classes", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_DroolsRuntimes(), this.getDroolsRuntime(), null, "droolsRuntimes", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentClassEClass, ComponentClass.class, "ComponentClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentClass_Apis(), this.getApi(), null, "apis", null, 0, -1, ComponentClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentClass_NumberOfResources(), theCorePackage.getLongMetricAttribute(), "numberOfResources", null, 0, 1, ComponentClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentClass_NumberOfUpdateRequests(), theCorePackage.getIncreasingULongMetricAttribute(), "numberOfUpdateRequests", null, 0, 1, ComponentClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentClass_NumberOfCreateRequests(), theCorePackage.getIncreasingULongMetricAttribute(), "numberOfCreateRequests", null, 0, 1, ComponentClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentClass_NumberOfDeleteRequests(), theCorePackage.getIncreasingULongMetricAttribute(), "numberOfDeleteRequests", null, 0, 1, ComponentClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiEClass, Api.class, "Api", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApi_NumberOfRequests(), theCorePackage.getIncreasingULongMetricAttribute(), "numberOfRequests", null, 0, 1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApi_NumberOfErrorRequests(), theCorePackage.getIncreasingULongMetricAttribute(), "numberOfErrorRequests", null, 0, 1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApi_NumberOfCompletedRequests(), theCorePackage.getIncreasingULongMetricAttribute(), "numberOfCompletedRequests", null, 0, 1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApi_OutstandingRequests(), theCorePackage.getLongMetricAttribute(), "outstandingRequests", null, 0, 1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApi_LastRequestDuration(), theCorePackage.getLongMetricAttribute(), "lastRequestDuration", null, 0, 1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getApi__CurrentRequests(), this.getApiRequest(), "currentRequests", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(apiRequestEClass, ApiRequest.class, "ApiRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiRequest_ComponentName(), theEcorePackage.getEString(), "componentName", null, 0, 1, ApiRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiRequest_ResourcePath(), theEcorePackage.getEString(), "resourcePath", null, 0, 1, ApiRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiRequest_TransactionId(), theEcorePackage.getEString(), "transactionId", null, 0, 1, ApiRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiRequest_ParentTransactionId(), theEcorePackage.getEString(), "parentTransactionId", null, 0, 1, ApiRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiRequest_Action(), theEcorePackage.getEString(), "action", null, 0, 1, ApiRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiRequest_Duration(), theEcorePackage.getELongObject(), "duration", null, 0, 1, ApiRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiRequest_Status(), this.getApiRequestStatus(), "status", null, 0, 1, ApiRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(droolsRuntimeEClass, DroolsRuntime.class, "DroolsRuntime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDroolsRuntime_Rules(), this.getDroolsRule(), null, "rules", null, 0, -1, DroolsRuntime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(droolsRuleEClass, DroolsRule.class, "DroolsRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDroolsRule_NumberOfFires(), theCorePackage.getIncreasingULongMetricAttribute(), "numberOfFires", null, 0, 1, DroolsRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(apiRequestStatusEEnum, ApiRequestStatus.class, "ApiRequestStatus");
		addEEnumLiteral(apiRequestStatusEEnum, ApiRequestStatus.OKAY);
		addEEnumLiteral(apiRequestStatusEEnum, ApiRequestStatus.ERROR);
		addEEnumLiteral(apiRequestStatusEEnum, ApiRequestStatus.INPROGRESS);
		addEEnumLiteral(apiRequestStatusEEnum, ApiRequestStatus.START);

		initEEnum(droolsObjectChangeEEnum, DroolsObjectChange.class, "DroolsObjectChange");
		addEEnumLiteral(droolsObjectChangeEEnum, DroolsObjectChange.INSERTED);
		addEEnumLiteral(droolsObjectChangeEEnum, DroolsObjectChange.DELETED);
		addEEnumLiteral(droolsObjectChangeEEnum, DroolsObjectChange.UPDATED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentPackageImpl
