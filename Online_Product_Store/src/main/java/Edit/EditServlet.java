package Edit;
import java.util.*;

import AddProduct.*;
import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs =req.getSession(false);
		
		if(hs==null){
			req.setAttribute("msg", "Session Expired :");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}else{
			ArrayList<AddBean>al= (ArrayList<AddBean>)hs.getAttribute("alist");
			int pcode = Integer.parseInt( req.getParameter("pcode"));
			
			Iterator<AddBean>it = al.iterator();
			while(it.hasNext()) 
			{
				
			AddBean ab = (AddBean)it.next();
			if(pcode==ab.getCode())
			{
				
				req.setAttribute("abean", ab);
				req.getRequestDispatcher("Edit.jsp").forward(req, res);
             break;
			}
				
			}
		}
		
	}
}
