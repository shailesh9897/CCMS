package com.ccms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccms.dao.CustomerDAO;
import com.ccms.entity.Customer;
@Service
public class CustomerService implements CustomerServiceInt {
	
	@Autowired
	private CustomerDAO customerdDAO;

	@Override
	@Transactional
	public List<Customer> getCustomersList() {
		
		return customerdDAO.getCustomerList();
	}

}
