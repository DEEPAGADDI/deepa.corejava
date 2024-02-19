package collection.comparator;

import java.util.Iterator;
import java.util.PriorityQueue;


class Student1 implements Comparable<Student1>{

	String name;
	int Rank;
	
	
	public Student1(String name, int rank) {
		super();
		this.name = name;
		this.Rank = rank;
	}


	@Override
	public String toString() {
		return "Student1 [name=" + name + ", Rank=" + Rank + "]";
	}


	@Override
	public int compareTo(Student1 o) {
		
		return Integer.compare(Rank, o.Rank);
	}
	
	
}
public class Demo2 {

	public static void main(String[] args) {
	
		PriorityQueue<Student1> ob = new PriorityQueue<Student1>() ;
		ob.add(new Student1("bob",106));
		ob.add(new Student1("alice",107));
		ob.add(new Student1("Devid",101));
		ob.add(new Student1("jhon",102));
		
		System.out.println(ob);
		
		System.out.println();
		
		Iterator it=ob.iterator();
		while(it.hasNext()) {

			System.out.println("Using iterator "+it.next());
	}

}
}
