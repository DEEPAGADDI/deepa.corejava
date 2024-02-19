package com.exceptionhandling;

import java.util.Scanner;

class MyClass extends Exception{
	MyClass(String message){
		super(message);
	}
}
public class ThrowEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		try {
			if(age<18) {
				System.out.println("Please enter the valid age");
				throw new MyClass("ur not eligible to vote");
				
			}
			else {
				System.out.println("ur eligible to vote");
			}
		}catch(Exception e) {
			System.out.println(e);
//  		e.printStackTrace(); // it tracks
		}
		
	}

}