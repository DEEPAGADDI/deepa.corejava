package com.overriding;
class Parent{
	public void property(){
		System.out.println("Gold+Land+Money");
	}
	public void marriage() {
		System.out.println("LAxmi/Appalamma");
	}
}
class Tej extends Parent{
	public void marriage(int a) {
		System.out.println("Karina/Katrina");//Overriding
	}
	public void abc() {
		
	}
}
public class OveeridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tej ob=new Tej();
ob.marriage();
Parent ob1=new Parent();
ob1.marriage();
ob1.property();
Parent ob2=new Tej();
ob2.marriage();
ob2.property();
	}

}
