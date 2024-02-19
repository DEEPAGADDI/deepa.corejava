package operators;

public class ConditionalOperatorMin {

	public static void main(String[] args) {
		int m=10;
		int n=20;
		int min;
		min=(m < n) ? m : n;
		System.out.println(min);
		
		//for 3 numbers
		int x=35, y=56, z=15, min1;
		min1 = (x < y && x < z) ? x :
			   (y < x && y < z) ? y : z;
		System.out.println(min1);
		
		//for 4 numbers
		int a=10, b=20, c=90, d=50, min2;
		min2 = (a<b && a<c && a<d) ? a :
			   (b<a && b<c && b<d) ? b :
			   (c<a && c<b && c<d) ? c : d;
		System.out.println(min2);
		
		//for 5 numbers
		int g=50, h=40, i=30, j=70, k=100, min3;
		min3 = (g<h && g<i && g<j && g<k) ? g:
			   (h<g && h<i && h<j && h<k) ? h :
			   (i<g && i<h && i<j && i<k) ? i :
			   (j<g && j<h && j<i && j<k) ? j :k;
		System.out.println(min3);

	}

}