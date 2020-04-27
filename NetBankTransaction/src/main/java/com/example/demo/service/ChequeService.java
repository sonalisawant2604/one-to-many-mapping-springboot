package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.example.demo.entity.Benifishiory;
import com.example.demo.entity.Customerdata;
import com.example.demo.entity.Login;
import com.example.demo.repository.BenifishioryRepository;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.LoginRepository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ChequeService {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private LoginRepository loginRepository;

	@Autowired
	private BenifishioryRepository benifishioryRepository;

	public List<Customerdata> getAllCustomer() {
		List<Customerdata> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customer -> customers.add(customer));
		return customers;
	}

	public Optional<Login> getCustomerByName(String name) {

		// log.info("inside service");
		// log.info("getting customer data");
		return loginRepository.findByUsername(name);
	}

	public void addCustomer(Customerdata customer) {
		customerRepository.save(customer);
	}

	/*
	 * public Customerdata updateCustomer(Customerdata customer, int id) { return
	 * customerRepository.findById(id).map(cust -> {
	 * 
	 * cust.setid(customer.getid());
	 * cust.setCustomername(customer.getCustomername());
	 * cust.setAccountnumber(customer.getAccountnumber());
	 * cust.setBalance(customer.getBalance());
	 * 
	 * 
	 * return chequeRepository.save(customer); }) .orElseGet(() -> {
	 * customer.setCust_id(id); return chequeRepository.save(customer);
	 * 
	 * 
	 * }); }
	 */

	/*
	 * public Iterable<Customer_data> getCustomerByAccountNumber(String
	 * accountnumber) { return
	 * chequeRepository.findAllByAccountnumber(accountnumber); // return null; }
	 */

	public void deleteCustomerById(long id, Customerdata customer) {
		customerRepository.deleteById(id);
	}

	/*
	 * public void betweenAccountsTransfer(String transferFrom, String transferTo,
	 * String amount, Customerdata customer, Benifishiory benifishiory) { //public
	 * void betweenAccountsTransfer(String transferFrom, String transferTo, String
	 * amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws
	 * Exception { if (transferFrom.equalsIgnoreCase("customer") &&
	 * transferTo.equalsIgnoreCase("benifishiory")) {
	 * customer.setBalance(customer.getBalance().subtract(new BigDecimal(amount)));
	 * //
	 * savingsAccount.setAccountBalance(savingsAccount.getAccountBalance().add(new
	 * BigDecimal(amount)));
	 * benifishiory.setBalance(benifishiory.getBalance().add(new
	 * BigDecimal(amount))); // primaryAccountDao.save(primaryAccount);
	 * //savingsAccountDao.save(savingsAccount); customerRepository.save(customer);
	 * benifishioryRepository.save(benifishiory); }
	 * 
	 * 
	 * Date date = new Date();
	 * 
	 * PrimaryTransaction primaryTransaction = new PrimaryTransaction(date,
	 * "Between account transfer from "+transferFrom+" to "+transferTo, "Account",
	 * "Finished", Double.parseDouble(amount), primaryAccount.getAccountBalance(),
	 * primaryAccount); primaryTransactionDao.save(primaryTransaction); } else if
	 * (transferFrom.equalsIgnoreCase("Savings") &&
	 * transferTo.equalsIgnoreCase("Primary")) {
	 * primaryAccount.setAccountBalance(primaryAccount.getAccountBalance().add(new
	 * BigDecimal(amount)));
	 * savingsAccount.setAccountBalance(savingsAccount.getAccountBalance().subtract(
	 * new BigDecimal(amount))); primaryAccountDao.save(primaryAccount);
	 * savingsAccountDao.save(savingsAccount);
	 * 
	 * Date date = new Date();
	 * 
	 * SavingsTransaction savingsTransaction = new SavingsTransaction(date,
	 * "Between account transfer from "+transferFrom+" to "+transferTo, "Transfer",
	 * "Finished", Double.parseDouble(amount), savingsAccount.getAccountBalance(),
	 * savingsAccount); savingsTransactionDao.save(savingsTransaction); } else {
	 * throw new Exception("Invalid Transfer"); }
	 * 
	 * }
	 */
	public List<Benifishiory> getAllBenifishiory() {
		List<Benifishiory> customers = new ArrayList<>();
		benifishioryRepository.findAll().forEach(customer -> customers.add(customer));
		return customers;
	}

	public List<Login> getLogin() {
		List<Login> customers = new ArrayList<>();
		loginRepository.findAll().forEach(customer -> customers.add(customer));
		return customers;
	}

	public Iterable<Customerdata> getCustomer() {
		List<Customerdata> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customer -> customers.add(customer));
		return customers;
	}
}

/*
 * public void deposite(Customerdata customer,int cust_id) {
 * customer.setBalance(customer.getBalance()+1000);
 * 
 * }
 */

/*
 * public PrimaryAccount addPrimaryAccount(int cust_id, PrimaryAccount
 * primaryaccount) { return chequeRepository.findById(cust_id).map(cust-> {
 * 
 * primaryaccount.setC);
 * 
 * 
 * 
 * return chequeRepository.save(primaryaccount); }) .orElseGet(() -> {
 * customer.setId(id); return chequeRepository.save(customer);
 * 
 * 
 * }); }
 */
