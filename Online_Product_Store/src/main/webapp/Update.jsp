<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="AddProduct.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//AddBean ab=(AddBean)session.getAttribute("abean");
	String msg=(String)request.getAttribute("msg");
	out.println(msg);

%>
<a href="AddProduct.html">Add Product</a>
<a href="ViewProduct">View Product</a>
<a href="logout">Logout</a>
</body>
</html>