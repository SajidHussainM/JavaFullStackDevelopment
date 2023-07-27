package org.studyeasy.showroom.services;

import java.util.List;

import org.studyeasy.showroom.hibernate.DAO.BrandsDAO;
import org.studyeasy.showroom.hibernate.entities.BrandEntity;
import org.studyeasy.showroom.resources.Brands;

public class BrandsService {

	public List<Brands> getBrands() {
		List<Brands> list = new BrandsDAO().getBrands();
		return list;
	}

	public void addBrand(BrandEntity brand) {
		new BrandsDAO().addBrand(brand);
		
	}

	public void updateBrand(BrandEntity updatedBrand) {
		new BrandsDAO().updateBrand(updatedBrand);
		
	}

	public void deleteBrand(int brandId) {
		new BrandsDAO().deleteBrand(brandId);
		
	}

}
