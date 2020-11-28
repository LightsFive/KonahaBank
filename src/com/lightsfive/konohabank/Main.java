package com.lightsfive.konohabank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import com.lightsfive.konohabank.bean.Customer;
import com.lightsfive.konohabank.service.CustomerService;
import com.lightsfive.konohabank.util.DBUtil;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getMyDBConnection();
		Customer customer = new Main().createCustomer();
		CustomerService service = new CustomerService();
		service.addCustomer(customer);
		PreparedStatement ps = con.prepareStatement("SELECT id from public.\"SAMPLE\"");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id"));
		}
	}
	
	private Customer createCustomer() {
		Customer c = new Customer();
		c.setCustomerId(1l);
		c.setCustomerSSNId(865429);
		c.setCustomerName("Uzumaki Naruto");
		c.setCustomerStatus('A');
		c.setEmailId("naruto.uzumaki@gmail.com");
		c.setMobileNumber(987654321);
		c.setAddress("address");
		c.setCity("Konoha");
		c.setState("Naruto");
		c.setAge(19);
		c.setUpdatedDate(new Timestamp(new Date().getTime()));
		return c;
	}

}
