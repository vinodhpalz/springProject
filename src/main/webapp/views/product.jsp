<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${HeaderName}</h1>
<h1>Add Products Page</h1>

<form action="/ECartSpring/productSuccess" method="post">
<table>
<tr><td>Product Name:</td></tr>
<tr><td><input type="text" name="pName"/></td></tr>

<tr><td>Product Cost:</td></tr>
<tr><td><input type="text" name="pCost"/></td></tr>

<tr><td><input type="submit" Value="Submit Data"/></td></tr>

</table>
</form>
</body>
</html>