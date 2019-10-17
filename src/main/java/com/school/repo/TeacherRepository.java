package com.school.repo;

import com.school.models.Teacher;

import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Integer>{

	Iterable<Teacher> findAllByDepartmentName(String departmentName);
	
	Teacher findByName(String name);
}