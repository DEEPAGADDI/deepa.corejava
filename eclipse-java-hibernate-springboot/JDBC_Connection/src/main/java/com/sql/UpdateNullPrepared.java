package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateNullPrepared {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String driver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/jdbc";//we have give our database 
		
		//2.load driver 
		Class.forName(driver);//to load the mysql driver
		
		//3.create connection object

		Connection conn=DriverManager.getConnection(url,username,password);
		String q1="update student SET course=? WHERE id=?";
		//String q1="update student SET course=? WHERE course is NULL";
		PreparedStatement ps=conn.prepareStatement(q1);
		ps.setInt(2, 103);
		ps.setString(1, "BBA");
		
		int row=ps.executeUpdate();
		System.out.println(row +" row updated");
				

	}

}
