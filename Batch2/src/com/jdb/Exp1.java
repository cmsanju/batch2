package com.jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exp1 {
	
	public static void main(String[] args) throws Exception
	{
		
		//step 1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//step 2 create the connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch4", "root", "password" );
		
		con.setAutoCommit(false);
		
		//step 3 create statement object
		Statement stmt = con.createStatement();
		
		//step 4 execute sql query
		//stmt.execute("create table books(id int, name varchar(50))");
		
		String sql = "insert into books values(4, 'J2SE')";
		
		stmt.addBatch("insert into books values(5, 'spring notes')");;
		stmt.addBatch("insert into books values(6,'JEE NOTES')");
		stmt.addBatch(sql);
		
		stmt.executeBatch();
		
		con.rollback();
		
		//step 5 close the connection object
		
		con.close();
		
		System.out.println("Done.");
		
		
	}
}
