package com.exception;

public class ExceptionHandlimgDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println(100/2);
			System.out.println(10/0);
			
		}
		catch(Exception e) {
			System.out.println(e);//just display exception
//			e.printStackTrace();//used to track the error it will take us to that error line
		}
		System.out.println("4");
		System.out.println("Exception can be handled");

	}

}
