package com.besant.student.service;

import java.util.List;
import java.util.Optional;

import com.besant.student.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
	
	
	
}
