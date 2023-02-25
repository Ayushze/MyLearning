package com.abc;

import java.util.LinkedList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started" );
        
        SessionFactory factory = new Configuration().configure("hiber.cfg.xml").buildSessionFactory();
        
        class1 q1 = new class1();
        q1.setQuestionid(1);
        q1.setQuestion("Properties of Hibernate: ");
        
        class2 a1 = new class2();
        a1.setAnswerid(101);
        a1.setAnswer("Variable size");
        a1.setQuestion(q1);
        
        class2 a2 = new class2();
        a2.setAnswerid(102);
        a2.setAnswer("Insert in o(1)");
        a1.setQuestion(q1);
        
        class2 a3 = new class2();
        a3.setAnswerid(103);
        a3.setAnswer("Non-contiguous memory");
        a1.setQuestion(q1);
        
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        LinkedList<class2> list = new LinkedList<class2>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        
        q1.setAnswer(list);
        
        s.save(q1);
        
        tx.commit();
        s.close();
        factory.close();
    }
}
