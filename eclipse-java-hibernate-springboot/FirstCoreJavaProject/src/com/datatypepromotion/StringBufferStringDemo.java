package com.datatypepromotion;
//case 3
class AA{
	public void display(StringBuffer s1) {
		System.out.println("Child 1");
	}
	public void display(String s2) {
		System.out.println("Child 2");
	}
}
public class StringBufferStringDemo {
public static void main(String[] args) {
	AA ob=new AA();
	ob.display(new StringBuffer(""));
	ob.display("Ramys");
	//ob.display(null); //StringBuffer and String have same priority so we will get error if we give null 
		
}
}
