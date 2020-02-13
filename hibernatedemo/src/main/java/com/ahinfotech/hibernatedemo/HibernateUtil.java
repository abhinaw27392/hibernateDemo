package com.ahinfotech.hibernatedemo;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	// creating sessionFactory for session generation
	private static SessionFactory buildSessionFactory() throws HibernateException {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Employee.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory factory = con.buildSessionFactory(reg);
		return factory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
