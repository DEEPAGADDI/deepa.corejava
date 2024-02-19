package com.iterativestatement;

public class StarPatternAssesment {
public static void main(String[] args) {
	
	for(int i=3;i<=3;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=2;i<=2;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=1;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("  *");
		}
		System.out.println();
	}
	int m,n,k;
    for(m=2;m<=2;m++) {
    	  for(n=3;n>=m;n--) {
    		  System.out.print(" ");
    	  }
    	  for(k=1;k<=m;k++) {
    		  System.out.print("*");
    	  }
    	  System.out.println( );
    	  }
    for(int x=5;x<=1;x++) {
    	for(int z=3;z>=x;z--) {
    		System.out.println(" ");
    		
    	}
    	for(int d=5;d<=x;d++) {
    		System.out.println("*");
    	}
    }
    
	
	
}
}
