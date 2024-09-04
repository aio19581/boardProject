package DB;

import java.sql.*;

public class DBconnect {
	
	static String driver = "com.mysql.jdbc.Driver";
	static String jdbcUrl = "jdbc:mysql://localhost:3306/mytest";
	static String dbID = "root";
	static String dbPW = "1111";
	Connection conn=null;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {	

		Class.forName(driver);
		return DriverManager.getConnection(jdbcUrl,dbID,dbPW);
		
	}
	
	public static void closeConnection(Connection connection) {
		if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}
}
