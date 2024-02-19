package com.edu;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter first numbers");
				int a=sc.nextInt();
				System.out.println("Enter second number");
				int b=sc.nextInt();
				int sum=a+b;
				int sub=a-b;
				int mul=a*b;
				int div=a/b;
				System.out.println("Sum of two numbers = "+sum);
				System.out.println("sub of  = "+sub);
				System.out.println("mul = "+mul);
				System.out.println(("div = "+div));
				
			}

		}