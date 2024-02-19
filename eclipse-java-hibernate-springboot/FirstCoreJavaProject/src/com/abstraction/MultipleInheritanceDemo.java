package com.abstraction;

interface Parent1{
	public void parent1properties();
}
interface Parent2{
	public void parent2properties();
}
class Child implements Parent1,Parent2{

	@Override
	public void parent2properties() {
		System.out.println("Extending properties from PARENT2");
		
	}

	@Override
	public void parent1properties() {
		System.out.println("Extending properties from PARENT1");		
	}
	
}
public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		Child ob=new Child();
		ob.parent1properties();
		ob.parent2properties();
		
	}

}