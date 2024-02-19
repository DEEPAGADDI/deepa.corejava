package com.datatypepromotion;
class AAA{
	public void display(float b) {
		System.out.println("Float Type");
	}
	public void display(int a) {
		System.out.println("Integer Type");
	}
	public void display(float... a) {
		System.out.println("... we can give any values Float");
	}
	public void display(int... a) {
		System.out.println("... we can give any values Integer");
	}
}
public class Case4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA ob=new AAA();
		ob.display(2.3f);
		ob.display(0);
		ob.display(0.9f,99.8f);
		ob.display(1,2,6);

	}

}
