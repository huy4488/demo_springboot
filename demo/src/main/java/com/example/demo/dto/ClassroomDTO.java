package com.example.demo.dto;

import com.example.demo.emtity.Classroom;

public class ClassroomDTO {
	private String name;
	private boolean isAvailable;
	public ClassroomDTO() {
		// TODO Auto-generated constructor stub
	}
	public ClassroomDTO(Classroom classroom) {
		// TODO Auto-generated constructor stub
		this.name = classroom.getName();
		this.isAvailable = classroom.isIs_availible();	
		
	}
	public ClassroomDTO(String name, boolean isAvailible) {
		super();
		this.name = name;
		this.isAvailable = isAvailible;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAvailible() {
		return isAvailable;
	}
	public void setAvailible(boolean isAvailible) {
		this.isAvailable = isAvailible;
	}
	
}
