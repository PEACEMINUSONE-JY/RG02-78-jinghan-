<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="news.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%News news=(News)(session.getAttribute("currentnews")); %>
</head>
<body>
<form action="<%=request.getContextPath()%>/ServletNewsmodify" method="post">
<center>
<table border="1">
<tr>  <td colspan="4">修改新闻</td></tr>
<tr> 
<td width="10%;" align="center">新闻ID</td> 
<td colspan="3"><input  width="40%;" readonly type="text"  name="newsid" value="<%=news.getNewsid() %>"/>
</td>
</tr>
<tr> 
<td width="10%;" align="center">新闻标题</td>     <td colspan="3"><input type="text" value="<%=news.getTitle() %>" name="title" width="40%;"/>
</td>
</tr>
<tr> 
<tr>
<td>新闻正文</td>
<td colspan="4"><textarea rows="3" cols="40"  name="content"><%=news.getContent()%></textarea></td> </tr>
<tr>
<td align="center" width="10%;">发布人</td>       <td> <input type="text" readonly  value="<%=news.getUsername()%>" name="userid" width="40%;"/>
</td>  
</tr> 
<tr>
<td align="center" width="10%;">发布时间</td>       <td> <input readonly type="text"  value="<%=news.getPubtime() %>" name="pubtime" width="40%;"/>
</td>   
</tr>
<tr>
<td colspan="4" align="center" width="10%;"> 
<input type="submit" value="提交"/>
<input type="button" class="btn"  value="返回" onclick="javascript:history.go(-1);"/> 
</td>
</tr>
</table>
</center>
</form>
</body>
</html>