package com.example.demo.dto;

import com.example.demo.emtity.Classroom;
import com.example.demo.emtity.Student;

public class StudentResponseDTO {
	private String name;
	private String address;
	private Classroom classroom;
	
	public StudentResponseDTO(String name, String address) {
		super();
		this.name = name;
		//this.classroom_id = classroom_id;
		this.address = address;
	}
	public StudentResponseDTO(Student student) {
		this.name = student.getName();;
		this.address = student.getAddress();
		//this.classroom_id = student.getClassroom_id();
	}
	
	public Classroom getClassroom() {
		return classroom;
	}
	public StudentResponseDTO(String name, String address, Classroom classroom) {
		super();
		this.name = name;
		this.address = address;
		this.classroom = classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	public StudentResponseDTO() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
