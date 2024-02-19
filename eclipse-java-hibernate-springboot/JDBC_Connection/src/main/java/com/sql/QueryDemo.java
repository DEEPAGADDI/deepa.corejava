package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryDemo {

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
		
		//4.create statement object
		Statement st=conn.createStatement();
     
     String q1="insert into student values(101,'Rekha','rekha@gmail.com','90876789568')";
     int rows=st.executeUpdate(q1);
     System.out.println("rows affected "+rows);
     
     String q2="insert into student values(102,'rahul','rahul@gmail.com','89767890988')";
     int rowss=st.executeUpdate(q2);
     System.out.println("rows affected "+rowss);
     
     String q3="insert into student values(103,'ramya','ramya@gmail.com','789678789568')";
     int rowsss=st.executeUpdate(q3);
     System.out.println("rows affected "+rowsss);
     //Data is repeatadly inserting in normal statement to over come this we use prepared statement
//     String q2="update student set name='mohan' where id=107";
//     int row=st.executeUpdate(q2);
//     System.out.println("rows affected "+row);
//     
//     String q3="delete from student where id=106";
//     int rowss=st.executeUpdate(q3);
//     System.out.println("rows affected "+rowss);
     
     String q6="select * from student";//first query
		
		ResultSet rs=st.executeQuery(q6);
     while(rs.next()) {
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"      "+rs.getString(3)+"      "+rs.getString(4));//my first column is int in mysql then we have to give getInt,second is string getString
		}
     
	}

}
