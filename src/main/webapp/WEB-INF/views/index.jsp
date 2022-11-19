<%@page import="springmvc.entity.User"%>
<html>
<body>
<h2>This is home Page</h2>

<%
           User userInfo =(User) request.getAttribute("user");

%>
User Details :<br>

Name :<%=userInfo.getName() %><br>
Designation :<%=userInfo.getDesignation() %><br>
Salary :<%=userInfo.getSalary() %><br>

</body>
</html>
