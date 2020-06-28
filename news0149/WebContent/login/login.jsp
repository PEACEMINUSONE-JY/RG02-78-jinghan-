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
	width: 300px;
	height: 200px;
	position: absolute;
	top: 50%;
	left: 50%;
	margin-left: -150px;
	margin-top: -100px;
}
body{
background:url(../image/bg2.jpg) top left;
background-size:100%;}
</style>
<script type="text/javascript" src="../js/register.js">
function refresh()
{
//document.getElementById("authImg").src='yzm?now='+ new Date();
}
</script>
</head>
<body>
	<center>
		<form action="<%=request.getContextPath()%>/LoginServlet">
			<table id="t1" border="1" style="width: 218px; height: auto;"
				style="margin: 0 auto;" style="border-collapse:collapse">
				<tr>
					<td colspan="4">Login</td>
				</tr>
				<tr align="center">
					<td align="center">Username</td>
					<td colspan="3"><input type="text" name="username" /></td>
				</tr>
				<tr align="center">
					<td align="center">Password</td>
					<td colspan="3"><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td align="center">variableCode:</td><td>										
					 </td>

				</tr>
				<tr>
				<tr align="center">
					<td colspan="4" align="center"><input type="submit" value="sign in" />
						&nbsp; &nbsp; <input type="reset" value="reset" /> &nbsp; &nbsp; <input
						type="button"
						onclick="window.location.href='../user_manager/add/register.jsp'"
						value="sign up" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>