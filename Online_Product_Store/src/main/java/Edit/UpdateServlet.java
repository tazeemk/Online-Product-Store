package Edit;
import jakarta.servlet.http.*;
import java.util.*;
import java.io.IOException;
import AddProduct.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/update")
public class UpdateServlet extends HttpServlet
{
 protected  void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
 {
	 HttpSession hs=req.getSession();
	 if(hs==null){
		 req.setAttribute("msg", "Session Expired :");
	     req.getRequestDispatcher("Msg.jsp").forward(req, res);
	 }else
	 {
		ArrayList<AddBean>al=(ArrayList<AddBean>)hs.getAttribute("alist"); 
		 int pcode=Integer.parseInt(req.getParameter("pcode"));
		 
		 Iterator<AddBean>it=al.iterator();
		 while(it.hasNext()){
			 
			 AddBean ab =(AddBean)it.next();
			 if(pcode==ab.getCode()){
				 ab.setPrice(Float.parseFloat(req.getParameter("price")));
				 ab.setQty(Long.parseLong(req.getParameter("qty")));
	  int k=new UpdateDAO().update(ab);
	  if(k>0) {
		  req.setAttribute("msg", "Update Suceefully ..");
		  req.getRequestDispatcher("Update.jsp").forward(req, res);
		  
		  
	  }
	  break;
				 
			 }
			 
		 }
		 
	 }
	 
 }
}
