package com.searchweb.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil2 {
	
public static Connection getConnection() {

		try {						
			String dbURL = "jdbc:mysql://searchweb.cafe24.com:3306/searchwebdb";
//jdbc:mysql://카페24도메인주소/카페24db명
	 				
String dbID = "searchweb";  //카페24아이디
String dbPassword = "****"; //카페24db비번		
						
					

					
			Class.forName("com.mysql.cj.jdbc.Driver");	
			
			return DriverManager.getConnection(dbURL ,dbID , dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
	    }
		return null;	 
	}
	

}