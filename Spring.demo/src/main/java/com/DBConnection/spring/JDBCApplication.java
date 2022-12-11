package com.DBConnection.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JDBCApplication {
		
	public static void main(String[] args) {
				
		ApplicationContext container1 = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		DBConnection dbConnection = container1.getBean(DBConnection.class);
		
		EmployeeImpl employeeObj = new EmployeeImpl();
		
		List<Employee> employeeList = employeeObj.getEmployeeList(dbConnection);
		
		for (Employee employee : employeeList) {
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmoloyeeName()+"\t"+
							   employee.getDepartment()+"\t"+employee.getSalary()+"\t"+
							   employee.getGender()+"\t"+employee.getAge()+"\t"+employee.getCity());
		}
		
		((ClassPathXmlApplicationContext)container1).close();
	}

}
