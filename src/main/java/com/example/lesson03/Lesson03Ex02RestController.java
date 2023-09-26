package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.domain.Review;

@RestController
public class Lesson03Ex02RestController {
	
	
	@Autowired
	private ReviewBO reviewBO;
	// http://localhost/lesson03/ex02/1
	@RequestMapping("/lesson03/ex02/1")
	public String ex02_1() {
		// ctrl + shift +r  : 소스를 찾아 오픈
		Review review = new Review();
		review.setStoreId(7);
		review.setMenu("삼겹혼밥세트");
		review.setUserName("사자고양이");
		review.setPoint(4.5);
		review.setReview("혼자 먹기 딱 적당해요");
		return "성공된 행의 갯수" + reviewBO.addReview(review);
	}
	
	@RequestMapping("/lesson03/ex02/2")
	public String ex02_2() {
		int rowCount = reviewBO.addReviewAsFiled(4, "콤비네이션R", "홍길동", 5.0, "역시 맛있다!!!");
		return "성공 건수 : " + rowCount;
	}
	
	

}
