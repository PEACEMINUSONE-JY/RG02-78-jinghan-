package news;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletNewsUpdate
 */
@WebServlet("/ServletNewsUpdate")
public class ServletNewsUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNewsUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//接收当前新闻ID
		String newsid=request.getParameter("newsid");
		NewsManager nm=new NewsManager();//获取NewsManager对象nm
		News news=nm.query(newsid);
		if(news!=null) {
			request.getSession().setAttribute("currentnews",news);
			response.sendRedirect("./news_manager/update/newsupdate.jsp");			
		}else {
			response.getWriter().println("queryfailure");									
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
