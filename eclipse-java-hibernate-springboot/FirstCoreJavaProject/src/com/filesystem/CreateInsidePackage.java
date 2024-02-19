package com.filesystem;

import java.io.File;
import java.io.IOException;

public class CreateInsidePackage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//txt file
		
		 File ob=new File("C:\\Users\\win10\\eclipse-workspace\\FirstCoreJavaProject\\src\\com\\filesystem\\CoreJava.txt");//for txt file we have to give java.txt
	     if(ob.createNewFile()) {
	    	 System.out.println("Created successfully");
	     }
	     else {
	    	 System.out.println("File Exist");
	     }
	     //pdf file
	     File ob1=new File("C:\\Users\\win10\\eclipse-workspace\\FirstCoreJavaProject\\src\\com\\filesystem\\CoreJava.pdf");//for txt file we have to give java.txt
	     if(ob1.createNewFile()) {
	    	 System.out.println("Created successfully");
	     }
	     else {
	    	 System.out.println("File Exist");
	     }
	}

}
