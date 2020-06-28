<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,common.*,news.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href=""/>
<link rel="stylesheet" type="text/css" href="../css/wall.css" />
<style type="text/css">
body{ margin:0;padding:0; }
</style>
<script type="text/javascript" src="../js/wall.js">	
</script>
</head>

<body bgcolor="skyblue">
<form action="<%=request.getContextPath()%>/ServletNewsQuery" method="post">
<div  id="d1">
<div align="center">
<h3>欢迎来到新闻发布系统。 <h4>游客,你好</h4></h3>
</div>
<div style="width: 800px; height: 600px; margin: 0 auto; border:1px; text-align: center;">
<div style="width: 150px; height: 100%; border:1px; float: left; text-align: center">
<ul style="float: left; list-style-type: none; margin: 0px;">
<li style="margin: 10px; margin-left: 0px; width: 80px;"><a
target="content" href="../news_manager/add/newsadd.jsp">
<h5><font face="verdana">发布我的新闻</font></h5></a></li>
<li style="margin: 20px; margin-left: 0px; width: 80px;"><a target="content" href="../news_manager/query/newsquery.jsp">
<h5><font face="verdana">查询我的新闻</font></h5></a></li>
<li style="margin: 20px; margin-left: 0px; width: 80px;"><a href="" onclick="return confirm('是否确认删除新闻?')"">
<h5><font face="verdana">删除我的新闻</font></h5></a></li>
<li style="margin: 20px; margin-left: 0px; width: 80px;"><a href="../login/exitsystem.jsp">
<h5><font face="verdana">点我退出系统</font></h5></a></li>
</ul>
</div>
<div style="width: 600px; height: 500px; margin: 0px; padding:0px; float: right; text-align: center;">
<iframe name="content" width="100%" height="100%" marginheight=0 marginwidth=0 frameborder=0  scrolling=no> </iframe>
</div>
</div>
<div id="div5">Time</div>
</form>
</body>
</html>