package news;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletNewsDelete
 */
@WebServlet("/ServletNewsDelete")
public class ServletNewsDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNewsDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");	
		String newsid=request.getParameter("newsid");
		NewsManager nm=new NewsManager(); 	
		int i=nm.delete(newsid);
		if(i==1) {
			//response.sendRedirect("/news0149/news_manager/query/newsquery.jsp");	
			response.getWriter().println("ɾ���ɹ�!���<a href='/news0149/ServletNewsQuery?queryType=2'>�˴�</a>,�˻ز鿴�޸Ľ��");
		}
		else {
			response.getWriter().println("ɾ��ʧ��,��ȥ��ʮ�������˵��");
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
