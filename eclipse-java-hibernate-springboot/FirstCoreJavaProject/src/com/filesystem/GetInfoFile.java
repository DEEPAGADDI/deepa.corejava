package com.filesystem;

import java.io.File;

public class GetInfoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     File ob=new File("Java.txt");
     if(ob.exists()) {
    	 System.out.println("Path "+ob.getAbsolutePath());
    	 System.out.println("Name of the file "+ob.getName());
    	 System.out.println("Can we write "+ob.canWrite());
    	 System.out.println("Can we read "+ob.canRead());
    	// ob.delete();
     }
     else {
    	 System.out.println("Does not exists");
     }
     File ob1=new File("CoreJava.pdf");
     if(ob1.exists()) {
    	 System.out.println("Path "+ob.getAbsolutePath());
    	 System.out.println("Name of the file "+ob.getName());
    	 System.out.println("Can we write "+ob.canWrite());
    	 System.out.println("Can we read "+ob.canRead());
     }
     else {
    	 System.out.println("Does not exists");
     }
	}

}
