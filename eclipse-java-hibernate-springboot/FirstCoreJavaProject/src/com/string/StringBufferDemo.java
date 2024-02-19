package com.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		//append()
		StringBuffer sb=new StringBuffer("JAVA ");
		sb.append("FULLSTACK");
		System.out.println(sb);
	
		
		//equals for string
		String sb4=new String("ramya");
		String sb5=new String("ramya");
		boolean st6 = sb4==sb5; //compare object reference
		System.out.println(st6);
		
		boolean rs=sb4.equals(sb5);
		System.out.println(rs); //compare string
		
		//insert
		StringBuffer sb7=new StringBuffer("Ramya");
		System.out.println(sb7.insert(5,"S"));
	
		
		//delete
		StringBuffer sb8=new StringBuffer("ramyashree");
		System.out.println(sb8.delete(2, 6));
		
		//replace
		StringBuffer sb9=new StringBuffer("hello");
		System.out.println(sb9.replace(0, 2, "hi"));
		
		//reverse
		StringBuffer sb10=new StringBuffer("ramya");
		System.out.println(sb10.reverse());
		//capacity
		System.out.println(sb10.capacity());
	}

}