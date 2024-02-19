package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//register
		String driver="com.mysql.cj.jdbc.Driver";//it is 4th type
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/jdbc";//we have give our database 
		
		//2.load driver 
		Class.forName(driver);//to load the mysql driver
		
		//3.create connection object

		Connection conn=DriverManager.getConnection(url,username,password);
		
		//4.create statement object
		Statement st=conn.createStatement();
		
		String q2="delete from student where id=101";
		int rows=st.executeUpdate(q2);
		System.out.println("deleted rows count: "+rows);
		
//		//String driver="com.mysql.cj.driver";
//		//string username="root";
//		//string password="root";
//		//String url="jdbc:mysql://localhost:3306/jdbc;
//		
//		Class.forName(driver);
//		
//		connection con=DriverManager.getConnection()
	}

}
