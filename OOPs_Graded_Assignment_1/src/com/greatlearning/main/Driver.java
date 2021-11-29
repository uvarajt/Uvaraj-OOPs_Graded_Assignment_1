package com.greatlearning.main;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HRDepartment;
import com.greatlearning.model.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		//Object to AdminDepartment class created
		AdminDepartment adminDept = new AdminDepartment();
		//Methods are invoked using adminDept Object
		adminDept.departmentName();
		adminDept.getTodaysWork();
		adminDept.getWorkDeadline();
		adminDept.isTodayAHoliday();
		
		//Object to HRDepartment class created
		HRDepartment hrDept = new HRDepartment();
		//Methods are invoked using hrDept Object
		hrDept.departmentName();
		hrDept.doActivity();
		hrDept.getTodaysWork();
		hrDept.getWorkDeadline();
		hrDept.isTodayAHoliday();
		
		//Object to TechDepartment class created
		TechDepartment techDept = new TechDepartment();
		//Methods are invoked using techDept Object
		techDept.departmentName();
		techDept.getTodaysWork();
		techDept.getWorkDeadline();
		techDept.getTechStackInformation();
		techDept.isTodayAHoliday();
	}
}
