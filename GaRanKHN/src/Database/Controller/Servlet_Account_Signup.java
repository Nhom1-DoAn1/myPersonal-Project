package Database.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.Management.getAccount;

/**
 * Servlet implementation class Servlet_Account_Signup
 */
@WebServlet("/Servlet_Account_Signup")
public class Servlet_Account_Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_Account_Signup() {
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
		String account = request.getParameter("txtTaiKhoan_DK");
		String matkhau = request.getParameter("txtMatKhau_DK");
		String mail = request.getParameter("txtMail");
		
		try {
		getAccount gAcc= new getAccount();
		boolean isExist = gAcc.isUserExist(account);
		if(isExist)
		{
			request.setAttribute("message", "Tài khoản đã tồn tại");
			RequestDispatcher dr = request.getRequestDispatcher("login");
			dr.forward(request, response);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
