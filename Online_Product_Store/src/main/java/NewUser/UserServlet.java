package NewUser;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;
import Admin.*;
@SuppressWarnings("serial")
@WebServlet("/new")
public class UserServlet extends HttpServlet
{
  protected void doPost(HttpServletRequest req,HttpServletResponse res )throws ServletException,IOException
  {
	    UserBean ub = new UserBean();
	  	ub.setPhno(Long.parseLong(req.getParameter("phno")));
	  	ub.setName(req.getParameter("name"));
	  	ub.setCity(req.getParameter("cty"));
	  	ub.setMid(req.getParameter("mid"));
	  
	  	int k=new UserDAO().insert(ub);
	  	if(k>0){
	  		req.setAttribute("msg", "Registration Successfully ...");
	  		req.getRequestDispatcher("NewUserSuccess.jsp").forward(req, res);
	  		
	  	}else {
	  		
	  		req.setAttribute("fail", "Some problem in userservlet");
	  	}
	  	
  }
}
