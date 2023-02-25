package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student stu1 = (Student) context.getBean("student1");
        Student stu2 = (Student) context.getBean("student2");
        
        System.out.println(stu1);
        System.out.println(stu2);
    }
}
