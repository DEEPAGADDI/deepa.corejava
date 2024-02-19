//Ability to take more then one form  is polymorphism
//two or more method having same name but differ in number of parameter is method overloading
//
package com.polymorphism;
class Test{
	public void display() {
		System.out.println("no-arg");
	}
	public void display(int a) {
		System.out.println("1-arg");
	}
	public void display(int a,int b) {
		System.out.println("2-arg");
	}
	public void display(int a,int b,int c) {
		System.out.println("3-arg");
	}
	
	//2nd type
	public void display(int a,float b) {
		System.out.println("Interchanging");
	}
	public int display(float b,int a) {
		System.out.println("Interchanging int to float");
		return 0;
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test ob=new Test();
ob.display();
ob.display(0);
ob.display(0, 0);
ob.display(0, 0, 0);
ob.display(2.3f, 0);
ob.display(0, 3.4f);

	}

}
