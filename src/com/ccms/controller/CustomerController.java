package com.ccms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ccms.dao.CustomerDAO;
import com.ccms.entity.Customer;
import com.ccms.service.CustomerServiceInt;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerServiceInt customerService;
	
	
	@GetMapping("/get-list")
	public String listCustomer (Model theModel) {
		
		//Get the listof customer from DAO
		 List<Customer> allCustomersList=customerService.getCustomersList();
		 
		 //Bind it with the Model
		 theModel.addAttribute("allcustomer",allCustomersList);
		
		return "customer-record-panel";
		
	}
	
	@GetMapping("/showaddform")
	public String showAddCustomerForm(Model theModel)
	{
		Customer theCustomer=new Customer();
		theModel.addAttribute("customerdata",theCustomer);
		return "add-new-customer";
	}
	
	@PostMapping("addnewcustomer")
	public String addNewUserToDb(@ModelAttribute("customerdata") Customer objCustomer ) {
		
		
		customerService.addCustomer(objCustomer);
		return "redirect:/customer/get-list";
	}

}
