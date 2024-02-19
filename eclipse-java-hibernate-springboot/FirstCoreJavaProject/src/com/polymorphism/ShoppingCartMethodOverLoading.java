package com.polymorphism;

import java.util.Scanner;

class Amazon{
	public void Shopping(String name) {
		System.out.println("Product Name is "+name);
		System.out.println("---------------------");
	}
	public void Shopping(String name,int qty) {
		System.out.println("Producr Name is "+name);
		System.out.println("Product Qty is "+qty);
		System.out.println("---------------------");
	}
	public void Shopping(String name,int qty,int size) {
		System.out.println("Producr Name is "+name);
		System.out.println("Product Qty is "+qty);
		System.out.println("Size is "+size);
		System.out.println("----------------------");
	}
	public void Shopping(String name,int qty,int size,String color) {
		System.out.println("Producr Name is "+name);
		System.out.println("Product Qty is "+qty);
		System.out.println("Size is "+size);
		System.out.println("Product color is "+color);
		System.out.println("------------------------");
	}
	
}

public class ShoppingCartMethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a product");
		String name=sc.next();
Amazon ob=new Amazon();
ob.Shopping(""+name);
ob.Shopping(""+name, 2);
ob.Shopping(""+name, 2, 6);
ob.Shopping(""+name, 2, 6, "Black");

	}

}
