package Edit;
import java.io.IOException;
import java.util.*;
import  AddProduct.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	HttpSession hs = req.getSession();
	if(hs==null) {
		req.setAttribute("msg", "Session Expired :");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
		
	}else
	{
	ArrayList<AddBean>al=(ArrayList<AddBean>)hs.getAttribute("alist");
	int pcode =Integer.parseInt(req.getParameter("pcode"));	
    Iterator<AddBean>it=al.iterator();
    while(it.hasNext()){
    	AddBean ab=(AddBean)it.next();
    	if(pcode==ab.getCode()) 
    	{
    		ab.setCode(Integer.parseInt(req.getParameter("pcode")));
    	int k = new DeleteDAO().delete(ab);	
 if(k>0) {
	 req.setAttribute("msg", "Record  Delete Successuflly >>");
	 req.getRequestDispatcher("Delete.jsp").forward(req, res);
 }
    	
    	}
    	
    }
	
	}
}
}
