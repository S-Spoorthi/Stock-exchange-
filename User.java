package com.waleed.stock.training;

public class User {
	String userName,pwd,userType,email,confirmed;
	int uId, phNo;
	
	public User(int uId,String userName,  String pwd, String userType,String email,int phNo, String confirmed) {
		this.userName = userName;
		this.userType = userType;
		this.pwd = pwd;
		this.email = email;
		this.confirmed = confirmed;
		this.uId = uId;
		this.phNo = phNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
}
