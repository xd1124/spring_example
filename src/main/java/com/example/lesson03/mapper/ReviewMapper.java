package com.example.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.domain.Review;

@Repository
public interface ReviewMapper {
	
	public List<Review> selectReviewList();
	
	public Review selectReview(int id);
	
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			// 파라미터가 2개 이상이면 map으로 만든다
			@Param("storeId") int storeId,
			@Param("menu") String menu,
			@Param("userName") String userName,
			@Param("point") Double point,
			@Param("review") String review
			);
	
	public int updateReviewById(
			@Param("id") int id,
			@Param("review") String review);
	
	public int deleteReviewById(int id);
}
