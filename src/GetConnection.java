
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GetConnection {
	
	
	public static Connection getConnection() throws ClassNotFoundException {
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		
		try{
			
			Class.forName("jdbc:mysql://localhost:3306/");
			System.out.println("Driver Loaded Successfully.");
			Connection con =DriverManager.getConnection(url,"root","anirudha");
			
			System.out.println("Connection got Established ");
			
			return con;
		}
		catch(SQLException e) {
			System.out.println("Connection not Established .");
		}
		return null;
	}
}

	
