import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	
	HttpSession hs=req.getSession(false);
	if(hs==null) {
		
		req.setAttribute("msg", "Session Expired ::");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
	}else {
		hs.invalidate();
		req.setAttribute("msg", "Logout Successfully ...");
		req.getRequestDispatcher("logout.jsp").forward(req, res);
	}
	
}
	
}
