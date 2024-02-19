package com.array;

import java.util.Arrays;

public class MethodsOfArray {

	public static void main(String[] args) {
		int[] num= {2,3,4,5,7};
		int length=num.length;
		System.out.println(length);
		System.out.println(num[2]);
		
		//shallow copy clone() method
		int[] a = {3,4,5};
		int[] b=a.clone();
		System.out.println(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		//Arrays.sort()
		int[] x= {12,3,2,4,8,5,9,5};
		Arrays.sort(x);
		//print sorted array
		System.out.println(Arrays.toString(x));
				
		//fill()
		int[] arr = new int[5];
		Arrays.fill(arr, 5);
		System.out.println(Arrays.toString(arr));
		arr[0]=10;
		arr[1]=20;
		System.out.println(Arrays.toString(arr));
		
		//binary search
		int[] arr1= {1,2,3,4,5};
		int index=Arrays.binarySearch(arr1,3);
		System.out.println(index);
		
		//equals
		int[] arr3= {2,3,4};
		int[] arr4= {2,3,4};
		boolean eq=Arrays.equals(arr3, arr4);
		System.out.println(eq);
		
		//for string
		System.out.println();
		String str[]= {"DEEPA","RAMYA","HAMSA"};
		System.out.println(Arrays.toString(str));
		System.out.println("Length of the array = "+str.length);
		System.out.println("Length of the String = "+str[1].length()); // returns length of RAMYA
		
	}

}