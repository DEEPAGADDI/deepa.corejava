package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> ob=new ArrayList<String>();
ob.add("Deepa");
ob.add("Ramya");
ob.add("Nadhiya");
ob.add("Hamsa");
System.out.println("After adding "+ob);

Collections.sort(ob);
System.out.println("After sorting "+ob);

Collections.shuffle(ob);
System.out.println("After Shuffle "+ob);

Collections.reverse(ob);
System.out.println("After Reverse "+ob);


System.out.println("For Integer type");
ArrayList<Integer> ob1=new ArrayList<Integer>();
ob1.add(897);
ob1.add(3465);
ob1.add(9876);
ob1.add(1223);
System.out.println("After adding "+ob1);

Collections.sort(ob1);
System.out.println("After sorting "+ob1);

Collections.shuffle(ob1);
System.out.println("After Shuffle "+ob1);

Collections.reverse(ob1);
System.out.println("After Reverse "+ob1);

//Different ways to display the content
//for(int i=0;i<ob.size();i++) {
//	System.out.println(ob.get(i));
//}
//System.out.println();
////for each method
//
//for(String s:ob) {
//	System.out.println(s);
//}
//System.out.println();
////Using iterator 
//
//Iterator it=ob.iterator();
//while(it.hasNext()) {
//	System.out.println(it.next());
//}
	}

}
