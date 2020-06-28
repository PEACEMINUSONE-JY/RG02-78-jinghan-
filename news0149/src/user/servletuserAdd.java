package user;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.*;

/**
 * Servlet implementation class servletuserAdd
 */
@WebServlet("/servletuserAdd")
public class servletuserAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletuserAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		User reg=new User(request);		
		userManager rm=new userManager();				
				try {
					int i=rm.addRegsiter(reg);
					if(i==1) {												
						response.sendRedirect("./login/login.jsp");
					}else {												
						response.sendRedirect("../user_manager/add/register_failure.jsp");
					}										
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
