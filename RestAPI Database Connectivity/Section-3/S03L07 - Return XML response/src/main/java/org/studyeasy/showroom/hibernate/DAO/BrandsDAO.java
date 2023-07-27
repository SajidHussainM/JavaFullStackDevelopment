package org.studyeasy.showroom.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.showroom.hibernate.entities.BrandEntity;
import org.studyeasy.showroom.resources.Brands;

public class BrandsDAO {
	
	SessionFactory factory = new Configuration()
			                 .configure("hibernate.cfg.xml")
			                 .addAnnotatedClass(BrandEntity.class)
			                 .buildSessionFactory();

	public List<Brands> getBrands() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Brands> list = session.createQuery("from brands").getResultList();
		return list;
	}

	public void addBrand(BrandEntity brand) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(brand);
		session.getTransaction().commit();

	}

	public void updateBrand(BrandEntity updatedBrand) {
		int BrandID = updatedBrand.getBrandId();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		BrandEntity brand = session.get(BrandEntity.class, BrandID);
		brand = updatedBrand;
		session.getTransaction().commit();
	}

	public void deleteBrand(int brandId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		BrandEntity brand = session.get(BrandEntity.class, brandId);
		session.delete(brand);
		session.getTransaction().commit();
		
	}

}
