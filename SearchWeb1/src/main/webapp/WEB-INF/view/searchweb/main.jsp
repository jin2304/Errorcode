<%@ page import = "com.searchweb.entity.Searchweb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
  
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>SearchWeb</title>
	
	<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Song+Myung&display=swap" rel="stylesheet">
	
	
	<script src="https://kit.fontawesome.com/85b6f09ce1.js" crossorigin="anonymous"></script>
	<script src="https://php-texab.run.goorm.io/project/main.js" defer></script>	
	
	
	<link rel="apple-touch-icon" sizes="180x180" href="images/favicon/apple-touch-icon.png">
	<link rel="icon" type="image/png" sizes="32x32" href="images/favicon/favicon-32x32.png">
	<link rel="icon" type="image/png" sizes="16x16" href="images/favicon/favicon-16x16.png">
	<link rel="manifest" href="images/favicon/site.webmanifest">
	<link rel="mask-icon" href="images/favicon/safari-pinned-tab.svg" color="#5bbad5">
	<meta name="msapplication-TileColor" content="#da532c">
	<meta name="theme-color" content="#ffffff">
	
	
	
	<link href=" ${pageContext.request.contextPath}/css/layout.css"  type="text/css" rel="stylesheet" />
	<link rel="icon" type="image/png" href="#"> 
	
</head>
	
	
<body>
  
<nav class="navbar">
	
	<div class = "navbar_logo">
		
		<a href="http://localhost:8080/SearchWeb1/main">
		  <img src="https://cdn-icons-png.flaticon.com/512/2807/2807256.png" class="search_logo" alt="search.image"  title="search.image" > 
		 SearchWeb
		</a>
		
	</div>
	
	<!-- <ul class="navbar_menu">
		
			<li><a href="">로그인11</a></li>
			<li><a href="">게시판 </a></li>
			<li><a href="">설정 </a></li>
			<li><a href="">My project</a></li>
		
	</ul> 
	
	
	<a href="#" class="navbar_toogleBtn">
		<i class="fas fa-bars"></i>
	</a>
	-->
	
</nav>	
	


<div class="side">
		
		<input type="checkbox" id="menuicon">
		<label for="menuicon"><img src="images/menu.png">
		 <div class="menu"><b>menu</b></div>
		</label>
		<div class = "sidebar">			
				
			<a href="http://localhost:8080/SearchWeb1/main""><div class="menu1"><h2>HOME</h2></div></a>
			<a href="detail?value=Best"><div class="menu2"><h2>Best</h2></div></a>
			<a href="detail?value=Design"><div class="menu3"><h2>Design</h2></div></a>
			<a href="detail?value=Icon"><div class="menu4"><h2>ICON</h2></div></a>
			<a href="detail?value=PPT"><div class="menu5"><h2> PPT/Fonts</h2></div></a>
			<a href="detail?value=Streaming"><div class="menu6"><h2>Streaming</h2></div></a>		
			<a href="detail?value=Shopping"><div class="menu7"><h2>Shopping</h2></div></a>
			
		
		</div>
		
	</div>		
	




	
<div class="mainwrap"> 


	
	<!-- <video src="img/bg.mp4" loop autoplay muted>
		해당파일은 지원되지않습니다.
	</video>  -->
	
<div class="titlewrap">
	
	 <div class="title"><a href="http://localhost:8080/SearchWeb1/main">SearchWeb</a></div>

	<%-- <select name="f">
	<option ${(param.f == "title")?"selected":"" } value="title"></option>
	<option ${(param.f == "writer_Id")?"selected":"" } value="writer_Id"></option>
	</select> --%> 

	  <form action="main" id="siq_searchForm"> 
       <div class="searchbar" > 
       
	     <input type="text" spellcheck="false" autocomplete="off"  name="q"  value="${param.q}" class="searchbar" placeholder=""/>
		 <img src="images/search.png">
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
	
	
	
	
	<!-- <div class="btn_group">
	
		<a href="http://localhost:8080/SearchWeb/main"><button class="btn1">홈</button></a>
		<a href="http://localhost:8080/SearchWeb/detail?value=DESIGN"><button class="btn2">디자인</button></a>	
		<a href="http://localhost:8080/SearchWeb/detail?value=ICON"><button class="btn3">아이콘</button></a>
		<a href="http://localhost:8080/SearchWeb/detail?value=STREAMING"><button class="btn4">스트리밍</button></a>
		<a href=""><button class="btn5">SNS</button></a>	
		<a href=""><button class="btn6">PPT</button></a>	 
		
		<a href=""><button class="btn7">폰트</button></a>	
		<a href=""><button class="btn8">게임</button></a>
		<a href=""><button class="btn9">패션</button></a>			
			
		<button class="btn7">버튼5</button>
		<button class="btn6">버튼6</button>
 	
		<!-- <button class="btn_c">Category</button>
		<button class="btn_p" value="+"  >+</button> 
		
	</div> -->
	
	
	
		<div class="wrap">
			
		
		  <c:forEach var="s" items = "${list}" varStatus="st"> 
		 
		   <%-- <c:if test="${param.value == s.value}"> 	 </c:if>   --%> 		     
		      <a href="${s.weburl}" class="wrapitems" target="_blank">
		    
			   <img src="https://www.google.com/s2/favicons?sz=48&domain_url=${s.weburl}" alt=""  title="">
			    <h2>${s.name}</h2>
			    <div class="desc">
			     <h2>${s.content}</h2>
			    </div>
			   
		      </a>
		 
	
		   
		  </c:forEach> 
		
		
		
		</div>
		
		
		<%--  <div class="page_list"> 
		  
		  	<c:set var="page" value="${(param.p == null)?1:param.p}"/>
		  	<c:set var="startNum" value="${page-(page-1)%5}"/>
		  	<c:set var="lastNum" value="23"/>
		  	
		  
		    <ul>
		    <c:if test="${startNum>1}">
		    	<a href="?p=${startNum-1}&t=&q=" class="btn_btn-prev">◀</a>
		     </c:if>
		    <c:if test="${startNum<=1}">
		    	<span class ="btn_btn-prev" onclick="alert('이전 페이지가 없습니다.');">◀</span>
		    </c:if>
		    
		    
		   	  <c:forEach var="i" begin="0" end="4">
		      <a class="" href="?p=${startNum+i}&t=&q"><li>${startNum+i}</li></a>
		      </c:forEach>
		      
		      
		    <c:if test="${startNum+5<lastNum}">
		    	<a href="?p=${startNum+5}&t=&q=" class="btn_btn-prev">▶</a> 
		    </c:if>
		    <c:if test="${startNum+5>=lastNum}">
		    	<span class ="btn_btn-prev" onclick="alert('다음 페이지가 없습니다.');">▶</span>
		    </c:if>	
		    </ul>
		   
		 </div> --%>
		
		

	
</div>			
	
	
<footer>
	
 <div class="footerwrap">
		
	    <div class = "footer_logo">
			
			<a href="https://php-texab.run.goorm.io/project/search.html">
			  <img src="https://cdn-icons-png.flaticon.com/512/2807/2807256.png" class="search_logo" alt="search.image"  title="search.image" > 
			 SearchWeb
			</a>
	
			
			
		  <div class="email">
			 <!-- <h3>Email: search2304@naver.com</h3> -->			  
		     <h3></h3>
		  </div>
			
		 
			
      </div>
	 
	
	 
	 
</div>
	
	
</footer>	
	
	
	
	
	
	
	
	
	
	
	
</body>
	

</html>
   

  
   