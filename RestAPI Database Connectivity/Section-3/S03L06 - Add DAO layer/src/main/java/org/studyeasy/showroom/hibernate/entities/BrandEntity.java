package org.studyeasy.showroom.hibernate.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

public class BrandEntity {
	int brandId;
	String BrandName;
	
	public BrandEntity() {
		
	}

	public BrandEntity(int brandId, String brandName) {
		super();
		this.brandId = brandId;
		BrandName = brandName;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	
}
