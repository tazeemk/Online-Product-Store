package Admin;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
@WebServlet("/admin")
public class AdminServlet extends HttpServlet
{

	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	  String uN =req.getParameter("uname");
	  String pW=req.getParameter("pword");
	  AdminBean ab = new AdminDao().user(uN, pW);
	  
	  if(ab==null)
	  {
		  
		  req.setAttribute("msg", "Login Denied :");
		  req.getRequestDispatcher("Msg.jsp").forward(req, res);
		  
	  }else {
		  
		  HttpSession hs = req.getSession();
		  hs.setAttribute("abean", ab);
		  req.setAttribute("msg", "Loging Successfully .... ");

		  req.getRequestDispatcher("logSucess.jsp").forward(req, res);
	  }
	  
	}
	
}
