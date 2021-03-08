package com.jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Exp2 {
	
	public static void main(String[] args) throws Exception
	{
		
		//step 1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");
				
		//step 2 create the connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch4", "root", "password" );
				
		//step 3 create statement object
		Statement stmt = con.createStatement();
		
		String sql = "select * from books";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		ResultSetMetaData rsData = rs.getMetaData();
		
		System.out.println(rsData.getColumnCount());
		System.out.println(rsData.getColumnName(2));
				
		
		while(rs.next())
		{
			System.out.println("Id : "+rs.getInt(1)+" Book Name : "+rs.getString(2));
		}
		
	}

}
