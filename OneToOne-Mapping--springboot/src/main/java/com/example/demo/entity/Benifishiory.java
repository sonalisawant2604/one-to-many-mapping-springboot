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
    private  long bene_id;
    private String benefishiory_account_no;
    private String name;
    private BigDecimal balance;
    
    @ManyToOne()
    private Customerdata customerdata;

    public long getBene_id() {
	return bene_id;
    }
    public void setBene_id(long bene_id) {
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
    public BigDecimal getBalance() {
	return balance;
    }
    public void setBalance(BigDecimal balance) {
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
