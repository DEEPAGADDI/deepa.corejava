package com.ex;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String a,b= "";
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a String ");
     a=sc.nextLine();
     int n=a.length();
     for(int i=n-1;i>=0;i--) {
    	 b=b+a.charAt(i);
    	 
    	 
     }
     if(b.equalsIgnoreCase(a))
    	 System.out.println(a+"is palindrome");
     else
    	 System.out.println(a+"is not palindrome");
	}
	

}
