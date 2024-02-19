package com.edu.HibernateScanner;

import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sf=new Configuration().configure().buildSessionFactory();
       Session se=sf.openSession();
       Transaction t=se.beginTransaction();
      Session see=sf.openSession();
      Transaction tt=see.beginTransaction();
       Employee1 e=new Employee1();
//       e.setId(101);
//       e.setName("Sana");
//       e.setSalary(20000);
//       e.setDepartment("Sales");
//       
//       Scanner sc=new Scanner(System.in);
//       System.out.println("********Employee Details*********");
////       System.out.println("Enter Employee ID");
////       e.setId(sc.nextInt());
////       sc.nextLine();
//       System.out.println("Enter Employee Name");
//       e.setName(sc.nextLine());
//       System.out.println("Enter Employee Department");
//       e.setDepartment(sc.nextLine());
//       System.out.println("Enter Employee Salary");
//       e.setSalary(sc.nextFloat());
//      System.out.println("Record inserted successfully");
//       
  e=(Employee1) se.get(Employee1.class,1);//to fetch details of particular employee
 
     System.out.println("Employee id : "+e.getId());
    System.out.println("Employee name : "+e.getName());
    System.out.println("Employee Department :"+e.getDepartment());
    System.out.println("Employee Salary : "+e.getSalary());
       
   e=(Employee1) see.get(Employee1.class, 2);
   
   System.out.println("Employee id : "+e.getId());
   System.out.println("Employee name : "+e.getName());
   System.out.println("Employee Department :"+e.getDepartment());
   System.out.println("Employee Salary : "+e.getSalary());
      
      se.save(e);
       t.commit();
       se.close();
       //System.out.println("One record inserted successfully");
    }
}
