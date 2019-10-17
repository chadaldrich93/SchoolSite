package com.school.repo;

import com.school.models.Subject;

import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Integer>{

	Iterable<Subject> findAllByDepartmentName(String departmentName);
	
	Subject findByName(String name);
}