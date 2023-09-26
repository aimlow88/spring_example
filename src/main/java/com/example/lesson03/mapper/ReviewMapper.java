package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.domain.Review;

@Repository
public interface ReviewMapper {
	
	public Review selectReview(int id);
	
	// return int(mybatis가 성곡된 행의 갯수를 리턴해준다)
	public int insertReview(Review review);
	
	public int insertReviewAsFiled(
			@Param("storeId") int storeId,
			@Param("menu") String menu,
			@Param("userName") String userName,
			@Param("point") Double point,
			@Param("review") String review);

	public int updateReviewById(
			@Param("id") int id,
			@Param("review") String review
			);
	
	public int deleteReviewById(int id);
}
