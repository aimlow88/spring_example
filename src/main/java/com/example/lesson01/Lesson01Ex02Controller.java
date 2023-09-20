package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // jsp를 뿌릴 때에는 @ResponseBody가 없는 Controller를 사용해야 한다.
public class Lesson01Ex02Controller {
	
	// 요청 URL : http://localhost/lesson01/ex02
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		
		//jsp 경로를 리턴한다.
		
		// return "/WEB-INF/jsp/lesson01/ex02.jsp";
		// /WEB-INF/jsp/      .jsp  => application property에 prefix와 suffix 정의를 빼고 리턴
		return "lesson01/ex02";  // jsp의 view 경로와 이름
	}

}
