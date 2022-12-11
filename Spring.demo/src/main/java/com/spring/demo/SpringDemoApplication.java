package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.demo.Person;

public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext containerObj = new ClassPathXmlApplicationContext("spring-beans.xml");
		//ApplicationContext containerObj = new FileSystemXmlApplicationContext("C://Users//Asus//Desktop//Dj//spring-beans.xml");
		Person personObj =containerObj.getBean("Person1",Person.class);
		
		//System.out.println(personObj.getPersonId());
		//System.out.println(personObj.getPersonName());
		//System.out.println(personObj.getMobileNumber());
		containerObj.getBean("Person1",Person.class);
		System.out.println(containerObj);
		
		((ClassPathXmlApplicationContext)containerObj).close();
		//((FileSystemXmlApplicationContext)containerObj).close();
	}

}
