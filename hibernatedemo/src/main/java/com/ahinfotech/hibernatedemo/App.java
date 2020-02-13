package com.ahinfotech.hibernatedemo;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		 EmpName eName = new EmpName();
		 eName.setfName("Abhinaw");
		 eName.setmName("Kumar");
		 eName.setlName("shahi");
		
		 Employee emp = new Employee();
		 emp.setEmpId(103L);
		 emp.setEmpName(eName);
		 emp.setEmail("abhinaw27392@gmail.com");

		Laptop laptop = new Laptop();
		laptop.setLid(2);
		laptop.setlName("Lenovo");

		Student student = new Student();
		student.setRoll(101);
		student.setsName("Abhinaw");
		student.setAge(28);
		student.getLaptop().add(laptop);

		// laptop.getStudent().add(student);
		laptop.setStudent(student);

		// creating session object for interaction with db
		Session session = (Session) HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.save(laptop);
		session.save(student);

		//saving employee data
		 session.save(emp);
		
		//getting laptop and student data
		// Laptop lap = (Laptop)session.get(Laptop.class, 2);
		// Student stud = (Student)session.get(Student.class, 101);

		// getting emp data using get method by given primary key
		// emp = (Employee) session.get(Employee.class, 106L);

		session.getTransaction().commit();

		// System.out.println(emp);
	}
}
