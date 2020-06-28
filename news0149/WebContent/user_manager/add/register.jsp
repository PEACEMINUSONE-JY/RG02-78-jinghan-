<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#t1 {
	margin: 0px auto;
	width: 510px;
	height: 360px;
	position: absolute;
	top: 50%;
	left: 50%;
	margin-left: -270px;
	margin-top: -200px;
}
body{
background:url(../image/bg3.jpg);
background-size:100%;}
</style>
<script type="text/javascript" src="../js/register.js">
</script>
</head>
<body>
<center>
<form name="f1" action="<%=request.getContextPath()%>/servletuserAdd">

<table border="1" class="carebody" id="t1">
<tr>  <td colspan="4" class="tabletitle" align="center">新用户注册</td></tr>

<tr> <td class="rowlabel">用户名</td>     <td class="rowdata" colspan="3" ><input type="text" class="defaultinput" name="username"/></td></tr>
<tr> <td class="rowlabel">密码</td>       <td class="rowdata"> <input type="password" class="defaultinput" name="password"/></td>   
      <td class="rowlabel">确认密码</td>  <td class="rowdata">   <input type="password" class="defaultinput" name="password"/></td>   </tr>
<tr> <td class="rowlabel">性别</td>
<td>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
<input type="radio"  value="1" name="xb"/>male &nbsp;&nbsp; 
<input type="radio" value="0" name="xb"/>female  </td> 
      
<td>职业</td>  
<td colspan="2">
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
<select name="zy">
<option>学生</option>
<option>教师</option>
<option>警察</option>
</select>
</td></tr>
<tr> <td>个人爱好</td>
<td colspan="3">
<input type="checkbox" value="dnyx" name="ah"/>电子游戏
<input type="checkbox" value="hwyd" name="ah"/>户外运动
<input type="checkbox" value="snyd" name="ah"/>室内运动
<input type="checkbox" value="yy" name="ah"/>音乐/影视
</td> </tr>
<tr> <td>个人说明</td>
<td colspan="4"><textarea rows="3" cols="40" name="grsm"></textarea></td> </tr>
<tr class="buttonline"><td class="rowdata" colspan="4" align="center"> &nbsp;&nbsp; &nbsp;
<input type="submit" value="提交" class="defaultbutton" onclick="validation();"/>&nbsp;
<input type="button"  value="返回" onclick="javascript:history.go(-1);"/>&nbsp;
<input type="reset" value="重置" class="defaultbutton" /></td></tr>

</table>
</form>
</center>
</body>
</html>