package com.iterativestatement;

import java.util.Scanner;

public class PrimeNoForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) 
				count++;
		}
			if(count==2) {
				System.out.println("The given number is prime no");
			}
			else {
				System.out.println("The given number is not a prime no");
			}
		
		
}

}