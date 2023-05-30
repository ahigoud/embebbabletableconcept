package com.pentagon.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Student s1=new Student();
        s1.setId(3);
        s1.setName("Ahi");
        s1.setCity("karimnagar");
        
        Certificate c1=new Certificate();
        c1.setCourse("springboot");
        c1.setDuration("3 months");
        
        s1.setCerti(c1);
        
        Session s=factory.openSession();
        s.beginTransaction();
        s.save(s1);
        s.getTransaction().commit();
        s.clear();
        factory.close();
    }
}
