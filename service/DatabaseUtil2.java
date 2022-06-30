package com.searchweb.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil2 {
	
public static Connection getConnection() {
				
		try {
			/*
			 * String dbURL = "jdbc:mariadb://localhost/searchweb"; 
			 * String dbID = "searchweb";
			 * String dbPassword = "ss04912304!!";
			 */
			//String dbURL = "jdbc:mariadb://localhost:3306/searchweb";
			String dbURL = "jdbc:mariadb://searchweb.cafe24.com:3306/searchweb";					
			String dbID = "searchweb";
			String dbPassword = "ss04912304!!";
			
			Class.forName("org.mariadb.jdbc.Driver"); 
			//Class.forName("com.mysql.cj.jdbc.Driver"); x		
			//Class.forName("org.mysql.jdbc.Driver"); x		
			
			
			return DriverManager.getConnection(dbURL ,dbID , dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
	    }
		return null;	 
	}
	

}