package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import Util.DbUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class VendorDAO 
{
	public static void insertIntoVendor(String venderName, String phoneNo,String address, String productName, String quantity, String amount) throws SQLException, ClassNotFoundException
	{
		String sqlQuery = "insert into vender values ('"+venderName+"','"+phoneNo+"','"+address+"','"+productName+"','"+quantity+"','"+amount+"')";
		try
		{
			DbUtil.dbExcecuteQuery(sqlQuery);
		}catch(SQLException e){
			System.out.println("Exception occur while inserting the data" +e);
			e.printStackTrace();
			throw e;
		}
	}
	
	public static ObservableList<Vendor> getAllRecords() throws ClassNotFoundException, SQLException
	{
		String sqlQuery = "select * from vender";
		try
		{
			ResultSet rs = DbUtil.dbExcecute(sqlQuery);
			ObservableList<Vendor> ven = getVendorObjects(rs);
			return ven;
		}catch(SQLException e ) {
			System.out.println("Error occured while fetching the DB" +e);
			e.printStackTrace();
			throw e;
		}
	}
	
	private static ObservableList<Vendor> getVendorObjects(ResultSet rs) throws ClassNotFoundException, SQLException
	{
		try {
			ObservableList<Vendor> ven = FXCollections.observableArrayList();
			
			while(rs.next())
			{
				Vendor vend = new Vendor();
				vend.setVenName(rs.getString("vender_name"));
				vend.setPhNo(rs.getInt("phone_no"));
				vend.setAdd(rs.getString("address"));
				vend.setPName(rs.getString("product_name"));
				vend.setQun(rs.getInt("quantity"));
				vend.setAmt(rs.getInt("amount"));
				ven.add(vend);
			}
			return ven;
		}catch(SQLException e ) { 
			System.out.println("Error occured while fetching the DB" +e);
			e.printStackTrace();
			throw e;
		}
	}
}
