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

	/*
	 * public List<Searchweb> getSearchwebList(){
	 * 
	 * return getSearchwebList("",1); }
	 * 
	 * 
	 * 
	 * public List<Searchweb> getSearchwebList(int page){
	 * 
	 * return getSearchwebList("",""); }
	 */
	
	//�˻��Լ�
	
	
//	public List<Searchweb> getSearchwebListh(String query,int page){
//		
//		List<Searchweb> list = new ArrayList<>();
//		
//		String sql = "SELECT * FROM main WHERE name LIKE ? ORDER BY HIT DESC";
//				
//		// 1, 11, 21, 31 -> an = a1+(n-1)*d -> 1+(page-1)*10
//		//10, 20, 30, 40 -> page*10
//
//
//		try {
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");	
//			Connection conn = DatabaseUtil2.getConnection();
//			PreparedStatement st = conn.prepareStatement(sql);
//
//			st.setString(1,"%"+query+"%");
//		   //st.setString(2,"%"+query+"%");
//		  //st.setInt(3, 1+(page-1)*10);
//		  //st.setInt(4, page*10);
//			ResultSet rs = st.executeQuery();
//			
//
//			 while(rs.next()){ 
//				  int id = rs.getInt("id");
//				  String name = rs.getString("name");
//				  String content = rs.getString("content");
//				  String weburl = rs.getString("weburl");
//				  String value = rs.getString("value");	
//				  String home = rs.getString("home");
//				  int hit = rs.getInt("hit");
//				  Searchweb searchweb = new Searchweb(
//						   id,						  
//						   name,
//						   content,
//						   weburl,
//						   value,
//						   home,
//						   hit
//						  );
//				  
//				  list.add(searchweb);
//			   }
//			 
//				rs.close();
//				st.close(); 
//				conn.close();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//		
//		return list;
//	}
//
//	
	
	
	
	public List<Searchweb> getSearchwebList(String query){
		
		List<Searchweb> list = new ArrayList<>();
		
		
		
		String sql = "SELECT * FROM main WHERE NAME LIKE UPPER(?) OR NAME LIKE LOWER(?) OR NAME2 LIKE ? ";
//		String sql = "SELECT * FROM( SELECT ROWNUM NUM, M.*FROM (SELECT * FROM MAIN WHERE NAME LIKE UPPER(?) OR NAME LIKE LOWER(?) ORDER BY HIT DESC) M) "
//				+ "WHERE NUM BETWEEN ? AND ?";
				
		// 1, 11, 21, 31 -> an = a1+(n-1)*d -> 1+(page-1)*10
		//10, 20, 30, 40 -> page*10
		
//		String url = "jdbc:mysql://localhost:3306/TEST";
//		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			
			Class.forName("org.mariadb.jdbc.Driver");				
			//Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection conn = DatabaseUtil2.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			
//			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1,"%"+query+"%");
			st.setString(2,"%"+query+"%");
			st.setString(3,"%"+query+"%");
			/* st.setString(4,"hit"); */
//			st.setString(1,"%"+query+"%");
//			st.setString(1,"%"+query+"%");
//			st.setString(2,"%"+query+"%");
//			st.setInt(3, 1+(page-1)*10);
//			st.setInt(4, page*10);
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
	
	


	
	
	
	

//detail�Լ�
public List<Searchweb> getSearchweb(String value,String home) {
	
	List<Searchweb> list = new ArrayList<>();
	/* Searchweb searchweb = null; */
	
	
	String sql = "SELECT * FROM main WHERE value=? OR home=? ORDER BY ID"; 
	
			try {
			    Class.forName("org.mariadb.jdbc.Driver");
				//Class.forName("com.mysql.cj.jdbc.Driver");	

				Connection conn = DatabaseUtil2.getConnection();
				PreparedStatement st = conn.prepareStatement(sql);
				
				st.setString(1,value);
				st.setString(2,home);
//				st.setString(1,"%"+query+"%");
//				st.setString(1,"%"+query+"%");
//				st.setString(2,"%"+query+"%");
//				st.setInt(3, 1+(page-1)*10);
//				st.setInt(4, page*10);
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
//	public int getSearchwebCount() {
//		
//		return 0;
//	}
//	
//	
//
//	
//	public int getSearchwebCount(String field, String query){
//		
//		int count = 0;
//		
////String sql = "SELECT * FROM test.main";	
//
//String sql = "SELECT COUNT(ID) COUNT FROM( SELECT ROWNUM NUM, M.*FROM (SELECT * FROM main WHERE "+field+" LIKE ? ORDER BY HIT DESC) M) ";
//		
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");	
//
//			
//			Connection conn = DatabaseUtil2.getConnection();
//			PreparedStatement st = conn.prepareStatement(sql);
//
//			st.setString(1,"%"+query+"%");
//		
//			ResultSet rs = st.executeQuery();
//			
//			count = rs.getInt("count");
//	  
//			rs.close();
//			st.close(); 
//			conn.close();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//		
//		return count;
//	}
//	
//	
	

	
	

	