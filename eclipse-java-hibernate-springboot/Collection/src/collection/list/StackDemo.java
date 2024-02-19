package collection.list;

import java.util.Collections;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push("Deepa");
		s.push("Ramya");
		s.push("Nadhiya");
		s.push("Hamsa");
		System.out.println("After adding " + s);
		s.pop();
		System.out.println("After Removing " + s);
		System.out.println("The Search element is at the index "+s.search("Ramya"));
//      System.out.println(s);
		Collections.reverse(s);
		System.out.println("After Reverse operation " + s);

	}

}
