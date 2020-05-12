package DButil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DButil {
	
	private final static String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private final static String DATABASE_URL="jdbc:mysql://localhost:3306/books?serverTimezone=UTC&characterEncoding=UTF-8";
	private static final String DATABASE_USER ="root";
	private static final String DATABASE_PASS="root";
	
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName(DRIVER_CLASS);
			conn=DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASS);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn) {
		try {
			if(conn!=null && (!conn.isClosed())) {
				conn.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeResultSet(ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
				rs=null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeStatement(PreparedStatement ps) {
		try {
			if(ps!=null) {
				ps.close();
				ps=null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
