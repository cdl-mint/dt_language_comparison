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
 * generated by Datatype.genmodel
 */
package org.eclipse.vorto.core.api.model.datatype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.vorto.core.api.model.datatype.PrimitivePropertyType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.vorto.core.api.model.datatype.DatatypePackage#getPrimitivePropertyType()
 * @model
 * @generated
 */
public interface PrimitivePropertyType extends PropertyType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2017 Bosch Software Innovations GmbH and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nand Eclipse Distribution License v1.0 which accompany this distribution.\n \nThe Eclipse Public License is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nThe Eclipse Distribution License is available at\nhttp://www.eclipse.org/org/documents/edl-v10.php.\n\nContributors:\nBosch Software Innovations GmbH - Please refer to git log\n\n*******************************************************************************\ngenerated by Datatype.genmodel";

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.vorto.core.api.model.datatype.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.vorto.core.api.model.datatype.PrimitiveType
	 * @see #setType(PrimitiveType)
	 * @see org.eclipse.vorto.core.api.model.datatype.DatatypePackage#getPrimitivePropertyType_Type()
	 * @model
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.vorto.core.api.model.datatype.PrimitivePropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.vorto.core.api.model.datatype.PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

} // PrimitivePropertyType
