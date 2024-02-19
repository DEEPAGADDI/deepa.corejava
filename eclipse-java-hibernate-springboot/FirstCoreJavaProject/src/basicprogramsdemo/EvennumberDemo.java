package basicprogramsdemo;

import java.util.Scanner;

public class EvennumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("The given number is Even Number");
		}
		else
		{
			System.out.println("The given number is Odd Number");
		}
	}

}