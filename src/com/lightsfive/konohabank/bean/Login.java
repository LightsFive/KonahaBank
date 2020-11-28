/**
 * 
 */
package com.lightsfive.konohabank.bean;

/**
 * @author Lella
 *
 */
public class Login {
 
	public String userName;
	public String password;
	public String role;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
	
}
