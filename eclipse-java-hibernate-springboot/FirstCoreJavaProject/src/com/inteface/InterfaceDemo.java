package com.inteface;
interface left{
	default void m1() {
		System.out.println("Left inteface implementation");
	}
}
interface right{
	void m1();
	
}
class Child implements left,right{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		left.super.m1();
		System.out.println("My own implementation");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Child ob=new Child();
   ob.m1();
	}

}
