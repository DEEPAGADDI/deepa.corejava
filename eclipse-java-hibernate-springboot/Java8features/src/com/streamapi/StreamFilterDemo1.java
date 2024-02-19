package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo1 {
public static void main(String[] args) {
	ArrayList<Integer> marks=new ArrayList<Integer>();
	marks.add(50);
	marks.add(80);
	marks.add(12);
	marks.add(30);
	marks.add(20);
//	System.out.println("Before Adding Grace Marks"+marks );
//	List<Integer> li=marks.stream().map((m)->m+20).collect(Collectors.toList());
//	System.out.println("After Adding Grace Marks "+li);
	List<Integer> noOfFailStudent =marks.stream().filter((n)->n<35).toList();
    System.out.println("Number of Fail student "+noOfFailStudent);
    List<Integer> Sort =marks.stream().sorted().toList();
     System.out.println("Sort in ascending order "+Sort);
}

}
