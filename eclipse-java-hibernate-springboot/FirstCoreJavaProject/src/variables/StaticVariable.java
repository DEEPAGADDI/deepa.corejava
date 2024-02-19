package variables;

class StaticDemo{
	static int agee=21;
	static String namee="Shree";
	static String no="9876543210l";
	
	static {
		System.out.println("Student Details");
	}
}
public class StaticVariable {
		static int age=20;
		static String name="Ramya";
	    static String dep="BCA";
public static void main(String[] args) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(dep+"\n");
		
		System.out.println(StaticDemo.namee);
		System.out.println(StaticDemo.agee);
		System.out.println(StaticDemo.no);
		

	}

}