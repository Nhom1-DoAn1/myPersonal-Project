package Database.Model;

import java.sql.Date;

public class Customer {

public int getIdCustomer() {
	return idCustomer;
}
public void setIdCustomer(int idCustomer) {
	this.idCustomer = idCustomer;
}
public String getCustomer_name() {
	return Customer_name;
}
public void setCustomer_name(String customer_name) {
	Customer_name = customer_name;
}
public Date getCustomer_birthday() {
	return Customer_birthday;
}
public void setCustomer_birthday(Date customer_birthday) {
	Customer_birthday = customer_birthday;
}
public String getCustomer_phone() {
	return Customer_phone;
}
public void setCustomer_phone(String customer_phone) {
	Customer_phone = customer_phone;
}
public String getAccount() {
	return Account;
}
public void setAccount(String account) {
	Account = account;
}
public String getMail() {
	return Mail;
}
public void setMail(String mail) {
	Mail = mail;
}
private int idCustomer;
public Customer(int idCustomer, String customer_name, Date customer_birthday, String customer_phone, String account,
		String mail) {
	super();
	this.idCustomer = idCustomer;
	Customer_name = customer_name;
	Customer_birthday = customer_birthday;
	Customer_phone = customer_phone;
	Account = account;
	Mail = mail;
}
private String Customer_name;
private Date Customer_birthday;
private String Customer_phone;
private String Account;
private String Mail;
}
