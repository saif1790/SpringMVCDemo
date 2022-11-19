<%@page import="java.time.LocalDateTime"%>
<%@page import="springmvc.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!-- //using JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

	<%
	/* 	User userInfo = (User) request.getAttribute("user");
		LocalDateTime dateTime = (LocalDateTime) request.getAttribute("dateTime"); */
	%>

	<%-- User Details :<%=dateTime%>
	<br> Name :<%=userInfo.getName()%><br> Designation :<%=userInfo.getDesignation()%><br>
	Salary :<%=userInfo.getSalary()%><br> --%>

	<!-- //getting above data ny using jsp expression language -->

	User Details :${dateTime}
	<br> Name : ${user.name}
	<br> Designation : ${user.designation}
	<br> Salary : ${user.salary}
	</br> User's Mobile : ${mobile}
	</br>
	<!-- used JSTL tag for iterating one by one item-->
	 <c:forEach var="item" items="${mobile}">
 
       <h1>   <c:out value="${item }"></c:out></h1>
              </br>
 </c:forEach>


</body>
</html>