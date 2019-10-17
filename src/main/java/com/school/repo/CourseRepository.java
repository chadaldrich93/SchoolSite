package com.school.repo;

import com.school.models.Course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer>{
	
	Iterable<Course> findBySubjectName(String subjectName);
	
	Course findByName(String name);

}