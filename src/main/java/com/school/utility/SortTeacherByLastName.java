package com.school.utility;

import java.util.Comparator;

import com.school.models.Teacher;

public class SortTeacherByLastName implements Comparator<Teacher>{
    
	public int compare(Teacher a, Teacher b) {
		return getLastName(a).compareTo(getLastName(b));
	}

    private String getLastName(Teacher teacher) {
	    String[] names = teacher.getName().split(" ");
	    return names[1];
    }
    
}
    