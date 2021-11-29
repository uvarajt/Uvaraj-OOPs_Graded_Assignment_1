package com.greatlearning.model;

//TechDepartment Class inherits the methods of SuperDepartment Class
public class TechDepartment extends SuperDepartment{
	public void departmentName() {
		System.out.println("\nWelcome to Tech Department");
	}

	public void getTodaysWork() {
		System.out.println("Complete coding of module1");
	}
	
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
	
	public void getTechStackInformation() {
		System.out.println("Core Java");
	}
}