package basicprogramsdemo;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rv = new Scanner(System.in);
		System.out.println("enter a number");
		int num=rv.nextInt();
		if(num >= 0) {
			System.out.println("Positive No");
		}
		else if( num < 0) {
			System.out.println("Negative no");
		}
		else
			System.out.println("invalid ");
	}

}