package com.iterativestatement;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=10;i++) {
//			System.out.println("no= "+i);
//		}
		
		for(int j=5;j>0;j--)
			System.out.println("Descending order: "+j);
		
		for(int a=0;a<=10;a+=2)
			System.out.println("Even numbers = "+a);
		
		int b=0;
		for(System.out.println("Are yuou sleeping"); b<=3;b++)
			System.out.println("no");
		
		for(int c=0;c<=10;c++) {
			if(c%2==0) {
				System.out.println("Even numbers: "+c);
			}
		}
		
		for(int d=1;d<=10;d++) {
			if(d%2!=0) {
				System.out.println("Odd numbers: "+d);
			}
		}
		
		int m[]= {1,2,3,4,5,6,7,8};
		for(int n=1;n<m.length;n++)
			System.out.println(m[n]);
		
		String r[]= {"ramya","moulya","shhree"};
		for(int s=0; s<r.length; s++)
			System.out.println(r[s]);
			
	}

}