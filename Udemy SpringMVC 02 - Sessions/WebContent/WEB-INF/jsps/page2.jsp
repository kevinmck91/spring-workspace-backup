<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>Hello World from Page2.jsp in project 02</p>

<p>The Request Variables are added to the session via the controller : </p>

<pre>
ModelAndView mv = new ModelAndView("index");
Map<String, Object> model = mv.getModel();
model.put("sessionName", "sessionObjectFromMap");
</pre>

<%= request.getAttribute("sessionName2") %>

<hr>

<p>We can also access the session variable using Expressions Language ( Not really recommended) : ${sessionName2} </p>

</body>
</html>