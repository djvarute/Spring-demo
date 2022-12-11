package com.object.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDataWithSpring {

	public static void main(String[] args) {
		ApplicationContext container1 = new ClassPathXmlApplicationContext("spring-beans.xml");

		StudentInfo studentObj = (StudentInfo) container1.getBean(StudentInfo.class);

		System.out.println("Student Id = " + studentObj.getStudentId());
		System.out.println("Student Name = " + studentObj.getStudentName());
		System.out.println("Student city = " + studentObj.getStudentAddress().getCity());
		System.out.println("Student locality = " + studentObj.getStudentAddress().getLocality());
		System.out.println("Student pin code = " + studentObj.getStudentAddress().getPinCode());

		((ClassPathXmlApplicationContext) container1).close();
	}

}
