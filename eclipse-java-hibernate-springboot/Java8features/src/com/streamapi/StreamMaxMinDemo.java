package com.streamapi;

import java.util.ArrayList;

public class StreamMaxMinDemo {
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(3);
	l.add(1);
	l.add(50);
	l.add(45);
	l.add(80);
	System.out.println("Before Filtering "+l);
	
	int max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
    System.out.println("Maximum value "+max);
    int min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
    System.out.println("Minimun value "+min);
}
}
