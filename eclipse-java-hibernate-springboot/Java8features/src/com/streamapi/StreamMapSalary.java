package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapSalary {
public static void main(String[] args) {
	ArrayList<Integer> salary=new ArrayList<Integer>();
	salary.add(10000);
	salary.add(50000);
	salary.add(60000);
	salary.add(20000);
	salary.add(30000);
	System.out.println("Before Adding bonus "+salary);
	List<Integer> l=salary.stream().map((m)->m+5000).collect(Collectors.toList());
	System.out.println("After Adding Bonus "+l);
}
}
