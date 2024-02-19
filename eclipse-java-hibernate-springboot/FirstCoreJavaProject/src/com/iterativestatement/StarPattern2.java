package com.iterativestatement;

public class StarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	//	-----------------------------------------
		for(int a=1;a<=4;a++) {
			for(int b=3;b>=a;b--) {
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		
//		//-------------------------------
		for(int m=1;m<=4;m++) {
			for(int n=3;n>=m;n--) {
				System.out.print(" ");
			}
			for(int o=1;o<=m;o++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int p=1;p<=3;p++) {
			for(int q=1;q<=p;q++) {
				System.out.print(" ");
			}
			for(int r=3;r>=p;r--) {
				System.out.print("*");
		}
			System.out.println();
          }
	}
}