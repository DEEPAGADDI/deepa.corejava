package com.datatypepromotion;
//case 1

class A{
	public void show(int a) {
		System.out.println("Interger type");
	}
	public void show(float f) {
		System.out.println("Float Type");
	}
}
public class DataTypeDemo {
public static void main(String[] args) {
	A ob=new A();
	//ob.show('c');//here the input is type char so after char data type is integer,the output will be integer
	ob.show(10l);//here the input is type long so after long data type is float,the output will be float
}
}
