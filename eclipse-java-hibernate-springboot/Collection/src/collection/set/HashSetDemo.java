package collection.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet h=new HashSet();
//h.add("Deepa");
//h.add("Deepa");
//h.add(null);
//h.add(null);
//h.add("Ramya");
//h.add("Hamsa");
//System.out.println("After Adding "+h);
//h.remove("Hamsa");
//System.out.println(h);

HashSet u=new HashSet();
u.add(1);
u.add(2);
u.add(15);
u.add(5);
u.add(8);
u.add(12);
u.add(13);
u.add(14);
System.out.println(u);

HashSet ui=new HashSet();
ui.add(9);
ui.add(1);
ui.add(2);
ui.add(10);
System.out.println(ui);
//ui.addAll(u);          //Union Operation
//System.out.println("After Union Operation +ui);
//ui.retainAll(u);         //Intersection operation
//System.out.println("After Intersection operation "+ui);
u.removeAll(ui);
System.out.println("After Removing Duplicate 'u'(Ignoring Common Elements) "+u);
//ui.removeAll(u);
//System.out.println("After Removing Duplicate 'ui' (Ignoring Common Elements) "+ui);
	}

}
