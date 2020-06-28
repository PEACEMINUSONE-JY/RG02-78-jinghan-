<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,common.*,news.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
/*ArrayList<News> al=(ArrayList<News>)session.getAttribute(Constant.NEWS_LIST);
*/
ArrayList<News> al=(ArrayList<News>)request.getAttribute(Constant.NEWS_LIST);
String username=session.getAttribute(Constant.USERNAME).toString();
//String usertype=session.getAttribute(Constant.TYPE).toString();
%>
<link rel="stylesheet" type="text/css" href=""/>
<link rel="stylesheet" type="text/css" href="../css/wall.css" />
<style type="text/css">
body{ 
margin:0;padding:0; 
}
</style>
<script type="text/javascript" src="../js/wall.js">	
</script>
</head>
<body bgcolor="skyblue">
<form  method="post">
<div  id="d1">
<div align="center">
 <h4>登录成功，欢迎来到新闻发布系统</h4>  
</div>
<div style="width: 800px; height: 600px; margin: 0 auto; border:1px; text-align: center;">
<div style="width: 120px; height: 100%; border:1px; float: left; text-align: center">
<ul style="float: left; list-style-type: none; margin: 0px;">
<li style="margin: 0px; margin-left: 0px; width: 60px;"><a
target="content" href="../news_manager/add/newsadd.jsp">
<h5><font face="verdana">发布新闻</font></h5></a></li>
<li style="margin: 0px; margin-left: 0px; width: 60px;"><a target="content" href="../news_manager/query/newsquery.jsp">
<h5><font face="verdana">查询新闻</font></h5></a></li>
<li style="margin: 0px; margin-left: 0px; width: 60px;"><a href="../user_manager/add/register.jsp">
<h5><font face="verdana">添加用户</font></h5></a></li>
<li style="margin: 0px; margin-left: 0px; width: 60px;"><a  target="content" href="../login/usermanager.jsp">
<h5><font face="verdana">查询用户</font></h5></a></li>
<li style="margin: 0px; margin-left: 0px; width: 60px;"><a href="../login/login.jsp">
<h5><font face="verdana">回到登录</font></h5></a></li>
<li style="margin: 0px; margin-left: 0px; width: 60px;"><a href="../login/exitsystem.jsp">
<h5><font face="verdana">退出系统</font></h5></a></li>
</ul>
</div>
<div style="width: 600px; height: 500px; margin: 0px; padding:0px; float: right; text-align:right;" border:1px;>
<iframe name="content" width="100%" height="100%" marginheight=0 marginwidth=0 frameborder=0  scrolling=no> </iframe>
</div>
</div>
<div id="div5">Time</div>
</form>
</body>
</html>