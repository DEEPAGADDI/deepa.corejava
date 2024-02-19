package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
//		ArrayList l1=new ArrayList();
//		ArrayList<Integer> l2=new ArrayList<Integer>(); 

		l.add("Deeps");
		l.add("BCA");
		l.add(90);
		l.add(8.8f);
		l.add(798068l);
//		System.out.println("We acan add n number of null values ");
		l.add(null);
		l.add(null);
		
		
		System.out.println("After Inserting "+l);
		
		l.remove(2);
		System.out.println("After Removing  "+l);
		
		boolean ob=l.contains(8.8f);
		System.out.println(ob);
		
		System.out.println("contains or not "+l.contains("BCA"));//another method to check
		
		
		Object value= l.get(1);
	    System.out.println("Get the value at specified index "+value);
		
	    System.out.println("Replace the current value to other value "+l.set(3, "XYZ") +l);
	   
	   
	    System.out.println("Size of the arraylist is"+l.size());
	   
	   
	}

}
