package org.studyeasy.showroom.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.showroom.hibernate.entities.BrandEntity;

public class BrandsDAO {
	
	SessionFactory factory = new Configuration()
			                     .configure("hibernate.cfg.xml")
			                     .addAnnotatedClass(BrandEntity.class)
			                     .buildSessionFactory();

	public List<BrandEntity> getBrands() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addBrand(BrandEntity brand) {
		// TODO Auto-generated method stub
		
	}

	public void updateBrand(BrandEntity updatedBrand) {
		// TODO Auto-generated method stub
		
	}

	public void deleteBrand(int brandId) {
		// TODO Auto-generated method stub
		
	}

}
