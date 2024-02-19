package variables;

public class InstanceVariable {
	 int a;
     float b;
     char ch;
     long lg;
     double dl;
     String s;
     
     String name="Ramya";
     String dep="BCA";
     int agee=20;
     float per=89.90f;
     long no=8892146152l;
     String ma="ramya28@gmail.com";
     String add="bangalore";
	public static void main(String[] args) {
		  InstanceVariable ob=new InstanceVariable();
	         System.out.println(ob.a);
	         System.out.println(ob.b);
	         System.out.println(ob.ch);
	         System.out.println(ob.lg);
	         System.out.println(ob.dl);
	         System.out.println(ob.s);
	         System.out.println();
	         System.out.println("Name is = "+ob.name);
	         System.out.println("Department is = "+ob.dep);
	         System.out.println("Age is = "+ob.agee);
	         System.out.println("Percentage is = "+ob.per);
	         System.out.println("Phone number = "+ob.no);
	         System.out.println("Mail = "+ob.ma);
	         System.out.println("Address = "+ob.add);


	}

}