package operators;

import java.util.Scanner;

public class AreaOfRectangular {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		double l=sc.nextDouble();
		System.out.println("Enter bredth");
	    double b=sc.nextDouble();
	    double res=l*b;
	    System.out.println("Area = "+res);
	}
}