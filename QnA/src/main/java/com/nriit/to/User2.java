package com.nriit.to;

public class User2 {
	
	private String username;
	private String password;
	private String imagePath;
	
	public User2() {
	}
	
	public User2(String username, String password, String imagePath) {
		super();
		this.username = username;
		this.password = password;
		this.imagePath = imagePath;
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
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
