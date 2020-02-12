package com.ahinfotech.hibernatedemo;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		 Employee emp = new Employee();
		 emp.setEmpId(108L);
		 emp.setEmpName("raghav");
		 emp.setEmail("raghav27392@gmail.com");

		// creating session object for interaction with db
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		 session.save(emp);

		// getting emp data using get method by given primary key
//		emp = (Employee) session.get(Employee.class, 106L);
		
		session.getTransaction().commit();

		System.out.println(emp);
	}
}
