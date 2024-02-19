package com.abstraction;


 abstract class Fruit{
	 abstract void taste();
}
class Mango extends Fruit{
	public void taste() {
		System.out.println("Sweet");
	}
}
public class AbstractionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango ob=new Mango();
		ob.taste();
	}

}