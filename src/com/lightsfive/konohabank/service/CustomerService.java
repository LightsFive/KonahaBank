package com.lightsfive.konohabank.service;

import java.sql.SQLException;

import com.lightsfive.konohabank.bean.Customer;
import com.lightsfive.konohabank.dao.CustomerDao;

public class CustomerService {
	
	public boolean addCustomer(Customer customer) throws SQLException {
		CustomerDao customerDao = new CustomerDao();
		return customerDao.addCustomer(customer);
	}

}
