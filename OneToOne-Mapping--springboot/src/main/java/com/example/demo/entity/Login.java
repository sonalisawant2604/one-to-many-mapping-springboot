package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Login {
	@Id
	private int id;
	private String username;
	private String password;
	
	@OneToOne
	private Customerdata customerdata;
	
	 public int getId() { return id; } public void setId(int id) { this.id = id; }
	 public String getUsername() { return username; } public void
	  setUsername(String username) { this.username = username; } public String
	  getPassword() { return password; } public void setPassword(String password) {
	  this.password = password; }
	  
	  @Override public String toString() { return "Login [id=" + id + ", username="
	  + username + ", password=" + password + "]"; } public Login() { super(); }
	  
	 
}
