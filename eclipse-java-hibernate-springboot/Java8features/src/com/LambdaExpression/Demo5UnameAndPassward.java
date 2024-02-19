package com.LambdaExpression;

import java.util.Scanner;

interface myInterface6{
	void display();
}
public class Demo5UnameAndPassward {

	public static void main(String[] args) {
		myInterface6 ob = ()->{
			String name="ramya";
			String pwd = "ram";
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the user name: ");
			String uname = sc.nextLine();
			
			System.out.println("Enter password: ");
			String pass = sc.nextLine();
			
			if(name.equals(uname) && pwd.equals(pass)) {
				System.out.println("Login successfully...");
			}
			else {
				System.out.println("Login failed...");
			}
		};
		ob.display();
	}

}