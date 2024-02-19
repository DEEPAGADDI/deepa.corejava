package com.ex;

import java.util.Scanner;

public class BuzzNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
if((num%10==7 || num%7==0)) {
	System.out.println("The Entered number is  buzz number");
	
}else
{
	System.out.println("The Entered Number is not Buzz number");
}
	}

}
