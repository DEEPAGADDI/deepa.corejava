package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertdemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	     
			//register
			String driver="com.mysql.cj.jdbc.Driver";
			String username="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/jdbc";//we have give our database 
			
			//2.load driver 
			Class.forName(driver);//to load the mysql driver
			
			//3.create connection object

			
			Connection conn=DriverManager.getConnection(url,username,password);
			
			//4.create statement object
			Statement st=conn.createStatement();
			
			String q1="insert into student values(106,'Radhika','radhika@gmail.com','9089078909')";
			int rows=st.executeUpdate(q1);
			System.out.println("rows affected "+rows);
	}

}
