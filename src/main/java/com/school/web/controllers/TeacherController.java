package com.school.web.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.school.models.Teacher;
import com.school.repo.TeacherRepository;
import com.school.utility.SortTeacherByLastName;

//@Slf4j
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    
	@Autowired
	private TeacherRepository teacherRepo;
	
	//@Autowired
	//public TeacherController(TeacherRepository teacherRepo) {
	//	this.teacherRepo = teacherRepo;
	//}
	
	@GetMapping
	public String showTeachers(Model model){
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		teacherRepo.findAll().forEach(t -> teachers.add(t));
		teachers.sort(new SortTeacherByLastName());
		model.addAttribute("teachers", teachers);
		return "teacher";
	}
}