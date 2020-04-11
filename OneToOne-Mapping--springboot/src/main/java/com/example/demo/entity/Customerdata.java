package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


@Entity
public class Customerdata {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
    private String customername;
    private String accountnumber;
    private BigDecimal balance;
    
    //one to one mapping with login table
    @OneToOne
     private Login login;
    
    
    
	/*
	 * @OneToMany(targetEntity = Benifishiory.class,fetch = FetchType.LAZY, cascade
	 * = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="ci_fk",referencedColumnName = "id") public
	 * List<Benifishiory> benifishioryList;
	 */
	  public Customerdata() { super(); }
 
	  
	
	  
	 
	  
	  @Override
	public String toString() {
		return "Customerdata [id=" + id + ", customername=" + customername + ", accountnumber=" + accountnumber
				+ ", balance=" + balance + ", login=" + login + "]";
	}






	public long getId() { return id; }
	  
	  public void setId(long id) { this.id = id; }
	  
	  public String getCustomername() { return customername; }
	  
	  public void setCustomername(String customername) { this.customername =
	  customername; }
	  
	  public String getAccountnumber() { return accountnumber; }
	  
	  public void setAccountnumber(String accountnumber) { this.accountnumber =
	  accountnumber; }
	  
	  public BigDecimal getBalance() { return balance; }
	  
	  public void setBalance(BigDecimal balance) { this.balance = balance; }
	  
	  
	  
	
	  
	 }
