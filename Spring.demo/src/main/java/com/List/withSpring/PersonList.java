package com.List.withSpring;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonList {
	public static void main(String[] args ) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring-beans.xml");
		PersonInfo person = (PersonInfo)container.getBean("person2");
		List<String> PersonData = person.getPersonData();
		
		for (String name : PersonData) {
		System. out .println(name);
		}
		
		((ClassPathXmlApplicationContext)container).close();
		
	}

}
