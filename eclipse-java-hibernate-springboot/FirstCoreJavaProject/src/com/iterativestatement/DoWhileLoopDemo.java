package com.iterativestatement;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			num=sc.nextInt();
			if(num!=0)
		 System.out.println("given number is positive");
		}while(num<=0);
		}
}