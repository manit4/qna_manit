package com.nriit.to;

public class User {
	
	private String username;
	private String password;
	private String name;
	private String email;
	private String role;
	private String fileName;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String password, String name, String email, String role) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.role = role;
	}



	public User(String username, String password, String name, String email, String role, String fileName) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.role = role;
		this.fileName = fileName;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
