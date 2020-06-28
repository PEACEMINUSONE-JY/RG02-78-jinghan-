package user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import news.NewsManager;

/**
 * Servlet implementation class servletuserQuery
 */
@WebServlet("/servletuserQuery")
public class servletuserQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletuserQuery() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");				
		userManager um=new userManager();			
		int i=um.query(request);
		if(i==0) {
			response.getWriter().println("User query failure");						
		}else {
			//response.sendRedirect("./news_manager/query/newsquery.jsp");//�ͻ�����ת
			request.getRequestDispatcher("/news0149/login/usermanager.jsp").forward(request, response);//��������ת
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
