package com.ex;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num,i=2;
     boolean Count=false;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter any number ");
     num=s.nextInt();
     while(i<=num/2)
     {
    	 if(num%1==0) {
    		 Count=true;
    		 break;
    	 }
    	 ++i;
     }
     if(!Count)
    	 System.out.println(num +" Is a prime");
     else
    	 System.out.println(num + " Is not prime");
}
}