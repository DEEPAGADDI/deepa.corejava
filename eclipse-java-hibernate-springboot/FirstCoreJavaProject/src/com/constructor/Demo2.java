package com.constructor;

class B{
	int roll=123;
	String name="shree";
	 B(){
		 System.out.println("Student details");
	 }
	public B(int roll,String name){
		 this.roll=roll;
		 this.name=name;
		 System.out.println("Name "+name);
		
	 }
}

public class Demo2 {

	public static void main(String[] args) {
		B ob=new B();
		B ob1=new B(101,"ramya");
		 System.out.println("Roll no "+ob1.roll);
	}

}
