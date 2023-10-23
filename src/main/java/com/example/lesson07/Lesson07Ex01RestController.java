package com.example.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson07.entity.StudentEntity;

@RequestMapping("/lesson07/ex01")
@RestController
public class Lesson07Ex01RestController {
	
	@Autowired
	private StudentBO studentBO;
	
	//
	@GetMapping("/1")
	public StudentEntity create() {
		
		String name = "홍길동";
		String phoneNumber = "010-1111-2222";
		String email = "kdhong@gmail.com";
		String dreamJob = "개발자";
		
		// 지금 들어간 id 값을 얻을 수 잇다.
		return studentBO.addStudent(name, phoneNumber, email, dreamJob);
		
	}
	
	
	// UPDATE
	@GetMapping("/2")
	public StudentEntity update() {
		// id:4 dreamjob변경
		
		return studentBO.upadteStudentDreamJobById(5, "재벌");
	}
	
	// D : delete
	@GetMapping("/3")
	public String delete() {
		// id:7
		studentBO.deleteStudentById(7);
		return "삭제완료";
	}

}
