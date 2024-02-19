package com.constructor;


class A{
	A(){
		System.out.println("No argument constructor");
	}
	A(int a,int b){
		System.out.println("Parameterized constructor");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		
		A ob = new A(); //constructor will call automatically when objects are created
		A ob1 = new A(28,12);
	}

}