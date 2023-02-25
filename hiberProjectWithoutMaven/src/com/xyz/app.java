package com.xyz;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class app 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.config.xml");
        SessionFactory factory =  cfg.buildSessionFactory();
        System.out.println(factory);
        System.out.println("Closed or not?");
        System.out.println(factory.isClosed());
    }
}