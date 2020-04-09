package com.example.demo.service;




import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.example.demo.entity.Customerdata;
import com.example.demo.repository.CustomerRepository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ChequeService
        {
    @Autowired
    private CustomerRepository customerRepository;


    List<Customerdata> customers=new ArrayList<>();
    public List<Customerdata> getAllCustomer() {
        List<Customerdata> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customer -> customers.add(customer));
        return customers;
    }

    public Optional<Customerdata> getCustomerById(int id) {
    
       // log.info("inside service");
       // log.info("getting customer data");
        return this.customerRepository.findById(id);
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

  /*  public Iterable<Customer_data> getCustomerByAccountNumber(String accountnumber) {
        return chequeRepository.findAllByAccountnumber(accountnumber);
       // return null;
    }*/

    public void deleteCustomerById(int cust_id, Customerdata customer) {
        customerRepository.deleteById(cust_id);
    }


	/*
	 * public void deposite(Customerdata customer,int cust_id) {
	 * customer.setBalance(customer.getBalance()+1000);
	 * 
	 * }
	 */

           /* public PrimaryAccount addPrimaryAccount(int cust_id, PrimaryAccount primaryaccount)
            {
                return chequeRepository.findById(cust_id).map(cust-> {

                    primaryaccount.setC);



                    return chequeRepository.save(primaryaccount);
                })
                        .orElseGet(() -> {
                            customer.setId(id);
                            return chequeRepository.save(customer);


                        });
            }*/
        }

