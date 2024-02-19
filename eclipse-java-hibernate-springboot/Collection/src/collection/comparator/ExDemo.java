package collection.comparator;
import java.util.Comparator;
import java.util.TreeSet;

class mycomprator implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return str2.compareTo(str1);//To reverse
	}

	
}
public class ExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   TreeSet<String> ob=new TreeSet<> (new mycomprator());
   ob.add("Dog");
   ob.add("Mouse");
   ob.add("Donkey");
   ob.add("Elephant");
   ob.add("Cat");
   ob.add("Ant");
   System.out.println(ob);
	}

}
