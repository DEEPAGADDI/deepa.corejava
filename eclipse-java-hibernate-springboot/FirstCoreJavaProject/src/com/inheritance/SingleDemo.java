package com.inheritance;


class Parent{
	public void parent() {
		System.out.println("Parent properties");
	}
}
	class Child extends Parent{
		public void child() {
			System.out.println("child properties");
	}
}
public class SingleDemo {
	public static void main(String[] args) {
		Parent ob=new Parent();
		ob.parent();
		
		Child ob1=new Child();
		ob1.child();
		ob1.parent();

	}

}