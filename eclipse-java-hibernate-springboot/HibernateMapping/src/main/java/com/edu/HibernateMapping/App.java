package com.edu.HibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
      Session s=sf.openSession();
      Transaction t=s.beginTransaction();
      
      Laptop l=new Laptop(100,"Lenova");
     
      
      StudentLaptop st=new StudentLaptop(101,"Ram",20000);
    
      l.setLap(st);
      s.save(l);
      s.save(st);
      t.commit();
      s.close();
      
      
    }
}
