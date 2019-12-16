package com.entity;

public class User {
	private int Id;
	private String First_name;
	private String Last_name;
	private String user_name;
	private String email;
	private String password;
	private String Role;
	public User(int id, String first_name, String last_name, String user_name, String email, String password,
			String role) {
		super();
		Id = id;
		First_name = first_name;
		Last_name = last_name;
		this.user_name = user_name;
		this.email = email;
		this.password = password;
		Role = role;
	}
	public User(String first_name, String last_name, String user_name, String email, String password, String role) {
		super();
		First_name = first_name;
		Last_name = last_name;
		this.user_name = user_name;
		this.email = email;
		this.password = password;
		Role = role;
	}
	public User() {
		super();
	}
	
	
	public User(String user_name) {
		super();
		this.user_name = user_name;
	}
	public User(String user_name, String email) {
		super();
		this.user_name = user_name;
		this.email = email;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
}
