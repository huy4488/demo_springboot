package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ClassroomDTO;
import com.example.demo.emtity.Classroom;
import com.example.demo.service.ClassroomService;

@RestController
@RequestMapping("/api/v1")
public class ClassroomController {
	@Autowired
	private ClassroomService classroomService;

	@GetMapping("/classroom")
	public List<ClassroomDTO> listAll() {
		return classroomService.getAllClassroom();
	}

	@GetMapping("/classroom/{id}")
	public ClassroomDTO getStudentById(@PathVariable int id) {
		return classroomService.getClassroomById(id);
	}

//
	@PostMapping("/add-classroom")
	public void addStudent(@RequestBody Classroom newClassroom) {

		classroomService.addNewClassroom(newClassroom);
	}

//
	@PutMapping("/classroom/{id}")
	public ResponseEntity<Classroom> update(@RequestBody Classroom classroom, @PathVariable(value = "id") int id) {
		var check = classroomService.updateClassroom(classroom, id);
		if (!check) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Classroom>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/delete-classroom/{id}")
	public ResponseEntity<ClassroomDTO> delete(@PathVariable(value = "id") int id) {
		ClassroomDTO dto = classroomService.getClassroomById(id);
		if (dto.equals(null)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			classroomService.deleteClassroom(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}

}
