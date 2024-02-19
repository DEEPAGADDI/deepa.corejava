package com.inheritance;

class Colors{
	public void details() {
		System.out.println("Colors are very attractive");
	}
}
class Red extends Colors{
	public void details1() {
		System.out.println("Red color");
		System.out.println();
	}
}
class Black extends Colors{
	public void details2() {
		System.out.println("Black color");
		System.out.println();
	}
}
class Blue extends Colors{
	public void details3() {
		System.out.println("Blue color");
		System.out.println();
	}
}
public class HeirarchicalEx {
	public static void main(String[] args) {
	Red ob=new Red();
	ob.details();
	ob.details1();
	
	Black ob1=new Black();
	ob1.details();
	ob1.details2();
	
	Blue ob2=new Blue();
	ob2.details();
	ob2.details3();
	}
}