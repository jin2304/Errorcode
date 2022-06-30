package com.searchweb.service;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.searchweb.entity.Searchweb;
//import com.searchweb.service.DatabaseUtil2;

public class SearchWebService {


	
	
	//List	
	public List<Searchweb> getSearchwebList(String query){
		
		List<Searchweb> list = new ArrayList<>();
		
		
		
		String sql = "SELECT * FROM main WHERE NAME LIKE UPPER(?) OR NAME LIKE LOWER(?) OR NAME2 LIKE ? ";
						

		try { 
			Class.forName("org.mariadb.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver"); x
			//Class.forName("org.mysql.jdbc.Driver"); x
				
							
			Connection conn = DatabaseUtil2.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);			
			
			st.setString(1,"%"+query+"%");
			st.setString(2,"%"+query+"%");
			st.setString(3,"%"+query+"%");
			
			ResultSet rs = st.executeQuery();
			
			 while(rs.next()){ 
				  int id = rs.getInt("id");
				  String name = rs.getString("name");
				  String content = rs.getString("content");
				  String weburl = rs.getString("weburl");
				  String value = rs.getString("value");	
				  String home = rs.getString("home");
				  int hit = rs.getInt("hit");
				  Searchweb searchweb = new Searchweb(
						   id,						  
						   name,
						   content,
						   weburl,
						   value,
						   home,
						   hit
						  );
				  
				  list.add(searchweb);
				  
			  }
			 		  
			rs.close();
			st.close(); 
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	


	
	
	
	

//detail
public List<Searchweb> getSearchweb(String value,String home) {
	
	List<Searchweb> list = new ArrayList<>();
	
		
	String sql = "SELECT * FROM main WHERE value=? OR home=? ORDER BY ID"; 
	
			try {
			      Class.forName("org.mariadb.jdbc.Driver"); 
				//Class.forName("com.mysql.cj.jdbc.Driver"); x	
				//Class.forName("org.mysql.jdbc.Driver");
									
				

				Connection conn = DatabaseUtil2.getConnection();
				PreparedStatement st = conn.prepareStatement(sql);
				
				st.setString(1,value);
				st.setString(2,home);
				ResultSet rs = st.executeQuery();
				

				while(rs.next()){ 
					  int id = rs.getInt("id");
					  String name = rs.getString("name");
					  String content = rs.getString("content");
					  String weburl = rs.getString("weburl");
					  String value1 = rs.getString("value");	
					  String home1 = rs.getString("home");
					  int hit = rs.getInt("hit");
					  Searchweb searchweb = new Searchweb(
							   id,						  
							   name,
							   content,
							   weburl,
							   value1,
							   home1,
							   hit
							  );
					  
					  list.add(searchweb);
					  
				  }
				 
		  
				rs.close();
				st.close(); 
				conn.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	
	return list;
	}




public List<Searchweb> getSearchweb(String value) {
	// TODO Auto-generated method stub
	return null;
}


}

	
