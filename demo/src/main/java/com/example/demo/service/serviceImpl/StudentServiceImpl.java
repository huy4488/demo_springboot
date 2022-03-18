package com.example.demo.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentResponseDTO;
import com.example.demo.emtity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentSevice;

@Service
public class StudentServiceImpl implements StudentSevice {
	@Autowired private StudentRepository studentRepository;

	@Override
	public List<StudentResponseDTO> getAllStudent() {
		var list = studentRepository.findAll();
		List<StudentResponseDTO> listResult = new ArrayList<StudentResponseDTO>();
		for (Student student : list) {
			StudentResponseDTO dto = new StudentResponseDTO(student);
			listResult.add(dto);
		}
		
		return listResult;
	}

	@Override
	public StudentResponseDTO getStudentById(int id) {
		// TODO Auto-generated method stub
		StudentResponseDTO dto = new StudentResponseDTO(studentRepository.findById(id).get());
		return dto;
	}

	@Override
	public void addNewStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		
	}

	@Override
	public boolean updateStudent(Student student,int id) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s = studentRepository.findById(id).get();
		if(s.equals(null)) {
			return false;
		} else {
			s.setAddress(student.getAddress());		
			s.setName(student.getName());
			studentRepository.save(s);
			return true;
		}
				
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}

}
