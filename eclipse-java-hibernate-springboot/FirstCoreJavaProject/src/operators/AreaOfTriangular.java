package operators;

import java.util.Scanner;

public class AreaOfTriangular {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter height");
			double h=sc.nextDouble();
			System.out.println("Enter base");
			double b=sc.nextDouble();
			double res=0.5*h*b;
			System.out.println("Area = "+res);
  
	}

}