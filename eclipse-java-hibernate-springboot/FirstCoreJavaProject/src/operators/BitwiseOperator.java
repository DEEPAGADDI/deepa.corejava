package operators;

public class BitwiseOperator {
   public static void main(String[] args) {
	System.out.println("Bitwise operators");
	int a=4;
	int b=5;
	int c=4|5;
	System.out.println("A | B is "+c);
	int x=4;
	int y=5;
	int z=x|y;
	System.out.println("X | Y is "+z);
	
	int r=7;
	int s=6;
	int t=r&s;
	System.out.println("R & S is "+t);
	
	int m=4;
	int n=5;
	int o=m^n;
	System.out.println("M ^ N is "+o);
	
	int e=10;
	int f=~e;
	System.out.println("~e is "+f);
}
}