package ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppName1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   SessionFactory sf=new Configuration().configure().buildSessionFactory();
   Session s=sf.openSession();
   Transaction t=s.beginTransaction();
   
  
   
   Laptop2 ob1=new Laptop2();
   ob1.setLid(2);
   ob1.setLname("Dell");
  
   
   StudentLaptop2 ob=new StudentLaptop2();
   ob.setSid(102);
   ob.setSname("Sita");
   ob.setFee(10000);
   ob.getLap2().add(ob1);
   ob1.getLap().add(ob);
   
   s.save(ob1);
   t.commit();
   s.close();
	}

}
