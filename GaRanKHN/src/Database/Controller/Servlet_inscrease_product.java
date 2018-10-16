package Database.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Database.Model.Item;
import Database.Model.Order;

/**
 * Servlet implementation class Servlet_decrease_product
 */

public class Servlet_inscrease_product extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet_inscrease_product() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			Order order = (Order) session.getAttribute("order");
			List<Item> ListItem = order.getItems();
			String idFood = request.getParameter("idFood");
			for(Item item: ListItem )
			{
				if(item.getFood().getIdFood().equals(idFood))
				{
					item.setQuantity(item.getQuantity()+1);

				}
			}
			order.setItems(ListItem);
			session.setAttribute("order", order);

		} catch (Exception e) {
			// TODO: handle exception
		}
		response.sendRedirect("cart");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
