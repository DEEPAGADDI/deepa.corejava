package com.filesystem;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class ReadinfoFromFile {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
    File ob=new File("C:\\Users\\win10\\eclipse-workspace\\FirstCoreJavaProject\\src\\com\\filesystem\\CoreJava.txt");
    Scanner sc=new Scanner(ob);
    while(sc.hasNext()) {
    	System.out.println(sc.nextLine());
    }
	}

}
