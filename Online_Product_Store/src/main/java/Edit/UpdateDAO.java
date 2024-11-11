package Edit;
import java.sql.*;
import AddProduct.*;
import Admin.*;

public class UpdateDAO 
{

	int k=0;
	
	public int update(AddBean ab){
		try {
			Connection con =DBConnection.getcon();
			PreparedStatement ps =con.prepareStatement("UPDATE PRODUCT SET PRICE=?,QTY=? WHERE CODE=?");
			ps.setFloat(1, ab.getPrice());
			ps.setLong(2, ab.getQty());
			ps.setInt(3, ab.getCode());
			k=ps.executeUpdate();
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		return k;
	}
}
