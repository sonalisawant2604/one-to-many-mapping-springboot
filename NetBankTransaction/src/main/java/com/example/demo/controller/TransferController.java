package com.example.demo.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.BenifishioryDao;
import com.example.demo.entity.Benifishiory;
import com.example.demo.entity.Customerdata;
import com.example.demo.entity.Login;
import com.example.demo.exception.BankTransactionException;
import com.example.demo.form.SendMoneyForm;
import com.example.demo.service.ChequeService;
@Controller
//@RequestMapping("/transfer")
public class TransferController {

	@Autowired
	BenifishioryDao bankAccountDAO;
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String showBankAccounts(Model model) {
        List<Benifishiory> list = bankAccountDAO.getBankAccounts();
 
        model.addAttribute("accountInfos", list);
 
        return "accountsPage";
    }


	 @RequestMapping(value = "/sendMoney", method = RequestMethod.GET)
	 public String viewSendMoneyPage(Model model) {

	  SendMoneyForm form = new SendMoneyForm(1L, 2L, 700d);

	  model.addAttribute("sendMoneyForm", form);

	  return "sendMoneyPage";
	 }

	  @RequestMapping(value = "/sendMoney", method = RequestMethod.POST)
	  public String processSendMoney(Model model, SendMoneyForm sendMoneyForm) {

	  System.out.println("Send Money::" + sendMoneyForm.getAmount());

	  try { bankAccountDAO.sendMoney(sendMoneyForm.getFromAccountId(),
	  sendMoneyForm.getToAccountId(),  sendMoneyForm.getAmount());
			   }
			   catch(BankTransactionException e)
			   { model.addAttribute("errorMessage", "Error: " +
	  e.getMessage()); return "/sendMoneyPage"; } return "redirect:/"; }

 
	@Autowired
	ChequeService chequeService;
   @RequestMapping("/transferdata")
    public String demo()
    {
    	return "NewFile";
    }
	 @GetMapping(value = "/betweenAccounts")
	  public String betweenAccounts(Model model) {
	  model.addAttribute("transferFrom", ""); 
	  model.addAttribute("transferTo", "");
	  model.addAttribute("amount", "");
	  
	  return "betweenAccounts"; 
	  }
	  
	/*
	 * @PostMapping(value = "/betweenAccounts") public String
	 * betweenAccountsPost(@ModelAttribute("transferFrom") String
	 * transferFrom,@ModelAttribute("transferTo") String
	 * transferTo, @ModelAttribute("amount") String amount, Principal principal)
	 * throws Exception { Optional<Login> login=chequeService.
	 * getCustomerByName(principal.getName()); // Customerdata // user =
	 * userService.findByAccountnumber(principal.getName()); Customerdata
	 * Customerdata customer = login.get().getCustomerdata(); // SavingsAccount
	 * savingsAccount =user.getSavingsAccount(); Benifishiory
	 * benifishiory=(Benifishiory) login.get().getBenifishioryList();
	 * chequeService.betweenAccountsTransfer(transferFrom, transferTo, amount,
	 * customer,benifishiory);
	 * 
	 * return "redirect:/NewFile"; }
	 */
	 

}
