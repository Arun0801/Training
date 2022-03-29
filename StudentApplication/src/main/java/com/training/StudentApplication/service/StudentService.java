package com.training.StudentApplication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.training.StudentApplication.Exception.ResourceNotFoundException;
import com.training.StudentApplication.dto.StudentDto;
import com.training.StudentApplication.model.Student;
import com.training.StudentApplication.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	@Autowired
	StudentRepository repo;	
	public StudentDto addStudent(StudentDto studto) {
		Student stutemp = new Student();
		stutemp.convertFromDto(studto);
		repo.save(stutemp);
		return studto;
	}
	
	public String getStudent(int id) {
		Optional <Student> stutempop = repo.findById(id);
		if(stutempop.isPresent()) {
		Student stutemp = stutempop.get();	
		return stutemp.toString();
		}
		else {
		return "Student Not Found!!";
		}
		/* Returning Exception instead of String (Not working still troubleshooting)
		//Student stutemp = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id:"+id));
		//StudentDto studto = new StudentDto();
		//studto.convertToDto(stutemp);
		//return ResponseEntity.ok(studto);*/
	}
	
	public String updateStudent(StudentDto studto) {
		Optional <Student> stutempop = repo.findById(studto.getId());
		if(stutempop.isPresent()) {
			Student stutemp = new Student();
			stutemp.convertFromDto(studto);
			repo.save(stutemp);
			return ("Updated Successfully!!" + "/n"+ stutemp.toString());
			}
		else
			return "Student Not Found!!";
		/*int id = studto.getId();
		Student  stutemp = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id:"+id));
		studto.convertToDto(stutemp);
		return ResponseEntity.ok(studto);*/
	}
	
	public String deleteStudent(int id) {
		Optional <Student> stutempop = repo.findById(id);
		if(stutempop.isPresent()) {
			repo.delete(stutempop.get());
			return("Deleted Successfully!!");
		}
		else {
			return("Student Not Found!!");
		}
	}
	
	public String deleteallStudents() {
		repo.deleteAll();
		return "Deleted all";
	}
	
}
