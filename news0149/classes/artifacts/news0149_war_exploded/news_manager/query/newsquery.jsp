<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,common.*,news.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
/*ArrayList<News> al=(ArrayList<News>)session.getAttribute(Constant.NEWS_LIST);
*/
ArrayList<News> al=(ArrayList<News>)request.getAttribute(Constant.NEWS_LIST);
String username=session.getAttribute(Constant.USERNAME).toString();
//String usertype=session.getAttribute(Constant.TYPE).toString();
%>
</head>
<body>
<form action="<%=request.getContextPath()%>/ServletNewsQuery" method="post">
<center>
<table border="1" style="width:700px;"  style="border-collapse:collapse">
<tr>  <td colspan="4">查询新闻</td></tr>
<tr> 
<td width="10%;" align="center">新闻ID</td> 
<td colspan="3"><input readonly type="text"  name="newsid" width="40%;"/>
</td>
</tr>
<tr> 
<td width="10%;" align="center">新闻标题</td>     <td colspan="3"><input type="text"  name="title" width="40%;"/>
</td>
</tr>
<tr> 
<tr>
<td>新闻正文</td>
<td colspan="4"><textarea rows="3" cols="40" name="content" ></textarea></td> </tr>
<tr>
<td align="center" width="10%;">发布人</td>       <td> <input type="text" readonly  name="username" width="40%;"/>
</td>  
</tr> 
<tr>
<td align="center" width="10%;">发布时间</td>       <td> <input readonly type="text"  name="pubtime" width="40%;"/>
</td>   
</tr>
<tr>
<td colspan="4" align="center" width="10%;"> 
<input type="button" class="btn"  value="返回" onclick="javascript:history.go(-1);"/>
<input type="submit" value="检索数据"/>         
</td>
</tr>
</table>
</center>
</form>
<%
	if(al!=null){
	if(al.size()>0){
%>
<table style="width:550px; height:150%;"  border="1" style="border-collapse:collapse" bgcolor="skyblue" align="center">
<tr align="center">
<td align="center">新闻ID</td>
<td align="center">新闻标题</td>
<td align="center">发布人</td>
<td align="center">发布时间</td>
<td align="center">操作</td>
<%
	for(int i=0;i<al.size();i++){
		News news=new News();
		news=(News)(al.get(i));
%>
</tr>
	<tr>
	<td align="center"><%=news.getNewsid()%></td>
	<td align="center"><%=news.getTitle()%>	</td>
	<td align="center"><%=news.getUsername()%>	</td>
	<td align="center"><%=news.getPubtime()%>	</td>
	<td>	
	<!--<a href="/ServletNewsView?newsid=<%=news.getNewsid() %>">查看</a>  -->
	<a href="<%=request.getContextPath() %>/ServletNewsUpdate?newsid=<%=news.getNewsid() %>">查看</a>
<% 
//if(usertype.equals(Constant.ADMIN)||username.equals(news.getUsername())){%>				
	<a href="<%=request.getContextPath() %>/ServletNewsUpdate?newsid=<%=news.getNewsid() %>">修改</a>&nbsp;     
	<a href="<%=request.getContextPath() %>/ServletNewsDelete?newsid=<%=news.getNewsid() %>" onclick="return confirm('确认删除新闻?')">删除</a>	 
<%//}
%>
</td>	
</tr>	
<%
}
%>	
</table>
<% 
}}
%>
</body>
</html>