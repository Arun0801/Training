package com.training.DepartmentApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.training.DepartmentApplication.model.Department;

public interface DepartmentRepository extends JpaRepository <Department,Integer>{

}
