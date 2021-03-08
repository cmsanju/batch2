package com.jdb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Exp3 {
	
	public static void main(String[] args) throws Exception
	{
		
		//step 1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");
				
		//step 2 create the connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch4", "root", "password" );
				
		//step 3 create preparedstatement object
		//PreparedStatement pst = con.prepareStatement("insert into books values(?,?)");
		//PreparedStatement pst = con.prepareStatement("update books set name = ? where id = ?");
		  PreparedStatement pst = con.prepareStatement("delete from books where id = ?");
		  
		  CallableStatement cst = con.prepareCall("{call insertFun(?,?)}");
		
		
		cst.setInt(1, 333);
		cst.setString(2, "praveen");
		
		cst.execute();
		
		System.out.println("Done.");
		
		con.close();
		
		
	}

}
