package com.datatypepromotion;
//Case 2
class A8{
	public void display(Object o) {
		System.out.println("Root class");
	}
	public void display(String s) {
		System.out.println("Child class");
	}
}
public class StringDemo {
	public static void main(String[] args) {
	A8 ob=new A8();
	ob.display(new Object());//object class
	ob.display("Deepa");//String
	ob.display(null);//String
}
}
