<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Calculate1" method="post">
	<input type="number" name="num1">
	<input type="number" name="num2"><br>
	
	<button type="submit" name="btn" value="+">Add</button>
	<button type="submit" name="btn" value="-">Substract</button>
	<button type="submit" name="btn" value="*">Multiplication</button>
	<button type="submit" name="btn" value="/">Division</button>
	
	
	
</form>


<%
Integer k= (Integer)request.getAttribute("result");
out.println(k);

%>

</body>
</html>