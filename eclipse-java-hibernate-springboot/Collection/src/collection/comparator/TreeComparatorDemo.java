package collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

class mycomparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2)
		return 1;
		else if(i1>i2)
			return -1;
		else
			return 0;
	}
	
}
public class TreeComparatorDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if we pass constructor name mycomparator1 within treeset() then we will get in descending order otherwise in ascending order
		TreeSet i=new TreeSet(new mycomparator1());
		i.add(10);
		i.add(0);
		i.add(15);
		i.add(5);
		i.add(20);
		i.add(20);
		System.out.println(i);

	}

}
