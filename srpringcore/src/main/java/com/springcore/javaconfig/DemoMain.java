package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s = (Student)con.getBean("temp");
//		Student s = (Student)con.getBean("student");
//		Student s = (Student)con.getBean("Student");
		System.out.println(s);
		s.study();
		
	}
}