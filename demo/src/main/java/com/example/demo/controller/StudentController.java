package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentResponseDTO;
import com.example.demo.emtity.Student;
import com.example.demo.service.StudentSevice;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	@Autowired
	private StudentSevice studentSevice;

	@GetMapping("/students")
	public List<StudentResponseDTO> listAll() {
		return studentSevice.getAllStudent();
	}

	@GetMapping("/student/{id}")
	public StudentResponseDTO getStudentById(@PathVariable int id) {
		return studentSevice.getStudentById(id);
	}

	@PostMapping("/add-student")
	public void addStudent(@RequestBody Student newStudent) {
		studentSevice.addNewStudent(newStudent);
	}

	@PutMapping("/student/{id}")
	public ResponseEntity<Student> update(@RequestBody Student student, @PathVariable(value = "id") int id) {
		var check = studentSevice.updateStudent(student, id);
		if (!check) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Student>(HttpStatus.OK);
		}
	}

	@DeleteMapping("/delete-student/{id}")
    public ResponseEntity deleteStudent(@PathVariable(value = "id") int id) {
		StudentResponseDTO student = studentSevice.getStudentById(id);
		if(student.equals(null)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			studentSevice.deleteStudent(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
    }

    
        
}
