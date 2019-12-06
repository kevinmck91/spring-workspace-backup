<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

This is the Index Page.

<br/><br/>

Working Links :
<pre>
	<br><a href="page1/">page1/</a> 
	<br><a href="page2/">page2/</a>
	<br><a href="page3/">page3/</a>
	<br><a href="page4/">page3/</a>
</pre>

<br/><br/>

Non - Working Links :

<pre>	
	<br><a href="//page2">//page2</a>
	<br><a href="/page2">/page2</a>
	<br><a href="page2">page2</a>
	<br><a href="//page2/">//page2/</a>
	<br><a href="/page2/">/page2/</a>
</pre>


</body>
</html>