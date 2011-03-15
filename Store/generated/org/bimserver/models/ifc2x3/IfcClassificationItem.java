/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3;

import org.bimserver.emf.IdEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcClassificationItem#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcClassificationItem#getItemOf <em>Item Of</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcClassificationItem#getTitle <em>Title</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcClassificationItem#getIsClassifiedItemIn <em>Is Classified Item In</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcClassificationItem#getIsClassifyingItemIn <em>Is Classifying Item In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcClassificationItem()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface IfcClassificationItem extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Notation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' reference.
	 * @see #setNotation(IfcClassificationNotationFacet)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcClassificationItem_Notation()
	 * @model
	 * @generated
	 */
	IfcClassificationNotationFacet getNotation();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcClassificationItem#getNotation <em>Notation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' reference.
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(IfcClassificationNotationFacet value);

	/**
	 * Returns the value of the '<em><b>Item Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcClassification#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Of</em>' reference.
	 * @see #isSetItemOf()
	 * @see #unsetItemOf()
	 * @see #setItemOf(IfcClassification)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcClassificationItem_ItemOf()
	 * @see org.bimserver.models.ifc2x3.IfcClassification#getContains
	 * @model opposite="Contains" unsettable="true"
	 * @generated
	 */
	IfcClassification getItemOf();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcClassificationItem#getItemOf <em>Item Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Of</em>' reference.
	 * @see #isSetItemOf()
	 * @see #unsetItemOf()
	 * @see #getItemOf()
	 * @generated
	 */
	void setItemOf(IfcClassification value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcClassificationItem#getItemOf <em>Item Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItemOf()
	 * @see #getItemOf()
	 * @see #setItemOf(IfcClassification)
	 * @generated
	 */
	void unsetItemOf();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcClassificationItem#getItemOf <em>Item Of</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Item Of</em>' reference is set.
	 * @see #unsetItemOf()
	 * @see #getItemOf()
	 * @see #setItemOf(IfcClassification)
	 * @generated
	 */
	boolean isSetItemOf();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcClassificationItem_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcClassificationItem#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Is Classified Item In</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcClassificationItemRelationship}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcClassificationItemRelationship#getRelatedItems <em>Related Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Classified Item In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Classified Item In</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcClassificationItem_IsClassifiedItemIn()
	 * @see org.bimserver.models.ifc2x3.IfcClassificationItemRelationship#getRelatedItems
	 * @model opposite="RelatedItems" upper="2"
	 * @generated
	 */
	EList<IfcClassificationItemRelationship> getIsClassifiedItemIn();

	/**
	 * Returns the value of the '<em><b>Is Classifying Item In</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcClassificationItemRelationship}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcClassificationItemRelationship#getRelatingItem <em>Relating Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Classifying Item In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Classifying Item In</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcClassificationItem_IsClassifyingItemIn()
	 * @see org.bimserver.models.ifc2x3.IfcClassificationItemRelationship#getRelatingItem
	 * @model opposite="RelatingItem" upper="2"
	 * @generated
	 */
	EList<IfcClassificationItemRelationship> getIsClassifyingItemIn();

} // IfcClassificationItem