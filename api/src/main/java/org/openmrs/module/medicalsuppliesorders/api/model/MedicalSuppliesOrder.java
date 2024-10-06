/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 * <p>
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */

package org.openmrs.module.medicalsuppliesorders.api.model;

import org.openmrs.ServiceOrder;

public class MedicalSuppliesOrder extends ServiceOrder {
	
	public static final long serialVersionUID = 1L;
	
	private Integer quantity;
	
	private String brandName;
	
	private String quantityUnits;
	
	private Integer medicalSuppliesInventoryId;
	
	public MedicalSuppliesOrder() {
	}
	
	@Override
	public MedicalSuppliesOrder copy() {
		MedicalSuppliesOrder newOrder = new MedicalSuppliesOrder();
		super.copyHelper(newOrder);
		return newOrder;
	}
	
	/**
	 * Creates a discontinuation order for this.
	 * 
	 * @return the newly created order
	 * @see org.openmrs.ServiceOrder#cloneForDiscontinuing()
	 */
	@Override
	public MedicalSuppliesOrder cloneForDiscontinuing() {
		MedicalSuppliesOrder newOrder = new MedicalSuppliesOrder();
		super.cloneForDiscontinuingHelper(newOrder);
		return newOrder;
	}
	
	/**
	 * Creates a ReferralOrder for revision from this order, sets the previousOrder, action field
	 * and other test order fields.
	 * 
	 * @return the newly created order
	 */
	@Override
	public MedicalSuppliesOrder cloneForRevision() {
		MedicalSuppliesOrder newOrder = new MedicalSuppliesOrder();
		super.cloneForRevisionHelper(newOrder);
		return newOrder;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public void setQuantityUnits(String quantityUnits) {
		this.quantityUnits = quantityUnits;
	}
	
	public String getQuantityUnits() {
		return quantityUnits;
	}
	
	public void setMedicalSuppliesInventoryId(Integer medicalSuppliesInventoryId) {
		this.medicalSuppliesInventoryId = medicalSuppliesInventoryId;
	}
	
	public Integer getMedicalSuppliesInventoryId() {
		return medicalSuppliesInventoryId;
	}
	
}
