/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractDiffExtension.java,v 1.6 2007/12/04 13:16:18 lgoubet Exp $
 */
package org.eclipse.emf.compare.diff.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.compare.diff.merge.api.IMerger;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Abstract Diff Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.compare.diff.metamodel.AbstractDiffExtension#getHideElements <em>Hide Elements</em>}</li>
 * <li>{@link org.eclipse.emf.compare.diff.metamodel.AbstractDiffExtension#isIsCollapsed <em>Is Collapsed</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getAbstractDiffExtension()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDiffExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>Hide Elements</b></em>' reference list. The list contents are of
	 * type {@link org.eclipse.emf.compare.diff.metamodel.DiffElement}. It is bidirectional and its opposite
	 * is '{@link org.eclipse.emf.compare.diff.metamodel.DiffElement#getIsHiddenBy <em>Is Hidden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Elements</em>' reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hide Elements</em>' reference list.
	 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getAbstractDiffExtension_HideElements()
	 * @see org.eclipse.emf.compare.diff.metamodel.DiffElement#getIsHiddenBy
	 * @model type="org.eclipse.emf.compare.diff.metamodel.DiffElement" opposite="isHiddenBy"
	 * @generated
	 */
	EList getHideElements();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	Object getImage();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	String getText();

	/**
	 * Returns the value of the '<em><b>Is Collapsed</b></em>' attribute. The default value is
	 * <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Collapsed</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Is Collapsed</em>' attribute.
	 * @see #setIsCollapsed(boolean)
	 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getAbstractDiffExtension_IsCollapsed()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsCollapsed();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.emf.compare.diff.metamodel.IMerger"
	 * @generated
	 */
	IMerger provideMerger();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.compare.diff.metamodel.AbstractDiffExtension#isIsCollapsed <em>Is Collapsed</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Is Collapsed</em>' attribute.
	 * @see #isIsCollapsed()
	 * @generated
	 */
	void setIsCollapsed(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void visit(DiffModel diffModel);

} // AbstractDiffExtension
