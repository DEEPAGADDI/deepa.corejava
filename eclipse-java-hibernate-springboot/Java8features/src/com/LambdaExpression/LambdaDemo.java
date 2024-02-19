package com.LambdaExpression;

//Lambda expression will work with only one abstract method and multiple static and default method
//Lambda expression does not not no name,no return type,no modifier 
//Symbol of lambda expression ()->
interface myInterface{
	void display();
	default void show() {
		System.out.println("Default method");
	}
	default void test() {
		System.out.println("Default method 2");
	}
	static void test1() {
		System.out.println("Static method");
	}
}
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    myInterface ob=()->{System.out.println("Abstract method - Hello world");};
    ob.display();
    ob.show();
    ob.test();
    myInterface.test1();//to call static method classname.methodname
    
	}

}
