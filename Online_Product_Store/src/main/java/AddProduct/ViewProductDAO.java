package AddProduct;
import java.sql.*;
import java.util.ArrayList;
import Admin.*;
public class ViewProductDAO 
{

	ArrayList<AddBean>al = new ArrayList<AddBean>();
	
	public ArrayList<AddBean> retrieve(){
		
		try {
			Connection con =DBConnection.getcon();
			PreparedStatement ps =con.prepareStatement("SELECT * FROM PRODUCT");
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				AddBean ab= new AddBean();
				ab.setCode(rs.getInt(1));
				ab.setName(rs.getString(2));
				ab.setPrice(rs.getFloat(3));
				ab.setQty(rs.getLong(4));
				al.add(ab);
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		return al;
	}
	
}
