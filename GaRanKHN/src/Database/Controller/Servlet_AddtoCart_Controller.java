package Database.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import Database.Management.getFood;
import Database.Model.Food;
import Database.Model.Item;
import Database.Model.Order;
import Database.Model.User;

/**
 * Servlet implementation class Servlet_AddtoCart_Controller
 */

public class Servlet_AddtoCart_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet_AddtoCart_Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().setAttribute("activekey", 6);
		Food food = null;
		try {
			int quantity = 1;
			String id = "";
			if(request.getParameter("idFood")!=null)
			{
				id = String.valueOf(request.getParameter("idFood"));
			}

			getFood gf = new getFood();
			food = gf.getFoodswithId(id);
		}
		catch (Exception e) {
		}


		if(food !=null)
		{
			Item item = new Item();
			item.setFood(food);
			item.setQuantity(1);
			item.setPrice(food.getCast());

			HttpSession session = request.getSession();
			if(session.getAttribute("order") == null)
			{	


				Order order = new Order();
				List<Item> ListItems = new ArrayList<>();
				ListItems.add(item);
				order.setItems(ListItems);
				session.setAttribute("order", order);
			}
			else
			{
				Order order = (Order) session.getAttribute("order");
				List<Item> ListItems = order.getItems();
				boolean check = false;

				for(Item item1 : ListItems)
				{
					if(item1.getFood().getIdFood().equals(item.getFood().getIdFood()))
					{
						int k = item1.getQuantity();
						item1.setQuantity(k+1);
						check = true;
						break;
					}

				}
				
				if(check == false)
				{
					ListItems.add(item);
					order.setItems(ListItems);
				}
				session.setAttribute("order", order);
				response.getWriter().append("setxong ").append(food.getFood_name());
			}
			response.sendRedirect("cart");
		}
		else
		{
			response.sendRedirect("home");
		}


	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
