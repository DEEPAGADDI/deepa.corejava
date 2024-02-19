package collection.map;
//it can have 1 null key and multiple null value
//it will display as it , which we are given
import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "Bob");
		map.put(102, "Alice");
		map.put(180, "xyz");
		map.put(103, "Devid");
		map.put(104, "john");
//		map.put(null, "xyz");//it can have 1 null key
//		map.put(null, null);
//		map.put(106, null);//it can have null value
		System.out.println(map);
		//System.out.println(map.containsKey(109));//if we have the key value then we will get true or false
		//System.out.println(map.get(101));//here it will give value of the particular key value i.e bob
		//System.out.println(map.isEmpty());//weather it is empty or not
		System.out.println(map.clone());//it will copy the entire set display
	System.out.println(map.remove(101));//it will remove the value from the set
	System.out.println(map);
	System.out.println(map.put(103, "Ramya"));//another method
	System.out.println(map);
//	System.out.println(map.replace(104, "Deepa"));//replace the current value to given value
//	System.out.println(map);
//		
System.out.println(map.keySet());//display only key
System.out.println(map.values());//display only values

//using for loop
for(Object o:map.keySet()) {
	System.out.println(map.get(o)+" "+o);
}
	}

}
