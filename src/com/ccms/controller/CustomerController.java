package com.ccms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ccms.dao.CustomerDAO;
import com.ccms.entity.Customer;

@Controller
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	private CustomerDAO customerDao;
	
	
	@RequestMapping("/get-list")
	public String listCustomer (Model theModel) {
		
		//Get the listof customer from DAO
		 List<Customer> allCustomersList=customerDao.getCustomerList();
		 
		 //Bind it with the Model
		 theModel.addAttribute("allcustomer",allCustomersList);
		
		return "customer-record-panel";
		
	}

}
