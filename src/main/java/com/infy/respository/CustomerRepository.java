package com.infy.respository;

public class CustomerRepository {

	public String  fetchCustomer(int count)
	{
		return "the number of the customer fetched are "+count;
	}
	
	public String createCustomer()
	{
		return "customer is created successfully";
	}
}
