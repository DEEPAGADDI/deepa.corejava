package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> marks=new ArrayList<Integer>();
marks.add(50);
marks.add(80);
marks.add(12);
marks.add(30);
marks.add(20);
System.out.println("Before Adding Grace Marks"+marks );
List<Integer> li=marks.stream().map((m)->m+20).collect(Collectors.toList());
System.out.println("After Adding Grace Marks "+li);



	}

}
