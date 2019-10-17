package com.school.utility;

import java.util.Comparator;

import com.school.models.Student;

public class SortStudentByLastName implements Comparator<Student>{
    
	public int compare(Student a, Student b) {
		return getLastName(a).compareTo(getLastName(b));
	}

    private String getLastName(Student Student) {
	    String[] names = Student.getName().split(" ");
	    return names[1];
    }
    
}
    