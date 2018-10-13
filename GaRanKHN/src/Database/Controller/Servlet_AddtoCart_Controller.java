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

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import Database.Management.getFood;
import Database.Model.Food;
import Database.Model.Item;
import Database.Model.Order;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			int quantity = 1;
			int id = -1;
			if(request.getParameter("idFood")!=null)
			{
				id = Integer.valueOf(request.getParameter("idFood"));
			}

			getFood gf = new getFood();
			Food food = gf.getFoodswithId(id);

			if(food !=null)
			{
				HttpSession session = request.getSession();
				if(session.getAttribute("order") == null)
				{
					Order order = new Order();
					List<Item> ListItems = new ArrayList<Item>();
					Item item = new Item();
					item.setFood(food);
					item.setQuantity(quantity);
					item.setPrice(food.getCast());
					ListItems.add(item);
					session.setAttribute("order", order);
				}
				else
				{
						Order order = (Order) session.getAttribute("order");
						List<Item> ListItems = order.getItems();
						boolean check = false;
						for(Item item : ListItems)
						{
							if(item.getFood().getIdFood() == food.getIdFood())
							{
								item.setQuantity(quantity + item.getQuantity());
								check = true;
							}
						}
						
						if(!check)
						{
							Item item = new Item();
							item.setQuantity(quantity);
							item.setFood(food);
							item.setPrice(food.getCast());
							ListItems.add(item);
						}
						session.setAttribute("order",order);
				}
			}
		}
		catch (Exception e) {
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
