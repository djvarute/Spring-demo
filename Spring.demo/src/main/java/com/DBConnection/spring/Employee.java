package com.DBConnection.spring;

public class Employee {
	int employeeId;
	String emoloyeeName;
	String department;
	long salary;
	String gender;
	int age;
	String city;
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmoloyeeName() {
		return emoloyeeName;
	}
	public void setEmoloyeeName(String emoloyeeName) {
		this.emoloyeeName = emoloyeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
