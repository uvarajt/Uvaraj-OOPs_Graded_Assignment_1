package com.greatlearning.model;

//AdminDepartment Class inherits the methods of SuperDepartment Class
public class AdminDepartment extends SuperDepartment {
	public void departmentName() {
		System.out.println("\nWelcome to Admin Department");
	}

	public void getTodaysWork() {
		System.out.println("Complete your documents submission");
	}
	
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
}
