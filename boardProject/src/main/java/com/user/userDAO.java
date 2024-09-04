package com.user;

import java.sql.*;

import DB.DBconnect;
import lombok.*;

public class userDAO {
	private String createSQL = "";
	private String readSQL ="select * from userinfo";
	private String updateSQL="";
	private String deleteSQL ="";
	
	userVO [] selectUserInfo() throws ClassNotFoundException, SQLException {
		
		DBconnect db = new DBconnect();
		ResultSet rs = db.getConnection().prepareStatement(readSQL).executeQuery();
		userVO[] userArray = new userVO[5];
		while(rs.next()) {
			int i=0;
			userArray[i].setUserID(rs.getString("userID"));
			userArray[i].setUserPW(rs.getString("userPW"));
		}
		return userArray;
		
	}
}
