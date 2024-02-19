package com.edu;
//implicit casting = converting lower datatype into higher datatype
//explicit casting = converting higher datatype into lower datatype
public class TypeCastingDemo {

	public static void main(String[] args) {
		int a = 100;
		long b = a;
		System.out.println("Implicit type casting "+b);
		
		byte c=12;
		int d=c;
		System.out.println("Implicit type casting "+d);
		
		short e=50;
		int f=e;
		System.out.println(f);
		
		long g=2345;
		float h=g;
		System.out.println(h);
		
		float x=3456.87f;
		double r=x;
		System.out.println(r);
		
		long t=1000l;
		int u=(int)t;
		System.out.println("Explicit type casting "+u);
		
		double v=256.768;
		float w=(float) v;
		System.out.println(w);
		
		int m=40;
		short n=(short) m;
		System.out.println(n);
		
		int j=1;
		char k=(char) j;
		System.out.println(k);

		
	}
}