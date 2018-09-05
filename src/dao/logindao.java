package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import userbean.userbean;

public class logindao {

	public static void login(userbean user) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "reddy", "reddy");
			PreparedStatement pstmt=conn.prepareStatement("select * from usertable where name=? and password=? ");
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			ResultSet rs=pstmt.executeQuery();
			boolean req=rs.next();
			if(req) {
				user.setValid(true);
				user.setUsername(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setId(rs.getInt("id"));
			}else {
				user.setValid(false);
			}
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
