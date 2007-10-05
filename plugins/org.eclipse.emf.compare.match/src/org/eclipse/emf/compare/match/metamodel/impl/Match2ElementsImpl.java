/*******************************************************************************
 * Copyright (c) 2006, 2007 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.compare.match.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.compare.match.metamodel.Match2Elements;
import org.eclipse.emf.compare.match.metamodel.MatchPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Match2 Elements</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.compare.match.metamodel.impl.Match2ElementsImpl#getLeftElement <em>Left Element</em>}</li>
 * <li>{@link org.eclipse.emf.compare.match.metamodel.impl.Match2ElementsImpl#getRightElement <em>Right Element</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
@SuppressWarnings("nls")
public class Match2ElementsImpl extends MatchElementImpl implements Match2Elements {
	/**
	 * The cached value of the '{@link #getLeftElement() <em>Left Element</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLeftElement()
	 * @generated
	 * @ordered
	 */
	protected EObject leftElement = null;

	/**
	 * The cached value of the '{@link #getRightElement() <em>Right Element</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRightElement()
	 * @generated
	 * @ordered
	 */
	protected EObject rightElement = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Match2ElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchPackage.Literals.MATCH2_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject getLeftElement() {
		if (leftElement != null && leftElement.eIsProxy()) {
			InternalEObject oldLeftElement = (InternalEObject)leftElement;
			leftElement = eResolveProxy(oldLeftElement);
			if (leftElement != oldLeftElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MatchPackage.MATCH2_ELEMENTS__LEFT_ELEMENT, oldLeftElement, leftElement));
			}
		}
		return leftElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject basicGetLeftElement() {
		return leftElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLeftElement(EObject newLeftElement) {
		EObject oldLeftElement = leftElement;
		leftElement = newLeftElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchPackage.MATCH2_ELEMENTS__LEFT_ELEMENT,
					oldLeftElement, leftElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject getRightElement() {
		if (rightElement != null && rightElement.eIsProxy()) {
			InternalEObject oldRightElement = (InternalEObject)rightElement;
			rightElement = eResolveProxy(oldRightElement);
			if (rightElement != oldRightElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MatchPackage.MATCH2_ELEMENTS__RIGHT_ELEMENT, oldRightElement, rightElement));
			}
		}
		return rightElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject basicGetRightElement() {
		return rightElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRightElement(EObject newRightElement) {
		EObject oldRightElement = rightElement;
		rightElement = newRightElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MatchPackage.MATCH2_ELEMENTS__RIGHT_ELEMENT, oldRightElement, rightElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MatchPackage.MATCH2_ELEMENTS__LEFT_ELEMENT:
				if (resolve)
					return getLeftElement();
				return basicGetLeftElement();
			case MatchPackage.MATCH2_ELEMENTS__RIGHT_ELEMENT:
				if (resolve)
					return getRightElement();
				return basicGetRightElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MatchPackage.MATCH2_ELEMENTS__LEFT_ELEMENT:
				setLeftElement((EObject)newValue);
				return;
			case MatchPackage.MATCH2_ELEMENTS__RIGHT_ELEMENT:
				setRightElement((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MatchPackage.MATCH2_ELEMENTS__LEFT_ELEMENT:
				setLeftElement((EObject)null);
				return;
			case MatchPackage.MATCH2_ELEMENTS__RIGHT_ELEMENT:
				setRightElement((EObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MatchPackage.MATCH2_ELEMENTS__LEFT_ELEMENT:
				return leftElement != null;
			case MatchPackage.MATCH2_ELEMENTS__RIGHT_ELEMENT:
				return rightElement != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * TODO this is a test
	 *
	 * @see java.lang.Object#hashCode()
	 * @generated NOT
	 */
	@Override
	public int hashCode() {
		return leftElement.hashCode() + rightElement.hashCode();
	}

	/**
	 * TODO this is a test
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @generated NOT
	 */
	public boolean equals(Object another) {
		boolean result = false;
		if (another == this) {
			result = true;
		} else if (another instanceof Match2Elements) {
			final Match2Elements other = (Match2Elements)another;
			if (leftElement == null) {
				if (rightElement == null)
					result = other.getLeftElement() == null && other.getRightElement() == null;
				else
					result = other.getLeftElement() == null && rightElement.equals(other.getRightElement());
			}
		}
		return result;
	}
} // Match2ElementsImpl
