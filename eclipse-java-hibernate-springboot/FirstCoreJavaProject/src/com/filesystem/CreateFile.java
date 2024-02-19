
package com.filesystem;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File ob=new File("CoreJava.pdf");//for txt file we have to give java.txt
     if(ob.createNewFile()) {
    	 System.out.println("Created successfully");
     }
     else {
    	 System.out.println("File Exist");
     }
	
	File ob1=new File("Java1.txt");
	if(ob1.createNewFile()) {
		 System.out.println("Created successfully");
    }
    else {
   	 System.out.println("File Exist");
    }
	File ob2=new File("Bike.txt");
	if(ob2.createNewFile()) {
		 System.out.println("Created successfully");
    }
    else {
   	 System.out.println("File Exist");
    }
	}
	}

