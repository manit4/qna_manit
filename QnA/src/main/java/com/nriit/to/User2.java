package com.nriit.to;

public class User2 {
	
	private String username;
	private String password;
	private String imageName;
	
	public User2() {
	}
	
	public User2(String username, String password, String imageName) {
		super();
		this.username = username;
		this.password = password;
		this.imageName = imageName;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
}
