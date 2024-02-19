package com.LambdaExpression;
interface myInterface2{
	int display(int a,int b);
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
myInterface2 ob=(a,b)->{return a+b;};//or without () we can write only n
System.out.println("Addition of two number "+ob.display(7,8));
	}

}
