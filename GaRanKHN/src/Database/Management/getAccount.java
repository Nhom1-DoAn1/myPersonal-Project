package Database.Management;


import java.sql.*;

import Database.Model.Account;
import Database.Model.Customer;
import Database.Model.Food;

public class getAccount {
	 Statement stm;

	public getAccount() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		stm = DriverManager.getConnection("jdbc:mysql://localhost/garankhn?useSSL=false", "root", "hongkha123").createStatement();
	}

	/*
	 private String idFood;
private int Cast;
private String Decription;
private int idKindOfFood;
private int isAcitve;
private String Food_name;
	 */


	public Account getUser(String user) throws SQLException{
		ResultSet rs= stm.executeQuery("select * from garankhn.account a where a.Account ='"+user+"'");
		
		while(rs.next())
			{
			Account acc = new Account(rs.getString(1), rs.getInt(2), rs.getString(3));
			System.out.println("Get user successfully");
			return acc;
			
			}
		return null;
	
	}

	
	public boolean isUserExist(String user) throws SQLException{
		ResultSet rs= stm.executeQuery("select * from garankhn.account a where a.Account ='"+user+"'");
		
		while(rs.next())
			{
			return true;
			
			}
		return false;
	
	}
	
	public void insertAccount(Account acc) throws SQLException, ClassNotFoundException
	{
		String sql="insert into Account values('"+acc.getIdAccount()+"',"+acc.getIdCustomer()+",'"+acc.getPassword()+"',1)";
		stm.executeUpdate(sql);
		System.out.println("insert tai khoan thanh cong");
	}
	
	
	public void insertCustomer(Customer cus) throws SQLException, ClassNotFoundException
	{
		String sql="INSERT INTO `garankhn`.`customer` (`Customer_name`, `Customer_birthday`, `Customer_phone`, `isActive`, `Account`, `Mail`) VALUES (null, null, null, b'1', '"+cus.getAccount()+"', '"+cus.getMail()+"')";
		stm.executeUpdate(sql);
		System.out.println("insert USER thanh cong");
	}
	
	public int getIdCustomerWithAccount(String acc) throws SQLException
	{
		ResultSet rs= stm.executeQuery("select * from garankhn.customer a where a.Account ='"+acc+"'");
		
		while(rs.next())
			{
			return rs.getInt(1);
			
			}
		return -1;
		
	}
	

	
}
