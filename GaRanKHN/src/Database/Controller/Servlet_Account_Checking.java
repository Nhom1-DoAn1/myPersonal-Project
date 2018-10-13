package Database.Controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import Database.Management.getAccount;
import Database.Model.Account;
import Database.Model.User;

/**
 * Servlet implementation class Servlet_Account_Checking
 */
@WebServlet("/Servlet_Account_Checking")
public class Servlet_Account_Checking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet_Account_Checking() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	
	
		
		String account = request.getParameter("txtTaiKhoan");
		String password =request.getParameter("txtMatKhau");
		
		try {
			getAccount getA = new getAccount();
			Account acc = getA.getUser(account);
			if(acc != null)
			{
				if(acc.getPassword().equals(password))
				{
					
					User user = new User();
					user.setAccount(acc);
				
					session.setAttribute("user", user);
					RequestDispatcher dr = request.getRequestDispatcher("home");
					dr.forward(request, response);
				}
				else
				{
					System.out.println("Khong trung password");
					response.sendRedirect("login");
				}
			}
			else
			{
				System.out.println("ACC rong");
				response.sendRedirect("login");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
