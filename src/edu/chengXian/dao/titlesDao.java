package edu.chengXian.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DButil.DButil;
import edu.chengXian.bean.titles;

public class titlesDao {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static final titlesDao me=new titlesDao();
	
	public List<titles> getTitles(){
		List<titles> titles=new ArrayList<titles>();
		String sql="select * from titles";
		
		try {
			conn=DButil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			titles t=null;
			while(rs.next()) {
				t=new titles(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getString(8));
				titles.add(t);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeConnection(conn);
			DButil.closeResultSet(rs);
			DButil.closeStatement(ps);
		}
		return titles;
	}
	
	public titles getTitle(String ISBN) {
		try {
			conn=DButil.getConnection();
			ps=conn.prepareStatement("select * from titles where isbn=?");
			ps.setString(1, ISBN);
			rs=ps.executeQuery();
			if(rs.next()) {
				titles t=new titles(rs.getString("isbn"), rs.getString("title"), rs.getInt("editionNumber"), rs.getString("copyright"), rs.getInt("publisherID"), rs.getString("imageFile"), rs.getDouble("price"), rs.getString("summary"));
				return t;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeConnection(conn);
			DButil.closeResultSet(rs);
			DButil.closeStatement(ps);
		}
		return null;
	}
	
	
	public boolean deleteTitle(String ISBN) {
		try {
			conn=DButil.getConnection();
			ps=conn.prepareStatement("delete from titles where isbn=?");
			ps.setString(1, ISBN);
			if(!ps.execute()) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeConnection(conn);
			DButil.closeStatement(ps);
		}
		return false;
	}
	
	public boolean modifyTitle(titles t) {
		try {
			conn=DButil.getConnection();
			ps=conn.prepareStatement("update titles set title=?,editionNumber=?,copyright=?,publisherID=?,imageFile=?,price=? where isbn=?");
			ps.setString(1, t.getTitle());
			ps.setInt(2, t.getEditionNumber());
			ps.setString(3, t.getCopyright());
			ps.setInt(4, t.getPublisherId());
			ps.setString(5, t.getImageFile());
			ps.setDouble(6, t.getPrice());
			ps.setString(7, t.getIsbn());
			if(ps.executeUpdate()>0) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeConnection(conn);
			DButil.closeStatement(ps);
		}
		return false;
	}
	
	public boolean addTitle(titles t) {
		try {
			conn=DButil.getConnection();
			ps=conn.prepareStatement("insert into titles(isbn,title,editionNumber,copyright,publisherID,imageFile,price) values (?,?,?,?,?,?,?)");
			ps.setString(1, t.getIsbn());
			ps.setString(2, t.getTitle());
			ps.setInt(3, t.getEditionNumber());
			ps.setString(4, t.getCopyright());
			ps.setInt(5, t.getPublisherId());
			ps.setString(6, t.getImageFile());
			ps.setDouble(7, t.getPrice());
			if(!ps.execute()) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DButil.closeConnection(conn);
			DButil.closeStatement(ps);
		}
		return false;
	}
}
