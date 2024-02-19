package com.polymorphism;
class A10{
	A10(){
		System.out.println("no-arg constructor");
	}
	A10(int a){
		this();
		System.out.println("one-arg constructor");
		
	}
	A10(int a,int b){
		this(a);
		System.out.println("Two-arg constructor");
	}
	A10(int a,int b,int c){
		this(a,b);
		System.out.println("Three-arg constructor");
	}
}
public class RealTimeExThis {

	public static void main(String[] args) {
		A10 ob = new A10(10,40,50);
		

	}

}