package com.edu.Demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Addition{ 
 public int add(int a,int b) {
	 return a+b;
 }
 @Test
 public void addition() {
	 assertEquals(10, add(3,7));
	 
 }
 public int sub(int a,int b) {
	 return a-b;
 }
 @Test
 public void subtraction() {
	 assertEquals(0, sub(5,5));
 }
 public int mul(int a,int b) {
	 return a*b;
 }
 @Test
 public void multiplication() {
	 assertEquals(20, mul(5,4));
 }
 public int div(int a,int b) {
	 return a/b;
 }
 @Test
 public void division() {
	 assertEquals(4, div(20,5));
 }
 @Test
 public void test1() {
	 int a=4;
	 assertTrue(a%2==0);
	 System.out.println("Number is an even number");
 }@Test
 public void test2() {
	 int a=5;
	 assertFalse(a%2==0);
	 System.out.println("The Number is odd number");
 }
 @Test
 public void test3() {
	 String str=null;
	 assertNull(str);
	System.out.println("Null");
 }
 @Test
 public void test4() {
	 String str="Deepa";
	 assertNotNull(str);
	 System.out.println("Not Null");
 }
// @Test Error
// public void test5() {
//	 String str=null;
//	 assertNotNull(str);
//	 System.out.println("Not Null");
// }
 @Test
 public void test5(){
	 int c=20;
	 assertNotEquals(20, 30);
	 System.out.println("Both the numbers are not equal");
 }
 //@TestError
// public void test5(){
//	 int c=20;
//	 assertEquals(20, 30);
//	 System.out.println("vgb");
// }
}
