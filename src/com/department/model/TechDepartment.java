package com.department.model;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		return " Tech Department ";
	}
	
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "Core Java";
	}
}
