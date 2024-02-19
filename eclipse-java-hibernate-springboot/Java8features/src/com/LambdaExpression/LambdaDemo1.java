package com.LambdaExpression;
interface myInterface1{
	int display(int n);
}
public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
myInterface1 ob=(n)->{return n*n;};//or without () we can write only n
System.out.println(""+ob.display(4));
	}

}                     
