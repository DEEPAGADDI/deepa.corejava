package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SteramStringSortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String> s=new ArrayList<String>();
   s.add("Laxmi");
   s.add("Ram");
   s.add("Sita");
   s.add("Anjan");
   s.add("Naveen");
   System.out.println("Before Filtering "+s);
  List<String> li=s.stream().sorted().toList();
   System.out.println("Ascending order "+li);
   List<String> li2=s.stream().sorted((s1,s2)->-s1.compareTo(s2)).toList();
   System.out.println("Decending order "+li2);
   //When we want to get according to the length
   Comparator<String> str=(s1,s2)->{
	   int l1=s1.length();
	   int l2=s2.length();
	   
	   if(l1<l2)
		   return 1;
	   else if(l1>l2)
		   return -1;
	   else
		   return s1.compareTo(s2);
   };
   List<String> sortedList=s.stream().sorted(str).toList();
   System.out.println("After Sorting according length "+sortedList);
   
	
   Comparator<String> str1=(s1,s2)->{
	   int l1=s1.length();
	   int l2=s2.length();
	   
	   if(l1<l2)
		   return -1;
	   else if(l1>l2)
		   return 1;
	   else
		   return s1.compareTo(s2);
   };
   List<String> sortedList1=s.stream().sorted(str1).toList();
   System.out.println("After Sorting according length "+sortedList1);}
	}


