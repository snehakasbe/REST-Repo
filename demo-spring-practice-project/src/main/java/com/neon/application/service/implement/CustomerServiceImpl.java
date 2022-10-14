package com.neon.application.service.implement;

import java.util.List;

import com.neon.application.entity.Customer;
import com.neon.application.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	
	private List<Customer> list = new ArrayList<Customer>();
	
	public void createCustomer() {
		
		list= List.of(
				
				new Customer(1l,"Neha","Pune"),
				new Customer(2l,"Pooja","Satara"),
				new Customer(3l,"priti","Kolhapur")
				);
				
	}


	@Override
	public Customer createCustomer(Customer c) {
		
		Customer customer = new Customer();
		customer.setId(c.getId());
		customer.setName(c.getName());
		customer.setCity(c.getCity());
		
		return customer;
	}

	@Override
	public Customer updateCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(long id) {
		
		
		
		return null;
	}

	@Override
	public List<Customer> getListCustomer() {
		
		return list;
	}

}
