package com.example.lesson02.domain;

import java.util.Date;

// DTO, Model, Domain
public class UsedGoods {
	// 필드 Integer = NULL 허용
	private int id;
	private int sellerId;
	private String title;
	private String description;
	private int price;
	private String pictureUrll;
	private Date createdAt;
	private Date updatedAt;
	
	// 생성자
	
	// 메소드
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPictureUrll() {
		return pictureUrll;
	}
	public void setPictureUrll(String pictureUrll) {
		this.pictureUrll = pictureUrll;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
