package com.training.DepartmentApplication.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.DepartmentApplication.model.Department;

@FeignClient(value="feign",url="http://localhost:8080/student/")
public interface FeignUtil {
	
	@RequestMapping("/Home")
	public String home();
	
	@PostMapping("/add")
	public Department add_student(Department dpt);
	
	@DeleteMapping("/delete/{id}")
	public String delete_student(@PathVariable ("id") int id);
	
	@PutMapping("update/{id}")
	public String update_student(Department dpt, @PathVariable("id") int id);
	
	@RequestMapping("retrieve/{id}")
	public String get_student(@PathVariable ("id") int id);
	
}
