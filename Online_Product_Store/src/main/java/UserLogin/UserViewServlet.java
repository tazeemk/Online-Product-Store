package UserLogin;
import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet("/UserViewProduct")
public class UserViewServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
			HttpSession hs= req.getSession(false);
	if(hs==null){
		req.setAttribute("msg", "Session Expired :");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
	}else {
		req.getRequestDispatcher("ViewProduct.jsp").forward(req, res);
		
	}
	
}
}
