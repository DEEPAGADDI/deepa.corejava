package collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PriorityQueue p=new PriorityQueue();
     p.add("Mango");//offer is also used to add
     p.add("Apple");
     p.add("Banana");
     p.add("Graps");
     p.add("WaterMelon");
     PriorityQueue p1=new PriorityQueue();
     System.out.println("After Adding "+p);
     p.remove("Mango");
     System.out.println("After Removing "+p);
     
     System.out.println("The First element is "+p.element());//Show first element ,if there is no element then it will throw exception
     p1.peek();//when we have empty set it will give null
     System.out.println(p1);
  System.out.println("Perform Peek Operation "+p);
    p.poll();//It will Return and Remove First Element
    System.out.println("Perform poll Operation "+p);
    System.out.println("Is Empty "+p.isEmpty());
    p.clear();
    System.out.println("After clearning "+p);
//    p.remove();//Exception
//    System.out.println(p);
//    p.poll();
//    System.out.println(p);
//    p.element();
//    System.out.println(p);
     
	}

}
