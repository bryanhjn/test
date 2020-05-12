package edu.chengXian.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DButil.DButil;
import edu.chengXian.bean.bookorder;

public class bookorderDao {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static final bookorderDao me=new bookorderDao();
	
	public boolean addOrder(bookorder order) {
		try {
			conn=DButil.getConnection();
			ps=conn.prepareStatement("insert into bookorder(username,zipcode,phone,creditcard,total) value(?,?,?,?,?)");
			ps.setString(1, order.getUsername());
			ps.setString(2, order.getZipcode());
			ps.setString(3, order.getPhone());
			ps.setString(4, order.getCreditcard());
			ps.setDouble(5, order.getTotal());
			if(!ps.execute()) {
				return true;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeConnection(conn);
			DButil.closeResultSet(rs);
			DButil.closeStatement(ps);
		}
		return false;
	}
}
