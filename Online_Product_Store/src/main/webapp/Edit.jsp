<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="AddProduct.*,Admin.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean a = (AdminBean)session.getAttribute("abean");
AddBean ab = (AddBean)request.getAttribute("abean");
out.println("Page Belongs to :"+a.getFname());

%>
 <form action="update" method="post">
 <input type="hidden" name="pcode" value=<%= ab.getCode()%>><br>
PrdouctPrice :<input type="text" name="price" value=<%=ab.getPrice() %>><br>
ProductName :<input type ="text" name="qty" value=<%=ab.getQty() %> > <br>
<input type="submit" value="UpdateProduct">
 </form>
</body>
</html>