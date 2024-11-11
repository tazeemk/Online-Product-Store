package AddProduct;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.*;
import java.net.http.HttpRequest;
@WebServlet("/add")
public class AddServlet extends HttpServlet
{
 protected void doPost(HttpServletRequest req,HttpServletResponse res )throws ServletException,IOException
 {
	 AddBean ab = new AddBean();
	  ab.setCode(Integer.parseInt(req.getParameter("pcode")));
	  ab.setName(req.getParameter("pname"));
	  ab.setPrice(Float.parseFloat(req.getParameter("pprice")));
	  ab.setQty(Long.parseLong(req.getParameter("pqty")));
	  int k=new AddDEO().insert(ab);
	        HttpSession hs= req.getSession(false);
	  if(hs==null)
	  {
		req.setAttribute("msg", "Session Expired :");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
	  }else {
		  
		  if(k>0) {
			  
			  req.setAttribute("msg", "Product Added SuccessFully....");
			  req.getRequestDispatcher("logSucess.jsp").forward(req, res);
			  
			  
		  }
		  
	  }
 }
}
