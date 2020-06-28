package common;

import java.sql.*;

public class DButil {
	
	public DButil(){
	}
	public static Connection getConnection() {
		//数据库链接对象
		Connection conn = null;
		String user = "root";
		String password = "RG1702-78-jinghan";
		String url = "jdbc:mysql://121.36.40.243:3306/db_news?serverTimezone=GMT";
		String className = "com.mysql.jdbc.Driver";
		try {
			Class.forName(className);
			conn =DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("链接失败");
			}finally {
				
			}
		return conn;
	}
	
	public static  void close(Connection conn,Statement st,ResultSet rs) {
			try {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if(st !=null ) {
					st.close();
					st = null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static  void close(Connection conn,Statement stmt) {
		try {
			if(stmt!=null ) {
				stmt.close();
				stmt= null;
			}
			if(conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}
