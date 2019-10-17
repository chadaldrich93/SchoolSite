package com.school.web.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import lombok.extern.slf4j.Slf4j;

import com.school.models.Department;

//@Slf4j
@Controller
@RequestMapping("/department")
public class DepartmentController {
    
	@GetMapping
	public String showDepartments(Model model){
		ArrayList<Department> departments = new ArrayList<Department>();
		departments.add(new Department(0, "Science"));
		departments.add(new Department(1, "Mathematics"));
		departments.add(new Department(2, "English"));
		departments.add(new Department(3, "History"));
		departments.add(new Department(4, "Spanish"));
		model.addAttribute("departments", departments);
		return "department";
	}
}