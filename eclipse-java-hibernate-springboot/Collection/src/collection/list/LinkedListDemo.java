package collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new LinkedList();
//		LinkedList l1=new LinkedList();
//		LinkedList<Integer> l2=new LinkedList<Integer>(); 

		l.add("Deeps");
		l.add("BCA");
		l.add("Banglore");
		l.add(8.89f);
		l.add(798068l);
////		System.out.println("We acan add n number of null values ");
//		l.add(null);
//		l.add(null);
		
		
		System.out.println("After Inserting "+l);
		
		l.remove(2);
		System.out.println("After Removing  "+l);
		
		boolean ob=l.contains("deepa");
		System.out.println(ob);
		
		System.out.println("contains or not "+l.contains("BCA"));//another method to check
		
		
		Object value= l.get(1);
	    System.out.println("Get the value at specified index "+value);
		
	    System.out.println("Replace the current value to other value "+l.set(3, "XYZ") +l);
	   
	   
	    System.out.println("Size of the arraylist is"+l.size());
	   
	   
	}

}
