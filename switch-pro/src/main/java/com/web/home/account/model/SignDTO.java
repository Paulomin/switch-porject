package com.web.home.account.model;


public class SignDTO {
	private int id;
	private String userId;
	private String password;
	private String username;
	private String email;
	private String phone;
	
	public SignDTO() {}
	
	public SignDTO(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "SignDTO [id=" + id + ", userId=" + userId + ", password=" + password + ", username=" + username
				+ ", email=" + email + ", phone=" + phone + "]";
	}
	
	

	
}
