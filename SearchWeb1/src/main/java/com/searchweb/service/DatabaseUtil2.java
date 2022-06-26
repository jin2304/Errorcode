package com.searchweb.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil2 {
	
public static Connection getConnection() {

		try {						
//			String dbURL = "jdbc:mariadb://searchweb.cafe24.com:3306/searchwebdb";					
//			String dbID = "searchweb";
//			String dbPassword = "ss0491!!";
			
			String dbURL = "jdbc:mysql://localhost/searchweb";	 				
			String dbID = "searchweb"; //카페24아이디
			String dbPassword = "*****"; //카페24db비번
			
//			String dbURL = "jdbc:mysql://searchweb.cafe24.com:3306/searchweb";					
//			String dbID = "jin";
//			String dbPassword = "ss0491!!";
					

			/*
			 * String dbURL = "jdbc:mysql://localhost:3306/TEST"; 
			 * String dbID = "root";
			 * String dbPassword = "ss04912304!!";
			 */
			Class.forName("org.mariadb.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");	
			
			return DriverManager.getConnection(dbURL ,dbID , dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
	    }
		return null;	 
	}
	

}
