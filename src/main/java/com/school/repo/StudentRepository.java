package com.school.repo;

import com.school.models.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	Student findByName(String name);

}