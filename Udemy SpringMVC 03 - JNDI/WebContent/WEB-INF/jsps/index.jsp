<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<p>Hello World from Index.jspppp</p>
	
		<h2>TestLine1</h2>
	
		<sql:query var="rs" dataSource="jdbc/myoracle">
			select username from all_users
		</sql:query>
	
		<h2>TestLine2</h2>
	
		<c:forEach var="row" items="${rs.rows}">
	    	Foo ${row.username}<br />
		</c:forEach>
		
		<h2>TestLine3</h2>
	
	</body>
</html>