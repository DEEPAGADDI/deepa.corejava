package selectionstatement;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=sc.nextInt();
		if(marks>90 && marks<=100) {
			System.out.println("Outstanding");
		}
		else if(marks>80 && marks<=90) {
			System.out.println("Excellent");
		}
		else if(marks>70 && marks<=80) {
		System.out.println("Good");
		}
		else if(marks>60 && marks<=70) {
			System.out.println("average");
		}
		else
			System.out.println("fail");
		}

}