package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        //SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        SessionFactory factory =  cfg.buildSessionFactory();
        
        //creating student
        Student st = new Student();
        st.setName("SNAPE");
        st.setCity("UK");
        System.out.println(st);
        
        Address ad = new Address();
        ad.setStreet("street4");
        ad.setCity("UK");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(675.47);
        
        //Reading image
//      FileInputStream fis = new FileInputStream("src/main/java/krishna.jpg");
//		byte[] data = new byte[fis.available()];
//		fis.read(data);
//		ad.setImage(data);
        
        Session session=factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        System.out.println("DONE!");
    }
}
