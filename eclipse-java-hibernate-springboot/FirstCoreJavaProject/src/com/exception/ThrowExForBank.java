package com.exception;

import java.util.Scanner;

class Bank extends Exception{
	Bank(String msg){
		super(msg);
	}
}
public class ThrowExForBank {

	public static void main(String[] args) {
		int available=5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the withdrawable amount");
		int amt =  sc.nextInt();
		
		try {
		if(amt>available) {
			throw new Bank("Sorry.... available balance is 50000");
		}
		else
			System.out.println("withdraw succecssfully");
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	}

}