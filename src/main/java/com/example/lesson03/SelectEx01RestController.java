package com.example.lesson03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.domain.Review;

@RestController
public class SelectEx01RestController {
	
	// 요청URL : http://localhost/lesson03/ex01
	@RequestMapping("/lesson03/ex01")
	public Review ex01() {
		
		return ;
		
	}

}
