package edu.chengXian.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DButil.DButil;
//¸üÐÂ²âÊÔ
public class userDao {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public boolean login(String uid,String psw) {
		try {
			conn=DButil.getConnection();
			ps=conn.prepareStatement("select * from userinfo where loginname=? and password=?");
			ps.setString(1, uid);
			ps.setString(2, psw);
			rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeConnection(conn);
			DButil.closeStatement(ps);
			DButil.closeResultSet(rs);
		}
		return false;
	}
	
}
