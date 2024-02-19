package com.overriding;
class Company{
	public void jobrole(){
		System.out.println("Post:Manager");
	}
	public void salary() {
		System.out.println("Salary:30000$");
	}
}
class Employee extends Company{
	public void salary() {
		System.out.println("Salary:50000$");
	}
}
public class RealTimeOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee ob=new Employee();
ob.jobrole();
ob.salary();
	}

}
