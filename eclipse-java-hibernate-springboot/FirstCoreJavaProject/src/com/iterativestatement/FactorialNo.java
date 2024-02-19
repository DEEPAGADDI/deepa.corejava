package com.iterativestatement;

public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1; i<=5; i++) {
			fact=i*fact;
			System.out.println(fact);//it prints 1 2 6 24 120
		}
			System.out.println(fact);//it prints only 120
		
	}

}