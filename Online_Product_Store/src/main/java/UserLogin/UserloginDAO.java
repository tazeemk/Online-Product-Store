package UserLogin;
import Admin.*;
import java.sql.*;
import NewUser.*;
public class UserloginDAO 
{
UserBean ub=null;
	public UserBean login(String nM,long Mn) {
		
		try {
			Connection con =DBConnection.getcon();
			PreparedStatement ps= con.prepareStatement("SELECT * FROM CUSTOMER WHERE PHNO=? AND NAME=?");
			ps.setLong(1, Mn);
			ps.setString(2, nM);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ub=new UserBean();
				ub.setPhno(rs.getLong(1));
				ub.setName(rs.getString(2));
				ub.setCity(rs.getString(3));
				ub.setMid(rs.getString(4));
				
				
			}
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		return ub;
		
	}
	
}
