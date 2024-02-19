package collection.map;
//it doesnot accept null key ,we can have multiple null value
//it will display in ascending order
import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> ob=new TreeMap<Integer, String>();
ob.put(1, "Apple");
//ob.put(null, "xyz");it cant have null key
ob.put(7, null);//it can have null value
ob.put(8, null);
ob.put(2,"Mango");
ob.put(3, "Grapes");
ob.put(4,"Banana");
ob.put(5,"Kivi");
System.out.println("After adding "+ob);
System.out.println(ob.containsKey(2));
System.out.println(ob.clone());
System.out.println(ob.isEmpty());
//System.out.println(map.get(1));//here it will give value of the particular key value i.e apple
System.out.println(ob.keySet());//display only key
System.out.println(ob.values());//display only values
	}

}
