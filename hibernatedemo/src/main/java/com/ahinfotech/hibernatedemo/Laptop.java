package com.ahinfotech.hibernatedemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lName;
	
	@ManyToOne
	private Student student;
	
//	@ManyToMany(mappedBy = "laptop", fetch = FetchType.LAZY)
//	private List<Student> student = new ArrayList<Student>();
//	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
//	public List<Student> getStudent() {
//		return student;
//	}
//	public void setStudent(List<Student> student) {
//		this.student = student;
//	}

}
