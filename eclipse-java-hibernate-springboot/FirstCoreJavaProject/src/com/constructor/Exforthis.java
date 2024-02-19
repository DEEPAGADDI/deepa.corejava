package com.constructor;


class Test1{
	public Test1() {
	System.out.println("College Name: Sri Aurobindo college");
	System.out.println("Place: Rajajinagar");
	System.out.println("Courses offered: BCA, B.COM, BBA");
	System.out.println();
	}
	Test1(int a, int b){
		this();
		System.out.println("Student details");
		System.out.println("------------------------------------");
		System.out.println("Name: Ananya");
		System.out.println("Phone no: 8989898989");
		System.out.println("Course: BCA");
	}
}

public class Exforthis {

	public static void main(String[] args) {
		Test1 ob=new Test1(10,20);

	}

}