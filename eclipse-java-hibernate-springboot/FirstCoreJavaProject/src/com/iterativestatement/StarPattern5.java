package com.iterativestatement;

import java.util.Scanner;

public class StarPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=4;i++){
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int a=1;a<=4;a++) {
//			for(int b=3;b>=a;b--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
		//using scanner for StarPattern2
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns");
		int col=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=col;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}