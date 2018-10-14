package Database.Model;

import java.util.List;

public class Order {


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public Order(int id, User user, List<Item> items) {
		super();
		this.id = id;
		this.user = user;
		this.items = items;
	}

	private int id;
	private User user;
	private List<Item> items;
}
