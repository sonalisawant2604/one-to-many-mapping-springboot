package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
public class Benifishiory {

   
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int bene_id;
    private String benefishiory_account_no;
    private String name;
    private  int balance;
    
    @ManyToOne()
    private Customerdata customerdata;

    public int getBene_id() {
	return bene_id;
    }
    public void setBene_id(int bene_id) {
	this.bene_id = bene_id;
    }
    public String getBenefishiory_account_no() {
	return benefishiory_account_no;
    }
    public void setBenefishiory_account_no(String benefishiory_account_no) {
	this.benefishiory_account_no = benefishiory_account_no;
    }
    public String getName() {
	return name;
    }
    public void setName(String name) {
	this.name = name;
    }
    public int getBalance() {
	return balance;
    }
    public void setBalance(int balance) {
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
	return "Benifishiory [bene_id=" + bene_id + ", benefishiory_account_no=" + benefishiory_account_no + ", name="
			+ name + ", balance=" + balance + ", customerdata=" + customerdata + "]";
    }
    public Benifishiory() {
	super();
    }


}
