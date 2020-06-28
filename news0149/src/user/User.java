package user;

import javax.servlet.http.HttpServletRequest;

import common.*;

public class User {
	 String username;
	 String password;
	 String sex;
	 String profession;
	 String favorite;
	 String note;	
	public User(HttpServletRequest request) {
		//this.username=request.getParameter("username");
		username =request.getSession().getAttribute(Constant.USERNAME).toString();
		password=request.getParameter("password");
		sex=request.getParameter("xb");
		profession=request.getParameter("zy");		
		String[] ahs=request.getParameterValues("ah");
		String ah=null;
		for(int i=0;i<ahs.length;i++) {
			ah+=ahs[i]+";";
		}
		favorite+=ah;		
		note=request.getParameter("grsm");
		
	}
	public User() {
		
	}
	public String getUsername() {
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
	
	
}
