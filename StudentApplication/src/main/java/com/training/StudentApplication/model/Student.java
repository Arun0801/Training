package com.training.StudentApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.training.StudentApplication.dto.StudentDto;

@Entity
@Table(name="students")
public class Student {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	@Column(name="Name")
	private String name;
	@Column(name="Age")
	private int age;
	@Column(name="CGPA")
	private double cgpa;
	@Column(name="Department")
	private String dept;
	
	public Student(String name, int age, double cgpa, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.cgpa = cgpa;
		this.dept = dept;
	}
	
	
	public Student() {
		super();
	}


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
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", cgpa=" + cgpa + ", dept=" + dept + "]";
	}
	
	public void convertFromDto(StudentDto student) {
		this.id = student.getId();
		this.name = student.getName();
		this.age = student.getAge();
		this.cgpa = student.getCgpa();
		this.dept = student.getDept();
	}
}
