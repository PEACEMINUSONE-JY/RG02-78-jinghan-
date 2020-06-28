package news;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import common.*;
import java.util.*;
public class NewsManager {
	public int add(News news) {
		int i=0;		
		Connection conn=DButil.getConnection();
		Statement st=null;
		String sql="insert into tab_news(title,content,userid)values('";
		sql+=news.getTitle()+"','"+news.getContent()+"','";
		sql+=news.getUsername()+"');";
		try {
			st=conn.createStatement();
			i=st.executeUpdate(sql); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {	
			DButil.close(conn, st);
		}
		return i;		 
	}
	
	
	public int update(HttpServletRequest request) {
		int i=0;		
		String title=request.getParameter("title");
		String newsid=request.getParameter("newsid");
		String content=request.getParameter("content");	
		String userid=request.getSession().getAttribute(Constant.USERNAME).toString();
		Connection conn=DButil.getConnection();					
		Statement st=null;			
		String sql="update tab_news set title='"+title+"',content='"+content+"',userid='"+userid+"'";
		sql+=" where id="+newsid;
			try {	
			st=conn.createStatement();
			i=st.executeUpdate(sql);										
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DButil.close(conn, st);
		}					
		return i;			
	}	
		
	public News query(String newsid) {	
		News news=null;
		int i=0;	
		Connection conn=DButil.getConnection();			
		Statement st=null;
		ResultSet rs=null;			   	  
		String sql="select * from tab_news where id='"+newsid+"'";			
		try {					
			st=conn.createStatement();			
			rs=st.executeQuery(sql);			
			while(rs.next()) {	
			 news=new News();
                i++;                  
         news.setNewsid(rs.getString(1));
         news.setTitle(rs.getString(2));
         news.setContent(rs.getString(3));
         news.setUsername(rs.getString(4));
         news.setPubtime(rs.getString(5));	         
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DButil.close(conn, st);
		}				
		return news;	
	}
	
	
	
	public int delete(String newsid) {
		int i=0;
		Connection conn = DButil.getConnection();
		Statement st=null; 
		try {				
			String sql = "delete from tab_news where id='"+newsid+"'";	
			st=conn.createStatement();
			i=st.executeUpdate(sql);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DButil.close(conn, st);
		}
		return i;
	}
	

	public int query(HttpServletRequest request) {
		int i=0;
		//运用模板类ArrayList存放数据
		ArrayList<News> al=new ArrayList<News>();
		String query_criteria="";
		String queryType=request.getParameter("queryType");
		if(queryType==null)queryType="1";		
		String sql="select * from tab_news where 1=1";
		String title=request.getParameter("title");
		String username=request.getParameter("username");		
		if(queryType.equals("1")) {
			if(title!=""&&title!=null) {
				query_criteria+=" and title like '%"+title+"%'";
			}
			if(username!=""&&username!=null) {
				query_criteria+=" and userid = '"+username+"';";
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
				News news=new News();
				news.setNewsid(rs.getString(1));
				news.setTitle(rs.getString(2));
				news.setContent(rs.getString(3));
				news.setUsername(rs.getString(4));
				news.setPubtime(rs.getString(5));
				//放数据
				al.add(news);
			}
			//ArrayList放入session对象
			if(i>0) {
				//有数据，存入session
				//request.getSession().setAttribute(Constant.NEWS_LIST,al);
				System.out.println("query:"+al.size());
				request.setAttribute(Constant.NEWS_LIST,al);
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

	
	
