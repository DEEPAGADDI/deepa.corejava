package com.edu.HibernateDemo2;



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
      Session se=sc.openSession();
      Transaction t=se.beginTransaction();
     
      Student s=new Student();
//      s.setId(102);//to create
//      s.setName("nadhiya");
//      s.setSchool_Name("Aurobindo school");
//      s.setFee(20000);
//      
//      se.save(s);
//      t.commit();
//      se.close();
//      //to delete
//      
////      s.setId(102);
////      se.delete(s);
////      t.commit();
//      
      s.setId(102);
      s.setName("Deepa");
      s.setSchool_Name("SBM");
      s.setFee(10000);
      
      se.update(s);
      t.commit();
      System.out.println("Record successfully updated");
      
    }
}
