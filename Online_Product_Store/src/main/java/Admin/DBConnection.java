package Admin;
import java.sql.*;
import java.sql.Connection;
public class DBConnection 
{
	private DBConnection() {}
	public static Connection con=null;
	
	static {
	
		
		try {
			Class.forName(DBInfo.driver);
 con =DriverManager.getConnection(DBInfo.DBUrl,DBInfo.uname,DBInfo.password);
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	public static Connection getcon() {
		
		return con;
	}
	
}
