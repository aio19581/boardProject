package com.user;

public class userVO {
	private String username;
	private String userID;
	private String userPW;
	private String userEmail;
	private String birthDay;
	private String phoneNumber;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public userVO() {}
	
	public userVO(String username, String userID, String userPW, String userEmail, String birthDay,
			String phoneNumber) {
		super();
		this.username = username;
		this.userID = userID;
		this.userPW = userPW;
		this.userEmail = userEmail;
		this.birthDay = birthDay;
		this.phoneNumber = phoneNumber;
	}
	
}
