package com.searchweb.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil2 {
	
public static Connection getConnection() {

		try {						
			String dbURL = "jdbc:mysql://searchweb.cafe24.com:3306/searchwebdb";
//jdbc:mysql://ī��24�������ּ�/ī��24db��
	 				
String dbID = "searchweb";  //ī��24���̵�
String dbPassword = "****"; //ī��24db���		
						
					

					
			Class.forName("com.mysql.cj.jdbc.Driver");	
			
			return DriverManager.getConnection(dbURL ,dbID , dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
	    }
		return null;	 
	}
	

}