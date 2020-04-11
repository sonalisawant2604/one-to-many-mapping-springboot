package com.example.demo.dto;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Entity;

import com.example.demo.entity.Customerdata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;




public class CustomerDetails {
	private Customerdata customerdata;

	@Override
	public String toString() {
		return "CustomerDetails [customerdata=" + customerdata + "]";
	}

	public CustomerDetails() {
		super();
	}

	public Customerdata getCustomerdata() {
		return customerdata;
	}

	public void setCustomerdata(Customerdata customerdata) {
		this.customerdata = customerdata;
	}

}
