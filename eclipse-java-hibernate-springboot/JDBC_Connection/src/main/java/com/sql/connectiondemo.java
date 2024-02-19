package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connectiondemo {

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
		
		String q1="select * from student";//first query
		
		ResultSet rs=st.executeQuery(q1);
		
		System.out.println("successfully connected");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"      "+rs.getString(3)+"      "+rs.getString(4));//my first column is int in mysql then we have to give getInt,second is string getString
		}
	}

}
