package com.ahinfotech.hibernatedemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	// creating sessionFactory for session generation
	public static SessionFactory getSessionFactory() {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory factory = con.buildSessionFactory(reg);
		return factory;
	}

}
