<%@page import="userbean.userbean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%    userbean user=(userbean)session.getAttribute("usersession"); %>

<h1>UserDetails</h1>
<h3><%=user.getUsername() %></h3>
<h3><%=user.getPassword() %></h3>
<h3><%=user.getEmail() %></h3>
<h3><%=user.getId() %></h3>
<a href="profile1.jsp">CLICK HERE</a>
</body>
</html>