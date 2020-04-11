package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.CustomerDetails;
import com.example.demo.entity.Benifishiory;
import com.example.demo.entity.Customerdata;
import com.example.demo.entity.Login;
import com.example.demo.repository.BenifishioryRepository;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.LoginRepository;
import com.example.demo.service.ChequeService;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.Optional;
//@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController
@Slf4j
@RequestMapping("/Customer")
public class ChequeController {
	@Autowired
	CustomerRepository CustomerRepository;
	@Autowired
	LoginRepository loginRepository;
	@Autowired
	ChequeService chequeService;
	@Autowired
	BenifishioryRepository benifishioryRepository;
    @PostMapping("/submitCustomer")
    public Login addCustomer(@RequestBody CustomerDetails customer) 
    {
        return loginRepository.save(customer.getLogin());
    }
	
	
}

	/*
	 * @PostMapping("/submitCustomer/{id}/PrimaryAccount") public PrimaryAccount
	 * addPrimaryAccount(@PathVariable int cust_id,@RequestBody PrimaryAccount
	 * primaryaccount) { return
	 * chequeService.addPrimaryAccount(cust_id,primaryaccount); }
	 */


/*
 * @DeleteMapping("/deleteCustomerById/{cust_id}") public void
 * deleteCustomer(@PathVariable int cust_id,Customerdata customer) { //
 * log.info("inside controller");
 * 
 * chequeService.deleteCustomerById(cust_id,customer); }
 */

    /*
	 * @Autowired private ChequeService chequeService;
	 * 
	 */
	/*
	 * @GetMapping("/getAllCustomer") public Iterable<Customerdata> getAllCustomer()
	 * { return chequeService.getAllCustomer(); }
	 */

	/*
	 * @GetMapping("/getCustomerById/{id}") public Optional<Customerdata>
	 * getCustomer(@PathVariable int cust_id) { // log.info("inside controller");
	 * 
	 * return chequeService.getCustomerById(cust_id); }
	 */
    /*@PutMapping("/updateCustomer/{cust_id}")

    public Customerdata updateCustomer(@RequestBody Customerdata customer,@PathVariable  int cust_id) { return
	 chequeService.updateCustomer(customer, cust_id); }*/
  /*  @PutMapping("/{id}/add/{amount}")
    void addMoney(@PathVariable int id, @PathVariable BigDecimal amount): Customer_data
*/
   /* @GetMapping("/getCustomerByAccountNumber/{accountnumber}")
    public Iterable<Customer_data> getCustomerByAccountNumber(@PathVariable String accountnumber) {
        return chequeService.getCustomerByAccountNumber(accountnumber);
    }*/
   /* @GetMapping("/deposite/{id}")

    public void deposite(Customer_data customer,int cust_id)
    {
        chequeService.deposite(customer,id);
    }
*/
   


