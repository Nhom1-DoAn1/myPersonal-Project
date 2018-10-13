package Database.Model;

import java.util.List;

public class Order {


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Order(int id, Customer customer, List<Item> items) {
		super();
		this.id = id;
		this.customer = customer;
		this.items = items;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private Customer customer;
	private List<Item> items;
}
