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

@WebServlet("/detail")
public class SearchwebDetailController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String value = request.getParameter("value");
		String home = request.getParameter("home");
//		 String value = ""; //�⺻�� 
//		 if(value_ != null) 
//		   value = value_;
//		 
		
		/*
		 * SearchWebService service = new SearchWebService(); Searchweb searchweb =
		 * service.getSearchweb(value); request.setAttribute("s",searchweb);
		 */

		SearchWebService service = new SearchWebService();
		List<Searchweb> list = service.getSearchweb(value,home);
		request.setAttribute("list",list);
		
//		service.getSearchweb(value_); request.setAttribute("s",Searchweb);

		
		
		//forward
		request
		.getRequestDispatcher("/detail.jsp")
		.forward(request, response);
		
	}

}