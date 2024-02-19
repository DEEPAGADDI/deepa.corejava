package com.edu;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("My name is "+name);
		System.out.println();
		System.out.println("Enter ur age");
		int age= sc.nextInt();
		System.out.println("My age is "+age);
		System.out.println();
		System.out.println("Enter your score");
		float per=sc.nextFloat();
		System.out.println("Percentage is " +per);
	}

}