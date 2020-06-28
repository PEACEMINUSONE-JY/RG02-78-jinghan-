package news;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import news.*;


/**
 * Servlet implementation class ServletNewsAdd
 */
@WebServlet("/ServletNewsAdd")
public class ServletNewsAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNewsAdd() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		News news=new News(request);
		NewsManager nm=new NewsManager();				
		int i=nm.add(news);	
		if(i==1) {
		 		//response.getWriter().println("Add news sucessfully!");		
		 		response.getWriter().println("��ӳɹ�!���<a href='/news0149/ServletNewsQuery?'>�˴�</a>,�˻ز鿴��ӽ��");
			}else {						
				response.getWriter().println("�������ʧ��,��ȥ��ʮ�����");
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
