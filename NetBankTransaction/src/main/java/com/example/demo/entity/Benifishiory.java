package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
public class Benifishiory {

   
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private double balance;
    @ManyToOne()
    private Customerdata customerdata;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customerdata getCustomerdata() {
		return customerdata;
	}
	public void setCustomerdata(Customerdata customerdata) {
		this.customerdata = customerdata;
	}
	@Override
	public String toString() {
		return "Benifishiory [id=" + id + ", fullName=" + fullName + ", balance=" + balance + ", customerdata="
				+ customerdata + "]";
	}
	public Benifishiory(Long id, String fullName, double balance) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.balance = balance;
		
	}
	public Benifishiory() {
		super();
	}

    

}
