<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

String value = request.getParameter("value");

String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
String sql = "SELECT * FROM MAIN WHERE VALUE=?";


Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection(url, "newlec","SS04912304!!");
PreparedStatement st = con.prepareStatement(sql);

st.setString(1,value);

ResultSet rs = st.executeQuery();

rs.next();

%>   
  
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>SearchWeb!</title>
	
	
	<script src="https://kit.fontawesome.com/85b6f09ce1.js" crossorigin="anonymous"></script>
	<script src="https://php-texab.run.goorm.io/project/main.js" defer></script>	
	
	
	
	<link href=" ${pageContext.request.contextPath}/css/main1.css"  type="text/css" rel="stylesheet" />
	<link rel="icon" type="image/png" href="#"> 
	
	<link rel="shortcut icon" href="img/favicon">
	<link rel="apple-touch-icon" sizes="180x180" href="img/favicon/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32" href="img/favicon/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16" href="img/favicon/favicon-16x16.png">
<link rel="manifest" href="img/favicon/site.webmanifest">
<meta name="msapplication-TileColor" content="#da532c">
<meta name="theme-color" content="#ffffff">
	
</head>
	
	
<body>
  
<nav class="navbar">
	
	<div class = "navbar_logo">
		
		<a href="https://php-texab.run.goorm.io/project/search.html">
		  <img src="https://cdn-icons-png.flaticon.com/512/2807/2807256.png" class="search_logo" alt="search.image"  title="search.image" > 
		 SearchWeb
		</a>
		
	</div>

	
	
	<ul class="navbar_menu">
		
			<li><a href="">로그인</a></li>
			<li><a href="">게시판 </a></li>
			<li><a href="">설정 </a></li>
			<li><a href="">My project</a></li>
		
	</ul>
	
	
	<a href="#" class="navbar_toogleBtn">
		<i class="fas fa-bars"></i>
	</a>
	
	
</nav>	
	
	

		
	
	
<div class="mainwrap"> 


	
	<!-- <video src="img/bg.mp4" loop autoplay muted>
		해당파일은 지원되지않습니다.
	</video>  -->
	
<div class="test">
	
	 <div class="title">Design</div>



	  <form id="siq_searchForm"> 
       <div class="searchbar">
	     <input type="text"  name="q"  value="" class="searchbar" placeholder=""/>

	   </div>
      </form>
	
	</div>	

              <!--   <section id="search-form">
                        <form action="/course">
                            <fieldset>
                                <input type="text" name="q" value="" />
                                <input type="submit" value="검색" />
                            </fieldset>
                        </form>
                  </section> -->
	
	
	
	
	<div class="btn_group">
	
		<button class="btn1"><a href="http://localhost:8080/SearchWeb/searchweb/Search.jsp?value=home">홈</a></button>
		<button class="btn2"><a href="http://localhost:8080/SearchWeb/searchweb/Search.jsp?value=design">디자인</a></button>	
		<button class="btn3">SNS</button>
		<button class="btn4">스트리밍</button>	
		<button class="btn5">PPT</button>
		<button class="btn6">아이콘</button>	
		<button class="btn7">통계</button>
		<button class="btn8">폰트</button>
		<button class="btn9">게임</button>	
		<!-- <button class="btn7">버튼5</button>
		<button class="btn6">버튼6</button>
 	
		<!-- <button class="btn_c">Category</button>
		<button class="btn_p" value="+"  >+</button>  -->
		
	</div>
	
	
	
	
		<div class="wrap">
			
		<% while(rs.next()){ %>	
			  
		<a href="<%= rs.getString("URL")%>" class="wrapitems" target="_blank">
			<img src="https://www.google.com/s2/favicons?sz=48&domain_url=<%= rs.getString("URL")%>" alt=""  title="">
			 <h2><%= rs.getString("NAME") %></h2> 
			
		</a>

		<% } %>
		
		
		
		
		
		
		
		
		<a href="https://www.remove.bg/ko" class="wrapitems" target="_blank">
			<img src="https://www.google.com/s2/favicons?sz=48&domain_url=https://www.remove.bg/">
			<h2>removebg</h2>
		</a>


		
		
		
		
		
</div>
	
	
	
	
	
</div>			
	
	

<footer></footer>	
	
	
	
	
	
	
	
	
	
	
	
</body>
	

</html>
   
<%
rs.close();
st.close(); 
con.close();

%>   
  
   