package com.example.model;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class User {
	private String userId;
	private String userName;
	private String password;
	private String loginDateTime;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getLoginDateTime() {
		return loginDateTime;
	}
	public void setLoginDateTime(String loginDateTime) {
		this.loginDateTime = loginDateTime;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ",+ loginDateTime="
				+ loginDateTime + "]";
	}
	
	public String loginDate() {
		DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
		 
		//Zoned datetime instance
		ZonedDateTime zdt = ZonedDateTime.now();
		 
		//Get formatted String
		String zdtString = FOMATTER.format(zdt);
		 
		return zdtString;
	}
	
	

}
