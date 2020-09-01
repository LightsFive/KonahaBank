package com.lightsfive.konohabank.bean;

import java.util.Date;

public class Account {

	private long customerId;
	
	private long accountId;
	
	private String IFSCCode;
	
	private String branch;
	
	private String branchEmail;
	
	private String accountType;
	
	private String balance;
	
	private Date lastUpdated;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getIFSCCode() {
		return IFSCCode;
	}

	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBranchEmail() {
		return branchEmail;
	}

	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		return "Account [customerId=" + customerId + ", accountId=" + accountId + ", IFSCCode=" + IFSCCode + ", branch="
				+ branch + ", branchEmail=" + branchEmail + ", accountType=" + accountType + ", balance=" + balance
				+ ", lastUpdated=" + lastUpdated + "]";
	}
	 

}
