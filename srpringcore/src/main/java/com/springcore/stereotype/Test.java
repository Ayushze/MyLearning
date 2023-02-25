package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student s = (Student) context.getBean("student");
		System.out.println(s);
		System.out.println(s.getAddress());
		System.out.println(s.getAddress().getClass().getName());
		System.out.println(s.hashCode());
		
		Student s1 = (Student) context.getBean("student");
		System.out.println(s1.hashCode());
	
		System.out.println("------------------------------------------------------------------------------");
		
		//we use prototype, so that, out IOC will create different obnjects of our single bean
		//like we have just one teacher bean with different hashcodes
		//use of prototype with xml
		Teacher t = (Teacher)context.getBean("teacher");
		System.out.println(t.hashCode());
		
		Teacher t1 = (Teacher)context.getBean("teacher");
		System.out.println(t1.hashCode());
	}

}
