package user;

import java.sql.*;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import common.*;
import news.*;

public class userManager {
	int addRegsiter(User reg) throws SQLException {
		int i = 0;
		Connection conn = DButil.getConnection();
		String sql = "insert into tab_userinfo(username,password,sex,favorite,profession,note)values('";
		sql += reg.getUsername() + "','" + reg.getPassword() + "','" + reg.getSex() + "','" + reg.getFavorite() + "','"
				+ reg.getProfession() + "','" + reg.getNote() + "');";
		try {
			//String sql="delete from tab_userinfo where username='"+username+"'";
			Statement st = conn.createStatement();
			i = st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			conn.close();
		}
		return i;
	}

	public int delete(User reg){
		int i = 0;
		Connection conn = DButil.getConnection();
		String sql="delete from tab_userinfo where username='"+reg.getUsername()+"'";
		try {
			Statement st = conn.createStatement();
			i = st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}
	
	public User query(String username) {		
		User user=null;
		int i=0;
		User u = null;
		Connection conn = DButil.getConnection();
		Statement st = null;
		ResultSet rs = null;
		String sql ="select * from tab_userinfo where username='"+username+"'";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				u = new User();	
				i++;
				u.setUsername(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setSex(rs.getString(3));
				u.setProfession(rs.getString(4));
				u.setFavorite(rs.getString(5));
				u.setNote(rs.getString(6));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DButil.close(conn, st);
		}
		return user;
	}
	
	public int query(HttpServletRequest request) {
		int i=0;
		//运用模板类ArrayList存放数据
		ArrayList<User> list=new ArrayList<User>();
		String query_criteria="";
		String queryType=request.getParameter("queryType");
		if(queryType==null)queryType="1";		
		String sql="select * from tab_userinfo where 1=1";
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String sex=request.getParameter("xb");
		String profession=request.getParameter("zy");
		String favorite=request.getParameter("ah");
		String note=request.getParameter("grsm");
		if(queryType.equals("1")) {
			if(username!=""&&username!=null) {
				query_criteria+=" and username like '%"+username+"%'";
			}
			if(password!=""&&password!=null) {
				query_criteria+=" and password = '"+password+"';";
			}
			request.getSession().setAttribute("QUERY_CRITERIA", query_criteria);
		}
		else {
			query_criteria=request.getSession().getAttribute("QUERY_CRITERIA").toString();
		}
		sql+=query_criteria;		
		Connection conn=DButil.getConnection();
		Statement st=null;
		ResultSet rs=null;
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			//数据从ResultSet传送给ArrayList
			while(rs.next()) {
				i++;				
				User u=new User();
				u.setUsername(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setSex(rs.getString(3));
				u.setProfession(rs.getString(4));
				u.setFavorite(rs.getString(5));
				u.setNote(rs.getString(6));
				//放数据
				list.add(u);
			}
			//ArrayList放入session对象
			if(i>0) {
				//有数据，存入session
				//request.getSession().setAttribute(Constant.NEWS_LIST,al);
				System.out.println("query:"+list.size());
				request.setAttribute(Constant.NEWS_LIST,list);
			}
			else {
				//无数据，从session清除以前可能存放的数据
				request.getSession().removeAttribute(Constant.NEWS_LIST);
				request.removeAttribute(Constant.NEWS_LIST);
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DButil.close(conn, st);
		}
		return i;
	}
}