package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

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
		
		String q1="insert into student values(?,?,?,?)";
		
		PreparedStatement ps=conn.prepareStatement(q1);
		
		ps.setInt(1, 101);
		ps.setString(2, "Ram");
		ps.setString(3, "ram@gmail.com");
		ps.setString(4, "9087896789");
		
		ps.setInt(1, 102);
		ps.setString(2, "sham");
		ps.setString(3, "sham@gmail.com");
		ps.setString(4, "897678789");
////		//At a time we cannot insert more then one data bcz it will consider only one
		ps.setInt(1, 103);
		ps.setString(2, "Monika");
		ps.setString(3, "Monika@gmail.com");
		ps.setString(4, "789090080");
		int row=ps.executeUpdate();
		System.out.println(row +" Rows Inserted");
	}

}
