package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program has been started!");
        ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao =(StudentDao) con.getBean("studentDaoImp");
        
//1        Student s = new Student();
//        s.setId(10);
//        s.setName("abc5");
//        s.setCity("City_10");
        
        //you can add two/three... rows at the same time by this in the database
//        Student s1 = new Student();
//        s1.setId(7);
//        s1.setName("xyz3");
//        s1.setCity("City_7");
        
//        int result = studentDao.insert(student);
//        System.out.println("Student added" + result);
        
//        int result1 = studentDao.insert(student1);
//        System.out.println("Student added" + result1);
        
//2        System.out.println(studentDao.delete(3));
    }
}