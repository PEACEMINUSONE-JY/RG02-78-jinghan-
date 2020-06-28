package news;

import javax.servlet.http.HttpServletRequest;

import common.Constant;

public class News {
	private String newsid;
	private String title;
	private String content;
	private String username;
	private String pubtime;
	public News(HttpServletRequest request) {				
	    title=request.getParameter("title");
		content=request.getParameter("content");	
		username =request.getSession().getAttribute(Constant.USERNAME).toString();
	}
	public News() {	
	}
	public String getNewsid() {
		return newsid;
	}
	public void setNewsid(String newsid) {
		this.newsid = newsid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPubtime() {
		return pubtime;
	}
	public void setPubtime(String pubtime) {
		this.pubtime = pubtime;
	}	
}
