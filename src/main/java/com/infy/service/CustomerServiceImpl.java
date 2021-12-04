package com.infy.service;

import com.infy.respository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private int count;
	private CustomerRepository repository;
	
	public CustomerServiceImpl(CustomerRepository repository,int count) {
		this.count=count;
		this.repository=repository;
	}
	
	public String createCustomer() {
		return repository.createCustomer();
	}
	
	public String fetchCustomer() {
	
	return repository.fetchCustomer(count);
	}

}
