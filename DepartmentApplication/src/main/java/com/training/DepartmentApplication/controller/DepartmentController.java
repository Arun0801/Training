package com.training.DepartmentApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.DepartmentApplication.feign.FeignUtil;
import com.training.DepartmentApplication.model.Department;

@RestController
@RequestMapping("/Department")
public class DepartmentController {
	
	@Autowired
	private FeignUtil util;
	
	@RequestMapping("/Home")
	public String home() {
		return util.home();
	}
	
	@PostMapping("/add")
	public Department addStudent(@RequestBody Department dept) {
		return util.add_student(dept);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletestudent(@PathVariable ("id") int id) {
		return util.delete_student(id);
	}
	
	@PutMapping ("/update/{id}")
	public String updateStudent(@RequestBody Department dpt, @PathVariable("id") int id) {
		return util.update_student(dpt,id);
	}
	
	@RequestMapping("/retrieve/{id}")
	public String getStudent(@PathVariable ("id") int id) {
		return util.get_student(id);
	}
}
