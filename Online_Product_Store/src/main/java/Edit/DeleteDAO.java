package Edit;
import AddProduct.*;
import Admin.*;
import java.sql.*;
public class DeleteDAO 
{
int k=0;
public int delete(AddBean ab) 
{
   try {
	Connection con=DBConnection.getcon();
	PreparedStatement ps =con.prepareStatement("DELETE FROM PRODUCT WHERE CODE=?");
	ps.setInt(1, ab.getCode());
    k=ps.executeUpdate();
   }catch(Exception e) {
	   e.printStackTrace();
	   
   }
   return k;
}
}
