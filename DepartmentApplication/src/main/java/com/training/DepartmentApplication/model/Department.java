package com.training.DepartmentApplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Department {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String Dept;
	private double cgpa;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", age=" + age + ", Dept=" + Dept + ", cgpa=" + cgpa + "]";
	}
	
	
	
}
