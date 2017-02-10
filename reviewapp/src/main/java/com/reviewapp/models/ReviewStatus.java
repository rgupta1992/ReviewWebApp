package com.reviewapp.models;

public class ReviewStatus {
	
	private String review;
	private String isPositive;
	
	
	
	public ReviewStatus() {
		
	}
	public ReviewStatus(String review, String isPositive) {
		super();
		this.review = review;
		this.isPositive = isPositive;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getIsPositive() {
		return isPositive;
	}
	public void setIsPositive(String isPositive) {
		this.isPositive = isPositive;
	}
	
	
	
	
}
