package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory =  cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Student student = session.get(Student.class,102);
        System.out.println(student);
        
//        Student student = session.load(Student.class,102);
//        System.out.println(student);
        
        Address address = session.get(Address.class, 1);
        System.out.println(address);
        
        factory.close();
	}

}
