package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CasecadeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory =  cfg.buildSessionFactory();
        Session s = factory.openSession();
        
        Question2 q1=new Question2();
        q1.setQuestionId(856);
        q1.setQuestion("What is Framework");
        
        Answer2 a1 = new Answer2(23423,"partially build application");
        Answer2 a2 = new Answer2(34,"Desktop");
        Answer2 a3 = new Answer2(789,"Learn by programmers");
        
        List<Answer2> list = new ArrayList<Answer2>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        
        q1.setAnswer(list);
        Transaction tx = s.beginTransaction();
        
        s.save(q1);
        
        tx.commit();
        s.close();
        factory.close();
	}

}
