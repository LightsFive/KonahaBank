package com.lightsfive.konohabank.bean;

public class Customer {

	private int customerId;

	private int customerSSNId;

	private String customerName;

	private int age;

	private String emailId;

	private long mobileNumber;

	private String address;

	private String state;

	private String city;

	private char customerStatus;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCustomerSSNId() {
		return customerSSNId;
	}

	public void setCustomerSSNId(int customerSSNId) {
		this.customerSSNId = customerSSNId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public char getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(char customerStatus) {
		this.customerStatus = customerStatus;
	}

}
