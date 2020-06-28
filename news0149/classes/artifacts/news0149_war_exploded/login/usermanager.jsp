<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,common.*,news.*,user.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%
ArrayList<User> list=(ArrayList<User>)request.getAttribute(Constant.NEWS_LIST);
String username=session.getAttribute(Constant.USERNAME).toString();
%>
</head>
<body>
<form action="<%=request.getContextPath()%>/servletuserQuery" method="post">
<center>
<table border="1" style="width:500px; height:auto;"  align="center">
<tr align="center">  <td colspan="4">用户管理</td></tr>
<tr> 
<td width="24%;" align="center">当前用户名:</td> 
<td colspan="3"><input type="text"  name="username" width="40%;" readonly/>
</td>
</tr>
<tr> 
<td width="20%;" align="center">当前密码:</td>     <td colspan="3"><input type="text"  name="password" width="40%;"/>
</td>
</tr>
<tr> 
<td align="center" width="15%;">性别:</td>       <td> 
<input type="radio" name="xb" value="1" checked/>male
&nbsp;&nbsp;
<input type="radio" name="xb" value="0" />female
</td>  
</tr> 
<tr>
<td align="center" width="15%;">职业:</td>       <td> 职业:<select name="zy">
<option selected>老师</option><option>学生</option><option>警察</option></select></td></tr><tr>
<td align="center" width="15%;">爱好:</td>      
 <td> <input type="checkbox" name="ah"  width="40%;" checked/>电脑游戏
<input type="checkbox" name="ah"  width="40%;"/>户外运动
<input type="checkbox" name="ah" width="40%;"/>音乐/影视
</td>   
</tr>
<tr>
<td align="center">个人介绍</td>
<td><textarea rows="2" cols="30" name="grsm"></textarea></td> </tr>
<tr>
<tr>
<td colspan="4" align="center" width="10%;"> 
<input type="button" class="btn"  value="返回" onclick="javascript:history.go(-1);"/>
<input type="submit" value="检索用户"/>         
</td>
</tr>
</table>
</center>
</form>
<%
	if(list!=null){
	if(list.size()>0){
%>

<table style="width:550px;" border="1" style="border-collapse:collapse" bgcolor="skyblue" align="center">
<tr align="center">
<td align="center" style="width:14.2%;">用户</td>
<td align="center" style="width:14.2%;">密码</td>
<td align="center" style="width:14.2%;">性别</td>
<td align="center" style="width:14.2%;">职业</td>
<td align="center" style="width:34.2%;">操作</td>
<%
	for(int i=0;i<list.size();i++){
		User u=new User();
		u=(User)(list.get(i));
%>
</tr>
	<tr>
	<td align="center"><%=u.getUsername()%></td>
	<td align="center"> <%=u.getPassword()%>  </td>
	<td align="center">  <%=u.getSex()%>        </td>
	<td align="center"> <%=u.getProfession()%></td>
	<td>	
	<a href="<%=request.getContextPath()%>">查看</a>	
	<a href="<%=request.getContextPath()%>">更改</a>&nbsp;     
	<a href="<%=request.getContextPath() %>/servletuserDelete?username=<%=u.getUsername()%>" onclick="return confirm('确认删用户?')">删除</a>	 
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