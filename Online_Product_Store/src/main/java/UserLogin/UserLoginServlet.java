package UserLogin;
import java.io.IOException;
import NewUser.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet("/login")
public class UserLoginServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	
	String nM=req.getParameter("uname");
	long mN=Long.parseLong(req.getParameter("mnumber"));
	
	UserBean ub=new UserloginDAO().login(nM, mN);
if(ub==null) {
	req.setAttribute("msg", "User Not Founded :");
	req.getRequestDispatcher("Msg.jsp").forward(req, res);
	
	
}else {
	
	HttpSession hs=req.getSession();
	hs.setAttribute("ubean", ub);
	req.setAttribute("msg", "Login Successfully.....");
	req.getRequestDispatcher("UserloginSuccess.jsp").forward(req, res);
	
}


}
	
}
