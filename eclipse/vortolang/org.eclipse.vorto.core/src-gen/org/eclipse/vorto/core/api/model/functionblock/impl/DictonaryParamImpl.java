/**
 * Copyright (c) 2017 Bosch Software Innovations GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *  
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * The Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * Contributors:
 * Bosch Software Innovations GmbH - Please refer to git log
 * 
 * *******************************************************************************
 * generated by Functionblock.genmodel
 */
package org.eclipse.vorto.core.api.model.functionblock.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.vorto.core.api.model.datatype.ConstraintRule;
import org.eclipse.vorto.core.api.model.datatype.DictionaryPropertyType;

import org.eclipse.vorto.core.api.model.functionblock.DictonaryParam;
import org.eclipse.vorto.core.api.model.functionblock.FunctionblockPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dictonary Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.vorto.core.api.model.functionblock.impl.DictonaryParamImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.vorto.core.api.model.functionblock.impl.DictonaryParamImpl#getConstraintRule <em>Constraint Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DictonaryParamImpl extends ParamImpl implements DictonaryParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2017 Bosch Software Innovations GmbH and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nand Eclipse Distribution License v1.0 which accompany this distribution.\n \nThe Eclipse Public License is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nThe Eclipse Distribution License is available at\nhttp://www.eclipse.org/org/documents/edl-v10.php.\n\nContributors:\nBosch Software Innovations GmbH - Please refer to git log\n\n*******************************************************************************\ngenerated by Functionblock.genmodel"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DictionaryPropertyType type;

	/**
	 * The cached value of the '{@link #getConstraintRule() <em>Constraint Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintRule()
	 * @generated
	 * @ordered
	 */
	protected ConstraintRule constraintRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictonaryParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionblockPackage.Literals.DICTONARY_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryPropertyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(DictionaryPropertyType newType, NotificationChain msgs) {
		DictionaryPropertyType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionblockPackage.DICTONARY_PARAM__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DictionaryPropertyType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionblockPackage.DICTONARY_PARAM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionblockPackage.DICTONARY_PARAM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionblockPackage.DICTONARY_PARAM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRule getConstraintRule() {
		return constraintRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintRule(ConstraintRule newConstraintRule, NotificationChain msgs) {
		ConstraintRule oldConstraintRule = constraintRule;
		constraintRule = newConstraintRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionblockPackage.DICTONARY_PARAM__CONSTRAINT_RULE, oldConstraintRule, newConstraintRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintRule(ConstraintRule newConstraintRule) {
		if (newConstraintRule != constraintRule) {
			NotificationChain msgs = null;
			if (constraintRule != null)
				msgs = ((InternalEObject)constraintRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionblockPackage.DICTONARY_PARAM__CONSTRAINT_RULE, null, msgs);
			if (newConstraintRule != null)
				msgs = ((InternalEObject)newConstraintRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionblockPackage.DICTONARY_PARAM__CONSTRAINT_RULE, null, msgs);
			msgs = basicSetConstraintRule(newConstraintRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionblockPackage.DICTONARY_PARAM__CONSTRAINT_RULE, newConstraintRule, newConstraintRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionblockPackage.DICTONARY_PARAM__TYPE:
				return basicSetType(null, msgs);
			case FunctionblockPackage.DICTONARY_PARAM__CONSTRAINT_RULE:
				return basicSetConstraintRule(null, msgs);
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
			case FunctionblockPackage.DICTONARY_PARAM__TYPE:
				return getType();
			case FunctionblockPackage.DICTONARY_PARAM__CONSTRAINT_RULE:
				return getConstraintRule();
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
			case FunctionblockPackage.DICTONARY_PARAM__TYPE:
				setType((DictionaryPropertyType)newValue);
				return;
			case FunctionblockPackage.DICTONARY_PARAM__CONSTRAINT_RULE:
				setConstraintRule((ConstraintRule)newValue);
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
			case FunctionblockPackage.DICTONARY_PARAM__TYPE:
				setType((DictionaryPropertyType)null);
				return;
			case FunctionblockPackage.DICTONARY_PARAM__CONSTRAINT_RULE:
				setConstraintRule((ConstraintRule)null);
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
			case FunctionblockPackage.DICTONARY_PARAM__TYPE:
				return type != null;
			case FunctionblockPackage.DICTONARY_PARAM__CONSTRAINT_RULE:
				return constraintRule != null;
		}
		return super.eIsSet(featureID);
	}

} //DictonaryParamImpl
