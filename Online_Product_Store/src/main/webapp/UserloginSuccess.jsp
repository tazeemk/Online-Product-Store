<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="NewUser.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub=(UserBean)session.getAttribute("ubean");
String msg=(String)request.getAttribute("msg");
out.println("Page Belongs to :"+ub.getName()+"<Br>");
out.println(msg);
%>
<a href="UserViewProduct.html">View Products</a>
</body>
</html>