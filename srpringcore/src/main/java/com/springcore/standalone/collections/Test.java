package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/collectionconfig.xml");
		Person p1 = (Person)context.getBean("per");
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println(p1.getFriends());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println(p1.getFeestucture());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println(p1.getFood());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println(p1.getProperties());
	}
}