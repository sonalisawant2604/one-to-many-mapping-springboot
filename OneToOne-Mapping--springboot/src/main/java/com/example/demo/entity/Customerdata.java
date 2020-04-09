package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * @author shaileshs31
 *
 */
@Entity


public class Customerdata {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="id")
    private int id;
    private String customername;

    private String accountnumber;
    private int balance;

    @OneToMany(targetEntity = Benifishiory.class,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="ci_fk",referencedColumnName = "id")
     public List<Benifishiory> benifishioryList;
   public Customerdata() {
		super();
	}


@Override
	public String toString() {
		return "Customerdata [id=" + id + ", customername=" + customername + ", accountnumber=" + accountnumber
				+ ", balance=" + balance + ", benifishioryList=" + benifishioryList + "]";
	}

public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}



    public List<Benifishiory> getBenifishioryList() {
        return benifishioryList;
    }

    public void setBenifishioryList(List<Benifishiory> benifishioryList) {
        this.benifishioryList = benifishioryList;
    }

}
