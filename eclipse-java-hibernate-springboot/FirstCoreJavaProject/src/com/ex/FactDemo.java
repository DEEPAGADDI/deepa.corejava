package com.ex;

import java.util.Scanner;

public class FactDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
int i1=sc.nextInt();
for(i=1;i<=i1;i++) {
	fact=fact*i;
}
	}

}
