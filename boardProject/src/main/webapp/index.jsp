<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<%
	
	String id = (String)session.getAttribute("id");
	if(id==null){
		%>
		<a href="user/login.jsp">로그인</a><br>
		<%
	} else { %>
		<a href="user/logout.action">로그아웃</a><br>
		<%
	}
	%>
	글 작성<br>
	글 목록
</body>
</html>