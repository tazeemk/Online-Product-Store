package AddProduct;
import Admin.DBConnection;
import java.sql.*;
public class AddDEO 
{
int k=0;
int insert(AddBean ab){
	
	try{
		Connection con=DBConnection.getcon();
		PreparedStatement ps=con.prepareStatement("INSERT INTO PRODUCT VALUES(?,?,?,?)");
	ps.setInt(1, ab.getCode());
	ps.setString(2, ab.getName());
	ps.setFloat(3, ab.getPrice());
	ps.setLong(4, ab.getQty());
	
	k=ps.executeUpdate();	
	}catch (Exception e) 
	{
		e.printStackTrace();
	}
	
	return k;
}
	
}
