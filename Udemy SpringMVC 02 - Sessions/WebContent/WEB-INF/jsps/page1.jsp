<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Hello World from Page1.jsp in project 02</p>

<p>The sessions variable is set in the Controller method : </p>

<pre>session.setAttribute("sessionName", "This is a session Attribute");</pre> 


<%= session.getAttribute("sessionName1") %>

</body>
</html>