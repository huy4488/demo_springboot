package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ClassroomDTO;
import com.example.demo.emtity.Classroom;
import com.example.demo.emtity.Student;

public interface ClassroomService {
	List<ClassroomDTO> getAllClassroom();
	ClassroomDTO getClassroomById(int id);
	void addNewClassroom(Classroom classroom);
	boolean updateClassroom(Classroom classroom, int id);
	void deleteClassroom(int id);
}
