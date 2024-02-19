package com.LambdaExpression;

interface Calculate{
	int reverse(int n);
}
public class Demo4ReverseOfNumber {

	public static void main(String[] args) {
	Calculate ob = (n)->{
		int reversed=0;
		while(n!=0) {
			int lastdigit = n % 10;  
			reversed = reversed * 10 + lastdigit; 
			n = n/10; 
		}
		return reversed;
	};
	System.out.println("reversed number is  "+ob.reverse(12345));


	}

}