package com.constructor;


class test2{
	public void display() {
		System.out.println("First method");
	}
	public void display1() {
		this.display();
		System.out.println("Second method");
	}
}
public class ThisforMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 ob=new test2();
		ob.display1();

	}

}