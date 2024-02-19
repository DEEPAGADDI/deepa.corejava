package com.ex;

public class PeterSonNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=145,num1=num;
     int sum=0;
     int rem=0;
     int fact=1;
     while(num!=0) {
    	 rem=num%10;
    	 fact=1;
    	 for(int i=1;i<=rem;i++) {
    		 fact=fact*i;
    	 }
    	 num=num/10;
    	 sum=sum+fact;
    	
     }
     if(num1==sum) {
    	 System.out.println("The entered number is peterson");
     }
     else {
    	 System.out.println("The entered number is not peterson");
     }
     
	}

}
