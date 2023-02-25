package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp e = (Emp)context.getBean("emp1");
		System.out.println(e.getName());
		System.out.println(e.getPhones());
		System.out.println(e.getAddresses());
		System.out.println(e.getCourses());
		System.out.println(e.getNames());
		System.out.println(e.getPhones().getClass().getName()); //by default it will use arraylist
	}
}
