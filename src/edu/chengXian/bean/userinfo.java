package edu.chengXian.bean;

public class userinfo {
	
	private int userId;
	private String loginname;
	private String password;
	
	@Override
	public String toString() {
		return "userinfo [userId=" + userId + ", loginname=" + loginname + ", password=" + password + "]";
	}
	public userinfo(int userId, String loginname, String password) {
		super();
		this.userId = userId;
		this.loginname = loginname;
		this.password = password;
	}
	public userinfo() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
