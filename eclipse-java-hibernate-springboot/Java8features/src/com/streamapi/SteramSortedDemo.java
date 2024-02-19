package com.streamapi;

import java.util.ArrayList;
import java.util.List;

public class SteramSortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(50);
		marks.add(80);
		marks.add(12);
		marks.add(30);
		marks.add(20);
	    List<Integer> Sort =marks.stream().sorted().toList();
	     System.out.println("Sort in ascending order "+Sort);
	   List<Integer> Sort1=marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).toList(); 
	   System.out.println("Sort in Descending Order "+Sort1);
	   //other way to display in descending order
	 List<Integer> Sort2=marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).toList(); 
	System.out.println("Other way "+Sort2);
	 //List<Integer> Sort3=marks.stream().sorted((i1,i2)->i2.compareTo(i1)).toList(); 
	
	
	}

}
