package com.web.home.account.model;

public class LoginVO {
	private String userId;
	private String password;
	
	public LoginVO() {}
	
	public LoginVO(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
