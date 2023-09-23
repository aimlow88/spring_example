package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.domain.Review;

@RestController
public class SelectEx01RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// 요청URL : http://localhost/lesson03/ex01
	// 요청URL : http://localhost/lesson03/ex01?id=5
	
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
			// @RequestParam(value="id") int id    // 필수 파라미터
			// @RequestParam(value="id", required=true) int id // 필수 파라미터
			// @RequestParam(value="id", required=false) Integer id    // 비필수 파라미터 (id가 null이어도 되기 때문에 id 타입명은 Integer로 지정
			@RequestParam(value="id", defaultValue="1") int id ) {
		//id = 5;
		return reviewBO.getReview(id);
	}

}
