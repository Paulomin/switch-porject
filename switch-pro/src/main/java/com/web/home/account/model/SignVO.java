package com.web.home.account.model;

public class SignVO {
	// 있는 그대로 저장할 클래스
	private String userId;
	private String userPw;
	private String userPw_chk;
	private String userEmail;
	private String userPhone;
	
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
	
	public String getUserPw_chk() {
		return userPw_chk;
	}
	
	public void setUserPw_chk(String userPw_chk) {
		this.userPw_chk = userPw_chk;
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
		return "SignVO [userId=" + userId + ", userPw=" + userPw + ", userPw_chk=" + userPw_chk + ", userEmail="
				+ userEmail + ", userPhone=" + userPhone + "]";
	}
	
	
	

}
