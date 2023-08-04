package com.nriit.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		
		Connection conn = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qna", "root", "root");	
		}
		catch (Exception e) {
			System.out.println("inside Catch of getConnection...");
			e.printStackTrace();
		}
		
		return conn;
	}

}
