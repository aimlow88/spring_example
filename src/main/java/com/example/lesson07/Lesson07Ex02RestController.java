package com.example.lesson07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson07.entity.StudentEntity;
import com.example.lesson07.repository.StudentRepository;

@RestController
@RequestMapping("/lesson07/ex02")
public class Lesson07Ex02RestController {
	
	//이번에만 BO생략
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/1")
	public List<StudentEntity> getStudentList(){
		// 1) 전체 조회(기본 제공)
//		return studentRepository.findAll();
		
		
		// 2) id기준 내림차순 정렬
//		return studentRepository.findAllByOrderByIdDesc();
		
		//3) id 기준 내림차순 3개만 조회
//		return studentRepository.findTop3ByOrderByIdDesc();
		
		// 4) 이름이 유재석인 데이터 조회
//		return studentRepository.findByName("유재석");
		
		// 5) in문으로 일치하는 값 모드ㅜ 조회
//		return studentRepository.findByNameIn(List.of("유재석", "조세호", "홍길동"));
		
		// 6) 여러 컬럼 값과 일치하는 데이터 조회
//		return studentRepository.findByNameAndDreamJob("조세호", "변호사");
		
		// 7) email 컬럼에 'naver'키워드가 포함된 데이터 조회(like문) -%naver%
//		return studentRepository.findByEmailContaining("naver");
		
		// 8) 이름이 "유"로 시작하는 데이터 조회 (like 유%)
//		return studentRepository.findByNameStartingWith("유");
		
		// 9) 아이디가 1 ~ 5인 데이더 조회
		return studentRepository.findByIdBetween(1, 5);
	
	}
	
	@GetMapping("/2")
	public List<StudentEntity> getStudentList2(){
		
		return studentRepository.findByDreamJob("프로그래머");
	}
	
	

}
