package news;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletNewsmodify
 */
@WebServlet("/ServletNewsmodify")
public class ServletNewsmodify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNewsmodify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		//����ʵ��������
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw=response.getWriter();
		NewsManager nm=new NewsManager();		
		int i=nm.update(request);		
		if(i==1) {
			pw.println("�޸ĳɹ�!���<a href='/news0149/ServletNewsQuery?queryType=1'>�˴�</a>,�˻ز鿴�޸Ľ��");		
		}else {
			pw.println("update   failure!");		
		}				
		//��ȡrequest�ύ��������Ϣ
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
