package com.searchweb.controller;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.searchweb.entity.Searchweb;
import com.searchweb.service.SearchWebService;

@WebServlet("/index")
public class SearchwebListController extends HttpServlet{
	
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
//		String field = request.getParameter("f");
		String query_ = request.getParameter("q");
		
		
		String query = "";  //�⺻��
		if(query_ != null)
			query = query_;
		
		
		SearchWebService service = new SearchWebService();
		List<Searchweb> list = service.getSearchwebList(query);
		//List<Searchweb> list2 = service.getSearch(query,1);
		request.setAttribute("list", list);
		//request.setAttribute("list2", list2);
		
		//forward
		request
		.getRequestDispatcher("/index.jsp")
		.forward(request, response);
		
	}

}