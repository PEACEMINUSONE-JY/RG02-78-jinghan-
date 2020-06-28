package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.Constant;
import common.DButil;
import news.News;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());	
		
		Login lg=new Login();
		int i=lg.verification(request);
			if(i==0) {				
				//跳转至普通用户页面					
				request.getSession().setAttribute(Constant.USERNAME,request.getParameter("username"));//保存用户登录信息	
				request.getSession().setAttribute("type",lg.verification(request));
				response.sendRedirect("./login/showview.jsp");
			}else if(i==1) {				
				request.getSession().setAttribute(Constant.USERNAME,request.getParameter("username"));
				request.getSession().setAttribute("type",lg.verification(request));								
				response.sendRedirect("./login/showview.jsp");
				//跳转至管理员用户页面
			}else{
				response.sendRedirect("./login/login_failure.jsp");
			}
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
