package com.constructor;

class Test{
	int score;
	int updatedScore=80;
	
	public Test() {
		
	System.out.println("No argument constructor");
	System.out.println("MY current score: "+this.score);
	}
	Test(int a, int b){
		this();
		System.out.println("Parameterized constructor");
		System.out.println("My updated score: "+this.updatedScore);
	}
}

public class SuperThisDemo {

	public static void main(String[] args) {
		Test ob=new Test(10,20);

	}

}
