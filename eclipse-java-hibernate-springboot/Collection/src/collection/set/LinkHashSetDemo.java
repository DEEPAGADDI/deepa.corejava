package collection.set;

import java.util.LinkedHashSet;

public class LinkHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet lh=new LinkedHashSet();
lh.add(88);
lh.add(12);
lh.add(45);
lh.add(56);
lh.add(76);//it wont allow duplicate value
lh.add(76);
lh.add(null);
System.out.println("After Adding "+lh);
lh.remove(12);
System.out.println("After Removing "+lh);
}

}
