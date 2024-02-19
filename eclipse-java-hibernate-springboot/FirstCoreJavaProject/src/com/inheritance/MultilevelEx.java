package com.inheritance;

class Loan{
	public void det() {
		System.out.println("Loan");
		System.out.println("---------------------");
		System.out.println("Home loan");
		System.out.println("Educational loan");
		System.out.println("Personal Loan");
		System.out.println();
	}
}
class EducationalLoan extends Loan{
	public void details() {
		System.out.println("Educational Loan");
		System.out.println("undergraduate loan and graduate loan");
		System.out.println("Interest: 12%");
		System.out.println();
	}
}
class Student extends EducationalLoan{
	 public void details1() {
		 System.out.println("student name: krishna");
		 System.out.println("Parents occupation: Loomer");
		 System.out.println("Loan amount:100000");
	 }
}
public class MultilevelEx {
	public static void main(String[] args) {
		Student ob= new Student();
		ob.det();
		ob.details();
		ob.details1();
		
//		EducationalLoan ob1=new EducationalLoan();
//		ob1.det();
//		ob1.details();
//		
//		Loan ob3=new Loan();
//		ob3.det();

	}

}