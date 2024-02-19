package com.datatypepromotion;
class AAAA{
	public void display(int a,float b) {
		System.out.println("int-float type");
	}
	public void display(float c,int d) {
		System.out.println("float-int type");
	}
}
public class Case5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAAA ob=new AAAA();
		ob.display(10, 02.3f);
		ob.display(10.1f, 100);
		//ob.display(10, 10);
		//ob.display(0.0f, 00.0f);
		

	}

}
