/**
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.emf.compare.diagram;

import org.eclipse.emf.compare.Diff;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Diagram Diff</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.compare.diagram.DiagramDiff#getSemanticDiff <em>Semantic Diff</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.compare.diagram.DiagramComparePackage#getDiagramDiff()
 * @model abstract="true"
 * @generated
 */
public interface DiagramDiff extends Diff {
	/**
	 * Returns the value of the '<em><b>Semantic Diff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Diff</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Diff</em>' reference.
	 * @see #setSemanticDiff(Diff)
	 * @see org.eclipse.emf.compare.diagram.DiagramComparePackage#getDiagramDiff_SemanticDiff()
	 * @model
	 * @generated
	 */
	Diff getSemanticDiff();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.compare.diagram.DiagramDiff#getSemanticDiff <em>Semantic Diff</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Diff</em>' reference.
	 * @see #getSemanticDiff()
	 * @generated
	 */
	void setSemanticDiff(Diff value);

} // DiagramDiff
