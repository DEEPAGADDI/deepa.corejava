package com.streamapi;
//Stream :to Process the object from the collection
//Filter :it is a method used to filter the input values input 10 then output will be 0-10 0<=10(Return Type boolean)
//Map:It is a method used to add Extra value to the present input values input 10 output will be 10 (Return type can be anything)
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> ob=new ArrayList<Integer>();
    ob.add(40);
    ob.add(44);
    ob.add(60);
    ob.add(11);
    ob.add(90);
    ob.add(55);
    System.out.println("Before Filtering "+ob);
    List<Integer> evenNumber=ob.stream().filter((i)->i%2==0).collect(Collectors.toList());
    System.out.println("Even Number After Filtering "+evenNumber);
    //List<Integer> oddNumber=ob.stream().filter((i)->i%2!=0).toList();
    List<Integer> oddNumber=ob.stream().filter((i)->i%2!=0).collect(Collectors.toList());
    System.out.println("Odd Number After Filtering "+oddNumber);
    
	}

}
