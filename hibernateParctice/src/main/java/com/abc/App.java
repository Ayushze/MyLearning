package com.abc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting the project...." );
        
        SessionFactory factory = new Configuration().configure("config.xml").buildSessionFactory();
        
        PersonOne p1 = new PersonOne();
        p1.setId(1);
        p1.setName("XYZ");
        p1.setAge(28);
        
        Address a1 = new Address();
        a1.setStreetNum(19);
        a1.setAdd1("jkanfnwe/ldfnkeln/lkwefnklw");
        a1.setAdd2("lskdnfk/lkdsnfs/skjlrgn");
        
        p1.setAddress(a1);
        
        Session s = factory.openSession();
        
        Transaction tx = s.beginTransaction();
        
        s.save(p1);
        s.save(a1);
        
        tx.commit();
        s.close();
        factory.close();
    }
}
