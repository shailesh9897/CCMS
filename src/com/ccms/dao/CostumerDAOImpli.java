package com.ccms.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ccms.entity.Customer;
@Repository
public class CostumerDAOImpli implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	@Transactional
	public List<Customer> getCustomerList() {
		//Get the session
		Session session=sessionFactory.getCurrentSession();
		
		Query<Customer> thequery=session.createQuery(" from Customer  ",Customer.class);
		
		//Get the list of all the customer in db.
		
		List<Customer> listOfCustomers=thequery.getResultList();
		
		return listOfCustomers;
	}

}
