package DB;

import java.sql.*;

public class DBconnect {
	
	String driver = "com.mysql.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost:3306/mytest";
	String dbID = "root";
	String dbPW = "1111";
	Connection conn=null;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {	
		Class.forName(driver);
		return DriverManager.getConnection(jdbcUrl,dbID,dbPW);
	}
	
	public void closeConnection(Connection connection) {
		if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}
}
