<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../register.css"/>
</head>
<body>

<form action="<%=request.getContextPath()%>/ServletNewsAdd">
<table border="1" class="carebody" align="center">
<tr>  <td colspan="4" class="tabletitle">发布新闻</td></tr>
<tr> <td class="rowlabel">新闻标题
<td class="rowdata" colspan="3" >
<input type="text" style="width:100%" name="title"/></td></tr>
<tr> <td>新闻正文</td>
<td colspan="4"><textarea rows="3" cols="40" name="content"></textarea></td> </tr>
<tr class="buttonline"><td class="rowdata" colspan="4" align="center"> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; 
<input type="submit" value="提交" class="defaultbutton" />   
<input type="button" class="btn"  value="返回" onclick="javascript:history.go(-1);"/>     
<input type="reset" value="重置" class="defaultbutton"  />
</td>
</tr>
</table>
</form>
</body>
</html>