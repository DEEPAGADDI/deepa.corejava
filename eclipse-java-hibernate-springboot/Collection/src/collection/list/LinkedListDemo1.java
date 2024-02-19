package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ob=new LinkedList<String>();
		ob.add("Jyothi");
		ob.add("Ambika");
		ob.add("Ambu");
		ob.add("Pacchu");
		System.out.println("After adding "+ob);
		
		Collections.sort(ob);
		System.out.println("Sorting "+ob);
		
		Collections.shuffle(ob);
		System.out.println("Shuffle "+ob);
		
		Collections.reverse(ob);
		System.out.println("Reverse "+ob);
		//to add other value to existing array list
		ob.add(3, "Akshatha");
		System.out.println(ob);
		
		//Different ways to display the content
//		for(int i=0;i<ob.size();i++) {
//		System.out.println("Using for loop "+ob.get(i));
//		}
//		System.out.println();
//		//for each method
//		
//		for(String s:ob) {
//			System.out.println("Using Foreach "+s);
//		}
//		System.out.println();
//		//Using iterator 
//		
//		Iterator it=ob.iterator();
//		while(it.hasNext()) {
//		System.out.println("Using iterator "+it.next());
//		}
	}

}
