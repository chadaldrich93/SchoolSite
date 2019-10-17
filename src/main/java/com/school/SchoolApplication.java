package com.school;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.school.models.Course;
import com.school.models.Student;
import com.school.models.Subject;
import com.school.models.Teacher;
import com.school.repo.CourseRepository;
import com.school.repo.StudentRepository;
import com.school.repo.SubjectRepository;
import com.school.repo.TeacherRepository;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner loadData(CourseRepository courses, 
			                          StudentRepository  students,
			                          SubjectRepository subjects,
			                          TeacherRepository teachers) {
		return (args) -> {
		subjects.save(new Subject(0, "Biology", "Science"));
		subjects.save(new Subject(1, "Chemistry", "Science"));
		subjects.save(new Subject(2, "Physics", "Science"));
		subjects.save(new Subject(3, "Anatomy", "Science"));
		subjects.save(new Subject(4, "Algebra1", "Math"));
		
		teachers.save(new Teacher(0, "Jeff Anderson", "Science"));
		teachers.save(new Teacher(1, "Becky Salinger", "Science"));
		teachers.save(new Teacher(2, "Bob Smith", "Math"));
		teachers.save(new Teacher(3, "Jessica Lonza", "Math"));
		
		students.save(new Student(0, "Jeff Buckley", 9));
		students.save(new Student(1, "Tim Peterson", 11));
		students.save(new Student(2, "Mary Sue", 9));
		students.save(new Student(3, "Emily Whitmore", 11));
		
		
		};
	}
}
