package collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr[]= {"Dog","cat","cow","Monkey"};
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
	
}

ArrayList ob=new ArrayList(Arrays.asList(arr));
System.out.println(ob);
	}

}
