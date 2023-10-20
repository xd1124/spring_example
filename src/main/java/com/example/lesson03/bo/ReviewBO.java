package com.example.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.domain.Review;
import com.example.lesson03.mapper.ReviewMapper;

@Service
public class ReviewBO {
	
	@Autowired
	public ReviewMapper reviewmapper;
	
	// output : 전체 행 뽑기
	public List<Review> getReviewList() {
		return reviewmapper.selectReviewList() ;
	}
	
	// input : id
	// output : Review(단건)
	public Review getReview(int id) {
		return reviewmapper.selectReview(id);
	}
	
	// input : Review(단건)
	// output : int (성공된 행의 개수)
	public int addReview(Review review) {
		return reviewmapper.insertReview(review);
	}
	
	// input : 행의 모든 필드
	// output : int (성공된 행의 개수)
	public int addReviewAsField(int storeId, String menu, 
			String userName, Double point, String review) {
		return reviewmapper.insertReviewAsField(storeId, menu, userName, point, review);
	}
	
	// input : id, review
	// output : int (성공 행의 개수)
	public int updateReviewById(int id, String review) {
		return reviewmapper.updateReviewById(id, review);
	}
	
	public void deleteReviewById(int id) {
		reviewmapper.deleteReviewById(id);
	}
}
