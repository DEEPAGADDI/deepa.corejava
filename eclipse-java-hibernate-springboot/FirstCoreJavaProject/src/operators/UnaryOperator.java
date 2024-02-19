package operators;

import java.util.Scanner;
//Pre-increment, post-increment,pre-decrement,post-decrenent
public class UnaryOperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for post incrememnt");
		int a=sc.nextInt();
		int b=a++;
		System.out.println(b);
		System.out.println(a);
		System.out.println();
		
		int c=34;
		int d=++c;
		System.out.println(c);
		System.out.println(d);
		System.out.println();
		
		
		System.out.println("Enter number for post decrement");
		int x=sc.nextInt();
		int y=x--;
		System.out.println(y);
		System.out.println(x);
		System.out.println();
		
		System.out.println("Enter number for pre decrement");
		int r=sc.nextInt();
		int s=--r;
		System.out.println(r);
		System.out.println(s);


	}

}