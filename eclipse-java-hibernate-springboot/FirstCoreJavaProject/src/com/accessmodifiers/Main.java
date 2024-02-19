package com.accessmodifiers;

import com.accessmodifer1.Main1;

class B{
	 private int marks3=92;//without private we access marks3 in main method using object because it is instance variable
}							//ex B ob3=new B(); then syso(ob3.marks) its not possible here because its private variable
public class Main {
	private int marks1 =70;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks4=89;
		
		//accessing the variable outside the package--->so we need to import that package and we need to create object for that class
		Main1 ob=new Main1();
		System.out.println(ob.marks);
		
		//accessing instance variable
		Main ob1=new Main();
		System.out.println(ob1.marks1);
		
		System.out.println(marks4);
	}

}