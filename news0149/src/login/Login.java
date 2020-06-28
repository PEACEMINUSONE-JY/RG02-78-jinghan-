package login;

import javax.servlet.http.HttpServletRequest;


import java.sql.*;



import common.DButil;

public class Login {
	public  String username;
	public String password;
	public int type=0;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public  String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int verification(HttpServletRequest request) {
		int type=2;
		String username=request.getParameter("username");
		String password=request.getParameter("password");	
		Connection conn=DButil.getConnection();
		Statement st=null;
		ResultSet rs=null;	
		String sql="select type from tab_userinfo where username='"+username+"'and password='"+password+"';";
		System.out.println(sql);
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()) {	
				type=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return type;			
	}
}
