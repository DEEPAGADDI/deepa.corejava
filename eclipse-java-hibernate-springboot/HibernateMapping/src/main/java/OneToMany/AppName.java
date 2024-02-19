package OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   SessionFactory sf=new Configuration().configure().buildSessionFactory();
   Session s=sf.openSession();
   Transaction t=s.beginTransaction();
   
   
   StudentLaptop1 st=new StudentLaptop1();
   st.setSid(2);
   st.setSname("deepa");
   st.setFees(2000);
   
   Laptop1 l=new Laptop1();
   l.setLid(102);
   l.setLname("lenovo");
   l.getLap().add(st);
   s.save(l);
   
  
   //l.getLap();
  
   s.save(st);
   t.commit();
   s.close();
	}

}
