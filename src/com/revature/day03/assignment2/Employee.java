package com.revature.day03.assignment2;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 4L;
	private long employeeId;
	private String firstName;
	private String lastName;
	private String jobTitle;
	
	public Employee() {
		
	}
	
	public Employee(long employeeId, String firstName, String lastName, String role) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = role;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "[Employee ID: " + employeeId + "; First Name: " + firstName + "; Last Name: " + lastName
				+ "; Job Title: " + jobTitle + "]";
	}
	
	
}
