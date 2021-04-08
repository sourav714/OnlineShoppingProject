package Project;
import java.sql.*;
public class ConnectionProvider {
public static Connection getCon() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/think","root","root");
		return cn;
	}
	catch(Exception e) {
		return null;
	}
}
}
