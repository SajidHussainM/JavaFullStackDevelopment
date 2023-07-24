package org.studyeasy.hibernate.DAO;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.hibernate.entity.Files;

public class FilesDAO {
	SessionFactory factory = new Configuration()
			                 .configure("hibernate.cfg.xml")
			                 .addAnnotatedClass(Files.class)
			                 .buildSessionFactory();
	
	public void addFileDetails(Files file) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(file);
		session.getTransaction().commit();
		System.out.println(file.getFileName()+" Got added");
	}
}
