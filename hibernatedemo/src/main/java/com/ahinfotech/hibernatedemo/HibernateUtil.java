package com.ahinfotech.hibernatedemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	// creating sessionFactory for session generation
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class)
					.addAnnotatedClass(Student.class).addAnnotatedClass(Employee.class);

			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties())
					.buildServiceRegistry();
			sessionFactory = con.buildSessionFactory(reg);
		}

		return sessionFactory;
	}

}
