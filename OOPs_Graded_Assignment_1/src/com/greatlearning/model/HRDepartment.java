package com.greatlearning.model;

//HRDepartment Class inherits the methods of SuperDepartment Class
public class HRDepartment extends SuperDepartment {
	public void departmentName() {
		System.out.println("\nWelcome to HR Department");
	}

	public void getTodaysWork() {
		System.out.println("Fill today's timesheet and mark your attendance");
	}
	
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
	
	public void doActivity() {
		System.out.println("Team Lunch");
	}
}
