package user;

import java.sql.*;

import DB.DBconnect;

public class userDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String USER_INSERT = "";
	private String USER_LIST ="select * from userinfo";
	private String USER_UPDATE="";
	private String USER_DELETE ="";
	private String USER_GET="select * from userinfo where userid = ?";
	
	public userVO getUser(userVO u) {
		userVO user = null;
		try {
			conn = DBconnect.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, u.getUserID());
			rs = stmt.executeQuery();
			while(rs.next()) {
				user = new userVO();
				user.setUserID(rs.getString("userID"));
				user.setUserPW(rs.getString("userPW"));
				user.setUserName(rs.getString("userName"));
				user.setUserEmail(rs.getString("userEmail"));
				user.setBirthDay(rs.getString("birthDay"));
				user.setPhoneNumber(rs.getString("phoneNumber"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBconnect.closeConnection(conn);
		}
		return user;
	}
}
