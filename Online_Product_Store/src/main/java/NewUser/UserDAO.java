package NewUser;
import Admin.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class UserDAO 
{
int k=0;
  int insert(UserBean ub){
	  try {
	  Connection con =DBConnection.getcon();
		  PreparedStatement ps = con.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?,?)");
		  ps.setLong(1, ub.getPhno());
		  ps.setString(2, ub.getName());
         ps.setString(3, ub.getCity());
         ps.setString(4, ub.getMid());
         k=ps.executeUpdate();
		  
	  }catch(Exception e) {
		  
		  e.printStackTrace();
	  }
	  return k;
  }
	
}
