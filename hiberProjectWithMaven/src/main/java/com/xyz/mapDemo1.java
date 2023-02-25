package com.xyz;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory =  cfg.buildSessionFactory();
        
        //creating question
        Question1 q1 = new Question1();
        q1.setQuestionId(1);
        q1.setQuestion("What is JAVA");
        
        Answer1 answer = new Answer1();
        answer.setAnswerId(111);
        answer.setAnswer("JAVA is programming language");
        answer.setQuestion(q1);
        
        Answer1 answer1 = new Answer1();
        answer1.setAnswerId(121);
        answer1.setAnswer("With the help of JAVA, we acan create software");
        answer1.setQuestion(q1);
        
        Answer1 answer2 = new Answer1();
        answer2.setAnswerId(122);
        answer2.setAnswer("Java has different types of framework");
        answer2.setQuestion(q1);
        
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        List<Answer1> list =new ArrayList<Answer1>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);
        
        q1.setAnswer(list);
        
        //save
        s.save(q1);
        s.save(answer);
        s.save(answer1);
        s.save(answer2);
        
        //fatch the data in eclipse console
//        Question1 q = s.get(Question1.class, 1);
//        System.out.println(q.getQuestion());
//        for(Answer1 a :q.getAnswer()) {
//        	System.out.println(a.getAnswer());
//        }
        
        tx.commit();
        s.close();
        factory.close();
	}

}
