package com.training.StudentApplication.dto;

import javax.persistence.Id;
import com.training.StudentApplication.model.Student;

public class StudentDto {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String dept;
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
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + ", cgpa=" + cgpa + "]";
	}
	
	public void convertToDto(Student student) {
		this.id = student.getId();
		this.name = student.getName();
		this.age = student.getAge();
		this.cgpa = student.getCgpa();
		this.dept = student.getDept();
	}

}
