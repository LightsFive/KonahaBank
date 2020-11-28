package com.lightsfive.konohabank.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.lightsfive.konohabank.bean.Customer;

public class CustomerDao extends Repository {
	
	private static final String ADD_CUSTOMER = "insert into knb_customer values(?,?,?,?,?,?,?,?,?,?,?)";
	
	public boolean addCustomer(Customer customer) throws SQLException {
		Map<Integer, Object> parameters = new HashMap<>();
		parameters.put(1, customer.getCustomerId());
		parameters.put(2, customer.getCustomerSSNId());
		parameters.put(3, customer.getCustomerName());
		parameters.put(4, customer.getAge());
		parameters.put(5, customer.getAddress());
		parameters.put(6, customer.getState());
		parameters.put(7, customer.getCity());
		parameters.put(8, customer.getEmailId());
		parameters.put(9, customer.getMobileNumber());
		parameters.put(10, customer.getCustomerStatus());
		parameters.put(11, customer.getUpdatedDate());
		return add(ADD_CUSTOMER, parameters);
	}

}
