package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeletePreparedDemo {

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
		
		String q1="delete from student where id=?";
//		String q2="alter table student set name=? where id=?";
		
		PreparedStatement ps=conn.prepareStatement(q1);
		
		ps.setInt(1, 101);
	    int row=ps.executeUpdate();
	    System.out.println(row +" row deleted");
	}

}
