package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePreparedDemo {

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
		 String str="update student set email=? where id=?";
		 
		 PreparedStatement ps=conn.prepareStatement(str);
		 
		 ps.setInt(2, 101);
		 ps.setString(1,"Deepa@gmail.com");
		 
//		 ps.setInt(2, 103);
//		 ps.setString(1, "Nadhiya");
		 
		 int row=ps.executeUpdate();
		 System.out.println(row +" Row updated");
	}

}
