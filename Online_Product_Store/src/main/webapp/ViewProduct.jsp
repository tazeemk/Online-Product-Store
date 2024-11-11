<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="Admin.*,java.util.*,AddProduct.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
ArrayList<AddBean> al=(ArrayList<AddBean>)session.getAttribute("alist");
out.println("Page Belongs to :"+ab.getFname()+"<br>");
if(al.size()==0){
	
	out.println("Product not Avaliable :");
}else{
	Iterator<AddBean>i=al.iterator();
	while(i.hasNext())
	{
	AddBean a = (AddBean)i.next();
	out.println(a.getCode()+"&nbsp &nbsp"+a.getName()+"&nbsp &nbsp"+a.getPrice()+"&nbsp &nbsp "+a.getQty()+
			"&nbsp&nbsp"+"<a href='edit?pcode="+a.getCode()+"'>Edit</a>"+"&nbsp&nbsp"+"<a href='delete?pcode="+a.getCode()+"'>Delete</a>"+"<br>");
		
	}
}
%>
<a href="AddProduct.html">Add Product</a>
<a href="logout">Logout</a>
</body>
</html>