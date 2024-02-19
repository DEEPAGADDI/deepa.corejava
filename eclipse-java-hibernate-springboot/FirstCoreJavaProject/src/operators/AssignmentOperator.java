package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
	   int a=10;
	   int b= 20;
	    a+=b;
	    System.out.println("Sum= "+a); 
	    
	   int m=30,n=20;
	   m-=n;
	   System.out.println("Sub= "+m);
	   
	   int x=50,y=10;
	   x*=y;
	   System.out.println("Mul= "+x);
	   
	   int c=30, d=2;
	   c/=d;
	   System.out.println("Div = "+c);
	   
	   int r=50,s=10;
	   r%=s;
	   System.out.println("mod = "+r);
	    
	   int g=10, h=20;
	   g&=h;
	   System.out.println("operator &= "+g);
       
	   int k=10,l=20;
	   k|=l;
	   System.out.println("Operator |= "+k);
	   
	   int u=10,v=20;
	   u^=v;
	   System.out.println("Operator ^= "+u);
	}
}