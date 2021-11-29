package com.greatlearning.model;

//SuperDepartment Class is the Base/Super class with public methods
public class SuperDepartment {
	public void departmentName() {
		System.out.println("Super Department");
	}
	
	public void getTodaysWork() {
		System.out.println("No work as of now");
	}
	
	public void getWorkDeadline() {
		System.out.println("Nil");
	}
	
	public void isTodayAHoliday() {
		System.out.println("Today is not a Holiday");
	}
}