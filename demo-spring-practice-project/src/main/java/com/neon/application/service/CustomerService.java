package com.neon.application.service;

import java.util.List;

import com.neon.application.entity.Customer;

public interface CustomerService {
	
	public Customer createCustomer(Customer c);
	public Customer updateCustomer();
	public Customer deleteCustomer(long id);
	public List getListCustomer();

}
