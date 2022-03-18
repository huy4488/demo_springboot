package com.example.demo.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.demo.controller.ClassroomController;
import com.example.demo.dto.ClassroomDTO;
import com.example.demo.dto.StudentResponseDTO;
import com.example.demo.emtity.Classroom;
import com.example.demo.emtity.Student;
import com.example.demo.repository.Classroomrepository;
import com.example.demo.service.ClassroomService;

@Service
public class ClassroomServiceImpl implements ClassroomService {
	@Autowired 
	private Classroomrepository classroomRepository;

	@Override
	public List<ClassroomDTO> getAllClassroom() {
		// TODO Auto-generated method stub
		var list = classroomRepository.findAll();
		List<ClassroomDTO> listResult = new ArrayList<ClassroomDTO>();
		for (Classroom classroom : list) {
			ClassroomDTO dto = new ClassroomDTO(classroom);
			listResult.add(dto);
		}
		
		return listResult;
	}

	@Override
	public ClassroomDTO getClassroomById(int id) {
		// TODO Auto-generated method stub
		ClassroomDTO dto = new ClassroomDTO(classroomRepository.findById(id).get());
		return dto;
	}

	@Override
	public void addNewClassroom(Classroom classroom) {
		// TODO Auto-generated method stub
		classroomRepository.save(classroom);
	}

	@Override
	public boolean updateClassroom(Classroom classroom, int id) {
		// TODO Auto-generated method stub
		Classroom s = new Classroom();
		s = classroomRepository.findById(id).get();
		if(s.equals(null)) {
			return false;
		} else {
			s.setIs_availible(classroom.isIs_availible());		
			s.setName(classroom.getName());
			classroomRepository.save(s);
			return true;
		}
	}

	@Override
	public void deleteClassroom(int id) {
		// TODO Auto-generated method stub
		classroomRepository.deleteById(id);
	}


	
	
}
