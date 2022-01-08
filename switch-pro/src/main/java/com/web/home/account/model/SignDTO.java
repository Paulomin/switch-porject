package com.web.home.account.model;

public class SignDTO {
	private int id;
	private String userId;
	private String userPw;
	private String userEmail;
	private String userPhone;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPw() {
		return userPw;
	}
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public String getUserPhone() {
		return userPhone;
	}
	
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	@Override
	public String toString() {
		return "SignVO [id=" + id + ", userId=" + userId + ", userPw=" + userPw 
				+ ", userEmail=" + userEmail + ", userPhone=" + userPhone + "]";
	}
	
	
}
