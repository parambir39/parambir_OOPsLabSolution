package com.greatlearning.model;


public class EmployeeServices {
	String firstname;
	String lastname;
	
	
	public String getFirstName() {
	return firstname;	
		}
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	
	public String getLastName() {
		
		return lastname;
	}
	
	public void setLastName(String lastname) {
	this.lastname=lastname;	
	}
	public EmployeeServices(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	
		
		
	}
}
	
	
	
