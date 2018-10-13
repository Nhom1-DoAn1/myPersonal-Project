package Database.Model;

public class Account {

public String getIdAccount() {
	return idAccount;
}
public void setIdAccount(String idAccount) {
	this.idAccount = idAccount;
}
public int getIdCustomer() {
	return idCustomer;
}
public void setIdCustomer(int idCustomer) {
	this.idCustomer = idCustomer;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
private String idAccount;
public Account(String idAccount, int idCustomer, String password) {
	super();
	this.idAccount = idAccount;
	this.idCustomer = idCustomer;
	Password = password;
}

public Account() {
	// TODO Auto-generated constructor stub
}
private int idCustomer;
private String Password;
}
