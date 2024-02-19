package com.accessmodifiers;

import java.util.Scanner;

public class RealTimeExforMethods {
		void add(int a,int b) {
			int c;
			c=a+b;
			System.out.println("sum= "+c);
		}
		void sub(int a,int b) {
			int c;
			c=a-b;
			System.out.println("sub= "+c);
		}
		void mul(int a,int b) {
			int c;
			c=a*b;
			System.out.println("Mul= "+c);
		}
		void div(int a,int b) {
			int c;
			c=a/b;
			System.out.println("Div= "+c);
		}
	public static void main(String[] args) {
		RealTimeExforMethods ob=new RealTimeExforMethods();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1 for addition");
		System.out.println("2 for subtraction");
		System.out.println("3 for multiplication");
		System.out.println("4 for division");
		System.out.println("-----------------------");
		while(true) {
		System.out.println("Enter your choice between 1 to 4: ");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			
			System.out.println("Enter 2 numbers");
			int no1=sc.nextInt();
			int no2=sc.nextInt();
			ob.add(no1, no2);
			break;
		case 2:
			System.out.println("Enter 2 numbers");
			int no3=sc.nextInt();
			int no4=sc.nextInt();
			ob.sub(no3, no4);
			break;
		case 3:
			System.out.println("Enter 2 numbers");
			int no5=sc.nextInt();
			int no6=sc.nextInt();
			ob.mul(no5, no6);
			break;
		case 4:
			ob.div(60,20);
			break;
			default:
				System.out.println("invalid  number");
		}

	}
	}
}