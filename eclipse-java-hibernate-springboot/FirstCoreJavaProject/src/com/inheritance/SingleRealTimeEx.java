package com.inheritance;


class Company{
	public void comp() {
		System.out.println("Company name: abb & co.");
		System.out.println("Place: Electronic City");
		System.out.println();
		}
}
class Employee extends Company{
	public void emp() {
		System.out.println("Employee details");
		System.out.println("-----------------");
		System.out.println("Employee name: sdf");
		System.out.println("Employee Reg no:1234");
		System.out.println("Gender: Male");
	}
}
public class SingleRealTimeEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee();
		ob.comp();
		ob.emp();
	}

}