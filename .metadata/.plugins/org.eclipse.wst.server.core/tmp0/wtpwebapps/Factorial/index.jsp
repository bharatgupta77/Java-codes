<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Business_Layer" method="post">
	<input type="number" name="num">
	<input type="submit">
	
</form>


<%
Integer k= (Integer)request.getAttribute("result");
out.println(k);

%>

</body>
</html>