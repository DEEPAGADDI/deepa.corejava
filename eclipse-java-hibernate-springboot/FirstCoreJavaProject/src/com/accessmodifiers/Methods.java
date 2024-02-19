package com.accessmodifiers;

public class Methods {
	public void display() {
	System.out.println("Hello");	
	}
	public void show() {
		System.out.println("World");
	}
	public void put(int a,int b) {
		System.out.println("Addition of two numbers: "+(a+b));
	}
	public void sub(int c,int d) {
		System.out.println("Subtraction of two no: " +(c-d));
	}
	public void mul(int c,int d) {
		System.out.println("Multiplication of two no: " +(c*d));
	}
	public void div(int c,int d) {
		System.out.println("Division of two numbers: " +(c/d));
	}
	
	public int put2() {
		System.out.println("Java");
		return 0;
	}
	public int add(int a, int b) {
		
		System.out.println("Sum= "+(a+b));
		return 0;
//		return a+b;
	
	}
	public static void main(String[] args) {
		
		//creating object for Methods class because display method is belongs to Methods class
		Methods ob=new Methods();
		ob.display();
		ob.show();
		ob.put(10,20);
		ob.sub(40,20);
		ob.mul(10, 3);
		ob.div(50, 02);
		ob.put2();
		ob.add(70, 10);
		
		
	}

}