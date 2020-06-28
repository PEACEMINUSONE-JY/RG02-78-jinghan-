<%@page import="java.util.Random"%>
<%@page import="java.awt.image.*,java.awt.*,java.io.*,javax.imageio.ImageIO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//设置响应的MIME类型jpeg
response.setContentType("image/jpeg");
//设置响应的头部信息以禁止缓存
response.setHeader("pragma", "no-cache");

response.setHeader("no-control", "no-cache");

response.setDateHeader("expires", -1);
int width=120,height=40;
BufferedImage bi=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

Graphics g= bi.getGraphics();

g.setColor(Color.LIGHT_GRAY);

g.fillRect(0,0,width,height);
//随机生成六个数字字符0-9
Random r=new Random();
//生成干扰
for(int i=0;i<120;i++){
	g.setColor(new Color(//RGB色
			r.nextInt(255),
			r.nextInt(255),
			r.nextInt(255)
			));
	g.drawOval(
			r.nextInt(198),
			r.nextInt(36),
			r.nextInt(5),
			r.nextInt(5));
}		
g.setColor(Color.BLUE);
for(int i=0;i<6;i++){
	int k=r.nextInt(10);
	String str=String.valueOf(k);
	g.drawString(str, 8+i*33,25);		
}
OutputStream os=response.getOutputStream();
ImageIO.write(bi,"jpeg",os);
os.flush();
os.close();//防止与out对象冲突
os=null;
response.flushBuffer();
out.clear();
out=pageContext.pushBody();

%>
</body>
</html> 