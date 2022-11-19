<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!-- //using JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Info</title>
</head>
<body>


<!-- used when we use @RequestParam in controller -->
<%-- User Info :</br>

${formData.name}</br>
${formData.email}</br>
${formData.password}</br>
 --%>
 
 <!-- used when we use @ModelAttribute in controller -->
User Info :</br>

${user.name}</br>
${user.email}</br>
${user.password}</br>
 
<h1 style="color: green;">${saveUser}</h1>
</body>
</html>