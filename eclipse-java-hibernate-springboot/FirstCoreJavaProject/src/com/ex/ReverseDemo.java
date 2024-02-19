package com.ex;

import java.util.Scanner;

public class ReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a,b="";
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String ");
      a=sc.nextLine();
      int n=a.length();
      for(int i=0;i<a.length();i++) {
    	  b=a.charAt(i)+b;
      }
      System.out.println("Reverse String is "+b);
	}

}
