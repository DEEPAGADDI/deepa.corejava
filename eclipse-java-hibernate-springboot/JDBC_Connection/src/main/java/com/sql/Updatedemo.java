package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Updatedemo {

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
		
		String q2="update student set name='sham' where name='ram'";
		int rows=st.executeUpdate(q2);
		System.out.println("Updated rows count: "+rows);
	}

}
