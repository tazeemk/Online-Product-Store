<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="Admin.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin DashBoard</title>
<style>
.f1{
margin:100px auto;
width:500px;
height:300px;
font-family: cursive;
font-size: large;
border-radius: 8px;
box-shadow: 6px 6px 12px 6px aqua;
  }
  .f1 a{
  margin:20px 30px;
  text-decoration: none;
  text-transform: capitalize;
  text-shadow: auto;
  color: #1a73e8; /* Link color */
   font-family: Arial, sans-serif; /* Font style */
   font-size: 16px; /* Font size */         
  padding: 5px; /* Space around text */
   border-radius: 4px; 
  }
</style>
</head>
<body>
<fieldset class="f1">
<legend>Welcome </legend>
<%
AdminBean ab =(AdminBean)session.getAttribute("abean");
String msg=(String)request.getAttribute("msg");
out.println("<br>");
out.println("&nbsp &nbsp Welcome Admin  :"+ab.getFname()+"<br>");
out.println("&nbsp &nbsp "+msg+"<br>");
%>
<br><br><br><br><a href="AddProduct.html">Add Product</a>
<a href="View">View All Product</a>
<a href="logout">LogOut</a>
</fieldset>
</body>
</html>