package AddProduct;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.ArrayList;
@WebServlet("/View")
public class ViewProductsServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	HttpSession hs=req.getSession(false);
	if(hs==null){
		req.setAttribute("msg", "Session Expired :");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
		
	}else{
		
		ArrayList<AddBean>al=new ViewProductDAO().retrieve();
           hs.setAttribute("alist", al);
           req.getRequestDispatcher("ViewProduct.jsp").forward(req, res);
	}
}
}
