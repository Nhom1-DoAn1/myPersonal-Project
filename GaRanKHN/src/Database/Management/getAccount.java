package Database.Management;


import java.sql.*;

import Database.Model.Account;
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

	
}
