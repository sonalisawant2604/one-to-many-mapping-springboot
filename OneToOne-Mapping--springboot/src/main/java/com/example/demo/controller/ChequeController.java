package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Customerdata;
import com.example.demo.service.ChequeService;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Optional;
//@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController
@Slf4j
@RequestMapping("/Customer")
public class ChequeController {
    @Autowired
    private ChequeService chequeService;
   
    @RequestMapping("/cheque")
    public String sayHello() {
        return "In Check transaction";

    }
    @GetMapping("/getAllCustomer")
    public Iterable<Customerdata> getAllCustomer() {
        return chequeService.getAllCustomer();
    }


    @GetMapping("/getCustomerById/{id}")
    public Optional<Customerdata> getCustomer(@PathVariable int cust_id)
    {
       // log.info("inside controller");

        return chequeService.getCustomerById(cust_id);
    }
    @PostMapping("/submitCustomer")
    public void addCustomer(@RequestBody Customerdata customer) {
        chequeService.addCustomer(customer);
    }

    /*@PostMapping("/submitCustomer/{id}/PrimaryAccount")
    public PrimaryAccount addPrimaryAccount(@PathVariable int cust_id,@RequestBody PrimaryAccount primaryaccount) {
       return chequeService.addPrimaryAccount(cust_id,primaryaccount);
    }*/

    @DeleteMapping("/deleteCustomerById/{cust_id}")
    public void deleteCustomer(@PathVariable int cust_id,Customerdata customer)
    {
       // log.info("inside controller");

        chequeService.deleteCustomerById(cust_id,customer);
    }


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
   /* @RequestMapping(value = "/betweenAccounts", method = RequestMethod.GET)
    public String betweenAccounts(Model model) {
        model.addAttribute("transferFrom", "");
        model.addAttribute("transferTo", "");
        model.addAttribute("amount", "");

        return "betweenAccounts";
    }

    @RequestMapping(value = "/betweenAccounts", method = RequestMethod.POST)
    public String betweenAccountsPost(@ModelAttribute("transferFrom") String transferFrom,
                                      @ModelAttribute("transferTo") String transferTo, @ModelAttribute("amount") String amount,
                                      Principal principal) throws Exception {
        Customer_data user = userService.findByAccountnumber(principal.getName());
        PrimaryAccount primaryAccount = user.getPrimaryAccount();
        SavingsAccount savingsAccount = user.getSavingsAccount();
        transactionService.betweenAccountsTransfer(transferFrom, transferTo, amount, primaryAccount, savingsAccount);

        return "redirect:/userFront";
    }*/
}




