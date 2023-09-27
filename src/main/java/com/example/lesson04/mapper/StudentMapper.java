package com.example.lesson04.mapper;

import com.example.lesson04.domain.Student;

public interface StudentMapper {
	
	public void insertStudent(Student student);
	
	public Student insertStudentById(int id);

}
