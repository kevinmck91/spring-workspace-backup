<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>Hello World from Page4.jsp in project 02</p>

<p>This page uses the JSTL tag library (Recommended) to access the session object</p>

<br><br><a href="https://www.tutorialspoint.com/jsp/jsp_standard_tag_library.htm" >JSTL Tab Library</a>

<br><br>Output using JSTL : <c:out value="${sessionName4}"></c:out>

<br><br>NOTE : Using JSTL means that the special charactors are not interpreted as HTML in the output

<br><br>TODO : Experiment with different JSTL tags and setting differnt things (object) in the session and accessing them on the JSP Page

</body>
</html>