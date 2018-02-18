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
<table>
<tr><td><h3>${product1.pName}</h3></td></tr>
<tr><td><h3>${product1.pCost}</h3></td></tr>
<tr><td><h3>${product1.pDesc}</h3></td></tr>
<tr><td><h3>${product1.pDOM}</h3></td></tr>
<tr><td><h3>${product1.pList}</h3></td></tr>
</table>
<tr><td><h4>${product1.supplier.sId}</h4></td></tr>
<tr><td><h4>${product1.supplier.sName}</h4></td></tr>
<tr><td><h4>${product1.supplier.sCountry}</h4></td></tr>

<table>


</table>
</body>
</html>