package Database.Management;


import java.sql.*;

import Database.Model.Food;

public class getFood {
	 Statement stm;

	public getFood() throws ClassNotFoundException, SQLException {
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

	public ResultSet getFoods() throws SQLException{
		ResultSet rs= stm.executeQuery("select * from food");
		System.out.println("Get food successfully");
		return rs;
	}
	
	public ResultSet getFoodswithKind(int Kind) throws SQLException{
		ResultSet rs= stm.executeQuery("select * from food where idKindOfFood = " + String.valueOf(Kind));
		System.out.println("Get food successfully");
		return rs;
	}
	
	public  Food getFoodswithId(String Kind) throws SQLException, ClassNotFoundException{

		ResultSet rs= stm.executeQuery("select * from food where idFood = '" + String.valueOf(Kind)+"'");
		System.out.println("Get food with ID successfully");
		Food f = null;
		if(rs.next())
			f = new Food(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getInt(3), rs.getString(6));
		return f;
	}


	
}
