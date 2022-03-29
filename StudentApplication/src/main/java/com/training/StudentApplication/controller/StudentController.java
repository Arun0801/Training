package com.training.StudentApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.training.StudentApplication.dto.StudentDto;
import com.training.StudentApplication.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService ss;
	
	@RequestMapping("/Home")
	public String home() {
		return"Student Home Page";
	}
	
	@PostMapping("/add")
	public StudentDto addStudent(@RequestBody StudentDto student) {
		ss.addStudent(student);
		return student;
	}
	
	@RequestMapping("/retrieve/{id}")
	public String getStudent(@PathVariable("id") int id) {
		return ss.getStudent(id);
	}
	
	@PutMapping("/update/{id}")
	public String updateStudent(@RequestBody StudentDto student, @PathVariable("id") int id) {
		return ss.updateStudent(student);
		
	}
	
	@DeleteMapping("/delete/{id}")
		public String deleteStudent(@PathVariable ("id") int id) {
			return ss.deleteStudent(id);
		}
	
	@DeleteMapping("/deleteall")
	public String deleteStudents() {
		return ss.deleteallStudents();
	}
}
