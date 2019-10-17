package com.school.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
public class Course{
   
	@Id
	private final int id;
	private final String name;
	private final String subjectName;
	private final String teacherName;
	private final int period;
	
}
