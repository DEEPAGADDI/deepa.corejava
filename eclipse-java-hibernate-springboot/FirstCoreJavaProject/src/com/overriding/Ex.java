package com.overriding;

import java.util.Scanner;

public class Ex {
 public static void main(String[] args) {
	 String a, b = "";
     Scanner s = new Scanner(System.in);
     System.out.print("Enter a string:");
     a = s.nextLine();
     int n = a.length();
     for(int i = n - 1; i >= 0; i--)
     {
         b = b + a.charAt(i);
     }
     if(a.equalsIgnoreCase(b))
     {
         System.out.println(a+ " is a palindrome.");
     }
     else
     {
         System.out.println(a+ " is not a palindrome.");
     }
	
	String c,d = "";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String ");
     c=sc.nextLine();
	int n1=c.length();
	for(int i=n1-1;i>=0;i--) {
		d=d+c.charAt(i);
	}
	if(c.equalsIgnoreCase(d))
	{
		System.out.println(c+" is a palindrome");
	}else {
		System.out.println(c+"is npt a palindrome");
	}
}
}
