package com.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDataWithConstructorInject {

	public static void main(String[] args) {
		
		ApplicationContext containerObj = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		EmployeeInfo employee = containerObj.getBean(EmployeeInfo.class);
		
		System.out.println("Employee ID = " + employee.getEmployeeId());
		System.out.println("Employee Name = " + employee.getEmployeeName());
		System.out.println("Employee Mobile number = " + employee.getEmployeeMobileNumber());
		
		System.out.println("Area of Employee = " + employee.getEmployeeAddress().getArea());
		System.out.println("Street of Employee = " + employee.getEmployeeAddress().getStreet());
		System.out.println("Pin Code of Employee = " + employee.getEmployeeAddress().getPinCode());
		
		((ClassPathXmlApplicationContext) containerObj).close();
	}

}



