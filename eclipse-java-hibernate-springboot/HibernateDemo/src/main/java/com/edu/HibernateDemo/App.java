package com.edu.HibernateDemo;



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
        SessionFactory sc=new Configuration().configure().buildSessionFactory();
        Session s=sc.openSession();
        Transaction t=s.beginTransaction();
        
        Employee1 ob=new Employee1();
     //  ob.setEid();  
        ob.setName("Ramya");
        ob.setEmail("ramya@gmail.com");
        ob.setSalary(35000);
        
           
        s.save(ob);
        t.commit();
        s.close();
        System.out.println("Record has been inserted");
    }
}
