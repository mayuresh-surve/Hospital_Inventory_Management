package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import Util.DbUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class InventoryDAO 
{
	
	public static void insertIntoInventory(String productNo, String ProductName, String Quantity) throws SQLException, ClassNotFoundException
	{
		String sqlQuery= "insert into inventory values('"+productNo+"','"+ProductName+"', '"+Quantity+"')";
		
		try
		{
			DbUtil.dbExcecuteQuery(sqlQuery);
		}catch(SQLException e){
			System.out.println("Exception occur while inserting the data" +e);
			e.printStackTrace();
			throw e;
		}
	}
	
	public static ObservableList<Inventory> getAllRecords() throws ClassNotFoundException, SQLException
	{
		String sqlQuery = "select * from inventory order by product_no";
		try {
			ResultSet rs = DbUtil.dbExcecute(sqlQuery);
			ObservableList<Inventory> inv = getInventoryObjects(rs);
			return inv;
		}catch(SQLException e) {
			System.out.println("Error occured while fetching data from database" +e);
			e.printStackTrace();
			throw e;
		}
	}

	private static ObservableList<Inventory> getInventoryObjects(ResultSet rs) throws ClassNotFoundException, SQLException
	{
		try {
		ObservableList<Inventory> inv = FXCollections.observableArrayList();
		while(rs.next()) {
			Inventory invt = new Inventory();
			invt.setPrdNo(rs.getInt("product_no"));
			invt.setPrdName(rs.getString("product_name"));
			invt.setQun(rs.getInt("quantity"));
			inv.add(invt);
		}
		return inv;
			}
		catch(SQLException e) 
		{
			System.out.println("Error occured while fetching data from database" +e);
			e.printStackTrace();
			throw e;
		}
	}
}
