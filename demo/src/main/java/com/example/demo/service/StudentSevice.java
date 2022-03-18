package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.StudentResponseDTO;
import com.example.demo.emtity.Student;


public interface StudentSevice {
	List<StudentResponseDTO> getAllStudent();
	StudentResponseDTO getStudentById(int id);
	void addNewStudent(Student student);
	boolean updateStudent(Student student, int id);
	void deleteStudent(int id);
	
}
