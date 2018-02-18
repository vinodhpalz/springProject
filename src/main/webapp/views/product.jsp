<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${HeaderName}</h1>
<form:errors path="product1.*"/>
<h1>Add Products Page</h1>

<form action="/ECartSpring/productSuccess" method="post">
<table>
<tr><td>Product Name:</td></tr>
<tr><td><input type="text" name="pName"/></td></tr>

<tr><td>Product Cost:</td></tr>
<tr><td><input type="text" name="pCost"/></td></tr>

<tr><td>Product Description:</td></tr>
<tr><td><input type="text" name="pDesc"/></td></tr>

<tr><td>Product DateOfMan:</td></tr>
<tr><td><input type="text" name="pDOM"/></td></tr>

<tr><td>Product List:</td></tr>
<tr><td><select name="pList" multiple>
<option value="Apple">Apple</option>
<option value="Orange">Orange</option>
<option value="Mango">Mango</option>
</select></td></tr>
</table>

<table>

<tr><td>Supplier Id:</td>
<td><input type="text" name="supplier.sId"/></td></tr>

<tr><td>Supplier Name:</td>
<td><input type="text" name="supplier.sName"/></td></tr>

<tr><td>Supplier Country:</td>
<td><input type="text" name="supplier.sCountry"/></td></tr>

<tr><td><input type="submit" Value="Submit Data"/></td></tr>
</table>

</form>
</body>
</html>