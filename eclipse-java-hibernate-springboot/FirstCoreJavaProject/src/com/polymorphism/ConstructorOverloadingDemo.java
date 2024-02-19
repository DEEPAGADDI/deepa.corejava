package com.polymorphism;
class Test2{
	Test2(){
		System.out.println("No-arg constructor");
	}
	Test2(String name){
		System.out.println("one arg constructor");
	}
	Test2(String a,int b){
		System.out.println("two arg constructor");
	}
	Test2(String a,int b,float c){
		System.out.println("Three arg constructor");
	}
}
public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 ob=new Test2();
Test2 ob2=new Test2("Deepa");
Test2 ob3=new Test2("Deepa",20);
Test2 ob4=new Test2("Deepa",20,0.4f);
	}

}
