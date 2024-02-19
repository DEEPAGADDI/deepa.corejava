package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCountMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> marks=new ArrayList<Integer>();
marks.add(50);
marks.add(80);
marks.add(12);
marks.add(30);
marks.add(20);
long noOfStudentMarks =marks.stream().count();
System.out.println("Total number of student marks count is "+noOfStudentMarks);


	}

}
