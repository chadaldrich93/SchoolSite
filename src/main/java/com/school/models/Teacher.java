package com.school.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
public class Teacher {
   
	@Id
	private final int id;
	private final String name;
	private final String departmentName;
}
