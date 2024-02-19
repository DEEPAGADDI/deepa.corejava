package collection.set;
//it will not allow duplicate value
//the data will be arranged in ascending order
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet td=new TreeSet();
td.add("Cat");//it will display in alphabetic form
td.add("Dog");
td.add("Ramya");

td.add("Cow");
td.add("Tiger");
td.add("Lion");
System.out.println("After Adding "+td);
td.remove("Cow");
System.out.println("After Removing "+td);//we will get in ascending order
	}

}
