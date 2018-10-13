package Database.Model;

public class User {
private Account account;
public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
private Order order;
}
