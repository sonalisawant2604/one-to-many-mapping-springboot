package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;


@Entity
public class Login {
	@Id
	private long id;
	private String username;
	private String password;
	
	public Customerdata getCustomerdata() {
		return customerdata;
	}
	public void setCustomerdata(Customerdata customerdata) {
		this.customerdata = customerdata;
	}


	@OneToOne(targetEntity =Customerdata.class,fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	  @JoinColumn(name="loginId_fk",referencedColumnName = "id")
	private Customerdata customerdata;
	
	@OneToMany(targetEntity = Benifishiory.class,fetch = FetchType.LAZY, cascade= CascadeType.ALL)
			  
			  @JoinColumn(name="ci_fk",referencedColumnName = "id") 
	public List<Benifishiory> benifishioryList;
	
	 public List<Benifishiory> getBenifishioryList() {
		return benifishioryList;
	}
	public void setBenifishioryList(List<Benifishiory> benifishioryList) {
		this.benifishioryList = benifishioryList;
	}
	public long getId() { return id; } public void setId(long id) { this.id = id; }
	 public String getUsername() { return username; } public void
	  setUsername(String username) { this.username = username; } public String
	  getPassword() { return password; } public void setPassword(String password) {
	  this.password = password; }
	  
	  @Override public String toString() { return "Login [id=" + id + ", username="
	  + username + ", password=" + password + "]"; } public Login() { super(); }
	  
	 
}
