package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		  int x=21;
		  int y=25;
		  if(++x<21 && ++y>25) 
		  {
			  x++;
		  }
		  else
		  {
			  y++;
		  }
		  System.out.println("x= "+x);
		  System.out.println("y= "+y+"\n");
		  
		  int a=10, b=15;
		  if(++a<10 || ++b>15) {
			  a++;
		  }else
			  b++;
		  System.out.println("a= "+a);
		  System.out.println("b= "+b);
		  
	}
   
}