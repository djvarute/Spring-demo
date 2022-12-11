package com.constructor.injection;

public class EmployeeInfo {
	int employeeId;
	String employeeName;
	String employeeMobileNumber;
	EmployeeAddress employeeAddress;
	
	public EmployeeInfo(int employeeId, String employeeName, String employeeMobileNumber,
			EmployeeAddress employeeAddress) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMobileNumber = employeeMobileNumber;
		this.employeeAddress = employeeAddress;
	}
	public EmployeeAddress getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(EmployeeAddress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	public void setEmployeeMobileNumber(String employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}
	

}
