package com.filesystem;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInfoToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// To write inside Absolute path located file
		FileWriter ob = new FileWriter(
				"C:\\Users\\win10\\eclipse-workspace\\FirstCoreJavaProject\\src\\com\\filesystem\\CoreJava.txt");
		ob.write("Java is Object oriented language\n");
		ob.write("Java is simple,Secure,Robust");
		System.out.println("Written Successfully");
		ob.close();
        //to write inside relative path
		FileWriter ob1 = new FileWriter("Java.txt");
		ob1.write("Java is Object oriented language");
		System.out.println("Written Successfully");
		ob1.close();
	}

}
