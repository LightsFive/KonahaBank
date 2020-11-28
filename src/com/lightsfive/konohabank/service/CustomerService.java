package com.lightsfive.konohabank.service;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import com.lightsfive.konohabank.bean.Customer;
import com.lightsfive.konohabank.dao.CustomerDao;

public class CustomerService {
	
	public boolean addCustomer(Customer customer) throws SQLException {
		if (customer != null) {
			//customer.setCustomerId(3l);
			customer.setCustomerSSNId(113858002);
			customer.setCustomerStatus('A');
			customer.setUpdatedDate(Timestamp.valueOf(LocalDateTime.now()));
		}
		CustomerDao customerDao = new CustomerDao();
		return customerDao.addCustomer(customer);
	}

}
