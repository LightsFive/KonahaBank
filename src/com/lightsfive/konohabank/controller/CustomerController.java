package com.lightsfive.konohabank.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lightsfive.konohabank.bean.Customer;
import com.lightsfive.konohabank.service.CustomerService;

/**
 * Servlet implementation class CreateCustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		String customerName = (String) request.getParameter("customerName");
		String age = (String) request.getParameter("age");
		String address = (String) request.getParameter("address");
		String state = (String) request.getParameter("state");
		String city = (String) request.getParameter("city");
		String mobileNumber = (String) request.getParameter("mobileNumber");
		String emailId = (String) request.getParameter("emailId");
		System.out.println("Age=" + age + " MobileNumber=" + mobileNumber);
		Customer customer = new Customer(customerName, Integer.valueOf(age), emailId, Long.valueOf(mobileNumber), address, state, city);
		CustomerService cs = new CustomerService();
		boolean added = false;
		try {
			added = cs.addCustomer(customer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (added) {
			requestDispatcher = request.getRequestDispatcher("success.jsp");
			request.setAttribute("message", "Customer Registration Successfull");
			requestDispatcher.forward(request, response);
		} else {
			requestDispatcher = request.getRequestDispatcher("success.jsp");
			request.setAttribute("message", "Customer Registration Failed");
			requestDispatcher.forward(request, response);
		}
	}

}
