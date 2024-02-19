package operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a=30;
		int b=20;
		int c=50;
		int max,min;
		max=(a > b && a > c) ? a:
			(b > a && b > c) ? b:c;
		System.out.println(max);
		
		//for 5 numbers
		int m=20, n=80, o=30, p=60, q=10, maxi;
		maxi=( m > n && m > o && m > p && m > q) ? m:
			(n > m && n > o && n > p && n > q) ? n :
			( o > m && o > n && o > p && o > q) ? o : 
			(p > m && p > n && p > o && p > q) ? p : q;
		System.out.println("Maximum of m n o p q = "+maxi);
		
		

	}


}