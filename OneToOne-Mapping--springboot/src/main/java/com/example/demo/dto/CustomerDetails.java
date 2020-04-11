package com.example.demo.dto;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Entity;

import com.example.demo.entity.Customerdata;
import com.example.demo.entity.Login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;




public class CustomerDetails {
	/*
	 * //private Customerdata customerdata;
	 * 
	 * @Override public String toString() { return "CustomerDetails [customerdata="
	 * + customerdata + "]"; }
	 * 
	 * public CustomerDetails() { super(); }
	 * 
	 * public Customerdata getCustomerdata() { return customerdata; }
	 * 
	 * public void setCustomerdata(Customerdata customerdata) { this.customerdata =
	 * customerdata; }
	 */private Login login;

	public CustomerDetails() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerDetails [login=" + login + "]";
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
}
