package operators;

import java.util.Scanner;

public class ShoppingCart {
	
	
	public static void main(String[] args) {
		System.out.println("Pen");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a price");
		int price=sc.nextInt();
		System.out.println("Enter the quantity");
		int qty=sc.nextInt();
		int res=qty*price;
		System.out.println("Total amount= "+res);
		double dis=0.10 * res;
		System.out.println("discount = "+dis);
		double fr=res-dis;
		System.out.println("After discount = "+fr);
		double tax=fr*0.07;
		System.out.println("Gst = "+tax);
		double taxx=fr+tax;
		System.out.println("Balance= "+taxx);

	}

}