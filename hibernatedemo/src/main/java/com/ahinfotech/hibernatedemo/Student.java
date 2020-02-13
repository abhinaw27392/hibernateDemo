package com.ahinfotech.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	private int roll;
	private String sName;
	private int age;
	
	@OneToMany(mappedBy = "student")
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
//	@ManyToMany(fetch = FetchType.LAZY)
//	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

}
