package com.training.StudentApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.training.StudentApplication.model.Student;

public interface StudentRepository extends JpaRepository <Student,Integer> {

}
