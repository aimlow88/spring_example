package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")  // method에 붙은 매핑보다 먼저 적용
@Controller   // Spring 객체임을 등록, Spring Bean 등록
public class Lesson01Ex01Controller {
	
	// spring 출력
	// 요청URL : http://localhost:8080/lesson01/ex01/1
	@RequestMapping("/1")   // 주소 맵핑
	@ResponseBody  // 리턴되는 string이 응답의 Body에 실려서 내려간다.
	
	public String ex01_1() {
		return "<h1>문자열을 Response body로 보내는 예제</h1>";
	}
	
	// Map -> JSON String 출력
	// 요청URL : http://localhost:8080/lesson01/ex01/2
	@RequestMapping("/2")
	@ResponseBody
	
	public Map<String, Object> ex01_2(){
		Map<String, Object> map = new HashMap<>();
		map.put("사과", 5);
		map.put("배", 25);
		map.put("포도", 100);
		
		// map을 리턴하면 json으로 변경되어 출력된다.
		// web starter에 Jackson이라는 라이브러리가 포함되어 있기 때문
		return map;
	}

}
