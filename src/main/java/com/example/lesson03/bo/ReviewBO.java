package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.domain.Review;
import com.example.lesson03.mapper.ReviewMapper;

@Service
public class ReviewBO {
	
	@Autowired
	public ReviewMapper reviewmapper;
	
	// input : 
	// output : Review(단건)
	public Review getReview(int id) {
		return reviewmapper.selectReview(id);
	}
}
