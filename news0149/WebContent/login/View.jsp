<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/View.css"/>
<link rel="stylesheet" type="text/css" href="../css/wall.css"/>
<script type="text/javascript" src="../js/wall.js">
</script>
<script type="text/javascript" src="../js/View.js">
</script>
</head>
<body>
 
<div class="test" id="d1">
<div align="center">
<h2>欢迎来到新闻发布系统</h2>
</div>
 <ul id="menu">
  <li class="yes" onclick="javascript:test_item(0);"><a href="#" onfocus="this.blur()">首页</a></li>
  <li onclick="javascript:test_item(1);"><a href="../news_manager/query/newsquery.jsp" onfocus="this.blur()">查询新闻</a></li>
  <li onclick="javascript:test_item(2);"><a href="../news_manager/add/newsadd.jsp" onfocus="this.blur()">发布新闻</a></li>
  <li onclick="javascript:test_item(3);"><a href="#" onfocus="this.blur()">删除新闻</a></li>
   <li onclick="window.location.href='exitsystem.jsp'"/><a href="../login/exitsystem.jsp" onfocus="this.blur()">退出系统</a></li>
 </ul>
 <div class="content" id="test0">
没有首页
 </div>
 <div id="test1" class="no">
  查询啊
 </div>
 <div id="test2" class="no">
 添加啊
 </div>
 <div id="test3" class="no">
  删除啊
 </div>
 <div id="test4" class="no">
 修改啊
 </div>
</div>
<div id="div5">Time
</div>
</body>
</html>
